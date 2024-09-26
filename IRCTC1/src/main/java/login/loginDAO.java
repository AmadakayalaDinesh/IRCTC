package login;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import common.DBCONNECTION;
import common.RegisterBean;

public class loginDAO {
	
	RegisterBean rb=null;
 
	public RegisterBean Dharan(String a,String b) {
		try {
			
			//get the connection
			Connection con=DBCONNECTION.getCon();
			//creating statement
			PreparedStatement ps=con.prepareStatement("Select * from IRCTC where pname=? And ptktno=?");
			   ps.setString(1,a);
			   ps.setString(2, b);
			   
			   ResultSet rs=ps.executeQuery();
			   if(rs.next()) {
				  
				  rb=new RegisterBean();
				  
				  rb.setPname(rs.getString(1));
				  rb.setPtktno(rs.getString(2));
                  rb.setPcoachno(rs.getString(3));
                  rb.setPcoachtyp(rs.getString(4));
                  
				   
				   
				   
			   }
			   
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	
		
		//Get The Connection Object
	
		
		
		
		
		
		
		
		
		return rb;
		
	}
}
