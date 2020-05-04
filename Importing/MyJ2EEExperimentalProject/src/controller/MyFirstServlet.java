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
	private int databaseUpdateChecker;
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
		this.commonMethod(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.commonMethod(request, response);
	}
	
	private void commonMethod(HttpServletRequest request, HttpServletResponse response) {
		String firstName = request.getParameter("firstName");
		String middleName = request.getParameter("middleName");
		String lastName = request.getParameter("lastName");
		String address = request.getParameter("address"); 
		String gender = request.getParameter("gender");
		String dobDate = request.getParameter("dobDate");
		String dobMonth = request.getParameter("dobMonth");
		String dobYear = request.getParameter("dobYear");
		String dob = dobDate + "-" + dobMonth + "-" + dobYear;
		String college = request.getParameter("college");
		String stream = request.getParameter("stream");
		
		System.out.println(firstName);
		System.out.println(middleName);
		System.out.println(lastName);
		System.out.println(address);
		System.out.println(gender);
		System.out.println(dob);
		System.out.println(college);
		System.out.println(stream);
		
		
		databaseUpdateChecker = new MyFirstLogic().insert(firstName, middleName, lastName, address, gender, dob, college, stream);
		
		session = request.getSession();
		if (databaseUpdateChecker != 0) {
			session.setAttribute("msg", "Hurray!!! Your information is successfully submitted");
		} else {
			session.setAttribute("msg", "Sorry!!! Submission faild");
		}
		
		try {
			response.sendRedirect("home.jsp");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
