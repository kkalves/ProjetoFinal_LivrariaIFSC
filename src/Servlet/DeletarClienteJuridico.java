package Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import dao.ClienteJuridicoDAO;

/**
 * Servlet implementation class DeletarCliente
 */
@WebServlet("/DeletarClienteJuridico")
public class DeletarClienteJuridico extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String cnpj = req.getParameter("cnpj");
		ClienteJuridicoDAO clienteJuridicodao = new ClienteJuridicoDAO();
		Boolean flagClienteJuridicoDeletado = clienteJuridicodao.deletarPorCnpj(cnpj);
		Gson gson = new Gson();
		if(flagClienteJuridicoDeletado == true){
			resp.getWriter().write(gson.toJson(clienteJuridicodao.buscarTodos()));
		}else{
			resp.getWriter().write(gson.toJson("Erro! Cliente nao deletado!"));
		}		
	}
}