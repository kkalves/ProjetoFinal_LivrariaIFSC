package dao;

import java.util.ArrayList;
import org.bson.Document;
import org.bson.conversions.Bson;

import com.google.gson.Gson;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.model.Filters;

import model.ClienteFisico;

public class ClienteFisicoDAO {

	private DatabaseProvider database_provider = new DatabaseProvider();
	MongoCollection<org.bson.Document> clienteFisicoCollection = database_provider.getDatabase()
			.getCollection("ClienteFisico");
	private Gson gson = new Gson();

	private ArrayList<ClienteFisico> clienteFisicos = new ArrayList<>();

	public void adicionar(ClienteFisico clienteFisico) {
		Document doc = this.convertClienteFisicoEmDocumento(clienteFisico);
		this.clienteFisicoCollection.insertOne(doc);
	}

	private Document convertClienteFisicoEmDocumento(ClienteFisico clienteFisico) {
		Document doc = new Document().append("nome", clienteFisico.getNome()).append("cpf", clienteFisico.getCpf())
				.append("email", clienteFisico.getEmail()).append("sexo", clienteFisico.getSexo())
				.append("telefone", clienteFisico.getTelefone()).append("endereco", clienteFisico.getTelefone());
		return doc;
	}

	private ClienteFisico convertDocumentoEmClienteFisico(Document doc) {
		ClienteFisico cf1 = new ClienteFisico((String) doc.get("nome"), (String) doc.get("cpf"),
				(String) doc.get("email"), (String) doc.get("sexo"), (String) doc.get("telefone"),
				(String) doc.get("endereco"));
		return cf1;
	}

	public void editar(ClienteFisico clienteFisico) {
		Document doc = this.convertClienteFisicoEmDocumento(clienteFisico);
		this.clienteFisicoCollection.updateOne(Filters.eq("cpf", clienteFisico.getCpf()), (Bson) doc);
	}

	public boolean deletarPorCpf(String cpf) {
		clienteFisicoCollection.deleteOne(Filters.eq("cpf", cpf));
		return true;
	}

	public ArrayList<ClienteFisico> buscarTodos() {
		MongoCursor<Document> cursor = clienteFisicoCollection.find().iterator();
		try {
			while (cursor.hasNext()) {
				ClienteFisico cf1 = this.convertDocumentoEmClienteFisico(cursor.next());
				clienteFisicos.add(cf1);
			}
		} finally {
			cursor.close();
		}
		return this.clienteFisicos;
	}

	public ClienteFisico buscarUmPorCPF(String cpf) {
		Document clienteFisicoDocumento = clienteFisicoCollection.find(Filters.eq("cpf", cpf)).first();
		ClienteFisico clienteFisico = gson.fromJson(clienteFisicoDocumento.toJson(), ClienteFisico.class);
		return clienteFisico;
	}

	public ClienteFisico buscarUmPorNome(String nome) {
		Document ClienteFisicoDocumento = clienteFisicoCollection.find(Filters.eq("nome", nome)).first();
		ClienteFisico clienteFisico = gson.fromJson(ClienteFisicoDocumento.toJson(), ClienteFisico.class);

		return clienteFisico;

	}

	public ArrayList<ClienteFisico> buscarNPorNome(String nome) {
		MongoCursor<Document> cursor = clienteFisicoCollection.find(Filters.eq("nome", nome)).iterator();
		clienteFisicos = new ArrayList<ClienteFisico>();
		try {
			while (cursor.hasNext()) {
				clienteFisicos.add(gson.fromJson(cursor.next().toJson(), ClienteFisico.class));
			}
		} finally {
			cursor.close();
		}
		return this.clienteFisicos;
	}
}
