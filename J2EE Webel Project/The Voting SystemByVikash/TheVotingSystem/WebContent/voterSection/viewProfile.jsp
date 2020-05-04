<%@page import="java.util.Iterator"%>
<%@page import="logic.LVoter"%>
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
	%>		Profile of <%= session.getAttribute("voterName") %>
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
		%>		<h1 align="center" class="pageHeader">Profile of <%= session.getAttribute("voterName") %></h1>
		<%	}
		%>
		<hr>
		<hr>
		<br>
		<br>
		
		<form action="#" method="post">
			<table align="center" class="box" bordercolor="#ddcef0">
				
				<%
					String voterId = session.getAttribute("accId").toString();
					ArrayList alist = new LVoter().getRecordsBySessionVoterId(voterId);
					Iterator it = alist.iterator();
					String[] data;
					while(it.hasNext()) {
						data = (String[])it.next();
				%>		<tr>
							<td>&nbsp;</td>
							<td>&nbsp;</td>
							<td colspan="1" align="left" rowspan="12">
								<img alt="<%=data[0]%> <%=data[1]%>" src="../upload/voter/<%= data[3]%>" style="padding-left: 46px; border-width: 1px; width: 115px; height: 185px;">
							</td>
						</tr>
						
						<tr>
							<td><label>First Name :</label></td>
							<td class="viewPro"><%= data[0] %></td>
						</tr>
						
						<tr>
							<td><label>Last Name :</label></td>
							<td class="viewPro"><%= data[1] %></td>
						</tr>
						
						<tr>
							<td><label>Date of Birth :</label></td>
							<td class="viewPro"><%= data[3] %></td>
						</tr>
						
						<tr>
							<td><label>E-mail :</label></td>
							<td class="viewPro"><%= data[4] %></td>
						</tr>
						
						<tr>
							<td><label>Address :</label></td>
							<td class="viewPro"><%= data[5] %></td>
						</tr>
						
						<tr>
							<td><label>P.O :</label></td>
							<td class="viewPro"><%= data[6] %></td>
						</tr>
						
						<tr>
							<td><label>Postal Code :</label></td>
							<td class="viewPro"><%= data[7] %></td>
						</tr>
						
						<tr>
							<td><label>State</label></td>
							<td class="viewPro"><%= data[8] %></td>
						</tr>
						
						<tr>
							<td><label>User Id :</label></td>
							<td class="viewPro"><%= data[9] %></td>
						</tr>
						
						<tr>
							<td><label>Registration Date :</label></td>
							<td class="viewPro"><%= data[10] %></td>
						</tr>
						
						<tr>
							<td><label>Registration Day</label></td>
							<td class="viewPro"><%= data[11] %></td>
						</tr>
						
						<tr>
							<td><label>Registration Time</label></td>
							<td class="viewPro"><%= data[12] %></td>
						</tr>
						
						<tr>
							<td colspan="3" align="center"><a href="../voterSection/editProfile.jsp"> Edit </a></td>
						</tr>
				<%	}
				%>
				
			</table>
		</form>
		</div>

</body>
</html>
<% } else {
	session.setAttribute("redirect", "Please sign-in again");
	response.sendRedirect("../mainToVoterSection/voterSignIn.jsp");
}%>