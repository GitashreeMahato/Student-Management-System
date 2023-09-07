<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM" crossorigin="anonymous">

</head>
<body>



<%String message=(String)request.getAttribute("message"); %>


<%if(message!=null){%>
<!-- <%=message %> -->
<h3 class="mx-auto p-2" style="width: 100px;"><%= message %></h3>


<%} %>

<br>
<br>

<form style="margin-left: 40%;" action="login" method="post">

Email : <input type="text" name="semail"  class="form-control form-control-lg" style="width: 40%">

<br>
<br>

Password : <input type="password" name="spassword" class="form-control form-control-lg" style="width: 40%">

<br>
<br>

 
<input type="submit" value="Login" class="btn btn-dark btn-lg btn-block">


</form>
</body>
</html>