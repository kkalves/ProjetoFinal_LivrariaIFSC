package Servlet;

import java.io.IOException;

import javax.security.sasl.SaslException;
import javax.xml.ws.RequestWrapper;

import model.ClienteJuridico;

public class CadastroClienteJuridico extends  ClienteJuridico {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws SaslException, IOException {
		req.setCharacterEncoding("UTF-8");
		resp.setCharacterEncoding("UTF-8");
		RequestWrapper view = req.getRequestDispatcher("/view/cadastros/ClienteJuridico.jsp");
		view.forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String nome = req.getParameter("nome");
                             String cpf = req.getParameter("cpf");
		String email = req.getParameter("email");
		String sexo = req.getParameter("sexo");
		String telefone = req.getParameter("telefone");
		String bairro = req.getParameter("bairro");
		String cidade = req.getParameter("cidade");
		String estado= req.getParameter("estado");
		
		
		ClienteJuridico p1 = new ClienteJuridico(nome, cpf, email,sexo,  telefone, bairro, cidade, estado);
		ClienteJuridicoDAO clienteJuridicoDAO = new ClienteJuridicoDAO();
		clienteJuridicoDAO.inserir(p1);
		
		ClienteJuridico p2 = ClienteJuridicoDAO.buscar(0);
		
		RequestDispatcher view = req.getRequestDispatcher("/view/cadastros/ClienteJuridico.jsp");
		req.setAttribute("mensagem", "<div class='alert alert-success'>Cliente cadastrado com sucesso</div>");
		view.forward(req, resp);
	}
}

