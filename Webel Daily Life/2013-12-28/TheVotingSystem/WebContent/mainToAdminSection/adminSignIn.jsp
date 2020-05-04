<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Administrator Section - Sign In</title>
<link href="../css/mainWebPage.css" rel="stylesheet">
</head>
<body>
	<div class="body">
		<h1 align="center">Welcome to administrator section</h1>
		<h4 align="center">If you have a account sign in with your user id and password if not just <font color="red"><i><b>SIGN UP</b></i></font></h4>
		
		<div>
			<form action="#" method="post">
				<table align="center" class="box" width="500px">
					<tr>
						<th class="header" colspan="2">Organization/Admin Sign In</th>
					</tr>
					<tr>
						<td>
							<label>User ID</label><em></em>
						</td>
						<td>
							<input type="text" name="userID" id="userID" placeholder="Enter User ID" style="width: 100%">
						</td>
					</tr>
					<tr>
						<td>
							<label>Password</label><em>*</em>
						</td>
						<td>
							<input type="password" name="password" id="password" placeholder="Enter Password" style="width: 100%"><br><br>
						</td>
					</tr>
					<tr>
						<td colspan="2" align="center">
							<input type="submit" value="Sign In" class="btn">
							<input type="reset" value="Reset" class="btn"><br><br>
						</td>
					</tr>
					
					<tr>
						<td colspan="2" class="hyperLink" align="center">
							<a href="adminSignUp.jsp">Don't have an accout. Create account here</a>
						</td>
					</tr>
				</table>
			</form>
		</div>
	</div>
</body>
</html>