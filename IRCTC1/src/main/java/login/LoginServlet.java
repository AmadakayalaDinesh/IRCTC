package login;
import java.io.*;

import common.RegisterBean;
import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;
@SuppressWarnings("serial")
@WebServlet("/login")
public class LoginServlet extends HttpServlet {

	protected void doPost(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException{
		
		String jk=req.getParameter("rk");
		String sk=req.getParameter("rk1");
		loginDAO  lg = new loginDAO();
		RegisterBean hhh=lg.Dharan(jk,sk);
		if(hhh==null) {
			req.setAttribute("msg","LoginFailed");
			req.getRequestDispatcher("fail.jsp").forward(req, res);;
		
		}
		else
		{
			  HttpSession hg=req.getSession();
			  hg.setAttribute("msg", hhh);
			  req.getRequestDispatcher("suc.jsp").forward(req, res);;
		}
		
		
		
		
		
		
	
		
		
		
		
		
		
		
	}
}
