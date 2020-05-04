<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table>
		<tr>
			<td>Your Name</td>
			<td> <%=request.getParameter("sName") %> </td>
		</tr>
		<tr>
			<td>Your Address</td>
			<td> <%=request.getParameter("add") %> </td>
		</tr>
		<tr>
			<td>Your Stream</td>
			<td> <%=request.getParameter("stream") %> </td>
		</tr>
		<tr>
			<td>Your Gender</td>
			<td> <%=request.getParameter("gen") %> </td>
		</tr>
	</table>
</body>
</html>