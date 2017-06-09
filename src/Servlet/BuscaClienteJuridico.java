package Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import dao.ClienteFisicoDAO;
import dao.ClienteJuridicoDAO;
import dao.ProdutoDAO;
import model.ClienteFisico;
import model.ClienteJuridico;
import model.Produto;

@WebServlet("/BuscaClienteJuridico")
public class BuscaClienteJuridico extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ClienteJuridicoDAO clienteJuridicoDao = new ClienteJuridicoDAO();
		ClienteJuridico clienteJuridico = clienteJuridicoDao.buscarUmPorCNPJ(req.getParameter("cnpj"));	
		if(clienteJuridico == null){
			req.setAttribute("mensagem", "<div class='alert alert-danger'>Cliente nao encontrado!</div>");
		}
		Gson gson = new Gson();
		resp.getWriter().write(gson.toJson(clienteJuridico));
	}
}


