
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
			public static void main (String[] args){
				VendedorDAO dao = new VendedorDAO();
				//dao.adicionar(new Cliente());
				//dao.adicionar(cliente());
				
				for(Vendedor vendedor : dao.getTodos()){
					System.out.println(vendedor);
			}
			}
			}


