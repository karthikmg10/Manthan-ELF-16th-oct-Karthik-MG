<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%String msg=(String)request.getAttribute("msg");%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body><%if(msg!=null && !msg.isEmpty()){ %>
	<%=msg %>
	<%} %>
<fieldset>
<legend>Search Employee</legend>
<form action="./order" method="get">
		Order ID : <input type="text" name="OrderID" required><br />
		<br /> <input type="submit" value="Search">
	</form>
	</fieldset>

</body>
</html>