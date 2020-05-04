<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags"%>
    <%@ taglib prefix="sx" uri="/struts-dojo-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>CCE | <s:if test="(coSchoPaperId == null || coSchoPaperId.equals('') ||coSchoPaperId.equals('-1'))">Add</s:if><s:else>Edit</s:else> Co-Scholastic Paper</title>
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
						<h1><s:if test="(coSchoPaperId == null || coSchoPaperId.equals('')||coSchoPaperId.equals('-1'))">Add</s:if><s:else>Edit</s:else> Co-Scholastic Paper </h1>
						<div class="form">
						<table >						
							<tr>
								<td colspan="3" align="center"><s:hidden value="%{coSchoPaperId}" name="coSchoPaperId"/><s:actionerror cssClass="error" /><s:actionmessage cssClass="msg"/> </td>								
							</tr>
							<tr>
								<td>Academic Year <em>*</em> :</td>
								<td><sx:autocompleter    headerKey="" headerValue="Select" list="acaYearList"    name="academicYear" cssClass="combobox"></sx:autocompleter></td>
								<td><s:fielderror  fieldName="academicYear" theme="simple" cssClass="error" /></td>
							</tr>
							<tr class="even">
								<td style="width: 25%">Exam Category <em>*</em> :</td>
								<td style="width: 35%"><sx:autocompleter    headerKey="" headerValue="Select" list="categoryList" listKey="firstVal" listValue="secondVal"   name="category" cssClass="combobox" onchange="loadNewValue(this.value,'newArea','getArea.html')"></sx:autocompleter></td>
								<td style="width: 40%"><s:fielderror  fieldName="category" theme="simple" cssClass="error" /></td>
							</tr>
							
							<tr>
								<td>Area<em>*</em> :</td>
								<td  id="newArea"><sx:autocompleter    headerKey="" headerValue="Select" list="areaList" listKey="firstVal" listValue="secondVal"   name="areaName" cssClass="combobox" onchange="loadNewValue(this.value,'newSubArea','getSubArea.html')"></sx:autocompleter></td>
								<td><s:fielderror  fieldName="areaName" theme="simple" cssClass="error" /></td>
							</tr>							
							<tr class="even">
								<td>Sub Area<em>*</em> :</td>
								<td id="newSubArea"><sx:autocompleter    headerKey="" headerValue="Select" list="subAreaList" listKey="firstVal" listValue="secondVal"   name="subAreaName" cssClass="combobox"></sx:autocompleter></td>
								<td><s:fielderror  fieldName="subAreaName" theme="simple" cssClass="error" /></td>
							</tr>
							<tr>
								<td>Paper Code :</td>
								<td><s:textfield name="paperCode" required="true" key="paperCode"  cssClass="textbox" maxlength="200" ></s:textfield></td>
								<td><s:fielderror  fieldName="paperCode" theme="simple" cssClass="error" /></td>
							</tr>
							<tr class="even">
								<td>Paper <em>*</em> :</td>
								<td><s:textfield name="paperName" required="true" key="paperName"  cssClass="textbox" maxlength="200" ></s:textfield></td>
								<td><s:fielderror  fieldName="paperName" theme="simple" cssClass="error" /></td>
							</tr>
							<tr >
								<td>Paper Short Name <em>*</em> :</td>
								<td><s:textfield name="paperShortName" required="true" key="paperShortName"  cssClass="textbox" maxlength="200" ></s:textfield></td>
								<td><s:fielderror  fieldName="paperShortName" theme="simple" cssClass="error" /></td>
							</tr>
							<tr class="even">
								<td>Marks <em>*</em> :</td>
								<td><s:textfield name="marks" required="true" key="marks"  cssClass="textbox" onkeypress="return isNumberKey(event)" maxlength="3"></s:textfield></td>
								<td><s:fielderror  fieldName="marks" theme="simple" cssClass="error" /></td>
							</tr>														
							<tr >
								<td colspan="3">
									<s:if test="(coSchoPaperId == null || coSchoPaperId.equals('') ||coSchoPaperId.equals('-1'))">
										<s:submit  value="Save" cssClass="blue-button" action="save" ></s:submit>
										<s:reset  value="Reset" cssClass="blue-button" ></s:reset>
										<s:submit  value="Close" cssClass="blue-button" action="CLOSE" ></s:submit>
									</s:if>
									<s:else>
										<s:submit  value="Update" action="save" cssClass="blue-button" ></s:submit>
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