package Servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ClienteFisicoDAO;

@WebServlet(urlPatterns="/listaFisico")
public class ListaFisico extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ClienteFisicoDAO clienteFisicodao = new ClienteFisicoDAO();
		RequestDispatcher view = req.getRequestDispatcher("/view/Clientes/ListaFisico.jsp");
		req.setAttribute("Cliente", clienteFisicodao.buscarTodos());
		view.forward(req, resp);
	}
}
