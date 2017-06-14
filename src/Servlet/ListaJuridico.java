package Servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import dao.ClienteJuridicoDAO;

@WebServlet(urlPatterns="/listaJuridico")
public class ListaJuridico extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ClienteJuridicoDAO clienteJuridicodao = new ClienteJuridicoDAO();
		RequestDispatcher view = req.getRequestDispatcher("/view/Clientes/ListaJuridico.jsp");
		req.setAttribute("Cliente juridico", clienteJuridicodao.buscarTodos());
		view.forward(req, resp);
	}
}
