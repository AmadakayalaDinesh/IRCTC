package editing;
import java.io.*;
import java.sql.*;

import common.RegisterBean;
import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;
@SuppressWarnings("serial")
@WebServlet("/Edit")
public class EditServlet extends HttpServlet {
	protected void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException{
		
		HttpSession gk=req.getSession(false);
		
		String ak=req.getParameter("ptk");
		
		RegisterBean hj=(RegisterBean)gk.getAttribute("msg");
		
		if(ak.equals(hj.getPtktno())) {
			/*PrintWriter pw=res.getWriter();
			pw.println(hj.getPcoachno()+" "+hj.getPcoachtyp()+" "+hj.getPname()+" "+hj.getPtktno());*/
			req.setAttribute("msg1",hj);
			req.getRequestDispatcher("edit.jsp").forward(req, res);			
		}
		else
		{
			req.setAttribute("msg", "Edit Not Avalible");
			req.getRequestDispatcher("fail.jsp").forward(req, res);
		}
		
		
		
	}
	

}
