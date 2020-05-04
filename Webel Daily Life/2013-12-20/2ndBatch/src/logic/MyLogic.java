package logic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;;

public class MyLogic {
	
	// In java.sql package interface
	PreparedStatement ps;
	
	public Connection createConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");// "Driver name"

	Connection con=	DriverManager.getConnection("jdbc:mysql://localhost/wip2", "root", "");// static method it is used to take id and password of the database
	return con;
		/* database name
		 * user id 
		 * password
		 * 
		 * */
		/*Connectioncon =  DriverManager.getConnection("jdbc:mysql://localhost/wip2", "root", "");//interface in java.sql
		// DriverManager is a static method
		/*BUISNESS LOGIC*/
	}
	
	public void insert(String name, String address, String gender, String standard) {
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
			/*Connection*/ con= this.createConnection();
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
			ps.setString(1, name);
			ps.setString(2, address);
			ps.setString(3, standard);
			ps.setString(4, gender);
			int result = ps.executeUpdate();
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
			}
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
