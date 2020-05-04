<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags"%>
    <%@ taglib prefix="sx" uri="/struts-dojo-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<link rel="stylesheet" type="text/css" href="<s:url value="../css/style.css"/>" />
<script type="text/javascript" src="<s:url value="../js/General/Validation.js"/>"></script>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>CCE | Co-Scho Marks </title>
	
   
</head>
<body>
	<s:form    theme="simple"  method="post" validate="true">
	<s:div>
	<s:div>
	    				<h1>Edit Co-Scholastic Marks</h1>
						<div class="details">
						<table >
						<s:set name="count" value="0"></s:set>	
						<s:iterator var="counter" begin="1" end="5" status="studentListStatus">												
							<tr class="<s:if test="#studentListStatus.odd == true ">odd</s:if><s:else>even</s:else>">
								
								<td width="35%" class="bold"><s:property value="studentList[0][#count]" /></td>
								<s:set name="count" value="#count+1"></s:set>	
								<td width="35%"><s:property value="studentList[0][#count]" /></td>
								<s:set name="count" value="#count+1"></s:set>
								<td width="30%">&nbsp;</td>
							</tr>							
						</s:iterator>
									<s:hidden name="standard"></s:hidden>
									<s:hidden name="area"></s:hidden>
									<s:hidden name="subArea"></s:hidden>
									<s:hidden name="studentId"></s:hidden>
									<s:hidden name="academicYear"></s:hidden>
									<s:hidden name="marksId"></s:hidden>		
							<s:iterator value="studentWiseMarksList" status="listStatus">
							<tr class="<s:if test="#listStatus.odd == true ">odd</s:if><s:else>even</s:else>">
								
								<td width="35%" class="bold">
									<s:property value="studentWiseMarksList[#listStatus.index][0]" />
									<s:hidden name="paper" value="%{studentWiseMarksList[#listStatus.index][3]}"></s:hidden>
									
								</td>
								<td width="35%">
									<s:textfield name="marks" id="marks" cssClass="textbox" onblur="marksChk(this,'%{studentWiseMarksList[#listStatus.index][2]}' )" onfocus="clearFun(this)" maxlength="3" onkeypress="return isNumberKey(event)" value="%{studentWiseMarksList[#listStatus.index][1]}"></s:textfield>
								</td>
								<td width="30%"></td>
							</tr>
							</s:iterator>							
							<tr>
								<td colspan="2" align="center">
								<s:submit  value="Update" action="save" cssClass="blue-button" ></s:submit>
									<s:submit  value="Close" action="marksEdit" cssClass="blue-button" ></s:submit>
									<br class="clear" />
								</td>
								<td></td>
							</tr>
						</table>
						
							
                        </div>
			   </s:div>
				<s:div cssClass="clear"></s:div>
			</s:div>
		
</s:form>
</body> 
</html>