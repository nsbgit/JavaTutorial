package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import logic.MyLogic;

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
		String name = request.getParameter("stName");
		String address = request.getParameter("address");
		String gender = request.getParameter("gender");
		String standard = request.getParameter("standard");
		
		/*
		System.out.println("Name : " + name);
		System.out.println("---------------");
		System.out.println("Address : " + address);
		System.out.println("---------------");
		System.out.println("Gender : " + gender);
		System.out.println("---------------");
		System.out.println("Standard : " + standard);
		*/
		
		//MyLogic myLogic = new MyLogic();
		new MyLogic().insert(name, address, gender, standard);
	}

}
