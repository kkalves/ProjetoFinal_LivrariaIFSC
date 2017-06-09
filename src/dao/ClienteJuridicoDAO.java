package dao;

import java.util.ArrayList;
import model.ClienteJuridico; 

public class ClienteJuridicoDAO {
    
	private ArrayList<ClienteJuridico> todos = new ArrayList<>();
	
	
	public void adicionar(ClienteJuridico cliente){
		todos.add(cliente);
	}
	public void remover (int indice){
		todos.remove(indice);
	}
	public ArrayList<ClienteJuridico> getTodos(){
		return todos;
			}
	public static void main (String[] args){
		ClienteJuridicoDAO dao = new ClienteJuridicoDAO();
		//dao.adicionar(new Cliente());
		//dao.adicionar(cliente());
		
		for(ClienteJuridico cliente : dao.getTodos()){
			System.out.println(cliente);
	}
	}
	public ClienteJuridico buscarUmCpf(String parameter) {
		// TODO Auto-generated method stub
		return null;
	}
	}
