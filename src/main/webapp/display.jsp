<%@page import="jspstudent.model.StudentDao"%>
<%@page import="java.util.List"%>
<%@page import="jspstudent.dto.Student"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display</title>
</head>
<body>

<table border= "1px">

<% List<Student> stulist=(List) request.getAttribute("listOfStudent"); %>


<tr>

<th>Id</th>
<th>Name</th>
<th>Email</th>
<th>Password</th>
<th>Address</th>
<th>PhoneNumber</th>
<th>Fees</th>
<th>Delete</th>
<th>Update</th>


</tr>



<% for(Student student : stulist){ %>

<tr>

<td><%=student.getSid() %></td>
<td><%=student.getStuname()%></td>
<td><%=student.getStuemail()%></td>
<td><%=student.getStupassword()%></td>
<td><%=student.getStuphoneno()%></td>
<td><%=student.getStuaddress()%></td>
<td><%=student.getStufees()%></td>
<td><a href="delete?sid=<%=student.getSid()%>">Delete</a></td>
<td><a href="update?sid=<%=student.getSid()%>">Update</a></td>


</tr>

<%} %>



</table>

</body>
</html>