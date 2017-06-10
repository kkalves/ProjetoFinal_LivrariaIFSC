package dao;

import java.util.ArrayList;

import org.bson.Document;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.Filters;

import model.ClienteJuridico;
import model.Produto;
import model.Vendedor; 

public class ClienteJuridicoDAO {
    
	private DatabaseProvider database_provider = new DatabaseProvider();
	MongoCollection<org.bson.Document> clienteJuridicocollection = database_provider.getDatabase().getCollection("ClienteJuridico");
	private Gson gson = new Gson();

	private static ArrayList<ClienteJuridico> todos = new ArrayList<>();
	
	
	public static void adicionar(ClienteJuridico clienteJuridico){
		todos.add(clienteJuridico);
	}
	public void remover (int indice){
		todos.remove(indice);
	}
	public ArrayList<ClienteJuridico> getTodos(){
		return todos;
			}
	public Vendedor buscarUmCpf(String parameter) {
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
	public void editar(ClienteJuridico clienteJuridico) {
		// TODO Auto-generated method stub
		
	}
	public ClienteJuridico buscarUmPorCNPJ(String parameter) {
		// TODO Auto-generated method stub
		return null;
	}
	public Boolean deletarPorCNPJ(String cnpj) {
		// TODO Auto-generated method stub
		return null;
	}
	}


	
	