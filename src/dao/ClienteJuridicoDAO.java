package dao;

import java.util.ArrayList;

import org.bson.Document;

import com.google.gson.JsonElement;
import com.mongodb.client.model.Filters;

import model.ClienteJuridico;
import model.Produto; 

public class ClienteJuridicoDAO {
    
private static final String ClienteJuridicoCollection = null;
//	private ArrayList<ClienteJuridico> todos = new ArrayList<>();
	//private DatabaseProvider database_provider = new DatabaseProvider();
	//MongoCollection<Document> clienteJuridicoCollection = database_provider.getDatabase().getCollection("ClienteJuridico");
	//private Gson gson = new Gson();
	//ArrayList<ClienteJuridico> clienteJuridico = new ArrayList<ClienteJuridico>();
   ArrayList<ClienteJuridico> clienteJuridico= new ArrayList <ClienteJuridico>();
   

	public static void adicionar(ClienteJuridico cj1) {
		Document doc = this.convertClienteJuridicoEmDocumento(cj1);
		this.ClienteJuridicoCollection.insertOne(doc);
	}
	private Document convertClienteJuridicoEmDocumento(ClienteJuridico cj1){
		Document doc = new Document()
				.append("nome", cj1.getNome())
				.append("cnpj", cj1.getCnpj())
				.append("endereco", cj1.getEndereco())
				.append("email", cj1.getEmail())
				.append("telefone", cj1.getTelefone());
		return doc;
	}
	//TODO
	private ClienteJuridico convertDocumentoEmClienteJuridico(Document doc){
		System.out.println(doc.get("valor"));
		String valorString = String.valueOf(doc.get("valor"));
		valorString = valorString.replace(",", ".");
		
		ClienteJuridico cj1 = new ClienteJuridico(
		(String)doc.get("nome"),
		(String)doc.get("cnpj"),
		(String)doc.get("endereco"),
		(String)doc.get("email"),
		(String)doc.get("telefone"));
		
		return cj1;
	}
	public void editarUm(ClienteJuridico cj1){
		Document doc = this.convertClienteJuridicoEmDocumento(cj1);
		this.ClienteJuridicoCollection.updateOne(Filters.eq("cnpj",cj1.getCnpj()), doc);
	}
	public boolean deletarPorCNPJ(String cnpj){
		ClienteJuridicoCollection.deleteOne(Filters.eq("cnpj", cnpj));
		return true;
	}
	public ArrayList<ClienteJuridico> buscarTodos(){
		MongoCursor<Document> cursor = ClienteJuridicoCollection.find().iterator();
		try {
		    while (cursor.hasNext()) {
		    	ClienteJuridico cj1 = this.convertDocumentoEmClienteJuridico(cursor.next());
		        ClienteJuridico.add(cj1);
		    }
		} finally {
		    cursor.close();
		}
		return this.clienteJuridico;
		
	}
	public ClienteJuridico buscarUmPorCNPJ(String cnpj) {
		Document clienteJuridicoDocumento = ClienteJuridicoCollection.find(Filters.eq("cnpj",cnpj)).first();
		ClienteJuridico clienteJuridico = gson.fromJson(clienteJuridicoDocumento.toJson(), ClienteJuridico.class);
		
		return clienteJuridico;
		
	}
	public ClienteJuridico buscarUmPorNome(String nome) {
		Document clienteJuridicoDocumento = clienteJuridicoCollection.find(Filters.eq("nome",nome)).first();
		ClienteJuridico clienteJuridico = gson.fromJson(clienteJuridicoDocumento.toJson(), ClienteJuridico.class);
		
		return clienteJuridico;
		
	}
     public ArrayList<ClienteJuridico> buscarNPorNome(String titulo) {
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

	}
	public static void adicionar(ClienteJuridico cj1) {
		// TODO Auto-generated method stub
		
	}

	