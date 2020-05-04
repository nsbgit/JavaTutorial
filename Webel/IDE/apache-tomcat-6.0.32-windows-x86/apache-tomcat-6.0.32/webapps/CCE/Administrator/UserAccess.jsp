<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" errorPage="../error.jsp"%>
    <%@ taglib prefix="s" uri="/struts-tags"%>
    <%@ taglib prefix="sx" uri="/struts-dojo-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>CCE | User Access</title>
<link rel="stylesheet" type="text/css" href="<s:url value="../css/style.css"/>" />    
    <link rel="stylesheet" type="text/css" href="<s:url value="../css/thickbox.css"/>"/>
    <script type="text/javascript" src="<s:url value="../js/General/Validation.js"/>"></script>
    <script type="text/javascript" src="<s:url value="../js/General/jquery-1.3.2.min.js"/>"></script>
    <script type="text/javascript" src="<s:url value="../js/General/thickbox.js"/>"></script> 
    <script type="text/javascript" src="<s:url value="../js/General/ddaccordion.js"/>"></script>	    
</head>
<body>
	<s:form     method="post" validate="true" >
	<sx:div >
	<s:div>
	 <s:div cssClass="main1" >    	
	</s:div>
	   <s:div cssClass="container">
		<s:div cssClass="container1">
			<s:div cssClass="wrapper">			   
				</s:div>
				<s:div cssClass="rightside">
						<h1> User Access</h1>
						<div class="form">
						<table >
						<tr>
							<td colspan="3"><b><s:property value="firstName"/> <s:property value="middleName"/> <s:property value="lastName"/></b></td>
						</tr>
							<tr>
								<td colspan="3" align="center"><s:hidden value="%{uid}" name="uid"/><s:actionerror cssClass="error" /><s:actionmessage cssClass="msg"/> </td>								
							</tr>
							<s:set name="count" value="0"></s:set>
							<s:iterator value="splitValList" status="splitValListStatus">							
							</s:iterator>
							<s:iterator value="permisstionList" status="permisstionListStatus">
							<s:if test="%{splitValList[#count]==firstVal}">
							<tr class="<s:if test="#permisstionListStatus.odd == true ">even</s:if><s:else>odd</s:else>">								
									<td>&nbsp;</td>							
									<td><s:checkbox   fieldValue="%{firstVal}" value="true" name="permissionOn" ></s:checkbox></td>
									<td><s:property value="secondVal"/> </td>
									<s:set name="count" value="#count+1"></s:set>																																				
							</tr>	
							</s:if>
							<s:else>
								<tr class="<s:if test="#permisstionListStatus.odd == true ">even</s:if><s:else>odd</s:else>">								
									<td>&nbsp;</td>							
									<td><s:checkbox  fieldValue="%{firstVal}"  name="permissionOn" ></s:checkbox></td>
									<td><s:property value="secondVal"/> </td>																																		
							</tr>	
							</s:else>
								</s:iterator>
																																		
							<tr>
								<td colspan="3">&nbsp;<s:checkbox cssStyle="display:none"   fieldValue="" value="true" name="permissionOn" ></s:checkbox></td>
							</tr>
							<tr>
								<td colspan="3">								
								<s:submit  value="Save" cssClass="blue-button" action="allowForPermission" ></s:submit>																									
								<s:reset  value="Reset" cssClass="blue-button" ></s:reset>								
								<br class="clear" />
								</td>
							</tr>
						</table>												
                    </div>
			   </s:div>
				<s:div cssClass="clear"></s:div>
			</s:div>
		</s:div>
	</s:div>	
</sx:div>
</s:form>
</body> 
</html>