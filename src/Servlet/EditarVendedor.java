package Servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ClienteFisicoDAO;
import dao.VendedorDAO;
import model.ClienteFisico;
import model.Vendedor;

@WebServlet("/EditarVendedor")
public class EditarVendedor extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		VendedorDAO vendedordao = new VendedorDAO();
		Vendedor vendedorEditar = vendedordao.buscarUmPorCPF(req.getParameter("cpf"));
		resp.setCharacterEncoding("UTF-8");
		RequestDispatcher view = req
				.getRequestDispatcher("/ProjetoFinal_Livraria/view/cadastros/FormularioEdicaoVendedor.jsp");
		req.setAttribute("Vendedor", vendedorEditar);
		System.out.println(vendedorEditar.getNome());
		view.forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String nome = req.getParameter("nome");
		String cpf = req.getParameter("cpf");
		String email = req.getParameter("email");
		String sexo = req.getParameter("sexo");
		String telefone = req.getParameter("telefone");
		String endereco = req.getParameter("endereco");

		VendedorDAO vendedordao = new VendedorDAO();
		vendedordao.editar(new Vendedor(nome, cpf, email, sexo, null, telefone, endereco, endereco));
		RequestDispatcher view = req
				.getRequestDispatcher("/ProjetoFinal_Livraria/view/cadastros/FormularioEdicaoVendedor.jsp");
		Vendedor vendedorEditar = vendedordao.buscarUmPorCPF(cpf);
		req.setAttribute("", vendedorEditar);
		view.forward(req, resp);
	}
}
