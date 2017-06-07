package Servlet;

import java.util.Date;

import javax.servlet.http.HttpServlet;

import model.Vendedor;
import model.Vendedor;

public class CadastroVendedor extends HttpServlet {

//	public CadastroVendedor(boolean tipo, String nome, String cpf, String email, String sexo, Date dataNascimento,
//			String telefone) {
//		super(tipo, nome, cpf, email, sexo, dataNascimento, telefone);
//		// TODO Auto-generated constructor stub
//	}
//
//	@Override
//	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws SaslException, IOException {
//		req.setCharacterEncoding("UTF-8");
//		resp.setCharacterEncoding("UTF-8");
//		RequestWrapper view = req.getRequestDispatcher("/view/cadastros/Vendedor.jsp");
//		view.forward(req, resp);
//	}
//
//	@Override
//	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		String nome = req.getParameter("nome");
//        String cpf = req.getParameter("cpf");
//		String email = req.getParameter("email");
//		String sexo = req.getParameter("sexo");
//		String telefone = req.getParameter("telefone");
//		String bairro = req.getParameter("bairro");
//		String cidade = req.getParameter("cidade");
//		String estado= req.getParameter("estado");
//		
//		
//		Vendedor p1 = new Vendedor(nome, cpf, email,sexo,  telefone, bairro, cidade, estado);
//		VendedorDAO vendedorDAO = new ClienteFisicoDAO();
//		VendedorDAO.inserir(p1);
//		
//		Vendedor p2 = VendedorDAO.buscar(0);
//		
//		RequestDispatcher view = req.getRequestDispatcher("/view/cadastros/Vendedor.jsp");
//		req.setAttribute("mensagem", "<div class='alert alert-success'>Vendedor cadastrado com sucesso</div>");
//		view.forward(req, resp);
//	}
}

