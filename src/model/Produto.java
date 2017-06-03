package model;

public class Produto {
	private String titulo;
	private String autor;
	private String editora;
	private String numero;
	private String ano;
	private String isbn;
	private String descricao;
	private String valor;

	public Produto(String titulo, String autor, String editora, String numero, String ano, String isbn,
			String descricao, String valor) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.editora = editora;
		this.numero = numero;
		this.ano = ano;
		this.isbn = isbn;
		this.descricao = descricao;
		this.valor = valor;
	}
	
	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getEditora() {
		return editora;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getAno() {
		return ano;
	}
	public void setAno(String ano) {
		this.ano = ano;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
}
