package view;
import java.io.*;

import common.RegisterBean;
import jakarta.servlet.annotation.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
@SuppressWarnings("serial")
@WebServlet("/View")
public class ViewServlet extends HttpServlet {
	
   protected void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException, IOException {
	   
	   HttpSession rk=req.getSession(false);
	    
	   RegisterBean rb=(RegisterBean)rk.getAttribute("msg");
	    
	   if(rb==null) {
		   req.setAttribute("msg","Your Detailes Is Not Avalible");
		   req.getRequestDispatcher("fail.jsp").forward(req, res);
		   
	   }else {
		   req.setAttribute("msg", rb);
		   req.getRequestDispatcher("view.jsp").forward(req, res);
	   }
	   
	
}
	
	
	
	

}
