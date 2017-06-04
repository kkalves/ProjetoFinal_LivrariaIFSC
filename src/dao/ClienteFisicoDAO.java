package dao;

import java.util.ArrayList;
import model.ClienteFisico; 

public class ClienteFisicoDAO {
    
	private ArrayList<ClienteFisico> todos = new ArrayList<>();
	
	
	public void adicionar(ClienteFisico clientefisico){
		todos.add(clientefisico);
	}
	public void remover (int indice){
		todos.remove(indice);
	}
	public ArrayList<ClienteFisico> getTodos(){
		return todos;
			}
	public static void main (String[] args){
		ClienteFisicoDAO dao = new ClienteFisicoDAO();
		//dao.adicionar(new Cliente());
		//dao.adicionar(cliente());
		
		for(ClienteFisico clientefisico : dao.getTodos()){
			System.out.println(clientefisico);
	}
	}
	}
