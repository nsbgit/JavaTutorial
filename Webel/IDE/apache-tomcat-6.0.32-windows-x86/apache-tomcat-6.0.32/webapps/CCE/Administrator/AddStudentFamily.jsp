<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" errorPage="../error.jsp"%>
    <%@ taglib prefix="s" uri="/struts-tags"%>
    <%@ taglib prefix="sx" uri="/struts-dojo-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>CCE | <s:if test="(studentID == null || studentID.equals('') ||studentID.equals('-1'))">Add</s:if><s:else>Edit</s:else> Student Family </title>	    
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
						<h1><s:if test="(familyId == null || familyId.equals('') ||familyId.equals('-1'))">Add</s:if><s:else>Edit</s:else> Student Family</h1>
						<div class="form">
						<table >
							<tr>
								<td colspan="3" align="center"><s:hidden value="%{familyId}" name="familyId"/><s:actionerror cssClass="error" /><s:actionmessage cssClass="msg"/> </td>								
							</tr>
							<tr>
								<td style="width: 25%">Father Name <em>*</em> : </td>
								<td style="width: 35%"><s:textfield  name="fatherName"  required="true" key="fatherName" maxlength="500" cssClass="textbox" ></s:textfield></td>
								<td style="width: 40%"><s:fielderror  fieldName="fatherName" theme="simple" cssClass="error" /></td>
							</tr>
							<tr class="even">
								<td>Father's Qualification: <em>*</em> : </td>
								<td><s:textfield  name="fathersQual"  required="true" key="fathersQual" cssClass="textbox" maxlength="500" ></s:textfield></td>
								<td><s:fielderror  fieldName="fathersQual" theme="simple" cssClass="error" /></td>
							</tr>
							<tr>
								<td>Father's Occupation<em>*</em> : </td>
								<td><s:textfield  name="fathersOcc"  required="true" key="fathersOcc" cssClass="textbox" maxlength="500" ></s:textfield></td>
								<td><s:fielderror  fieldName="fathersOcc" theme="simple" cssClass="error" /></td>
							</tr>
							<tr class="even">
								<td>Mother Name <em>*</em> :</td>
								<td><s:textfield  name="motherName"  required="true" key="motherName" maxlength="500" cssClass="textbox" ></s:textfield></td>
								<td><s:fielderror  fieldName="motherName" theme="simple" cssClass="error" /></td>
							</tr>
							<tr>
								<td>Mother's Qualification  <em>*</em> :</td>
								<td><s:textfield  name="motherQual"  required="true" key="motherQual" maxlength="500" cssClass="textbox" ></s:textfield> </td>
								<td><s:fielderror  fieldName="motherQual"   theme="simple" cssClass="error" /></td>
							</tr>
							<tr class="even">
								<td>Mother's Occupation <em>*</em> :</td>
								<td><s:textfield  name="mothersOcc"  required="true" key="mothersOcc" maxlength="500" cssClass="textbox" ></s:textfield> </td>
								<td><s:fielderror  fieldName="mothersOcc" theme="simple" cssClass="error" /></td>
							</tr>
							<tr>
								<td>No. Of Brothers <em>*</em> :</td>
								<td><s:textfield  name="noOfBrother"  required="true" key="noOfBrother" maxlength="2" onkeypress="return isNumberKey(event)" cssClass="textbox" ></s:textfield></td>
								<td><s:fielderror  fieldName="noOfBrother" theme="simple" cssClass="error" /></td>
							</tr>
							<tr class="even">
								<td>No. Of Sister <em>*</em>  :</td>
								<td><s:textfield  name="noOfSister"  required="true" key="noOfSister" maxlength="2" onkeypress="return isNumberKey(event)" cssClass="textbox" ></s:textfield></td>
								<td><s:fielderror  fieldName="noOfSister" theme="simple" cssClass="error" /></td>
							</tr>
							<tr>
								<td>Residential Address <em>*</em> :</td>
								<td><s:textarea   name="residentialAddress" key="residentialAddress" cssClass="textbox"  ></s:textarea></td>
								<td><s:fielderror  fieldName="residentialAddress" theme="simple" cssClass="error" /></td>
							</tr>
							<tr class="even">
								<td>Phone No.<em>*</em> :</td>
								<td><s:textfield name="phoneNo" key="phoneNo" cssClass="textbox" onkeypress="return isNumberKey(event)" maxlength="11"></s:textfield></td>
								<td><s:fielderror  fieldName="phoneNo1" theme="simple" cssClass="error" /></td>
							</tr>
							<tr>
								<td>Email Id  :</td>
								<td><s:textfield name="emailId" key="emailId" cssClass="textbox" onblur="return checkEmail(this)" maxlength="200"></s:textfield></td>
								<td><s:fielderror  fieldName="emailId" theme="simple" cssClass="error" /></td>
							</tr>																											
							<tr class="even">
								<td colspan="3">
								<s:if test="(familyId == null || familyId.equals('') )">
										<s:submit  value="Save" cssClass="blue-button" action="saveFamily" ></s:submit>
									</s:if>
									<s:else>
										<s:submit  value="Update" action="saveFamily" cssClass="blue-button" ></s:submit>
									</s:else>									
								<s:reset  value="Reset" cssClass="blue-button" ></s:reset>
								<s:submit  value="Close" action="CLOSE" cssClass="blue-button" action="revert"></s:submit>
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