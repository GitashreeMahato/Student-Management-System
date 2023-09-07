package jspstudent.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jspstudent.dto.Student;
import jspstudent.model.StudentDao;

@WebServlet("/delete")

public class StudentDelete extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		 int id=Integer.parseInt(req.getParameter("sid"));
		 
		 StudentDao dao= new StudentDao();
		 
		 dao.deleteStudent(id);
		 
		 List<Student> list = dao.getAllStudent();
		
			 req.setAttribute("listOfStudent", list);
			 RequestDispatcher dispatcher=req.getRequestDispatcher("display.jsp");
			 dispatcher.forward(req, resp);
		 }
		 
	}


