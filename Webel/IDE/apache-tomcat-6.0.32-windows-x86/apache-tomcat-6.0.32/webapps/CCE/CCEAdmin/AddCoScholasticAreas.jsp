<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags"%>
    <%@ taglib prefix="sx" uri="/struts-dojo-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>CCE | <s:if test="(coSchoAreasId == null || coSchoAreasId.equals('') ||coSchoAreasId.equals('-1'))">Add</s:if><s:else>Edit</s:else> Co-Scholastic Areas</title>
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
						<h1><s:if test="(coSchoAreasId == null || coSchoAreasId.equals('')||coSchoAreasId.equals('-1'))">Add</s:if><s:else>Edit</s:else> Co-Scholastic Areas  </h1>
						<div class="form">
						<table >						
						<tr>
								<td colspan="3" align="center"><s:hidden value="%{coSchoAreasId}" name="coSchoAreasId"/><s:actionerror cssClass="error" /><s:actionmessage cssClass="msg"/> </td>								
							</tr>
							<tr >
								<td style="width: 25%">Standard Category <em>*</em> :</td>
								<td style="width: 35%"><sx:autocompleter    headerKey="" headerValue="Select" list="cateList" listKey="firstVal" listValue="secondVal"   name="category" cssClass="combobox"></sx:autocompleter></td>
								<td style="width: 40%"><s:fielderror  fieldName="category" theme="simple" cssClass="error" /></td>
							</tr>
							<tr class="even" >
								<td>Part No. <em>*</em> :</td>
								<td><s:textfield name="partNo" required="true" key="partNo"  cssClass="textbox" maxlength="200" ></s:textfield></td>
								<td><s:fielderror  fieldName="partNo" theme="simple" cssClass="error" /></td>
							</tr>							
							<tr >
								<td>Areas Name <em>*</em> :</td>
								<td><s:textfield name="areaName" required="true" key="areaName"  cssClass="textbox" maxlength="200" ></s:textfield></td>
								<td><s:fielderror  fieldName="areaName" theme="simple" cssClass="error" /></td>
							</tr>
							
							<tr class="even" >
								<td style="width: 25%">Area Type <em>*</em> :</td>
								<td style="width: 35%"><sx:autocompleter    headerKey="" headerValue="Select" list="#{'1':'All sub area are compulsory','2':'Optional'}" onchange="disableEnable(this,'maxAssesed')"  name="areaType" cssClass="combobox"></sx:autocompleter></td>
								<td style="width: 40%"><s:fielderror  fieldName="subCategory" theme="simple" cssClass="error" /></td>
							</tr>
							<s:if test="(areaType==1 || areaType == null  )">
								<tr >
									<td>Maximum assessed <em>*</em> :</td>
									<td><s:textfield name="maxAssessed" required="true" key="maxAssessed"  id="maxAssesed" onfocus="blank(this.id)" onkeypress="return isNumberKey(event)" onblur="fillWithoutDecimal(this.id)" cssClass="textbox" disabled="true" maxlength="2" ></s:textfield></td>
									<td><s:fielderror  fieldName="maxAssessed" theme="simple" cssClass="error" /></td>
								</tr>
							</s:if>
							<s:else>
								<tr >
									<td>Maximum assessed <em>*</em> :</td>
									<td><s:textfield name="maxAssessed" required="true" key="maxAssessed"  id="maxAssesed" onfocus="blank(this.id)" onkeypress="return isNumberKey(event)" onblur="fillWithoutDecimal(this.id)" cssClass="textbox"  maxlength="2" ></s:textfield></td>
									<td><s:fielderror  fieldName="maxAssessed" theme="simple" cssClass="error" /></td>
								</tr>
							</s:else>	
							<tr valign="top" class="even">
								<td>Comment :</td>								
								<td><s:textarea name="description" key="description" cssClass="textbox"  ></s:textarea></td>
								<td></td>
							</tr>
							
							<tr >
								<td colspan="3">
									<s:if test="(coSchoAreasId == null || coSchoAreasId.equals('') ||coSchoAreasId.equals('-1'))">
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