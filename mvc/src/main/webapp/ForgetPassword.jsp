<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Forget Password</title>
</head>
<body bgcolor="cyan">
<center>
<font color="Blue"><h1>Forget Password</h1></font><br/><br/><br/><br/>
<font color="red">${requestScope.errMessage}</font>
<font color="green">${requestScope.successMessage}</font>
<form action="ForgetPasswordServlet" method="post">
    <font color="blue">UserId</font><input type="text" name="userName"><br/>
    <font color="blue">New Password</font><input type="password" name="password"><br/>
    <br/><br/>
    <input type="submit" value="Reset Password" name="submit">
    <input type="reset" value="Clear"><br/>
</form>
<br/>
<a href="Login.jsp">Go to Login</a>
</center>
</body>
</html>