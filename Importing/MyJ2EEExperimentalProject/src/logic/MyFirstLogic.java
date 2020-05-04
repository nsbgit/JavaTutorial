package logic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class MyFirstLogic {
	private Connection connection;
	private PreparedStatement preparedStatement;
	private int databaseUpdateChecker;
	private ResultSet resultSet;
	private int columnCount;
	private ArrayList arrayList;
	private String[] data;

	@SuppressWarnings("finally")
	public int insert(String firstName, String middleName, String lastName, String address, String gender, String dob, String college, String stream) {
		
		try {
			connection = this.createConnection();
			String sql = "INSERT INTO student (firstName, middleName, lastName, address, gender, dob, college, stream) VALUES (?,?,?,?,?,?,?,?)";
			
			preparedStatement = connection.prepareStatement(sql);
			
			preparedStatement.setString(1, firstName);
			preparedStatement.setString(2, middleName);
			preparedStatement.setString(3, lastName);
			preparedStatement.setString(4, address);
			preparedStatement.setString(5, gender);
			preparedStatement.setString(6, dob);
			preparedStatement.setString(7, college);
			preparedStatement.setString(8, stream);
			
			databaseUpdateChecker = preparedStatement.executeUpdate();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 0;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 0;
		} finally {
			try {
				preparedStatement.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return databaseUpdateChecker;
		}
	}

	private Connection createConnection() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.jdbc.Driver");
		return DriverManager.getConnection("jdbc:mysql://localhost/studentRegistrationDatabase", "root", "526328");
	}
	
	public ArrayList getRecords() {
		try {
			connection = this.createConnection();
			String sql = "SELECT firstName, middleName, lastName, address, gender, dob, college, stream FROM student";
			
			preparedStatement = connection.prepareStatement(sql);
			resultSet = preparedStatement.executeQuery();
			columnCount = resultSet.getMetaData().getColumnCount();
			arrayList = new ArrayList();
			
			while (resultSet.next()) {
				/*
					System.out.println(resultSet.getString(1));
					System.out.println(resultSet.getString(2));
					System.out.println(resultSet.getString(3));
					System.out.println(resultSet.getString(4));
					System.out.println(resultSet.getString(5));
					System.out.println(resultSet.getString(6));
					System.out.println(resultSet.getString(7));
					System.out.println(resultSet.getString(8));
				*/
				
				data = new String[columnCount];
				
				for (int i = 0; i < columnCount; i++) {
					data[i] = resultSet.getString(i+1);
				}
				arrayList.add(data);
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
