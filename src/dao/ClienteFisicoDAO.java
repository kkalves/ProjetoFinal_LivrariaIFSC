package dao;

import java.util.ArrayList;

import javax.swing.text.Document;

import com.google.gson.JsonElement;

import model.ClienteFisico;
import model.ClienteJuridico; 

public class ClienteFisicoDAO {
    
	
	private DatabaseProvider database_provider = new DatabaseProvider();
	MongoCollection<Document> clienteJuridicoCollection = database_provider.getDatabase().getCollection("ClienteFisico");
	private Gson gson = new Gson();
	private ArrayList<ClienteFisico> todos = new ArrayList<ClienteFisico>();
	
	public void inserir(ClienteFisico cf1){
		Document doc = this.convertClienteFisicoEmDocumento(cf1);
		this.ClienteFisicoCollection.insertOne(doc);
	}
	private Document convertClienteJuridicoEmDocumento(ClienteJuridico cf1){
		Document doc = new Document()
				.append("nome", cf1.getNome())
				.append("cpf", cf1.getCpf())
				.append("sexo" cf1.getSexo())
				.append("endereco", cf1.getEndereco())
				.append("email", cf1.getEmail())
				.append("telefone", cf1.getTelefone());
		return doc;
	}
	//TODO
	private ClienteFisico convertDocumentoEmClienteFisico(Document doc){
		System.out.println(doc.get("valor"));
		String valorString = String.valueOf(doc.get("valor"));
		valorString = valorString.replace(",", ".");
		
		ClienteFisico cf1 = new ClienteFisico(
		(String)doc.get("nome"),
		(String)doc.get("cpj"),
		(String)doc.get("endereco"),
		(String)doc.get("email"),
		(String)doc.get("telefone"),
		valorString);
		
		return cf1;
	}
	public void editarUm(ClienteFisico cf1){
		Document doc = this.convertClienteFisicoEmDocumento(cf1);
		this.clienteFisicoCollection.updateOne(Filters.eq("cpf",cf1.getCpf()), doc);
	}
	public boolean deletarPorCPF(String cpf){
		clienteFisicoCollection.deleteOne(Filters.eq("cpf", cpf));
		return true;
	}
	public ArrayList<CienteFisico> buscarTodos(){
		MongoCursor<Document> cursor = ClienteFisicoCollection.find().iterator();
		try {
		    while (cursor.hasNext()) {
		    	ClienteFisico cf1 = this.convertDocumentoEmClienteFisico(cursor.next());
		        ClienteFisico.add(cf1);
		    }
		} finally {
		    cursor.close();
		}
		return this.clienteFisico;
		
	}
	public ClienteFisico buscarUmPorCPF(String cpf) {
		Document clienteFisicocDocumento = clienteFisicoCollection.find(Filters.eq("cpf",cpf)).first();
		ClienteFisico clienteFisico = gson.fromJson(clienteFisicoDocumento.toJson(), ClienteFisico.class);
		
		return clienteFisico;
		
	}
	public ClienteFisico buscarUmPor(String nome) {
		Document ClienteFisicoDocumento = clienteFisicoCollection.find(Filters.eq("nome",nome)).first();
		ClienteFisico clienteFisico = gson.fromJson(clienteFisicoDocumento.toJson(), ClienteFisico.class);
		
		return produto;
		
	}
	/*public ArrayList<Produto> buscarNPorTitulo(String titulo) {
		MongoCursor<Document> cursor = produtoCollection.find(Filters.eq("titulo", titulo)).iterator();
		produtos = new ArrayList<Produto>();
		try {
		    while (cursor.hasNext()) {
		        produtos.add(gson.fromJson(cursor.next().toJson(), Produto.class));
		    }
		} finally {
		    cursor.close();
		}
		return this.produtos;
	}*/
	public static void adicionar(ClienteJuridico cj1) {
		// TODO Auto-generated method stub
		
	}
	public void editar(ClienteFisico clienteFisico) {
		// TODO Auto-generated method stub
		
	}
	public void editar(ClienteFisico clienteFisico) {
		// TODO Auto-generated method stub
		
	}
	public static void adicionar(ClienteJuridico cj1) {
		// TODO Auto-generated method stub
		
	}
}
