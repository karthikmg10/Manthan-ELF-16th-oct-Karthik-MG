<%@page import= "java.util.Set" %>
<%@page import= "com.manthan.resumefinder.bean.SearchDataBean" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<style>
table {
  border-collapse: collapse;
}


table, th, td {
  border: 1px solid black;
}
</style>
<head>
<meta charset="ISO-8859-1">
<title>Search Resume</title>
</head>
<body style="font-family: Arial;">
<fieldset>
<legend>Search Resume</legend> 
<a href="./Upload" style="margin-left: 1185px">Upload Resume</a>
<center>
<form action="./SearchResume" method="post" autocomplete="on">
Search Resume: <input type="text" name="searchtxt" placeholder="Search Resume" required="required" >
<br><br>
 
<input type="submit" name="searchbtn" value="Search">
</center>
 <%Set<SearchDataBean> searchResults =  
            (Set<SearchDataBean>)request.getAttribute("results"); 
        if(null != searchResults){
        if(searchResults.size() >= 1) {%>
<table cellpadding="10" width="300" align="center"> 
         <tr bgcolor="#808080"> 
          <th><b>File Name</b></th> 
          <th><b>Email</b></th> 
          <th><b>Mobile</b></th> 
          <th><b>Download Link</b></th>
         </tr> 
        <%-- Fetching the attributes of the request object 
             which was previously set by the servlet  
              "ResumeServlet.java" 
        --%>  
        <%
        for(SearchDataBean s:searchResults){%> 
        <%-- Arranging data in tabular form 
        --%> 
            <tr> 
                <td><%=s.getFilename()%></td> 
                <td><%=s.getEmail()%></td>
                <td><%=s.getMobile()%></td>
                <td align="center"><a href="./Download?filename=<%= s.getFilename()  %>">
                <img src="${pageContext.request.contextPath}/image/Downloads2-icon.png" alt="/download" align="middle"/></a></td>
            </tr> 
            <%}%>
        </table> 
           <% }else{ %>
           <Script>alert("no data");</Script>
           <%}} %>
</form>
</fieldset>

</body>
</html>