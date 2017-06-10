package dao;

import java.util.ArrayList;

import javax.swing.text.Document;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.mongodb.client.MongoCollection;

import model.ClienteFisico;
import model.ClienteJuridico;
import model.Produto;
import model.Vendedor;

public class ClienteFisicoDAO {

	private DatabaseProvider database_provider = new DatabaseProvider();
	MongoCollection<org.bson.Document> clienteFisicoCollection = database_provider.getDatabase().getCollection("ClienteFisico");
	private Gson gson = new Gson();

	private ArrayList<ClienteFisico> todos = new ArrayList<>();

	public void adicionar(ClienteFisico clientefisico) {

		todos.add(clientefisico);
	}

	public void remover(int indice) {
		todos.remove(indice);
	}

	public ArrayList<ClienteFisico> getTodos() {
		return todos;
	}

	public ClienteFisico buscarUmCpf(String parameter) {
		// TODO Auto-generated method stub
		return null;
	}

	public JsonElement buscarTodos() {
		// TODO Auto-generated method stub
		return null;
	}

	public Boolean deletarPorCpf(String cpf) {
		// TODO Auto-generated method stub
		return null;
	}

	public void editar(ClienteFisico clienteFisico) {
		// TODO Auto-generated method stub

	}
}
