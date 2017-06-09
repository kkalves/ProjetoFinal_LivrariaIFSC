package Servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ClienteFisicoDAO;
import model.ClienteFisico;

@WebServlet("/EditarClienteFisico")
public class EditarClienteFisico extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ClienteFisicoDAO clienteFisicodao = new ClienteFisicoDAO();
		ClienteFisico clienteFisicoEditar = clienteFisicodao.buscarUmPorCPF(req.getParameter("cpf"));
		resp.setCharacterEncoding("UTF-8");
		RequestDispatcher view = req.getRequestDispatcher("/ProjetoFinal_Livraria/view/cadastros/FormularioEdicaoClienteFisico.jsp");
		req.setAttribute("cliente", clienteFisicoEditar );
		System.out.println(clienteFisicoEditar.getNome());
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
		
		ClienteFisicoDAO clienteFisicodao = new ClienteFisicoDAO();
		clienteFisicodao.editar(new ClienteFisico(nome, cpf, email, sexo, telefone, endereco));
		RequestDispatcher view = req.getRequestDispatcher("/ProjetoFinal_Livraria/view/cadastros/FormularioEdicaoClienteFisico.jsp");
		ClienteFisico clienteFisicoEditar = clienteFisicodao.buscarUmPorCPF(cpf);
		req.setAttribute("", clienteFisicoEditar );
		view.forward(req, resp);
	}
}
