<%@page import="com.manthan.empwebapp.beans.EmployeeInfoBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <% EmployeeInfoBean employeeInfoBean = (EmployeeInfoBean) session.getAttribute("employeeInfoBean"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
</head>
<body>
	<h3 style="color: cyan;">Hello <%=employeeInfoBean.getEmpName()%>!</h3>
	<a href="./searchEmployeeForm">Search Employee</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	<a href="./addEmployeeForm">Add Employee</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	<a href="./updateEmployeeForm">Update Employee</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	<a href="./deleteEmployeeForm">Delete Employee</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	<a href="./seeAllEmployeeForm">See All Employee</a><br><br>
	<br>
	<a href="./logout">Logout</a><br>
</body>
</html>