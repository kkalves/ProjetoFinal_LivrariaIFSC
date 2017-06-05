package Servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import dao.ProdutoDAO;
import model.Produto;

@WebServlet(urlPatterns="/buscaProdutos")
public class BuscaProdutos extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ProdutoDAO produto_dao = new ProdutoDAO();
		ArrayList<Produto> produtosEncontrados = new ArrayList<Produto>();
		if(req.getParameter("titulo").isEmpty()){
			produtosEncontrados = produto_dao.buscarTodos();
		}else{
			produtosEncontrados = produto_dao.buscarNPorTitulo(req.getParameter("titulo"));
		}
		if(produtosEncontrados == null){
			req.setAttribute("mensagem", "<div class='alert alert-danger'>Produto não encontrado!</div>");
		}
		Gson gson = new Gson();
		resp.getWriter().write(gson.toJson(produtosEncontrados));
	}
}
