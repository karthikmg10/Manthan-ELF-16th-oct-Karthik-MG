<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%String msg = (String) request.getAttribute("msg"); %>

<<<jsp:include page="/home"></jsp:include>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%if (msg != null && !msg.isEmpty()) { %>
		<h3 style="color: blue;"><%=msg %></h3>
		<% } %>
	<form action="./addEmp"  method="post">
		<table>
			<tr>
				<td> Emp Id </td>
				<td> : </td>
				<td><input type="number" name="empId" required></td>
			</tr>
			<tr>
				<td>Employee Name</td>
				<td> : </td>
				<td><input type="text" name="empName" required></td>
			</tr>
			<tr>
				<td>Employee Age</td>
				<td> : </td>
				<td><input type="number" name="age" required></td>
			</tr>
			<tr>
				<td>Employee salary</td>
				<td> : </td>
				<td><input type="number" name="salary" required></td>
			</tr>
			<tr>
				<td>Designation</td>
				<td> : </td>
				<td><input type="text" name="designation" required></td>
			</tr>
			<tr>
				<td>Mobile Number</td>
				<td> : </td>
				<td><input type="number" name="mobile" required></td>
			</tr>
			<tr>
				<td colspan="3" align="center">
				<input type="submit" value="Add Employee">
				</td>
			</tr>
		</table>
	</form>
</body>
</html>