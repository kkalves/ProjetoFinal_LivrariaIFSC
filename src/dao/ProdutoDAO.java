package dao;

import java.text.DecimalFormat;
import java.util.ArrayList;

import org.bson.Document;

import com.google.gson.Gson;
import com.mongodb.Block;
import com.mongodb.DB;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;

import model.Produto;

public class ProdutoDAO {
	
	private DatabaseProvider database_provider = new DatabaseProvider();
	MongoCollection<Document> produtoCollection = database_provider.getDatabase().getCollection("Produto");
	private Gson gson = new Gson();
	ArrayList<Produto> produtos = new ArrayList<Produto>();
	
	public void inserir(Produto p1){
		Document doc = this.convertProdutoEmDocumento(p1);
		this.produtoCollection.insertOne(doc);
	}
	private Document convertProdutoEmDocumento(Produto p1){
		Document doc = new Document()
				.append("titulo", p1.getTitulo())
				.append("autor", p1.getAutor())
				.append("editora", p1.getEditora())
				.append("numero", p1.getNumero())
				.append("ano", p1.getAno())
				.append("isbn", p1.getIsbn())
				.append("descricao", p1.getDescricao())
				.append("valor", p1.getValor());
		return doc;
	}
	//TODO
	private Produto convertDocumentoEmProduto(Document doc){
		String valorString = String.valueOf(doc.get("valor"));
		valorString = valorString.replace(",", ".");
		
		Produto p1 = new Produto(
		(String)doc.get("titulo"),
		(String)doc.get("autor"),
		(String)doc.get("editora"),
		(String)doc.get("numero"),
		(String)doc.get("ano"),
		(String)doc.get("isbn"),
		(String)doc.get("descricao"),
		valorString);
		
		return p1;
	}
	public void editarUm(Produto p1){
		Document doc = this.convertProdutoEmDocumento(p1);
		this.produtoCollection.replaceOne(Filters.eq("isbn",p1.getIsbn()), doc);
	}
	public boolean deletarPorISBN(String isbn){
		produtoCollection.deleteOne(Filters.eq("isbn", isbn));
		return true;
	}
	public ArrayList<Produto> buscarTodos(){
		MongoCursor<Document> cursor = produtoCollection.find().iterator();
		try {
		    while (cursor.hasNext()) {
		    	Produto p1 = this.convertDocumentoEmProduto(cursor.next());
		        produtos.add(p1);
		    }
		} finally {
		    cursor.close();
		}
		return this.produtos;
		
	}
	public Produto buscarUmPorISBN(String isbn) {
		Document produtoDocumento = produtoCollection.find(Filters.eq("isbn",isbn)).first();
		Produto produto = gson.fromJson(produtoDocumento.toJson(), Produto.class);
		
		return produto;
		
	}
	public Produto buscarUmPorTitulo(String titulo) {
		Document produtoDocumento = produtoCollection.find(Filters.eq("titulo",titulo)).first();
		Produto produto = gson.fromJson(produtoDocumento.toJson(), Produto.class);
		
		return produto;
		
	}
	public ArrayList<Produto> buscarNPorTitulo(String titulo) {
		MongoCursor<Document> cursor = produtoCollection.find(Filters.eq("titulo", titulo)).iterator();
		produtos = new ArrayList<Produto>();
		try {
		    while (cursor.hasNext()) {
		        produtos.add(gson.fromJson(cursor.next().toJson(), Produto.class));
		    }
		} finally {
		    cursor.close();
		}
		return this.produtos;
	}
}
