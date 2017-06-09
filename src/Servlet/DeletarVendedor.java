package Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import dao.VendedorDAO;

@WebServlet("/DeletarVendedor")
public class DeletarVendedor extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String cpf = req.getParameter("cpf");
		VendedorDAO vendedordao = new VendedorDAO();
		Boolean flagVendedorDeletado = vendedordao.deletarPorCpf(cpf);
		Gson gson = new Gson();
		if(flagVendedorDeletado == true){
			resp.getWriter().write(gson.toJson(vendedordao.buscarTodos()));
		}else{
			resp.getWriter().write(gson.toJson("Erro! Vendedor nao deletado!"));
		}		
	}
}