package Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.ClienteFisico;
import dao.ClienteFisicoDAO;

@WebServlet(urlPatterns="/CadastroClienteFisico")
public class CadastroClienteFisico extends HttpServlet {


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
        String cpf = req.getParameter("cpf");
		String email = req.getParameter("email");
		String sexo = req.getParameter("sexo");
		String telefone = req.getParameter("telefone");
		String endereco= req.getParameter("endereco");
		
		
		ClienteFisico cf1 = new ClienteFisico(nome, cpf, email, sexo, telefone, endereco);
		ClienteFisicoDAO clienteDAO = new ClienteFisicoDAO();
		clienteDAO.adicionar(cf1);
		
		//ClienteFisico cf2 = ClienteDAO.buscar(0);
		//o metodo buscar não foi criado!!!
		RequestDispatcher view = req.getRequestDispatcher("/view/cadastros/ClienteFisico.jsp");
		req.setAttribute("mensagem", "<div class='alert alert-success'>Cliente cadastrado com sucesso</div>");
		view.forward(req, resp);
	}
}

