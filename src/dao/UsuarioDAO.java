package dao;

import java.util.ArrayList;

import org.bson.Document;

import com.google.gson.Gson;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.model.Filters;

import model.Usuario;

public class UsuarioDAO {

	private DatabaseProvider database_provider = new DatabaseProvider();
	MongoCollection<Document> usuarioCollection = database_provider.getDatabase().getCollection("Usuario");
	private Gson gson = new Gson();
	ArrayList<Usuario> usuarios = new ArrayList<Usuario>();

	private Document convertUsuarioEmDocumento(Usuario usuario) {
		Document doc = new Document().append("login", usuario.getLogin()).append("senha", usuario.getSenha());
		return doc;
	}

	private Usuario convertDocumentoEmUsuario(Document doc) {
		Usuario usuario = new Usuario((String) doc.get("login"), (String) doc.get("senha"));
		return usuario;
	}

	public void cadastrar(Usuario usuario) {
		Document doc = this.convertUsuarioEmDocumento(usuario);
		this.usuarioCollection.insertOne(doc);
	}

	public void editar(Usuario usuario) {
		Document doc = this.convertUsuarioEmDocumento(usuario);
		this.usuarioCollection.updateOne(Filters.eq("login", usuario.getLogin()), doc);
	}

	public boolean remover(String login) {
		this.usuarioCollection.deleteOne(Filters.eq("login", login));
		return true;
	}

	public ArrayList<Usuario> buscarTodos() {
		MongoCursor<Document> cursor = this.usuarioCollection.find().iterator();
		try {
			while (cursor.hasNext()) {
				Usuario usuario = this.convertDocumentoEmUsuario(cursor.next());
				usuarios.add(usuario);
			}
		} finally {
			cursor.close();
		}
		return this.usuarios;

	}

	public Usuario buscarUmPorLogin(String login) {
		Document usuarioDocument = this.usuarioCollection.find(Filters.eq("login", login)).first();
		Usuario usuario = gson.fromJson(usuarioDocument.toJson(), Usuario.class);
		return usuario;
	}

	 public String verificaLogin(Usuario usuario){
		 Usuario aux = buscarUmPorLogin(usuario.getLogin());
		 return "";
	 }
//	 String sqlVerifica = "select * from login where log_usuario=? and
//	 log_senha=?";
//	 String status = "";
//	
//	 try {
//	
//	 PreparedStatement stmt = connection.prepareStatement(sqlVerifica);
//	 stmt.setString(1, login.getLog_usuario());
//	 stmt.setString(2, login.getLog_senha());
//	 ResultSet rs = stmt.executeQuery();
//	
//	 if(rs.next()){
//	
//	 status = "true";
//	 }
//	
//	 } catch (SQLException erroSql) {
//	 throw new RuntimeException(erroSql);
//	 }
//	
//	 return status;
}
