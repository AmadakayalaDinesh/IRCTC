package logout;
import java.io.*;
import java.util.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;
@SuppressWarnings("serial")
@WebServlet("/logout")
public class LogOut extends HttpServlet{

protected void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException{
	
	HttpSession hs=req.getSession(false);
	
	if(hs==null) {
		
		req.setAttribute("fail", "Session Is Expired");
		req.getRequestDispatcher("logout.jsp").forward(req, res);
		
		
	}
	else {
		//hs.invalidate();
		hs.removeAttribute("msg");
		req.setAttribute("fail", "LogOut Sucesfully");
		req.getRequestDispatcher("logout.jsp").forward(req, res);
	}
}

}
