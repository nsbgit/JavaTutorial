<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags"%>
    <%@ taglib prefix="sx" uri="/struts-dojo-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>CCE | Edit  User Image </title>	    
</head>
<body>
	<s:form    theme="simple" action="uploadEmployeeImage" method="post" validate="true" enctype="multipart/form-data">
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
						<h1>Edit Employee Image</h1>
						<div class="form">
						<table >
							<tr>
								<td colspan="3" align="center"><s:fielderror cssClass="error" /> </td>								
							</tr>								
							<tr>
								<td>Image  :</td>
								<td><s:file name="imageUpload" key="imageUpload" size="43" accept="image/jpeg" cssClass="textbox" ></s:file></td>
								<td>&nbsp;</td>
							</tr>																					
							<tr>
								<td colspan="3">&nbsp;</td>
							</tr>
							<tr class="even">
								<td colspan="3">
									<s:submit  value="Upload" cssClass="blue-button" ></s:submit>
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
	<s:include value="../UserControler/Footer.jsp"></s:include>
</s:div>
</s:form>
</body> 
</html>