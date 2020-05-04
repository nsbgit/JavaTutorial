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
						<s:set name="count" value="0"></s:set>	
						<s:iterator var="counter" begin="1" end="6" status="studentListStatus">												
							<tr class="<s:if test="#studentListStatus.odd == true ">odd</s:if><s:else>even</s:else>">
								<td width="10%"></td>
								<td width="43%" class="bold"><s:property value="studentList[0][#count]" /></td>
								<s:set name="count" value="#count+1"></s:set>	
								<td width="35%"><s:property value="studentList[0][#count]" /></td>
								<s:set name="count" value="#count+1"></s:set>
								<td width="12%">&nbsp;</td>
							</tr>							
						</s:iterator>
														
							<s:iterator value="studentWiseMarksList" status="listStatus">
							<tr class="<s:if test="#listStatus.odd == true ">odd</s:if><s:else>even</s:else>">
								<td width="10%"></td>
								<td width="43%" class="bold"><s:property value="studentWiseMarksList[#listStatus.index][0]" /></td>
								<td width="35%"><s:property value="studentWiseMarksList[#listStatus.index][1]" /></td>
								<td width="12%">&nbsp;</td>
							</tr>
							</s:iterator>							
							<tr>
								<td colspan="4" align="center">
								<s:hidden name="standard" ></s:hidden>
								<s:hidden name="examType"></s:hidden>
								<s:hidden name="examName"></s:hidden>
								<s:hidden name="subject"></s:hidden>
								<s:hidden name="academicYear"></s:hidden>
									<s:submit  value="Close" action="marksEdit" cssClass="blue-button" ></s:submit>
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