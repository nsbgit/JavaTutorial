<%@page import="java.util.Iterator"%>
<%@page import="logic.LAdminRegistration"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%if(session.getAttribute("accId") != null) {%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>
	<%
		if(session.getAttribute("accId") != null) {
	%>	Profile of <%= session.getAttribute("organisationName") %>
	<%	}
	%>
</title>
<link href="../css/mainWebPage.css" rel="stylesheet">
</head>
<body>
	<div class="recordsBody">
		<hr>
		<hr>
		<%
			if(session.getAttribute("accId") != null) {
		%>	<h1 align="center" class="pageHeader">View profile of  <%= session.getAttribute("organisationName") %></h1>
		<%	}
		%>
		<hr>
		<hr>
		<br>
		<br>
		<form action="#" method="post">
			<table align="center" class="box" bordercolor="#ddcef0">
				<%-- 
				<tr>
					<th class="header">First Name</th>
					<th class="header">Last Name</th>
					<th class="header">Organisation Name</th>
					<th class="header">E-mail</th>
					<th class="header">User ID</th>
					<th class="header">Password</th>
					<th class="header">Organisation Address</th>
					<th class="header">Agree</th>
					<th class="header">Registration Date</th>
					<th class="header">Registration Day</th>
					<th class="header">RegistrationTime</th>
					<th class="header">Option</th>
				</tr>
				--%>
				<%
					ArrayList arrayList = new LAdminRegistration().getRecordsByAccId((String)session.getAttribute("accId"));
					Iterator iterator = arrayList.iterator();
					String[] data;
					while(iterator.hasNext())  {
					data = (String[])iterator.next();
				%>	<%--
					<tr>
						<td><%= data[0] %></td>
						<td><%= data[1] %></td>
						<td><%= data[2] %></td>
						<td><%= data[3] %></td>
						<td><%= data[4] %></td>
						<td><%= data[5] %></td>
						<td><%= data[6] %></td>
						<td><%= data[7] %></td>
						<td><%= data[8] %></td>
						<td><%= data[9] %></td>
						<td><%= data[10] %></td>
						<td><a href="../adminSection/editProfile.jsp"> Edit </a> | <a href="#" onclick="delete()">Delete</a> </td>
					</tr>
					 --%>
					
					<tr>
					<td>&nbsp;</td>
					<td>&nbsp;</td>
					<td colspan="1" align="left" rowspan="12">
							<img alt="<%=data[0] + data[1]%>" src="../upload/admin/<%= data[11]%>" style="padding-left: 46px; border-width: 1px; width: 115px; height: 185px;">
						</td>
					</tr>
					<tr>
						<td><label>First Name:</label></td>
						<td ><%=data[0] %></td>
					</tr>
					
					<tr>
						<td><label>Last Name:</label></td>
						<td><%=data[1] %></td>
						
					</tr>
					
					<tr>
						<td><label>Organisation Name:</label></td>
						<td><%=data[2] %></td>
					</tr>
					
					<tr>
						<td><label>E-mail:</label></td>
						<td><%=data[3] %></td>
					</tr>
					
					<tr>
						<td><label>User ID:</label></td>
						<td><%=data[4] %></td>
					</tr>
					
					<tr>
						<td><label>Password:</label></td>
						<td><%=data[5] %></td>
					</tr>
					
					<tr>
						<td><label>Organisation Address :</label></td>
						<td><%=data[6] %></td>
					</tr>
					
					<tr>
						<td><label>Agree:</label></td>
						<td><%=data[7] %></td>
					</tr>
					
					<tr>
						<td><label>Registration Date:</label></td>
						<td><%=data[8] %></td>
					</tr>
					
					<tr>
						<td><label>Registration Day:</label></td>
						<td><%=data[9] %></td>
					</tr>
					
					<tr>
						<td><label>Registration Time:</label></td>
						<td><%=data[10] %></td>
					</tr>
					
					<tr>
						<td colspan="3" align="center"><a href="../adminSection/editProfile.jsp"> Edit </a></td>
					</tr>
					
				<%	}
				%>
				
			</table>
		</form>
	</div>
</body>
</html>
<%} else {
	session.setAttribute("redirect", "Please sign-in again");
	response.sendRedirect("../mainToAdminSection/adminSignIn.jsp");
}%>