package Servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import dao.ProdutoDAO;
import model.Produto;

@WebServlet(urlPatterns="/buscaProduto")
public class BuscaProduto extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ProdutoDAO produto_dao = new ProdutoDAO();
		Produto produto = produto_dao.buscarPorTitulo(req.getParameter("titulo"));	
		if(produto == null){
			req.setAttribute("mensagem", "<div class='alert alert-danger'>Produto não encontrado!</div>");
		}
		Gson gson = new Gson();
		resp.getWriter().write(gson.toJson(produto));
	}
}
