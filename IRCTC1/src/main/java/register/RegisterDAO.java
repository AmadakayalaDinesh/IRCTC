package register;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import common.DBCONNECTION;
import common.RegisterBean;

public class RegisterDAO {
	int s=0;
	
	public int Dinesh(RegisterBean rb)  {
		try {
		//Get The Connection 
		Connection con=DBCONNECTION.getCon();
		//Creating The Statement
		PreparedStatement ps=con.prepareStatement("insert into IRCTC values(?,?,?,?) ");
		ps.setString(1, rb.getPname());
		ps.setString(2, rb.getPtktno());
		ps.setString(3, rb.getPcoachtyp());
		ps.setString(4, rb.getPcoachno());
		
		s=ps.executeUpdate(); 
			
		
		}catch(Exception e) {
			e.printStackTrace();
		}
		return s;
		
	}
	
	

}
