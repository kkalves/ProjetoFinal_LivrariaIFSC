package dao;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoDatabase;

class DatabaseProvider{
	private MongoClient mongo_client;
	private String nomeBancoDeDados = "Livraria";
	public MongoDatabase getDatabase(){
		this.mongo_client = new MongoClient(new MongoClientURI("mongodb://localhost:27017"));
		return this.mongo_client.getDatabase(this.nomeBancoDeDados);
	} 
	public void add(){
		
	}
}