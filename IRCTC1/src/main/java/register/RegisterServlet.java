package register;
import java.io.*;

import common.RegisterBean;
import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;
@SuppressWarnings("serial")
@WebServlet("/reg")
public class RegisterServlet extends HttpServlet{
	@Override
protected void doPost(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException{
		
		RegisterBean rb=new RegisterBean();
		rb.setPname(req.getParameter("ok"));
		rb.setPtktno(req.getParameter("ok1"));
		rb.setPcoachno(req.getParameter("ok2"));
		rb.setPcoachtyp(req.getParameter("ok3"));
		
		/*PrintWriter pw=res.getWriter();
		pw.println(rb.getPname()+" "+rb.getPtktno()+" "+rb.getPcoachno()+" "+rb.getPcoachtyp());*/
		
		RegisterDAO SQ=new RegisterDAO();
		int j= SQ.Dinesh(rb);
		if(j>0) {
			req.setAttribute("msg", "Register Sucessfuly");
			req.getRequestDispatcher("true.jsp").forward(req, res);
		}else {
			req.setAttribute("msg", "Register Failed");
			req.getRequestDispatcher("fail.jsp").forward(req, res);
			
		}
	}
}	


