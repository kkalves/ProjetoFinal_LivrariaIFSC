package Servlet;

import java.util.Date;

import model.ClienteFisico;
import model.ClienteJuridico;

public class CadastroClienteFisico extends  ClienteFisico {

	public CadastroClienteFisico(boolean tipo, String nome, String cpf, String email, String sexo, Date dataNascimento,
			String telefone) {
		super(tipo, nome, cpf, email, sexo, dataNascimento, telefone);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws SaslException, IOException {
		req.setCharacterEncoding("UTF-8");
		resp.setCharacterEncoding("UTF-8");
		RequestWrapper view = req.getRequestDispatcher("/view/cadastros/ClienteFisico.jsp");
		view.forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String nome = req.getParameter("nome");
        String cpf = req.getParameter("cpf");
		String email = req.getParameter("email");
		String sexo = req.getParameter("sexo");
		String telefone = req.getParameter("telefone");
		String bairro = req.getParameter("bairro");
		String cidade = req.getParameter("cidade");
		String estado= req.getParameter("estado");
		
		
		ClienteFisico p1 = new ClienteFisico(nome, cpf, email,sexo,  telefone, bairro, cidade, estado);
		ClienteFisicoDAO clientefisicoDAO = new ClienteFisicoDAO();
		clienteFisicoDAO.inserir(p1);
		
		ClienteFisico p2 = ClienteFisicoDAO.buscar(0);
		
		RequestDispatcher view = req.getRequestDispatcher("/view/cadastros/ClienteFisico.jsp");
		req.setAttribute("mensagem", "<div class='alert alert-success'>Cliente cadastrado com sucesso</div>");
		view.forward(req, resp);
	}
}

