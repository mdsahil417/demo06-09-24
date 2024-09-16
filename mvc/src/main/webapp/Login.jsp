<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Form</title>
</head>
<body bgcolor="cyan">
<center>
    <font color="Blue"><h1>Login Form</h1></font><br/><br/><br/><br/>
    <font color="red"><%= (request.getAttribute("errMessage") == null) ? "" : request.getAttribute("errMessage") %></font>
    <form action="LoginServlet" method="post">
        <font color="blue">UserId</font><input type="text" name="userName"><br/>
        <font color="blue">Password</font><input type="password" name="password"><br/>
        <br/><br/>
        <input type="submit" value="LogIn" name="submit">
        <input type="reset" value="Clear"><br/><br/>
        <a href="Register.jsp">New User</a><br/>
        <a href="ForgetPassword.jsp">Forgot Password?</a>
    </form>
</center>
</body>
</html>
