<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%String msg=(String)request.getAttribute("msg");%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
</head>
<body>
<%if(msg!=null && !msg.isEmpty()){ %>
	<%=msg %>
	<%} %>
<form action="./register" method="post">
		<table>
			<tr>
				<td>UserID</td>
				<td>:</td>
				<td><input type="number" name="UserID" required></td>
			</tr>
			
			<tr>
				<td>UserName</td>
				<td>:</td>
				<td><input type="text" name="Username" required></td>
			</tr>
			
			<tr>
				<td>Email</td>
				<td>:</td>
				<td><input type="text" name="Email" required></td>
			</tr>
			<tr>
				<td>Password</td>
				<td>:</td>
				<td><input type="password" name="password" required></td>
			</tr>
			<tr>
				<td colspan="3" align="center"><input type="submit"
					value="Register"></td>
			</tr>
		</table>
	</form>
</body>
</html>