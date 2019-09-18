<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form name="student_form" id="student_form" method="post" action="saveStudent">
<h1 align="center">Welcome to my Application Homepage!!</h1>
<table>
	<tr>
		<td>Student Id</td>
		<td><input type="text" name="studentId"></input></td>
	</tr>
	<tr>
		<td>Student Name</td>
		<td><input type="text" name="studentName"></input></td>
	</tr>
	<tr>
		<td>Student Address</td>
		<td><input type="text" name="studentAddress"></input></td>
	</tr>
	<tr>
		<td>&nbsp;</td>
		<td><button type="submit" name="studentSubmit">Save</button></td>
	</tr>
</table>
</form>
${msg}
</body>
</html>