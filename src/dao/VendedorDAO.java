
package dao;

import java.util.ArrayList;
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
			}


