<%@page import="jspstudent.dto.Student"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Page</title>
</head>
<body>

<%Student student=(Student) request.getAttribute("Student"); %>

<form action="edit" method="post">

Id: <input type="number" name="sid" value="<%=student.getSid() %>" readonly="readonly">

<br>
<br>

Name: <input type="text" name="sname" value="<%=student.getStuname() %>" required="required">

<br>
<br>

Email: <input type="email" name="semail" value="<%=student.getStuemail()%>" required="required">

<br>
<br>

Password: <input type="password" name="spassword" value="<%=student.getStupassword()%>" required="required">

<br>
<br>

Address : <input type="text" name="saddress" value="<%=student.getStuaddress()%>" required="required">

<br>
<br>

PhoneNo: <input type="tel" name="sphoneno" value="<%=student.getStuphoneno()%>" required="required">

<br>
<br>


<br>
<br>

<input type="submit" value="Done">


</form>

</body>
</html>