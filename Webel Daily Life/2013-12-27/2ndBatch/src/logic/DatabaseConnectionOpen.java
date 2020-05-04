package logic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnectionOpen {
	public static Connection createConnection() throws ClassNotFoundException, SQLException {
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
	}

}
