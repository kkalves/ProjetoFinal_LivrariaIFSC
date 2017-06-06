package dao;

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
		Document doc = new Document()
				.append("titulo", p1.getTitulo())
				.append("autor", p1.getAutor())
				.append("editora", p1.getEditora())
				.append("numero", p1.getNumero())
				.append("ano", p1.getAno())
				.append("isbn", p1.getIsbn())
				.append("descricao", p1.getDescricao())
				.append("valor", p1.getValor());
		this.produtoCollection.insertOne(doc);
	}
	
	public void deletar(Produto p1){
		produtos.remove(p1);
	}
	
	public boolean deletarPorISBN(String isbn){
		produtoCollection.deleteOne(Filters.eq("isbn", isbn));
		return true;
	}
	public ArrayList<Produto> buscarTodos(){
		MongoCursor<Document> cursor = produtoCollection.find().iterator();
		try {
		    while (cursor.hasNext()) {
		        produtos.add(gson.fromJson(cursor.next().toJson(), Produto.class));
		    }
		} finally {
		    cursor.close();
		}
		return this.produtos;
		
	}
	public Produto buscarUmPorISBN(String isbn) {
		for (Produto produto : this.produtos) {
			if(produto.getIsbn().trim().equals(isbn.trim())){
				return produto;
			}
		}
		return null;
		
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
