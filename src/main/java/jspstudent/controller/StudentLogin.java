package jspstudent.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jspstudent.dto.Student;
import jspstudent.model.StudentDao;

@WebServlet("/login")
public class StudentLogin extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String email=req.getParameter("semail");
		String password=req.getParameter("spassword");
		
		StudentDao dao=new StudentDao();
		List<Student>students=dao.getAllStudent();
		boolean value=false;
		for(Student stu : students) {
			if (stu.getStuemail().equals(email)) {
			value=true;
			break;
		}
	
		}
    if(value==false) {
	
		req.setAttribute("message", "Incorrect email");
	RequestDispatcher dispatcher=req.getRequestDispatcher("login.jsp");
	dispatcher.include(req, resp);
		
	}else {
		Student student=dao.getStudentByEmail(email);
		if(student.getStupassword().equals(password)) {
			req.setAttribute("listOfStudent", students);
//			req.setAttribute("message", "Login Successfully");
			RequestDispatcher dispatcher=req.getRequestDispatcher("display.jsp");
			dispatcher.forward(req, resp);
		}else {
			req.setAttribute("message", "Incorrect Password");
			RequestDispatcher dispatcher=req.getRequestDispatcher("login.jsp");
			dispatcher.include(req, resp);
		}
		
	}
	}
}


