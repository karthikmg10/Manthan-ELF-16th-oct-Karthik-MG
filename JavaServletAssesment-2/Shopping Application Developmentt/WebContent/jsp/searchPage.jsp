<%@page import="com.manthan.shopping.productbean.ProductBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <% ProductBean bean=(ProductBean) request.getAttribute("searchProduct"); %>
    <%String msg=(String)request.getAttribute("msg");%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<fieldset>
<legend>Search Employee</legend>
<form action="./search" method="get">
		Product ID : <input type="text" name="ProductID" required><br />
		<br /> <input type="submit" value="Search">
	</form>
	</fieldset>
	<%if(msg!=null && !msg.isEmpty()){ %>
	<%=msg %>
	<%} %>
	<%if(bean !=null){ %>
	<table>
	<tr>
	<td>Product ID</td>
	<td>:</td>
	<td><%=bean.getProductID()%></td>
	</tr>
	</table>
	<%} %>
	
</body>
</html>