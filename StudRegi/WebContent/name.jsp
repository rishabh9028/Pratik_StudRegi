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
<form action="findname1.obj">
<table align="center">
<tr>
<td>Enter Name</td>
<td>
<select id="studentName" name="studentName">
<option value="--SELECT--">--SELECT--</option>
<c:forEach items="${k2}" var="name">
<option value ="${ name.studentName}">${ name.studentName}</option>
</c:forEach>
</select>
<tr><td align="center" colspan="2"><input type="submit" value="Submit"></td></tr>
</table>
<h4 align="center"><a href="index.jsp">Go Back</a></h4>
</form>
</body>
</html>