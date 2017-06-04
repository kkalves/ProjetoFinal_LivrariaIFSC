package Servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ProdutoDAO;
import model.Produto;

@WebServlet(urlPatterns="/FrenteCaixa")
public class FrenteCaixa extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ProdutoDAO produto_dao = new ProdutoDAO();
		RequestDispatcher view = req.getRequestDispatcher("/view/venda/FrenteCaixa.jsp");
		req.setAttribute("produtos", produto_dao.buscarTodos());
		view.forward(req, resp);
	}
}
