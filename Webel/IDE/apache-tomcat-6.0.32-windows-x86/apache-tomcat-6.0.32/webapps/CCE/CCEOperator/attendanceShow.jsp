<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags"%>
    <%@ taglib prefix="sx" uri="/struts-dojo-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<link rel="stylesheet" type="text/css" href="<s:url value="../css/style.css"/>" />
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>CCE | <s:property value="Header"/> </title>
	
   
</head>
<body>
	<s:form    theme="simple"  method="post" validate="true">
	<s:div>
	<s:div>
	    				<h1><s:property value="Header"/></h1>
						<div class="details">
						<table >
							<s:iterator value="attendanceList" status="listStatus">
							<tr class="<s:if test="#listStatus.odd == true ">odd</s:if><s:else>even</s:else>">
								<td width="12%"></td>
								<td width="28%" class="bold"><s:property value="firstVal"></s:property>&nbsp;&nbsp;:</td>
								<td width="40%"><s:property value="secondVal" ></s:property></td>
								<td width="20%">&nbsp;</td>
							</tr>
							</s:iterator>							
							<tr>
								<td colspan="4" align="center">
								<s:hidden name="standard" ></s:hidden>
								<s:hidden name="area"></s:hidden>
								<s:hidden name="subArea"></s:hidden>
								<s:hidden name="academicYear"></s:hidden>
									<s:submit  value="Close" action="view" cssClass="blue-button" ></s:submit>
									<br class="clear" />
								</td>
								
							</tr>
						</table>
						
							
                        </div>
			   </s:div>
				<s:div cssClass="clear"></s:div>
			</s:div>
		
</s:form>
</body> 
</html>