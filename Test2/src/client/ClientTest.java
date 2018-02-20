package client;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import util.DBUtil;

public class ClientTest {

	public static void main(String[] args)throws SQLException {
		
		
		try(Connection con =DBUtil.getDataSource().getConnection();
		Statement st=con.createStatement();)	{
			
			String query="select * from user";
			ResultSet rs=st.executeQuery(query);
			
			while(rs.next()){
				
				String name=rs.getString("name");
				String email=rs.getString("email");
				
				System.out.println("Name : "+name+" Email : "+email);
				
			}
			
		}catch (Exception e) {
			e.printStackTrace();	
		}
		
	}
}
