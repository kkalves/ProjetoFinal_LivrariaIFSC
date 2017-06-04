package dao;

import java.util.ArrayList;
import com.sun.javafx.collections.MappingChange.Map;
import model.Produto;

public class ProdutoDAO {

	private ArrayList<Produto> produtos;
	
	public ProdutoDAO() {
		this.produtos = new ArrayList<>();
		produtos.add(new Produto("Harry potter","JK Rowling","rocco","1","2003", "123", "É um otimo livro", "100"));
		produtos.add(new Produto("Senhor dos anéis","Tolkien","whatever","1","1900", "123", "É um otimo livro", "100"));
		produtos.add(new Produto("Harry potter","JK Rowling","rocco","1","2003", "123", "É um otimo livro", "100"));
		produtos.add(new Produto("Senhor dos anéis","Tolkien","whatever","1","1900", "123", "É um otimo livro", "100"));
		produtos.add(new Produto("Harry potter","JK Rowling","rocco","1","2003", "123", "É um otimo livro", "100"));
		produtos.add(new Produto("Senhor dos anéis","Tolkien","whatever","1","1900", "123", "É um otimo livro", "100"));
	}
	
	public void inserir(Produto p1){
		produtos.add(p1);
	}
	public Produto buscar(int index){
		return (Produto) produtos.get(index);
	}
	
	public void deletar(Produto p1){
		produtos.remove(p1);
	}
	
	public void deletarPorCodigo(int index){
		produtos.remove(index);
	}
	public ArrayList<Produto> buscarTodos(){
		return this.produtos;
		
	}

	public Produto buscarPorTitulo(String titulo) {
		for (Produto produto : this.produtos) {
			if(produto.getTitulo().equals(titulo)){
				return produto;
			}
		}
		return null;
		
	}
}
