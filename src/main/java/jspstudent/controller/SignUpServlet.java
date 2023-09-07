package jspstudent.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jspstudent.dto.Student;
import jspstudent.model.StudentDao;

public class SignUpServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// to get attribute from html page
		int id=Integer.parseInt(req.getParameter("id"));
		String name=req.getParameter("sname");
		String email=req.getParameter("semail");
		String password=req.getParameter("spassword");
		long phoneno=Long.parseLong(req.getParameter("sphoneno"));
		String address=req.getParameter("saddress");
		
		ServletContext context=getServletContext();
		String stufees=context.getInitParameter("fees");
		
		
		double fees=Double.parseDouble(stufees);

		
		Student stu=new Student();
		stu.setSid(id);
		stu.setStuname(name);
		stu.setStuemail(email);
		stu.setStuphoneno(phoneno);
		stu.setStuaddress(address);
		stu.setStupassword(password);
		stu.setStufees(fees);
		
		StudentDao dao=new StudentDao();
		Student dbstudent=dao.signUpStudent(stu);
		
		if(dbstudent!=null) {
			req.setAttribute("message", "Signed In Successfully");  //
			
			RequestDispatcher dispatcher=req.getRequestDispatcher("login.jsp");
			dispatcher.forward(req, resp);
		}

		
	}
	

}
