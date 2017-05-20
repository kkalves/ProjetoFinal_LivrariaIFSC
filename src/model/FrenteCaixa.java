package model;

public class FrenteCaixa {

	private String produto;
	private String descricao;
	private int quantidade;
	private double valorUnitario;
	private double valorTotalProduto;
	private double valorTotal;
	//private Cliente cliente;
	private Vendedor vendedor;
	
	
	
	public String getProduto() {
		return produto;
	}
	public void setProduto(String produto) {
		this.produto = produto;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public double getValorUnitario() {
		return valorUnitario;
	}
	public void setValorUnitario(double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}
	public double getValorTotalProduto() {
		return valorTotalProduto;
	}
	public void setValorTotalProduto(double valorTotalProduto) {
		this.valorTotalProduto = valorTotalProduto;
	}
	public double getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}
	//public Cliente getCliente() {
		//return cliente;
	//}
	//public void setCliente(Cliente cliente) {
		//this.cliente = cliente;
	//}
	public Vendedor getVendedor() {
		return vendedor;
	}
	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}
	
	
}

