package it.alfasoft.rossella;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class PrimoServlet
 */
@WebServlet("/Servlet")
public class Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
	}
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String nome = request.getParameter("username");
		String password = request.getParameter("password");
		
		HttpSession session = request.getSession();
		PrintWriter writer = response.getWriter();//metodo che f tornare quello che scrivo
		
		if(!nome.isEmpty() && nome!=null){
			
		session.setAttribute("usernameSalvato", nome);
		
			if(password.equals("123")){
			writer.println("Registrazione avvenuta correttamente! Benvenuto/a "+ nome);
			}else{
			response.sendRedirect("login2.html");
		}
		
	}
	}
}
		
		





