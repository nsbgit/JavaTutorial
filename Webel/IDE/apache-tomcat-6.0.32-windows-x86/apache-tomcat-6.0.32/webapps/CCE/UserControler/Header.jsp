<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<link rel="stylesheet" type="text/css" href="<s:url value="../css/style.css"/>" />
	<link rel="icon" type="image/ico" href="../images/favicon.ico">
    <link rel="shortcut icon" href="../images/favicon.ico">
    <link rel="stylesheet" type="text/css" href="<s:url value="../css/thickbox.css"/>"/>
    <script type="text/javascript" src="<s:url value="../js/General/Validation.js"/>"></script>
    <script type="text/javascript" src="<s:url value="../js/General/datetimepicker.js"/>"></script>
    <script type="text/javascript" src="<s:url value="../js/General/jquery-1.3.2.min.js"/>"></script>
    <script type="text/javascript" src="<s:url value="../js/General/thickbox.js"/>"></script> 
    <script type="text/javascript" src="<s:url value="../js/General/ddaccordion.js"/>"></script>
    <script type="text/javascript" src="../js/General/CalendarControl.js"></script> 
    <script type="text/javascript" src="../js/General/dojo.js" ></script>
<div class="header">
		<div class="wrapper">
		<div ><a target="_blank" class="logo" href="http://http://www.jnvb24paraganas.in/"></a></div>
		<div class="headernav">
			<ul>
				<li><span><b>Hi, </b><s:iterator value="userDetailsList" ><s:property value="secondVal"/> <s:property value="thredVal"/> <s:property value="fourthVal"/><s:if test="%{loginType.equals('admin')}"> </s:if> </s:iterator> </span> </li>
                <li><s:a action="../Common/home">Home</s:a></li>
				<li><a href="../Common/changePass.html" class="change">Change Password</a></li>
				<s:if test="%{loginType.equals('admin')}">
					<li><s:a action="../Common/logout">Sign Out</s:a></li>
				</s:if>
				<s:else>
					<li><s:a action="../Common/logoutGen">Sign Out</s:a></li>
				</s:else>
				<li><br class="clear" ></li>
			</ul>
			<div style="float: right;font-family:Arial;font-size: 21px;font-weight: bold;color: #EEEEEE;padding-top: 1px"><a target="_blank" href="http://www.aimpl.co.in"><img alt=""  width="95" height="55" src="../images/cce.png"></a> </div>
		</div>	
		</div>
		</div>	