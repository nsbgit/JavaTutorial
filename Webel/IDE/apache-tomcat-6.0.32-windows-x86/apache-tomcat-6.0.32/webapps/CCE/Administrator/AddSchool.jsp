<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" errorPage="../error.jsp"%>
    <%@ taglib prefix="s" uri="/struts-tags"%>
    <%@ taglib prefix="sx" uri="/struts-dojo-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>CCE | <s:if test="(schoolID == null || schoolID.equals('') ||schoolID.equals('-1'))">Add</s:if><s:else>Edit</s:else> School </title>	    
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
						<h1><s:if test="(schoolID == null || schoolID.equals('') ||schoolID.equals('-1'))">Add</s:if><s:else>Edit</s:else> School</h1>
						<div class="form">
						<table >
							<tr>
								<td colspan="3" align="center"><s:hidden value="%{schoolID}" name="schoolID"/><s:actionerror cssClass="error" /><s:actionmessage cssClass="msg"/> </td>								
							</tr>
							<tr>
								<td style="width: 25%">School Name <em>*</em> : </td>
								<td style="width: 35%"><s:textfield  name="schoolName"  required="true" key="schoolName" maxlength="500" cssClass="textbox" ></s:textfield></td>
								<td style="width: 40%"><s:fielderror  fieldName="schoolName" theme="simple" cssClass="error" /></td>
							</tr>
							<tr class="even">
								<td>Trust Name <em>*</em> : </td>
								<td><s:textfield  name="trustName"  required="true" key="trustName" cssClass="textbox" maxlength="500" ></s:textfield></td>
								<td><s:fielderror  fieldName="trustName" theme="simple" cssClass="error" /></td>
							</tr>
							<tr>
								<td>Affiliated By <em>*</em> : </td>
								<td><sx:autocompleter    headerKey="" headerValue="Select" list="affiliatedByList"  listKey="firstVal" listValue="secondVal"  name="affiliatedBy" cssClass="combobox"></sx:autocompleter></td>
								<td><s:fielderror  fieldName="affiliatedBy" theme="simple" cssClass="error" /></td>
							</tr>
							<tr class="even">
								<td>Affiliation No.<em>*</em> :</td>
								<td><s:textfield name="affiliationNo" key="affiliationNo" cssClass="textbox" maxlength="15"></s:textfield></td>
								<td><s:fielderror  fieldName="affiliationNo" theme="simple" cssClass="error" /></td>
							</tr>
							<tr>
								<td>Approved By  <em>*</em> :</td>
								<td><sx:autocompleter    headerKey="" headerValue="Select" list="approvedByList"  listKey="firstVal" listValue="secondVal"  name="approvedBy" cssClass="combobox"></sx:autocompleter> </td>
								<td><s:fielderror  fieldName="approvedBy"   theme="simple" cssClass="error" /></td>
							</tr>
							<tr class="even">
								<td>Campus Address <em>*</em> :</td>
								<td><s:textarea  name="address" key="address" cssClass="textbox" ></s:textarea></td>
								<td><s:fielderror  fieldName="address" theme="simple" cssClass="error" /></td>
							</tr>
							<tr>
								<td>Phone No1.<em>*</em> :</td>
								<td><s:textfield name="phoneNo1" key="phoneNo1" cssClass="textbox" onkeypress="return isNumberKey(event)" maxlength="11"></s:textfield></td>
								<td><s:fielderror  fieldName="phoneNo1" theme="simple" cssClass="error" /></td>
							</tr>
							<tr class="even">
								<td>Phone No2.  :</td>
								<td><s:textfield name="phoneNo2" key="phoneNo2" cssClass="textbox" onkeypress="return isNumberKey(event)" maxlength="11"></s:textfield></td>
								<td>&nbsp;</td>
							</tr>
							<tr>
								<td>Fax No1  :</td>
								<td><s:textfield name="faxNo1" key="faxNo1" cssClass="textbox" onkeypress="return isNumberKey(event)" maxlength="11" ></s:textfield> </td>
								<td>&nbsp;</td>
							</tr>
							<tr class="even">
								<td>Fax No2  :</td>
								<td><s:textfield name="faxNo2" key="faxNo2" cssClass="textbox" onkeypress="return isNumberKey(event)" maxlength="11"></s:textfield></td>
								<td>&nbsp;</td>
							</tr>
							<tr>
								<td>Email Id  :</td>
								<td><s:textfield name="emailId" key="emailId" cssClass="textbox" onblur="return checkEmail(this)" maxlength="200"></s:textfield></td>
								<td><s:fielderror  fieldName="emailId" theme="simple" cssClass="error" /></td>
							</tr>
							<tr class="even">
								<td>URL(http://xyz.com) :</td>
								<td><s:textfield name="url" key="url" cssClass="textbox" maxlength="300"></s:textfield></td>
								<td><s:fielderror  fieldName="url" theme="simple" cssClass="error" /></td>
							</tr>														
							<tr>
								<td>School Logo  :</td>
								<td><s:hidden name="schoolLogo" /><s:file name="schoolLogo" key="schoolLogo" size="43px" accept="image/jpeg" cssClass="textbox" ></s:file></td>
								<td>&nbsp;</td>
							</tr>							
														
							<tr>
								<td colspan="3">&nbsp;</td>
							</tr>
							<tr class="even">
								<td colspan="3">
								<s:if test="(schoolID == null || schoolID.equals('') ||schoolID.equals('-1'))">
										<s:submit  value="Save" cssClass="blue-button" action="saveSchoolInfo" ></s:submit>
										<s:reset  value="Reset" cssClass="blue-button" ></s:reset>
										<s:submit  value="Close" action="CLOSE" cssClass="blue-button" ></s:submit>
									</s:if>
									<s:else>
										<s:submit  value="Update" action="saveSchoolInfo" cssClass="blue-button" ></s:submit>
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
</sx:div>
</s:form>
</body> 
</html>