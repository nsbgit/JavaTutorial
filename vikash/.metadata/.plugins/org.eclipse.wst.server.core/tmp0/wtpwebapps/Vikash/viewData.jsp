<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@page import="java.util.ArrayList"%>
<%@page import="logic.MyLogic"%>
<%@page import="java.util.Iterator"%><html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link href="style.css" rel="stylesheet">
</head>
<body>
	<div class="body">
	<%
		
		ArrayList ar=new MyLogic().selectData();
	%>
		<table  align="center"  width="500px" class="box">
			<tr>
				<th class="header" colspan="5">Student Information</th>
			</tr>
			<tr class="lbl">
				<td width="20%">Name1</td>
				<td width="20%">Address</td>
				<td width="10%">Standard</td>
				<td width="10%">Gender</td>
				<td width="40%">Option</td>
			</tr>
			<%
				Iterator it=ar.iterator();
			String[] data=null;
			while(it.hasNext()){
				data=(String[])it.next();
			%>
			<tr>
				<td>&nbsp;<%=data[0] %></td>
				<td>&nbsp;<%=data[1] %></td>
				<td>&nbsp;<%=data[2] %></td>
				<td>&nbsp;<%=data[3] %></td>
				<td>
					<a href="#">Edit</a> |
					<a href="#">Delete</a>
				</td>
			</tr>
			<%
			}
				
			%>
			
		</table>
	</div>
</body>
</html>












