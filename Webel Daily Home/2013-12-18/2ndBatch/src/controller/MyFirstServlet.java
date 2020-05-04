package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyFirstServlet
 */
public class MyFirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyFirstServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		commonMethod(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		commonMethod(request, response);
	}
	
	private void commonMethod(HttpServletRequest request, HttpServletResponse response){
		String name = request.getParameter("name");
		String address = request.getParameter("address");
		String gender = request.getParameter("name");
		String standard = request.getParameter("standard");
		String conNum = request.getParameter("conNum");
		
		
		System.out.println(name);
		System.out.println(address);
		System.out.println(gender);
		System.out.println(standard);
		System.out.println(conNum);
	}

}
