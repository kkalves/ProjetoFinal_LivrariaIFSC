
package dao;

import java.util.ArrayList;

import com.google.gson.JsonElement;

import model.Vendedor; 

public class VendedorDAO {

		   
		    
			private ArrayList<Vendedor> todos = new ArrayList<>();
			
			
			public void adicionar(Vendedor vendedor){
				todos.add(vendedor);
			}
			public void remover (int indice){
				todos.remove(indice);
			}
			public ArrayList<Vendedor> getTodos(){
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
			public void editar(Vendedor vendedor) {
				// TODO Auto-generated method stub
				
			}
			}


