package logic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;



public class MyLogic extends Resource {
	public void insert(String name,String add,String gen,String stan)
	{
		try{
			PreparedStatement ps;
	        Connection con=getConnection();
		//System.out.println(name);
		//System.out.println(add);
		//System.out.println(gen);
		//System.out.println(stan);
		
            String sql="INSERT INTO bipasha11 ('name','add','gen','stan') VALUES (?,?,?,?)";
	    
	        ps=con.prepareStatement(sql);
	        
	        ps.setString(1, name);
	        ps.setString(2, add);
	        ps.setString(3, gen);
	        ps.setString(4, stan);
	        ps.executeUpdate();
	        
		}catch(SQLException ee){
			ee.printStackTrace();	
			
		}
		
		
		
		}
		
		
}
	

