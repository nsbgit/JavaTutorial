package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import logic.MyFirstLogic;

/**
 * Servlet implementation class MyFirstServlet
 */
public class MyFirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private HttpSession session;
       
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
		String gender = request.getParameter("gender");
		String standard = request.getParameter("standard");
		String contactNumber = request.getParameter("conNum");
		
		/*
		System.out.println(name);
		System.out.println(address);
		System.out.println(gender);
		System.out.println(standard);
		System.out.println(conNum);
		*/
		
		//MyFirstLogic myFirstLogic = new MyFirstLogic();
		int successfullDatabaseUpdateChecker = new MyFirstLogic().insert(name, address, gender, standard, contactNumber);
		session = request.getSession(); // Creation of session object. Session is available in server side but cookies is available in client side
		if (successfullDatabaseUpdateChecker != 0) {
			session.setAttribute("msg", "Hurray!!! Your information is successfully submitted"); // It will show success message
		} else {
			session.setAttribute("msg", "Sorry!!! Submission faild"); // It will show error message
		}
		try {
			response.sendRedirect("1st.jsp");
			/*
			 * Here we redirect to the above page so that the user can not
			 * see the servlet side.
			 * */
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
