package dao;

import java.util.ArrayList;

import org.bson.Document;
import org.bson.conversions.Bson;

import com.google.gson.Gson;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.model.Filters;

import model.ClienteJuridico;

public class ClienteJuridicoDAO {

	private DatabaseProvider database_provider = new DatabaseProvider();
	MongoCollection<org.bson.Document> clienteJuridicocollection = database_provider.getDatabase()
			.getCollection("ClienteJuridico");
	private Gson gson = new Gson();

	private static ArrayList<ClienteJuridico> todos = new ArrayList<>();

	private ArrayList<ClienteJuridico> clienteJuridicos = new ArrayList<>();
	// private ArrayList<ClienteJuridico> clienteJuridico;
	private ArrayList<ClienteJuridico> clienteJuridico;

	public void adicionar(ClienteJuridico clienteJuridico) {
		Document doc = this.convertClienteJuridicoEmDocumento(clienteJuridico);
		this.clienteJuridicocollection.insertOne(doc);
	}

	private Document convertClienteJuridicoEmDocumento(ClienteJuridico cj1) {
		Document doc = new Document().append("nome", cj1.getNome()).append("cnpj", cj1.getCnpj())
				.append("email", cj1.getEmail()).append("telefone", cj1.getTelefone());
		return doc;
	}

	private ClienteJuridico convertDocumentoEmClienteJuridico(Document doc) {
		ClienteJuridico cj1 = new ClienteJuridico((String) doc.get("nome"), (String) doc.get("cpf"),
				(String) doc.get("email"), (String) doc.get("sexo"), (String) doc.get("telefone"));
		return cj1;
	}

	public void editar(ClienteJuridico clienteJuridico) {
		Document doc = this.convertClienteJuridicoEmDocumento(clienteJuridico);
		this.clienteJuridicocollection.updateOne(Filters.eq("cnpj", clienteJuridico.getCnpj()), (Bson) doc);
	}

	public boolean deletarPorCnpj(String cnpj) {
		clienteJuridicocollection.deleteOne(Filters.eq("cnpj", cnpj));
		return true;
	}

	public ArrayList<ClienteJuridico> buscarTodos() {
		MongoCursor<Document> cursor = clienteJuridicocollection.find().iterator();
		ArrayList<ClienteJuridico> clienteJuridico;
		try {
			while (cursor.hasNext()) {
				ClienteJuridico cj1 = this.convertDocumentoEmClienteJuridico(cursor.next());
				clienteJuridicos.add(cj1);
			}
		} finally {
			cursor.close();
		}
		return this.clienteJuridico;
	}

	public ClienteJuridico buscarUmPorCNPJ(String cnpj) {
		Document clienteJuridicoDocumento = clienteJuridicocollection.find(Filters.eq("cnpj", cnpj)).first();
		ClienteJuridico clienteJuridico = gson.fromJson(clienteJuridicoDocumento.toJson(), ClienteJuridico.class);
		return clienteJuridico;
	}

	public ClienteJuridico buscarUmPorNome(String nome) {
		Document ClienteJuridicoDocumento = clienteJuridicocollection.find(Filters.eq("nome", nome)).first();
		ClienteJuridico clienteJuridico = gson.fromJson(ClienteJuridicoDocumento.toJson(), ClienteJuridico.class);

		return clienteJuridico;

	}

	public ArrayList<ClienteJuridico> buscarNPorNome(String nome) {
		MongoCursor<Document> cursor = clienteJuridicocollection.find(Filters.eq("nome", nome)).iterator();
		clienteJuridico = new ArrayList<ClienteJuridico>();
		try {
			while (cursor.hasNext()) {
				clienteJuridicos.add(gson.fromJson(cursor.next().toJson(), ClienteJuridico.class));
			}
		} finally {
			cursor.close();
		}
		return this.clienteJuridicos;
	}
}
