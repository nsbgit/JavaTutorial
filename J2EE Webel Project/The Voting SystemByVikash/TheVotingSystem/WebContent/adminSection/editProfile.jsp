<%@page import="java.util.Iterator"%>
<%@page import="logic.DatabaseToArrayListConversion"%>
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
<script type="text/javascript" src="../js/jquery-1.7.1.min.js"></script>
<script type="text/javascript" src="../js/Validation.js"></script>
<script type="text/javascript" src="../js/datetimepicker_css.js"></script>
<script type="text/javascript" src="../js/imageColck.js"></script>
</head>
<body>
	<div class="body">
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
		
							
								<div style="text-align: center; padding-bottom: 20px;" class="">
									<script type="text/javascript">
																	
										new imageclock.display()
									
									</script>
								</div>
								
								
		<%
			String sql = "SELECT id, firstName, lastName, organisationName, eMail, organisationAddress FROM admin_registration_information";
			ArrayList arrayList = new DatabaseToArrayListConversion().convertToArrayListBySession(sql, (String)session.getAttribute("accId"));
			Iterator iterator = arrayList.iterator();
			String[] data;
			while(iterator.hasNext()) {
				data = (String[])iterator.next();
		%>
		
		<form action="<%= request.getContextPath() %>/SAdmin.do?linkId=4" method="post">
			<table class="box" align="center" width="500px">
				<tr>
					<th colspan="2" class="header" align="center">Profile update</th>
				</tr>
				
				<tr>
					<td>
						<label>First Name</label><em>*</em>
					</td>
					<td class="required">
						<input type="text" name="firstName" id="firstName" placeholder="Enter First Name" style="width: 100%" value="<%=data[0] %>">
					</td>
				</tr>
				
				<tr>
					<td>
						<label>Last Name</label><em>*</em>
					</td>
					<td class="required">
						<input type="text" name="lastName" id="lastName" placeholder="Enter Last Name" style="width: 100%" value="<%=data[1] %>">
					</td>
				</tr>
				<%--
				<tr>
					<td>
						<label>Upload Photo</label><em>*</em>
					</td>
					<td>
						<input type="file" placeholder = "Upload Photo">
					</td>
				</tr>
				 --%>
				
				<tr>
					<td>
						<label>Organisation Name</label><em>*</em>
					</td>
					<td class="required">
						<input type="text" name="organisationName" id="organisationName" placeholder="Enter Organisation Name"  style="width: 100%" value="<%=data[2] %>">
					</td>
				</tr>
				
				<tr>
					<td>
						<label>E-mail</label><em>*</em>
					</td>
					<td class="required email">
						<input type="text" name="eMail" id="eMail" style="width: 100%" placeholder="Enter e-mail address" value="<%=data[3] %>">
					</td>
				</tr>
				
				<tr>
					<td>
						<label>Organisation Address</label><em>*</em>
					</td>
					<td class="required">
						<textarea rows="4" cols="15" name="organisationAddress" id="organisationAddress" style="width: 100%" placeholder="Enter Organisation Address"><%=data[4] %></textarea>
					</td>
				</tr>
				
				<tr>
					<td colspan="2" align="center">
						<input type="submit" value="Save" class="btn" onclick="return validation()">
						<input type="reset" value="Reset" class="btn"><br><br>
					</td>
				</tr>
					
					<%
						if(session.getAttribute("registrationMsg") != null) {
					%>	<tr>
							<td colspan="2" align="center">
								<font color="green"><b><%= session.getAttribute("registrationMsg") %></b></font>
								<% session.removeAttribute("registrationMsg"); %>
							</td>
						</tr>
					<%	}
					%>
				
				
			</table>
		</form>
		<%	}
		%>
		
	</div>

</body>
</html>
<% } else {
	session.setAttribute("redirect", "Please sign-in again");
	response.sendRedirect("../mainToAdminSection/adminSignIn.jsp");
}%>