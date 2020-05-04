package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dto.Student;

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
		try {
			HttpSession session = request.getSession(); // Creation of session object. Session is available in server side but cookies is available in client side
			//String name = request.getParameter("stName");
			//String address = request.getParameter("address");
			//String gender = request.getParameter("gender");
			//String standard = request.getParameter("standard");
			
			
			Student student = new Student();
			student.setName(request.getParameter("stName"));
			student.setAddress(request.getParameter("address"));
			student.setGender(request.getParameter("gender"));
			student.setStandard(request.getParameter("standard"));
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
			int result = new MyLogic().insert(student);
			if (result != 0) {
				session.setAttribute("msg", "Your message");// "ID" , "object"
				/*
				 * By this line a table is created in database where 1st column
				 * is id and second is object is stored. Here we created a session which is
				 * stored in server side until and unless server is open and it is not destroyed by the use
				 * it is available.
				 * */
			} else {
				session.setAttribute("msg", "Error mesage");
			}
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
