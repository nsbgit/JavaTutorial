package logic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.ArrayList;

import dto.Student;

public class MyLogic {
	
	// In java.sql package interface
	PreparedStatement ps;
	private int result;
	/*
	public Connection createConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");// "Driver name"

		Connection con=	DriverManager.getConnection("jdbc:mysql://localhost/wip2", "root", "");// static method it is used to take id and password of the database\
		return con;
		/* database name
		 * user id 
		 * password
		 * 
		 * */
		/*Connectioncon =  DriverManager.getConnection("jdbc:mysql://localhost/wip2", "root", "");//interface in java.sql
		// DriverManager is a static method
		/*BUISNESS LOGIC*/
	//}
	
	public int insert(Student student) {
		Connection con=null;
		try {
			//Class.forName("com.mysql.jdbc.Driver");// "Driver name"
			//DriverManager.getConnection("jdbc:mysql://localhost/wip2", "", "");// static method it is used to take id and password of the database
			/* database name
			 * user id 
			 * password
			 * 
			 * */
			//Connection con =  DriverManager.getConnection("jdbc:mysql://localhost/wip2", "root", "");//interface in java.sql
			// DriverManager is a static method
			/*BUISNESS LOGIC*/
			/*Connection*/ con= DatabaseConnectionOpen.createConnection();
			/*
			 * We have to connect database
			 * */
			
			
			/*
			 * This con will receive the object from the corresponding method call.
			 * This con is the connection object all types of database connection is done
			 * with this object
			 * */
			
			String sql = "INSERT INTO student(name, address, standard, gender) VALUES (?,?,?,?)";
			/*PreparedStatement*/ps = con.prepareStatement(sql);
			ps.setString(1, student.getName());
			ps.setString(2, student.getAddress());
			ps.setString(3, student.getStandard());
			ps.setString(4, student.getGender());
			result = ps.executeUpdate();
			//System.out.println(result);
			
			
			/***********************/
			
			
			//con.close(); // for connection closing
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // File is to be loaded on runtime
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				ps.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return 0;
			}
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return 0;
			}
		}
		return result;
		
	}
	
	public ArrayList getRecords() {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		ArrayList ar = null;
		
		try {
			con = DatabaseConnectionOpen.createConnection();
			String sql = "SELECT name, address, standard, gender FROM student";// Select attributes from table student in any sequence
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			/*
			 * It is result set which contains the metadata i.e. all information of the table and attribute selected
			 * then we have to store rs data into a array list object
			 * */
			String data[]; // String array of object
			int count = rs.getMetaData().getColumnCount();// gets the column number that rs holds
			ar = new ArrayList();
			while (rs.next()) {
				/*
					System.out.println(rs.getString(1));
					System.out.println(rs.getString(2));
					System.out.println(rs.getString(3));
					System.out.println(rs.getString(4));
				*/
				
				/*
				 * Here we combine the 4 attributes string result into a array of object data
				 * */
				data = new String[count];
				for (int i = 0; i < count; i++) {
					data[i] = rs.getString(i+1);
				}
				ar.add(data);//the sting array is stored in array list
				
			}
			//return ar;
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		} finally {
			try {
				rs.close();
				ps.close();
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return ar;
		
	}

}
