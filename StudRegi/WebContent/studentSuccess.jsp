<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<marquee><h1 align="center">Successfully Registered!!!</h1></marquee>
<table align="center">
<tr>
<td colspan="2" align="center" ><h3>Student Details</h3></td>
</tr>

<tr>
<td>Student ID:</td>
<td>${k.studentId}</td>
</tr>

<tr>
<td>Student Name:</td>
<td>${k.studentName}</td>
</tr>

<tr>
<td>Student Class:</td>
<td>${k.studentClass}</td>
</tr>

<tr>
<td>Student Phone Number:</td>
<td>${k.studentMob }</td>
</tr>

<tr>
<td>Student Address:</td>
<td>${k.studentAdd }</td>
</tr>
</table>
<h4 align="center"><a href = "index.jsp">Go Back</a></h4>
</body>
</html>