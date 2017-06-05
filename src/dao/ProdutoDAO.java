package dao;

import java.util.ArrayList;
import com.sun.javafx.collections.MappingChange.Map;
import model.Produto;

public class ProdutoDAO {

	private ArrayList<Produto> produtos;
	
	public ProdutoDAO() {
		this.produtos = new ArrayList<>();
		produtos.add(new Produto("HarryPotter","JK Rowling","rocco","1","2003", "123", "É um otimo livro", "100"));
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
	
	public boolean deletarPorISBN(String titulo){
		Produto produto = this.buscarUmPorISBN(titulo);
		if(produto == null){
			return false;
		}
		produtos.remove(produto);
		return true;
	}
	public ArrayList<Produto> buscarTodos(){
		return this.produtos;
		
	}
	public Produto buscarUmPorISBN(String isbn) {
		for (Produto produto : this.produtos) {
			if(produto.getIsbn().trim().equals(isbn.trim())){
				return produto;
			}
		}
		return null;
		
	}
	public Produto buscarUmPorTitulo(String titulo) {
		for (Produto produto : this.produtos) {
			if(produto.getTitulo().trim().toLowerCase().equals(titulo.trim().toLowerCase())){
				return produto;
			}
		}
		return null;
		
	}
	public ArrayList<Produto> buscarNPorTitulo(String titulo) {
		ArrayList<Produto> ProdutosEncontrados = new ArrayList();
		for (Produto produto : this.produtos) {
			System.out.println(produto.getTitulo());
			if(produto.getTitulo().trim().toLowerCase().equals(titulo.trim().toLowerCase())){
				
				ProdutosEncontrados.add(produto);
			}
		}
		if(ProdutosEncontrados.isEmpty()){
			ProdutosEncontrados = null;
		}
		return ProdutosEncontrados;
	}
}
