<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" errorPage="../error.jsp"%>
    <%@ taglib prefix="s" uri="/struts-tags"%>
    <%@ taglib prefix="sx" uri="/struts-dojo-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>CCE | Edit Health Status </title>	    
</head>
<body>
	<s:form     method="post" validate="true" enctype="multipart/form-data">
	<sx:div theme="ajax">
	<s:div>
	 <s:div cssClass="main1" >
    	<s:include value="../UserControler/Header.jsp"></s:include>
	</s:div>
	   <s:div cssClass="container">
		<s:div cssClass="container1">
			<s:div cssClass="wrapper">
			    <s:include value="../UserControler/LeftPanel.jsp"></s:include>
				</s:div>
				<s:div cssClass="rightside">
						<h1>Edit Health Status of <s:property value="name"/></h1>
						<div class="form">
						<table >
							<tr>
								<td colspan="3" align="center"><s:hidden value="%{typeId}" name="typeId"/><s:actionerror cssClass="error" /><s:actionmessage cssClass="msg"/> </td>								
							</tr>
							<tr>
								<td style="width: 25%">Height : </td>
								<td style="width: 35%"><s:textfield  name="heightIndv"  required="true" key="heightIndv" id="heightIndv" maxlength="500" cssClass="textbox" ></s:textfield></td>
								<td style="width: 40%"><s:fielderror  fieldName="heightIndv" theme="simple" cssClass="error" /></td>
							</tr>
							<tr class="even">
								<td>Weight  : </td>
								<td><s:textfield  name="weightIndv"  required="true" key="weightIndv" cssClass="textbox" maxlength="500" ></s:textfield></td>
								<td><s:fielderror  fieldName="weightIndv" theme="simple" cssClass="error" /></td>
							</tr>
							<tr>
								<td>Left Vision  : </td>
								<td><s:textfield  name="leftVision"  required="true" key="leftVision" cssClass="textbox" maxlength="15" ></s:textfield></td>
								<td><s:fielderror  fieldName="leftVision" theme="simple" cssClass="error" /></td>
							</tr>
							<tr class="even">
								<td>Right Vision :</td>
								<td><s:textfield name="rightVision" key="rightVision" cssClass="textbox" maxlength="15"></s:textfield></td>
								<td><s:fielderror  fieldName="rightVision" theme="simple" cssClass="error" /></td>
							</tr>
							<tr>
								<td>Dental Hygiene  :</td>
								<td><s:textarea name="dental" key="dental" cssClass="textbox" ></s:textarea></td>
								<td><s:fielderror  fieldName="dental" theme="simple" cssClass="error" /></td>
							</tr>
														
							<tr>
								<td colspan="3">&nbsp;</td>
							</tr>
							<tr class="even">
								<td colspan="3">
										<s:submit  value="Update" action="save" cssClass="blue-button" ></s:submit>
										<s:reset  value="Reset" cssClass="blue-button" ></s:reset>
										<s:submit  value="Close" cssClass="blue-button" action="revert" ></s:submit>
																									
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
	<s:include value="../UserControler/Footer.jsp"></s:include>
</sx:div>
</s:form>
</body> 
</html>