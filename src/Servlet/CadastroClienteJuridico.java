package Servlet;

import java.io.IOException;

import javax.security.sasl.SaslException;
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

@WebServlet(urlPatterns = "/CadastroClienteJuridico")
public class CadastroClienteJuridico extends HttpServlet {



	private static final ClienteFisicoDAO CienteJuridicoDAO = null;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		resp.setCharacterEncoding("UTF-8");
		RequestDispatcher  view = req.getRequestDispatcher("/view/cadastros/ClienteFisico.jsp");
		view.forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String nome = req.getParameter("nome");
        String cnpj = req.getParameter("cnpj");
		String email = req.getParameter("email");
		String telefone = req.getParameter("telefone");
		String endereco= req.getParameter("endereco");
		
		
		ClienteJuridico cj1 = new ClienteJuridico(nome, cnpj, endereco, email, telefone );
		ClienteJuridicoDAO.adicionar(cj1);
		

		RequestDispatcher view = req.getRequestDispatcher("/view/cadastros/ClienteJuridico.jsp");
		req.setAttribute("mensagem", "<div class='alert alert-success'>Cliente cadastrado com sucesso</div>");
		view.forward(req, resp);
	}
}
