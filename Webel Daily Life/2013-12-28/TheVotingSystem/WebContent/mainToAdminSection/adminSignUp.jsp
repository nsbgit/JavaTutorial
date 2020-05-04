<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link href="../css/mainWebPage.css" rel="stylesheet">
</head>
<body>
	<div>
		<form action="#" method="post">
			<table align="center" class="box" width="500px">
					<tr>
						<th colspan="2">Organization Registration</th>
					</tr>
					<tr>
						<td>
							<label>First Name</label><em>*</em>
						</td>
						<td>
							<input type="text" name="firstName" id="firstName" placeholder="Enter First Name" style="width: 100%">
						</td>
					</tr>
					
					
					<tr>
						<td>
							<label>Last Name</label><em>*</em>
						</td>
						<td>
							<input type="text" name="lastName" id="lastName" placeholder="Enter Last Name" style="width: 100%">
						</td>
					</tr>
					
					<tr>
						<td>
							<label>Organization Name</label><em>*</em>
						</td>
						<td>
							<input type="text" name="organizationName" id="organizationName" placeholder="Enter Organization Name"  style="width: 100%">
						</td>
					</tr>
				
					<tr>
						<td>
							<label>User ID</label><em>*</em>
						</td>
						<td>
							<input type="text" name="userID" id="userID" placeholder="Enter User ID" style="width: 100%">
							<input type="button" value="Check Availiblity" class="btn">
						</td>
					</tr>
				
					<tr>
						<td>
							<label>Organization Address</label><em>*</em>
						</td>
						<td>
							<textarea rows="4" cols="15" name="organizationAddress" id="organizationAddress" style="width: 100%" placeholder="Enter Organization Address"></textarea>
						</td>
					</tr>
					
					<tr>
						<td colspan="2" style="padding-left: 30px">
							<input type="checkbox" name="agree" id="agree"><i>I agree all terms and condition.</i><br><br>
						</td>
					</tr>
					
					<tr>
						<td colspan="2" align="center">
							<input type="submit" value="Sign Up" class="btn">
							<input type="reset" value="Reset" class="btn"><br><br>
						</td>
					</tr>
				</table>
			</form>
		</div>
</body>
</html>