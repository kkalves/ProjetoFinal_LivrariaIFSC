package Servlet;

import java.io.IOException;

import javax.security.sasl.SaslException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.ClienteJuridico;

@WebServlet(urlPatterns = "/CadastroClienteJuridico")
public class CadastroClienteJuridico extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws SaslException, IOException, ServletException {
		resp.setCharacterEncoding("UTF-8");
		RequestDispatcher view = req.getRequestDispatcher("/view/cadastros/CadastroCliente.jsp");
		view.forward(req, resp);
	}

	@Override
	 protected void doPost(HttpServletRequest req, HttpServletResponse resp)throws ServletException, IOException {
	 String nome = req.getParameter("nome");
	 String cpf_cnpj = req.getParameter("cpf_cnpj");
	 String email = req.getParameter("email");
	 String sexo = req.getParameter("sexo");
	 String dataNascimento = req.getParameter("dataNascimento");
	 String telefone = req.getParameter("telefone");
	 String bairro = req.getParameter("bairro");
	 String cidade = req.getParameter("cidade");
	 String estado= req.getParameter("estado");
	
	
//	 Cliente p1 = new Cliente(nome, cpf_cnpj, email, sexo, dataNascimento, telefone);
//	 ClienteFisicoDAO clientefisicoDAO = new ClienteFisicoDAO();
//	 clienteFisicoDAO.inserir(p1);
//	
//	 Cliente p2 = ClienteFisicoDAO.buscar(0);
	
	 RequestDispatcher view =
	 req.getRequestDispatcher("/view/cadastros/ClienteFisico.jsp");
	 req.setAttribute("mensagem", "<div class='alert alert-success'>Cliente cadastrado com sucesso</div>");
	 view.forward(req, resp);
	 }
}
