<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%String msg=(String) request.getAttribute("msg"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Upload Resume</title>
</head>
<body style="font-family: Arial;">
	<fieldset>
		<legend>Upload Resume</legend>
		<a href="./Search" style="margin-left: 1185px">Search Resume</a>
		<center>
			<form method="post" name="uploadform" action="./Uploadresume"
				enctype="multipart/form-data" onsubmit="return validateForm()">
				Select file to upload: <input type="file" name="uploadFile" /> <br />
				<br /> <input type="submit" value="Upload" multiple="multiple" />
			</form>
		</center>
	</fieldset>
	<% if(msg!=null && !msg.isEmpty()){%>
	<fieldset
		style="margin-top: 270px; background-color: #7FFFD4; border-color: solid-black">
		<p style="color: black; text-align: center;"><%=msg %>
		</h2>
		</p>
	</fieldset>
	<% } %>
	<script>
function validateForm() {
  var x = document.forms["uploadform"]["uploadFile"].value;
  if (x == "") {
    alert("Please Select a File");
    return false;
  }
}
</script>

</body>
</html>