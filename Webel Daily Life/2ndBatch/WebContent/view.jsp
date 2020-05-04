<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@page import="java.util.ArrayList"%>
<%@page import="logic.MyLogic"%>
<%@page import="java.util.Iterator"%><html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table>
		<tr>
			<th>1</th>
			<th>2</th>
			<th>3</th>
			<th>4</th>
			<th>Option</th>
		</tr>
		
		<%
			ArrayList ar = new MyLogic().getRecords();
			Iterator it = ar.iterator();
			String data[];
			while(it.hasNext()) {
				data = (String[])it.next();
		%>
		<tr>
			<td><%= data[0] %></td>
			<td><%= data[1] %></td>
			<td><%= data[2] %></td>
			<td><%= data[3] %></td>
			<td>Edit | Delete</td>
		</tr>
		<%	} %>
	</table>


</body>
</html>