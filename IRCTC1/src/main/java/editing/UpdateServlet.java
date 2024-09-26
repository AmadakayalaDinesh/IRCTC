package editing;
import java.io.*;
import java.sql.*;

import common.RegisterBean;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
@SuppressWarnings("serial")
@WebServlet("/upd")
public class UpdateServlet extends HttpServlet{

	protected void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException{
		
	RegisterBean rb=new RegisterBean();	
	
	rb.setPname(req.getParameter("jok1"));
	rb.setPtktno(req.getParameter("jok"));
	rb.setPcoachno(req.getParameter("jok3"));
	rb.setPcoachtyp(req.getParameter("jok4"));
	/*PrintWriter pw=res.getWriter();
	pw.println(rb.getPcoachno()+rb.getPname()+rb.getPtktno()+rb.getPtktno());*/
	UpdateDAO sp=new UpdateDAO();
	   int k= sp.Reddy(rb);
	   
	   if(k>0) {
		
	req.setAttribute("msg2", "Updated Succesfuly");
	req.getRequestDispatcher("update.jsp").forward(req, res);
		   
		   
	   }
	   else
	   {
		   req.setAttribute("msg", "Your Data Is Not Updated Bro");
		   req.getRequestDispatcher("fail.jsp").forward(req, res);
	   }
		
		
		
	}


}
