<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%if(session.getAttribute("accId") != null) {%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome Voter</title>
<link href="../css/mainWebPage.css" rel="stylesheet">
</head>
<body>
	<div class="body">
		<hr>
		<hr>
		<%
			if(session.getAttribute("accId") != null) {
		%>		<h1 align="center">Welcome to <%= session.getAttribute("voterName") %></h1>
		<%	}
		%>
		<hr>
		<hr>
		<br>
		<br>
		
		<form action="<%= request.getContextPath() %>/SAdmin.do?linkId=3" method="post">
			<table align="center" class="box">
				<tr>
					<br>
					<br>
					<th class="header" colspan="2">Voter functions</th>
				</tr>
				
				<tr>
					<td class="hyperLink">
						<a href="../voterSection/viewProfile.jsp">View Profile</a>
					</td>
				</tr>
				
				<tr>
					<td class="hyperLink">
						<a href="../voterSection/giveVote.jsp">Vote</a>
					</td>
				</tr>
				
				<tr>
					<td class="hyperLink">
						<a href="../voterSection/result.jsp">Result</a>
					</td>
				</tr>
				
			</table>
		
		</form>
		
	</div>
</body>
</html>
<% } else {
	session.setAttribute("redirect", "Please sign-in again");
	response.sendRedirect("../mainToVoterSection/voterSignIn.jsp");
}%>