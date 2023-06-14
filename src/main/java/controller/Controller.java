package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.DAO;
import model.JavaBeans;

@WebServlet(urlPatterns = { "/Controller", "/main", "/insert" })
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
	DAO dao = new DAO();
	JavaBeans cadastro = new JavaBeans();

	public Controller() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getServletPath();
		System.out.println(action);
		if (action.equals("/main")) {
			cadastro(request, response);
		} else if (action.equals("/insert")) {
			novoCadastro(request, response);
		} else {
			response.sendRedirect("index.html");
		}
	}

	// listar cadastro
	protected void cadastro(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// Criando um objeto que irá receber os dados JavaBeans

		ArrayList<JavaBeans> lista = dao.listarCadastro();
		//Encaminhar a lista ao documento agenda.jsp
		request.setAttribute("cadastro", lista);
		RequestDispatcher rd = request.getRequestDispatcher("cadastro.jsp");
		rd.forward(request, response);
		
		/**
		// teste de recebimento da lista
		
		for(int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i).getIdDF());
			System.out.println(lista.get(i).getNome());
			System.out.println(lista.get(i).getQuant());
			System.out.println(lista.get(i).getTomb());
			System.out.println(lista.get(i).getText());
			System.out.println(lista.get(i).getValor());
		} **/
	}

	// Novo cadastro
	protected void novoCadastro(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// teste de recebimento dos dados do formulário
		/**
		 * System.out.println(request.getParameter("nome"));
		 * System.out.println(request.getParameter("quant"));
		 * System.out.println(request.getParameter("tomb"));
		 * System.out.println(request.getParameter("infor"));
		 * System.out.println(request.getParameter("valor"));
		 **/

		// setar as variaveis JavaBeans
		cadastro.setNome(request.getParameter("nome"));
		cadastro.setQuant(request.getParameter("quant"));
		cadastro.setTomb(request.getParameter("tomb"));
		cadastro.setText(request.getParameter("infor"));
		cadastro.setValor(request.getParameter("valor"));

		// invocar o metodo inserirCadastro passando o objeto cadastro
		dao.inserirCadastro(cadastro);

		// redirecionar para cadastro.jsp

		response.sendRedirect("main");
	}

}
