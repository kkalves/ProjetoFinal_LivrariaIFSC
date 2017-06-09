package dao;

import java.util.ArrayList;

import com.google.gson.JsonElement;

import model.ClienteFisico; 

public class ClienteFisicoDAO {
    
	private ArrayList<ClienteFisico> todos = new ArrayList<>();
	
	
	public void adicionar(ClienteFisico cliente){
		todos.add(cliente);
	}
	public void remover (int indice){
		todos.remove(indice);
	}
	public ArrayList<ClienteFisico> getTodos(){
		return todos;
			}
	public ClienteFisico buscarUmCpf(String parameter) {
		// TODO Auto-generated method stub
		return null;
	}
	public Boolean deletarPorCpf(String cpf) {
		// TODO Auto-generated method stub
		return null;
	}
	public JsonElement buscarTodos() {
		// TODO Auto-generated method stub
		return null;
	}
	public void editar(ClienteFisico clienteFisico) {
		// TODO Auto-generated method stub
		
	}
	}
