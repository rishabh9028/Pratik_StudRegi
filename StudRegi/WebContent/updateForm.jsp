<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form action="doUpdate.obj" modelAttribute="bean">
<table cellpadding="5" cellspacing="5" border="5" align="center">

<tr>
<td>Student ID:</td>
<td><form:input path="studentId"/>
<form:errors path="studentId"/>
</td>
</tr>

<tr>
<td>Student Name:</td>
<td><form:input path="studentName"/>
<form:errors path="studentName"/>
</td>
</tr>

<tr>
<td>Student Class:</td>
<td><form:input path="studentClass"/>
<form:errors path="studentClass"/>
</td>
</tr>

<tr>
<td>Student Mobile:</td>
<td><form:input path="studentMob" />
<form:errors path="studentMob"/>
</td>
</tr>

<tr>
<td>Student Address:</td>
<td><form:input path="studentAdd"/>
<form:errors path="studentAdd"/>
</td>
</tr>

<tr>
<td colspan="5" align="center"><input type="submit" value="submit">
</td>
</tr>

</table>
<h4 align="center"><a href="index.jsp">Go Back</a></h4>

</form:form>
</body>
</html>