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
<form action="findId.obj">
<table align="center">
<tr>
<td>Enter Student ID:</td>
<td><select id="studentId" name="studentId">
<option value="--SELECT--">--SELECT--</option>
<c:forEach var="list" items="${k}">
<option value="${list.studentId}">${list.studentId}</option>
</c:forEach>
</select></td>
<td><input type="submit" value="submit"></td>

</tr>
</table>
<h4 align="center"><a href="index.jsp">Go Back</a></h4>

</form>
</body>
</html>