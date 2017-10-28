<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
           <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1 align="center">Update By ID</h1>
<form action="update1.obj">
<table align="center" border="2" cellspacing="2" cellpadding="2">
<tr>
<td>Enter Student ID</td>
<td>
<select id="studentId" name="studentId" style = "width: 100px;">
<option value="--SELECT--">--SELECT--</option>
<c:forEach var="del" items="${k3}">
<option value="${del.studentId}">${del.studentId}</option>
</c:forEach>
</select>
</td>
</tr>
<tr>
<td align="center" colspan="2"><input type="submit" value="update"></td>
</tr>
</table>
</form>
</body>
</html>