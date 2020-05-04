
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>  
 <%@ taglib prefix="sx" uri="/struts-dojo-tags"%>     
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login | CCE</title>
<link rel="stylesheet" type="text/css" href="<s:url value="/css/style.css"/>" />
<link rel="icon" type="image/ico" href="images/favicon.ico">
 <link rel="shortcut icon" href="images/favicon.ico">
</head>
<body>
	<div class="main" style="margin:0">
	<div class="header">
		<div  style="float: left;"><a target="_blank" class="logo" href="http://www.bokaropublicschool.com/"></a></div>
		<div style="float: right;font-family:Arial;font-size: 21px;font-weight: bold;color: #EEEEEE;padding-right: 30px;padding-top: 15px"><a target="_blank" href="http://www.aimpl.co.in"><img alt="" src="images/cce.png"></a> </div>
	</div>
	<div class="container">
		<div class="wrapper">
			<div class="loginsection">
				<div class="loginbg">
					<div class="loginheader">
						<div class="logincontainer">
							 <s:form action="login_input" method="post" theme="simple">
							<table align="center" > 
							<tr><td colspan="2"  ><s:actionerror cssClass="error" /><s:fielderror fieldName="userId" theme="simple" cssClass="error" />	</td></tr>								
								<tr>
									<td><s:label>User Name</s:label></td>
									<td><s:textfield name="userId" key="userId" cssClass="textbox" ></s:textfield></td>
								</tr>
								<tr><td colspan="2"><s:fielderror fieldName="pass" theme="simple" cssClass="error" />	</td></tr>
								<tr>
									<td><s:label>Password</s:label></td>
									<td><s:password name="pass"  cssClass="textbox" key="pass" ></s:password></td>
								</tr>
								
								<tr>
									<td >									
										<label><s:hidden name="type" value="admin"></s:hidden> </label>
									</td>
									<td>
										<s:submit  value="Login" cssClass="blue-button" ></s:submit>
										<s:reset  value="Reset" cssClass="blue-button" ></s:reset><br class="clear" />
									</td>
								</tr>
							</table>																											
							<p class="buttons"></p>
							</s:form>
						</div>
					</div>
					<div class="loginfooter"></div>
				</div>
			</div>
		</div>
	</div>
	<div class="footer footerlogin">&copy; 2011 Copyright AIMPL. All Rights reserved</div>
</div>
	
</body>
</html>