package dao;

import java.util.ArrayList;
import com.sun.javafx.collections.MappingChange.Map;
import model.Produto;

public class ProdutoDAO {

	private ArrayList produtos;
	
	public ProdutoDAO() {
		this.produtos = new ArrayList<>();
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
}
