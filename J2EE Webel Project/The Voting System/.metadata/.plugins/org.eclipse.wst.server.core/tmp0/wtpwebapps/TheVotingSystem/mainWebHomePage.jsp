<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome To Online Voting</title>
<style type="text/css">
<!--
.button {
   display:block;
   padding: 0;
   height: 30px;
   background: url(images/bg-button.png) no-repeat top left;
   text-family: Arial, sans-serif;
}
.button a {
	display: block;
	padding: 0;

}
.button a:LINK,
.button a:VISITED
.button a:HOVER
.button a:ACTIVE {
     color: #696;
     text-decoration: none;
}
.button a span {
	display: block;
	padding: 6px 15px 0 0;
	color: #666;
	text-shadow: 1px 1px 1px #fff;
	font-size: 10pt;
	font-weight: bold;
}

-->
</style>
<link href="css/mainWebPage.css" rel="stylesheet">
</head>
<body>
	
	<hr>
		<hr>
		<div class="hyperLink">
			<p>
				<a href="../mainWebsitePages/mainWebHomePage.jsp">Home</a>
			</p>
		</div>
		<hr>
	<hr>
	
	<table border="0" align="center" width="300px">
		<tbody>
			<tr>
				<td height="152" colspan="2" align="center" valign="top">
				<img border="0" src="images/wel-come.jpg" width="525" height="150">
				</td>
			</tr>
			
			<tr>
				<td colspan="2" height="40">
				</td>
			</tr>
			
			<tr>
				<td height="255" colspan="2" align="center" valign="middle">
				<img alt="logo" src="images/india-vote101.jpg">
				</td>
			</tr>
			
			<tr>
				<td colspan="2" height="40"></td>
			</tr>
			
			<tr>
				<td align="center" valign="middle">
					<div class="button" style="float: left; width: 150px; margin-left:300px; ">
						<a href="FirstPage1.jsp">
						</a>
						<a href="mainToAdminSection/adminSignIn.jsp">
							<span>ORGANISATION</span>
						</a>
					</div>
				</td>
				<td align="center" valign="middle">
					<div class="button" style="float: right; width: 150px; margin-right: 300px;">
						<a href="mainToVoterSection/voterSignIn.jsp">
						<span>VOTER</span>
						</a>
					</div>
				</td>
			</tr>
			
											<tr>
												<td align="center" valign="middle" colspan="2">
													<div class="button" style="float: right; width: 150px; margin-right: 300px;">
														<a href="extra.jsp">
														<span>EXTRA</span>
														</a>
													</div>
												</td>
											</tr>
		</tbody>
	</table>
</body>
</html>