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
	%>	Change password ----  <%= session.getAttribute("organisationName") %>
	<%	}
	%>
</title>
<link href="../css/mainWebPage.css" rel="stylesheet">
<script type="text/javascript" src="../js/jquery-1.7.1.min.js"></script>
<script type="text/javascript" src="../js/Validation.js"></script>
<script type="text/javascript" src="../js/imageColck.js"></script>
</head>
<body>
	<div class="body">
		<h1 align="center">Change password ---- <%= session.getAttribute("organisationName") %></h1>
		<hr>
		<hr>
		<br>
		<br>
		
								<div style="text-align: center; padding-bottom: 20px;" class="">
									<script type="text/javascript">
																	
										new imageclock.display()
									
									</script>
								</div>
		<form action="<%= request.getContextPath() %>/SAdmin.do?linkId=6" method="post">
			<table align="center" class="box" width="500px">
				<tr>
					<th colspan="2" class="header" align="center">Change Password</th>
				</tr>
				
				<tr>
					<td>
						<label>Old Password</label><em>*</em>
					</td>
					<td class="required password" style="padding-right: 6px;">
						<input type="password" name="oldPassword" id="oldPassword" placeholder="Enter old password" style="width: 100%">
					</td>
				</tr>
				
				<tr>
					<td>
						<label>New Password</label><em>*</em>
					</td>
					<td class="required password" style="padding-right: 6px;">
						<input type="password" name="password" id="pwd" placeholder="Re-enter new password" style="width: 100%">
					</td>
				</tr>
				
				<tr>
					<td>
						<label>Confirm Password</label><em>*</em>
					</td>
					<td class="required" style="padding-right: 6px;">
						<input type="password" name="conPwd" id="conPwd" style="width: 100%" placeholder="Re-enter your password">
					</td>
				</tr>
				
				<tr>
					<td colspan="2" align="center" style="padding-top: 17px;">
						<input type="submit" value="Change Password" class="btn" onclick="return validation()">
						<input type="reset" value="Reset" class="btn"><br><br>
					</td>
				</tr>
				
				<%
					if(session.getAttribute("changeMsg") != null) {
				%>	<tr>
						<td colspan="2" align="center">
							<font color="green"><b><%= session.getAttribute("changeMsg") %></b></font>
							<% session.removeAttribute("changeMsg"); %>
						</td>
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
	response.sendRedirect("../mainToAdminSection/adminSignIn.jsp");
}%>