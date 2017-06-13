package dao;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoDatabase;

class DatabaseProvider{
	private MongoClient mongo_client;
	private String nomeBancoDeDados = "Livraria";
	private final String MONGO_URI = "mongodb://localhost:27017";
	
	public MongoDatabase getDatabase(){
		this.mongo_client = new MongoClient(new MongoClientURI(MONGO_URI));
		return this.mongo_client.getDatabase(this.nomeBancoDeDados);
	} 
}