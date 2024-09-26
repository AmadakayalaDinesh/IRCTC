package editing;

import java.sql.Connection;
import java.sql.PreparedStatement;

import common.DBCONNECTION;
import common.RegisterBean;

public class UpdateDAO {
	
	public int k=0;
	//CRAETEING METHOD
	public int Reddy(RegisterBean bk) {
		try {
	//Get The Connection
	Connection con=DBCONNECTION.getCon();
	
	//Creating The Statement
	
	PreparedStatement ps=con.prepareStatement("Update IRCTC set pname=?,pcaochno=?,pcoachtype=? where ptktno=?");
	       ps.setString(1, bk.getPname());
	       ps.setString(2, bk.getPcoachno());
	       ps.setString(3, bk.getPcoachtyp());
	       ps.setString(4, bk.getPtktno());
	        
	       k=ps.executeUpdate();
	       

}catch(Exception e) {
	e.printStackTrace();
}
		return k;

}
}