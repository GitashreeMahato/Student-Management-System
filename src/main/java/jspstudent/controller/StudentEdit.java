package jspstudent.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jspstudent.dto.Student;
import jspstudent.model.StudentDao;

public class StudentEdit extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int id=Integer.parseInt(req.getParameter("sid"));
		String name=req.getParameter("sname");
		String email=req.getParameter("semail");
		String password=req.getParameter("spassword");
		String address=req.getParameter("saddress");
		long phone=Long.parseLong(req.getParameter("sphoneno"));
		
		ServletContext context=getServletContext();
		double fees=Double.parseDouble(context.getInitParameter("fees"));
		


		Student stu =new Student();
		stu.setSid(id);
		stu.setStuname(name);
		stu.setStuemail(email);
		stu.setStupassword(password);
		stu.setStuaddress(address);
		stu.setStuphoneno(phone);
		stu.setStufees(fees);
		
		StudentDao dao =new StudentDao();
		dao.updateStudent(id, stu);
		List<Student> list =dao.getAllStudent();
		
		req.setAttribute("listOfStudent", list);
		RequestDispatcher dispatcher= req.getRequestDispatcher("display.jsp");
		dispatcher.forward(req, resp);
	}

}
