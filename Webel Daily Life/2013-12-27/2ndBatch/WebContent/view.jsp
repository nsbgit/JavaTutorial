<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@page import="java.util.ArrayList"%>
<%@page import="logic.MyLogic"%>
<%@page import="java.util.Iterator"%><html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>All records</title>
</head>
<body>
	<h1 align="center"><font color="blue">All records</font></h1>
	<hr>
	<hr>
	<br>
	<table border="1" align="center">
		<tr>
			<th><font color="red"><u><b>Name</b></u></font></th>
			<th><font color="red"><u><b>Address</b></u></font></th>
			<th><font color="red"><u><b>Gender</b></u></font></th>
			<th><font color="red"><u><b>Standard</b></u></font></th>
			<th><font color="red"><u><b>Contact Number</b></u></font></th>
			<th><font color="red"><u><b>Option</b></u></font></th>
		</tr>
		
		<%
			ArrayList ar = new MyLogic().getRecords();
			Iterator it = ar.iterator();
			String data[];
			while(it.hasNext()) {
				data = (String[])it.next();
		%>
		<tr>
			<td><b><%= data[0] %></b></td>
			<td><%= data[1] %></td>
			<td><%= data[2] %></td>
			<td><%= data[3] %></td>
			<td>Edit | Delete</td>
		</tr>
		<%	} %>
	</table>


</body>
</html>