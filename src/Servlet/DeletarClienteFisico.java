package Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import dao.ClienteFisicoDAO;


@WebServlet("/DeletarClienteFisico")
public class DeletarClienteFisico extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String cpf = req.getParameter("cpf");
		ClienteFisicoDAO clienteFisicodao = new ClienteFisicoDAO();
		Boolean flagClienteFisicoDeletado = clienteFisicodao.deletarPorCPF(cpf);
		Gson gson = new Gson();
		if(flagClienteFisicoDeletado == true){
			resp.getWriter().write(gson.toJson(clienteFisicodao.buscarTodos()));
		}else{
			resp.getWriter().write(gson.toJson("Erro! Cliente nao deletado!"));
		}		
	}
}
