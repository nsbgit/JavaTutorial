package logic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class MyFirstLogic {
	
	private Connection con;
	private PreparedStatement ps;
	private int successfullDatabaseUpdateChecker;
	private Connection connection;
	private PreparedStatement preparedStatement;
	private ResultSet resultSet;
	private int countColumn;
	private String[] data;
	private ArrayList arrayList;
	
	
	public Connection createConnection() throws ClassNotFoundException, SQLException {
		// Here error handle is necessary by throw method because we have to
		// close non java resources in finally block which is in the other method from
		// where it is calling
		
		Class.forName("com.mysql.jdbc.Driver"); //Driver name in the string argument
		Connection conTemp = DriverManager.getConnection("jdbc:mysql://localhost/wip2", "root", "");
		
		/*
		 * This Connection is a interface in java.sql package and the driver manager is a another
		 * class in the same package. The getConnection is a static method which contains three strings
		 * as the argument they are respectively -
		 * 1. Url address of the database u want to connect. Which have to written in this proper syntax.
		 * 2. User Id of the database.(default user id of mysql database is "root")
		 * 3. Password of the database. (default password of mysql database is "root")
		 * */
		
		return conTemp;
		// This line will return the value of the temporary connection object which will be stored in the other variables
	}
	
	public int insert(String name, String address, String gender, String standard, String contactNumber) {
		try {
			con = this.createConnection(); // Create connection object for all connection process with database
			
			/*
			 * This con will receive the object from the corresponding method call.
			 * This con is the connection object all types of database connection is done
			 * with this object
			 * */
			
			/********	ADDING OR INSERTING A DATA FROM JSP PAGE TO DATA BASE THROUGH SQL COMMAND	**********/
			
			String sql = "INSERT INTO student(name, address, gender, standard, contactNumber) VALUES(?,?,?,?,?)";
			/*
			 * The question marks (?) will be replaced by the value passed here from the jsp page by the following code 
			 * */
			
			ps = con.prepareStatement(sql);
			
			ps.setString(1, name);  // this line will replace the first question mark with the data of name and so on
			ps.setString(2, address);
			ps.setString(3, gender);
			ps.setString(4, standard);
			ps.setString(5, contactNumber);
			
			successfullDatabaseUpdateChecker = ps.executeUpdate();
			//System.out.println(successfullDatabaseUpdateChecker);
			
			// return 1 for successful insertion of 1 row and 2 for 2 row and so on and 0 for no updation occured 
			
			/*************************************************************************************************/
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				ps.close();
				con.close();
				
				/*
				 * This ps and con is to be close on a stack(LIFO) manner
				 * i.e. which is created at last that will close at the first
				 * */
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return successfullDatabaseUpdateChecker;
	}
	
	public ArrayList getRecords() {
		try {
			connection = this.createConnection();
			String sql = "SELECT name, address, gender, standard, contactNumber FROM student";// Select attributes from table student
			preparedStatement = connection.prepareStatement(sql);
			resultSet = preparedStatement.executeQuery();
			/*
			 * As here any row is not affected trough the selection
			 * process so that we would call executeQuery() method which
			 * will return a object which will contain all the mata-data
			 * of the database.
			 * 
			 * It is result set which contains the metadata i.e. all information of the table and attribute selected
			 * then we have to store rs data into a array list object
			 * */
			//String[] data; // String array of object
			countColumn = resultSet.getMetaData().getColumnCount(); // Get the column number that resultSet holds
			arrayList = new ArrayList();
			while (resultSet.next()) { // resultSet.next() will return true if there is present next row in resultSet object
				
					System.out.println(resultSet.getString(1));
					System.out.println(resultSet.getString(2));
					System.out.println(resultSet.getString(3));
					System.out.println(resultSet.getString(4));
				
				data = new String[countColumn];
				
				for (int i = 0; i < countColumn; i++) {
					data[i] = resultSet.getString(i+1);//Attribute is started from 1 in resultSet meta-data and the data i.e. the string objects are stored in a array of string object
				}
				arrayList.add(data); //the sting array is stored in array list
				/*
				 * As we have to close the connection as well as the preparedStatement and the resultSet so the
				 * value we need will be also destroyed, so as a solution we stores the data in a array list
				 * before closing of the connections and all.
				 * */
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				resultSet.close();
				preparedStatement.close();
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return arrayList;
		
	}
}
