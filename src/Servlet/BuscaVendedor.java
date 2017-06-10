package Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import dao.ClienteFisicoDAO;
import dao.VendedorDAO;
import model.ClienteFisico;
import model.Vendedor;

@WebServlet("/BuscaVendedor")
public class BuscaVendedor extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		VendedorDAO vendedorDao = new VendedorDAO();
		Vendedor vendedor = vendedorDao.buscarUmPorCPF(req.getParameter("cpf"));	
		if(vendedor == null){
			req.setAttribute("mensagem", "<div class='alert alert-danger'>Vendedor nao encontrado!</div>");
		}
		Gson gson = new Gson();
		resp.getWriter().write(gson.toJson(vendedor));
	}
}

