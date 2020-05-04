package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import logic.MyLogic;

/**
 * Servlet implementation class Myfirstservlet
 */
public class Myfirstservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Myfirstservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		commonMethod(request,response);
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		commonMethod(request,response);
	// TODO Auto-generated method stub
	}
private void commonMethod(HttpServletRequest request, HttpServletResponse response)
{
	String name=request.getParameter("names");
	String add=request.getParameter("adds");
	String gen=request.getParameter("gen");
	String stan=request.getParameter("selects");
	MyLogic mylogic=new MyLogic();
	mylogic.insert(name, add, gen, stan);
	
	

	
}
}
