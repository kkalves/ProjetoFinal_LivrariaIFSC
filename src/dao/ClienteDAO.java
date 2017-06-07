package dao;

import java.util.ArrayList;
import model.ClienteFisico; 

public class ClienteDAO {
    
	private ArrayList<Cliente> todos = new ArrayList<>();
	
	
	public void adicionar(Cliente cliente){
		todos.add(cliente);
	}
	public void remover (int indice){
		todos.remove(indice);
	}
	public ArrayList<Cliente> getTodos(){
		return todos;
			}
	public static void main (String[] args){
		ClienteDAO dao = new ClienteDAO();
		//dao.adicionar(new Cliente());
		//dao.adicionar(cliente());
		
		for(Cliente cliente : dao.getTodos()){
			System.out.println(clientefisico);
	}
	}
	}
