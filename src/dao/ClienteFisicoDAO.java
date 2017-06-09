package dao;

import java.util.ArrayList;
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
	}
