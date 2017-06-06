package Servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import dao.ProdutoDAO;

@WebServlet(urlPatterns="/deletarProduto")
public class DeletarProduto extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String isbn = req.getParameter("isbn");
		ProdutoDAO produto_dao = new ProdutoDAO();
		Boolean flagProdutoDeletado = produto_dao.deletarPorISBN(isbn);
		Gson gson = new Gson();
		if(flagProdutoDeletado == true){
			resp.getWriter().write(gson.toJson(produto_dao.buscarTodos()));
		}else{
			resp.getWriter().write(gson.toJson("Erro! Produto não deletado!"));
		}		
	}
}
