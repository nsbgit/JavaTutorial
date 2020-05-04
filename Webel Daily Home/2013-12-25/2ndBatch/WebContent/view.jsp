<%@page import="java.util.Iterator"%>
<%@page import="logic.MyFirstLogic"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
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
			ArrayList arrayList = new MyFirstLogic().getRecords(); // Here arrayList holds the data that we have previously fetched from the meta-data
			Iterator iterator = arrayList.iterator(); // Iterator is used to traverse the data in a array list, we can do this also using for each loop but this method is easy to implement
			String[] data;
			while(iterator.hasNext()) {
				data = (String[])iterator.next();
		%>
				<tr>
					<td><b><%= data[0] %></b></td>
					<td><%= data[1] %></td>
					<td><%= data[2] %></td>
					<td><%= data[3] %></td>
					<td><%= data[4] %></td>
					<td>Edit | Delete</td>
				</tr>
				
		<% 	}
		%>
		
	</table>

</body>
</html>