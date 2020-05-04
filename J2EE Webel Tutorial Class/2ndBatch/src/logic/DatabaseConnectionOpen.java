package logic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnectionOpen {
	public static Connection createConnection() throws ClassNotFoundException, SQLException { // Here we made the method static because we don't have to create object for database connection open for that the uses of memory is decreased.
		// Here error handle is necessary by throw method because we have to
		// close non java resources in finally block which is in the other method from
		// where it is calling
		
		Class.forName("com.mysql.jdbc.Driver"); //Driver name in the string argument
		//Connection conTemp = DriverManager.getConnection("jdbc:mysql://localhost/wip2", "root", "");
		return DriverManager.getConnection("jdbc:mysql://localhost/wip2", "root", "");
		
		/*
		 * This Connection is a interface in java.sql package and the driver manager is a another
		 * class in the same package. The getConnection is a static method which contains three strings
		 * as the argument they are respectively -
		 * 1. Url address of the database u want to connect. Which have to written in this proper syntax.
		 * 2. User Id of the database.(default user id of mysql database is "root")
		 * 3. Password of the database. (default password of mysql database is "root")
		 * */
		
		
		// This line will return the value of the temporary connection object which will be stored in the other variables
	}
}
