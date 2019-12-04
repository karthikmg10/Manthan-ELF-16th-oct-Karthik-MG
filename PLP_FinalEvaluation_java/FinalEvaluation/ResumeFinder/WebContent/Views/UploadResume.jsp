<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%String msg=(String) request.getAttribute("msg"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="font-family: cursive;">
<fieldset>
<legend>Upload Resume</legend>
<a href="./Search" style="margin-left: 900px">Search Resume</a>
     <center>
        <form method="post" action="./Uploadresume" enctype="multipart/form-data">
            Select file to upload:
            <input type="file" name="uploadFile" />
            <br/><br/>
            <input type="submit" value="Upload" multiple="multiple" />
        </form>
    </center>
</fieldset>
	<% if(msg!=null && !msg.isEmpty()){%>
	<fieldset style="margin-top: 270px; background-color: #7FFFD4; border-color: solid-black">
	<p style="color: black; text-align: center;"><%=msg %></h2></p>
</fieldset>
<% } %>
</body>
</html>