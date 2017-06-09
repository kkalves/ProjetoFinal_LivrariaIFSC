package Servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ClienteFisicoDAO;
import dao.ClienteJuridicoDAO;
import model.ClienteFisico;
import model.ClienteJuridico;

@WebServlet("/EditarClienteJuridico")
public class EditarClienteJuridico extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ClienteJuridicoDAO clienteJuridicodao = new ClienteJuridicoDAO();
		ClienteJuridico clienteJuridicoEditar = clienteJuridicodao.buscarUmPorCNPJ(req.getParameter("cnpj"));
		resp.setCharacterEncoding("UTF-8");
		RequestDispatcher view = req.getRequestDispatcher("/ProjetoFinal_Livraria/view/cadastros/FormularioEdicaoClienteJuridico.jsp");
		req.setAttribute("cliente", clienteJuridicoEditar );
		System.out.println(clienteJuridicoEditar.getNome());
		view.forward(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String nome = req.getParameter("nome");
        String cnpj = req.getParameter("cnpj");
		String email = req.getParameter("email");
		String sexo = req.getParameter("sexo");
		String telefone = req.getParameter("telefone");
		String endereco= req.getParameter("endereco");
		
		ClienteJuridicoDAO clienteJuridicodao = new ClienteJuridicoDAO();
		clienteJuridicodao.editarUm(new ClienteJuridico(nome, cnpj, email, sexo, telefone));
		RequestDispatcher view = req.getRequestDispatcher("/ProjetoFinal_Livraria/view/cadastros/FormularioEdicaoClienteJuridico.jsp");
		ClienteJuridico clienteJuridicoEditar = clienteJuridicodao.buscarUmPorCNPJ(cnpj);
		req.setAttribute("", clienteJuridicoEditar );
		view.forward(req, resp);
	}
}
