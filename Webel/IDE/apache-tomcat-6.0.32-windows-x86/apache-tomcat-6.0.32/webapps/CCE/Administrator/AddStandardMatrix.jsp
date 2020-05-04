<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags"%>
    <%@ taglib prefix="sx" uri="/struts-dojo-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>CCE | <s:if test="(standMatrixID == null || standMatrixID.equals('') ||standMatrixID.equals('-1'))">Add</s:if><s:else>Edit</s:else> Standard Matrix</title>
</head>
<body>
	<s:form    theme="simple"  method="post" validate="true">
	<s:div>
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
						<h1><s:if test="(standMatrixID == null || standMatrixID.equals('')||standMatrixID.equals('-1'))">Add</s:if><s:else>Edit</s:else> Standard Matrix  </h1>
						<div class="form">
						<table >						
						<tr>
								<td colspan="3" align="center"><s:hidden value="%{standMatrixID}" name="standMatrixID"/><s:actionerror cssClass="error" /><s:actionmessage cssClass="msg"/> </td>								
							</tr>	
							<tr >
								<td style="width: 25%">Standard <em>*</em> :</td>
								<td style="width: 35%"><sx:autocompleter    headerKey="" headerValue="Select" list="standardList"  listKey="firstVal" listValue="secondVal"  name="standard" cssClass="combobox"></sx:autocompleter></td>
								<td style="width: 40%"><s:fielderror  fieldName="standard" theme="simple" cssClass="error" /></td>
							</tr>						
							<tr class="even">
								<td>Section <em>*</em> :</td>
								<td><sx:autocompleter    headerKey="" headerValue="Select" list="sectionList"  listKey="firstVal" listValue="secondVal"  name="section" cssClass="combobox"></sx:autocompleter></td>
								<td><s:fielderror  fieldName="section" theme="simple" cssClass="error" /></td>
							</tr>
							<tr valign="top" >
								<td>Short Name <em>*</em> :</td>								
								<td><s:textfield name="shortName" key="shortName" cssClass="textbox"  maxlength="100"></s:textfield></td>								
								<td><s:fielderror  fieldName="shortName" theme="simple" cssClass="error" /></td>
							</tr>
							
							<tr class="even">
								<td colspan="3">
									<s:if test="(standMatrixID == null || standMatrixID.equals('') ||standMatrixID.equals('-1'))">
										<s:submit  value="Save" cssClass="blue-button" action="saveStandMatrix" ></s:submit>
										<s:reset  value="Reset" cssClass="blue-button" ></s:reset>
										<s:submit  value="Close" cssClass="blue-button" action="CLOSE" ></s:submit>
									</s:if>
									<s:else>
										<s:submit  value="Update" action="saveStandMatrix" cssClass="blue-button" ></s:submit>
										<s:reset  value="Reset" cssClass="blue-button" ></s:reset>
										<s:submit  value="Close" cssClass="blue-button" action="revert" ></s:submit>
									</s:else>
									
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
</s:div>
</s:form>
</body>
</html>