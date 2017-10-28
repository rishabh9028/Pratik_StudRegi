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
<form action="index.obj">

<table align = "center" cellpadding = "5" border="3">
<tr><td colspan = "5" style = 'text-align: center;'><h1 align = "center">Student Information</h1></td></tr>
<tr>
<th>ID</th>
<th>NAME</th>
<th>CLASS<th>
<th>ADDRESS</th>
</tr>

<c:forEach items="${k1}" var="list">
<tr>
<td><c:out value="${list.studentId}"></c:out></td> 
<td><c:out value="${list.studentName}"></c:out></td>
<td><c:out value="${list.studentClass}"></c:out></td>
<td><c:out value="${list.studentMob}"> </c:out></td>
<td><c:out value="${list.studentAdd}"> </c:out> </td>
</tr>
</c:forEach>
<tr>
<td><h4><input type="submit"  value="Go Back"></h4></td>
</tr>
</table>
<h4 align="center"><a href="index.jsp">Go Back</a></h4>

</form>

</body>

</html>