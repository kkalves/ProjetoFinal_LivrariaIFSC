package dao;

import java.util.ArrayList;
import com.google.gson.JsonElement;
import org.bson.Document;
import com.google.gson.Gson;
import com.mongodb.Block;
import com.mongodb.DB;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import model.Vendedor;

public class VendedorDAO {

	private DatabaseProvider database_provider = new DatabaseProvider();
	MongoCollection<Document> vendedorCollection = database_provider.getDatabase().getCollection("Vendedor");
	private Gson gson = new Gson();

	private ArrayList<Vendedor> vendedores = new ArrayList<>();

	public void adicionar(Vendedor vendedor) {
		Document doc = this.convertVendedorEmDocumento(vendedor);
		this.vendedorCollection.insertOne(doc);
	}

	private Document convertVendedorEmDocumento(Vendedor v1) {
		Document doc = new Document().append("nome", v1.getNome()).append("cpf", v1.getCpf())
				.append("email", v1.getEmail()).append("sexo", v1.getSexo()).append("telefone", v1.getTelefone());
		return doc;
	}

	private Vendedor convertDocumentoEmVendedor(Document doc) {
		Vendedor v1 = new Vendedor((String) doc.get("nome"), (String) doc.get("cpf"), (String) doc.get("email"),
				(String) doc.get("sexo"), (String) doc.get("dataNascimento"), (String) doc.get("telefone"),
				(String) doc.get("login"), (String) doc.get("senha"));
		return v1;
	}

	public void editar(Vendedor vendedor) {
		Document doc = this.convertVendedorEmDocumento(vendedor);
		this.vendedorCollection.updateOne(Filters.eq("cpf", vendedor.getCpf()), doc);
	}

	public boolean deletarPorCpf(String cpf) {
		vendedorCollection.deleteOne(Filters.eq("cpf", cpf));
		return true;
	}

	public ArrayList<Vendedor> buscarTodos() {
		MongoCursor<Document> cursor = vendedorCollection.find().iterator();
		try {
			while (cursor.hasNext()) {
				Vendedor v1 = this.convertDocumentoEmVendedor(cursor.next());
				vendedores.add(v1);
			}
		} finally {
			cursor.close();
		}
		return this.vendedores;
	}

	public Vendedor buscarUmPorCPF(String cpf) {
		Document vendedorDocumento = vendedorCollection.find(Filters.eq("cpf", cpf)).first();
		Vendedor vendedor = gson.fromJson(vendedorDocumento.toJson(), Vendedor.class);
		return vendedor;
	}

	public Vendedor buscarUmPorNome(String nome) {
		Document vendedorDocumento = vendedorCollection.find(Filters.eq("nome", nome)).first();
		Vendedor vendedor = gson.fromJson(vendedorDocumento.toJson(), Vendedor.class);

		return vendedor;

	}

	public ArrayList<Vendedor> buscarNPorNome(String nome) {
		MongoCursor<Document> cursor = vendedorCollection.find(Filters.eq("nome", nome)).iterator();
		vendedores = new ArrayList<Vendedor>();
		try {
			while (cursor.hasNext()) {
				vendedores.add(gson.fromJson(cursor.next().toJson(), Vendedor.class));
			}
		} finally {
			cursor.close();
		}
		return this.vendedores;
	}
}
