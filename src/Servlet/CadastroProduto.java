package Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ProdutoDAO;
import model.Produto;

@WebServlet(urlPatterns="/CadastroProduto")
public class CadastroProduto extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		resp.setCharacterEncoding("UTF-8");
		RequestDispatcher view = req.getRequestDispatcher("/view/cadastros/FormularioCadastroProduto.jsp");
		view.forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String titulo = req.getParameter("titulo");
		String autor = req.getParameter("autor");
		String editora = req.getParameter("editora");
		String numero = req.getParameter("numero");
		String ano = req.getParameter("ano");
		String isbn = req.getParameter("isbn");
		String descricao = req.getParameter("descricao");
		String valor = req.getParameter("valor");
		
		Produto p1 = new Produto(titulo, autor, editora, numero, ano, isbn, descricao, valor);
		ProdutoDAO produtoDAO = new ProdutoDAO();
		produtoDAO.inserir(p1);
		
		Produto p2 = produtoDAO.buscar(0);
		
		RequestDispatcher view = req.getRequestDispatcher("/view/cadastros/FormularioCadastroProduto.jsp");
		req.setAttribute("mensagem", "<div class='alert alert-success'>Produto cadastrado com sucesso</div>");
		view.forward(req, resp);
	}
}
