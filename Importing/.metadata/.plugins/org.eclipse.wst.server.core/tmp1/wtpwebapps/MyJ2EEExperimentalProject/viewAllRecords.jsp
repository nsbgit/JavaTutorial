<%@page import="java.util.Iterator"%>
<%@page import="logic.MyFirstLogic"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1 align="center"></h1>
	<hr>
	<hr>
	<hr>
	<table border="1" align="center">
		<tr>
			<td>
				<th><font color="red"><u><b>First Name</b></u></font></th>
				<th><font color="red"><u><b>Middle Name</b></u></font></th>
				<th><font color="red"><u><b>Last Name</b></u></font></th>
				<th><font color="red"><u><b>Address</b></u></font></th>
				<th><font color="red"><u><b>Gender</b></u></font></th>
				<th><font color="red"><u><b>Date of Birth(dd-mm-yyy)</b></u></font></th>
				<th><font color="red"><u><b>College</b></u></font></th>
				<th><font color="red"><u><b>Stream</b></u></font></th>
				<th><font color="red"><u><b>Option</b></u></font></th>
			</td>
		</tr>
		
		<%
			ArrayList arrayList = new MyFirstLogic().getRecords();
			Iterator iterator = arrayList.iterator();
			String[] data;
			while(iterator.hasNext()) {
				data = (String[])iterator.next();
		%>
				<tr>
					<td><b><%= data[0] %></b></td>
					<td><b><%= data[1] %></b></td>
					<td><b><%= data[2] %></b></td>
					<td><b><%= data[3] %></b></td>
					<td><b><%= data[4] %></b></td>
					<td><b><%= data[5] %></b></td>
					<td><b><%= data[6] %></b></td>
					<td><b><%= data[7] %></b></td>
					<td><b>Edit | Delete</b></td>
				</tr>
		<%	}
		%>
	</table>
</body>
</html>