package logic;


		import java.sql.Connection;
		import java.sql.DriverManager;
		import java.sql.PreparedStatement;
		import java.sql.SQLException;

		public class Resource {
		protected Connection getConnection(){
			Connection con=null;
			try{
				PreparedStatement ps=null;
				Class.forName("com.mysql.jdbc.Driver");
				con=DriverManager.getConnection("jdbc:mysql://localhost/bipasha1","root","");
				return con;
			}catch (ClassNotFoundException ee){
				ee.printStackTrace();
				return null;
			}
			catch (SQLException ee) {
				ee.printStackTrace();
				return null;
			}
		}
		}
		

