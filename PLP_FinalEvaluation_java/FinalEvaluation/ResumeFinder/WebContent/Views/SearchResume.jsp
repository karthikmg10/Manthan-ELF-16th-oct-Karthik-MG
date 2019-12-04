<%@page import= "java.util.Set" %>
<%@page import= "com.manthan.resumefinder.bean.SearchDataBean" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="font-family: cursive;">
<fieldset>
<legend>Search Resume</legend> 
<a href="./Upload" style="margin-left: 900px">Upload Resume</a>
<form action="./SearchResume" method="post">
SearchResume: <input type="text" name="searchtxt" required>
<br><br>
 
<input type="submit" name="searchbtn" value="Search">

 <%Set<SearchDataBean> searchResults =  
            (Set<SearchDataBean>)request.getAttribute("results"); 
        if(null != searchResults && searchResults.size() >= 1){%>
<table border ="1" width="300" align="center"> 
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
                <td><a href="./Download?filename=<%= s.getFilename()  %>">
                <img src="${pageContext.request.contextPath}/image/Downloads2-icon.png" alt="/download"/></a></td>
            </tr> 
            <%}%>
        </table> 
           <% }%> 
           
         
</form>
</fieldset>

</body>
</html>