package Servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ProdutoDAO;
import model.Produto;

@WebServlet(urlPatterns="/editarProduto")
public class EditarProduto extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ProdutoDAO produto_dao = new ProdutoDAO();
		Produto produtoAEditar = produto_dao.buscarUmPorISBN(req.getParameter("isbn"));
		resp.setCharacterEncoding("UTF-8");
		RequestDispatcher view = req.getRequestDispatcher("/view/cadastros/FormularioEdicaoProduto.jsp");
		req.setAttribute("produto", produtoAEditar );
		System.out.println(produtoAEditar.getDescricao());
		view.forward(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String titulo = req.getParameter("titulo");
		String autor = req.getParameter("autor");
		String editora = req.getParameter("editora");
		String numero = req.getParameter("numero-edicao");
		String ano = req.getParameter("ano");
		String isbn = req.getParameter("isbn");
		String descricao = req.getParameter("descricao");
		String valor = req.getParameter("valor");
		
		ProdutoDAO produto_dao = new ProdutoDAO();
		produto_dao.editarUm(new Produto(titulo, autor, editora, numero, ano, isbn, descricao, valor));
		RequestDispatcher view = req.getRequestDispatcher("/view/cadastros/FormularioEdicaoProduto.jsp");
		Produto produtoAEditar = produto_dao.buscarUmPorISBN(isbn);
		req.setAttribute("produto", produtoAEditar );
		view.forward(req, resp);
	}
}
