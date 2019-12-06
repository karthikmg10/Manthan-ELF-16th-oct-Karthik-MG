<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%String msg=(String)request.getAttribute("msg");%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%if(msg!=null){ %>
<%=msg %>
<%} %>
<fieldset>
		<legend>User login</legend>
		<form action="./login" method="post">
			<table>
				<tr>
					<td>Email</td>
					<td>:</td>
					<td><input type="text" name="Email" required></td>
				</tr>
				<tr>
					<td>Password</td>
					<td>:</td>
					<td><input type="password" name="Password" required></td>
				</tr>
				
				<td colspan="3"><br /> <input type="submit" value="Login"></td>
				<td colspan="3"><br /> <input type="reset" value="Reset"></td>
				
				</tr>

			</table>
			<a href="./Login.jsp"> Forgot Password</a>
		</form>

	</fieldset>
	<a href='./Register.jsp'>Register</a></br>
</body>
</html>