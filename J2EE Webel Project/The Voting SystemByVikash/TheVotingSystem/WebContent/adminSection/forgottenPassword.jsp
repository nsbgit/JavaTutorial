<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Forgotten Your Password</title>
<link href="../css/mainWebPage.css" rel="stylesheet">
<script type="text/javascript" src="../js/jquery-1.7.1.min.js"></script>
<script type="text/javascript" src="../js/Validation.js"></script>
</head>
<body>
	<div class="body">
		<h1 align="center">Forgotten your password?</h1>
		<hr>
		<hr>
		<br>
		<br>
		<form action="<%= request.getContextPath() %>/SAdmin.do?linkId=8" method="post">
			<table class="box" align="center">
				<tr align="center">
					<th class="header" colspan="2">Forgotten your password?</th>
				</tr>
				
				<tr>
					<td>
						<label>User ID</label><em>*</em>
					</td>
					<td class="required">
						<input type="text" name="userID" id="userID" placeholder="Enter User ID" style="width: 100%">
					</td>
				</tr>
				
				<tr>
					<td colspan="2" align="center">
						<input type="submit" value="Send password on registered e-mail ID" class="btn" onclick="return validation()">
						<input type="reset" value="Reset" class="btn">
					</td>
				</tr>
				
				<%
					if(session.getAttribute("isSendS") != null) {%>
						<br>
						<br>
						<tr>
							<td colspan="2" align="center">
								<font color="green"><b><%= session.getAttribute("isSendS") %></b></font>
								<% session.removeAttribute("isSendS"); %>
							</td>
						</tr>
				<% 	}
				%>
				
				<%
					if(session.getAttribute("isSendN") != null) {%>
						<br>
						<br>
						<tr>
							<td colspan="2" align="center">
								<font color="red"><b><%= session.getAttribute("isSendN") %></b></font>
								<% session.removeAttribute("isSendN"); %>
							</td>
						</tr>
				<% 	}
				%>
			
			</table>
		</form>
	</div>

</body>
</html>