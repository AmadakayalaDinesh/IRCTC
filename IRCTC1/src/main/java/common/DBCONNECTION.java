package common;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBCONNECTION {
	
	public static Connection con=null;
	
	private  DBCONNECTION () {}
		
		static {
			try {
			//Loading Driver
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			
			//DB-INFO-TO-DB CONNECTION
			con=DriverManager.getConnection(DB_INFO.URL,DB_INFO.UserName,DB_INFO.Password);
			
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		public static Connection getCon() {
			return con;
		} 
	}


