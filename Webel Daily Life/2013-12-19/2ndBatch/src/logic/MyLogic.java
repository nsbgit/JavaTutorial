package logic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyLogic {
	
	public void insert(String name, String address, String gender, String standard) {
		try {
			Class.forName("com.mysql.jdbc.Driver");// "Driver name"
			//DriverManager.getConnection("jdbc:mysql://localhost/wip2", "", "");// static method it is used to take id and password of the database
			/* database name
			 * user id 
			 * password
			 * */
			Connection con =  DriverManager.getConnection("jdbc:mysql://localhost/wip2", "root", "");//interface in java.sql
			con.close();
			String s = "";
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // File is to be loaded on runtime
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}