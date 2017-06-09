package Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import dao.ClienteFisicoDAO;
import dao.ProdutoDAO;
import model.ClienteFisico;
import model.Produto;

@WebServlet("/BuscaClienteFisico")
public class BuscaClienteFisico extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ClienteFisicoDAO clienteFisicoDao = new ClienteFisicoDAO();
		ClienteFisico clienteFisico = clienteFisicoDao.buscarUmCpf(req.getParameter("cnpj"));	
		if(clienteFisico == null){
			req.setAttribute("mensagem", "<div class='alert alert-danger'>Cliente nao encontrado!</div>");
		}
		Gson gson = new Gson();
		resp.getWriter().write(gson.toJson(clienteFisico));
	}
}
