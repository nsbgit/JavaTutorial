<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" errorPage="../error.jsp"%>
    <%@ taglib prefix="s" uri="/struts-tags"%>
    <%@ taglib prefix="sx" uri="/struts-dojo-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>CCE | Subject Access</title>
<link rel="stylesheet" type="text/css" href="<s:url value="../css/style.css"/>" />    
    <link rel="stylesheet" type="text/css" href="<s:url value="../css/thickbox.css"/>"/>
    <script type="text/javascript" src="<s:url value="../js/General/Validation.js"/>"></script>
    <script type="text/javascript" src="<s:url value="../js/General/jquery-1.3.2.min.js"/>"></script>
    <script type="text/javascript" src="<s:url value="../js/General/thickbox.js"/>"></script> 
    <script type="text/javascript" src="<s:url value="../js/General/ddaccordion.js"/>"></script>
     <script type="text/javascript" src="../js/General/dojo.js" ></script>	    
</head>
<body onload="loadNewValueFor4(document.getElementById('standardMat').value,document.getElementById('academicYear').value,'<s:property value="Id"/>','subjectNew','standard.html')">
	<s:form     method="post" validate="true" >
	<sx:div >
	<s:div>
	 <s:div cssClass="main1" ><s:hidden name="Id"></s:hidden>    	
	</s:div>
	   <s:div cssClass="container">
		<s:div cssClass="container1">					
						<h1> Subject Access</h1>
						<div class="form">
						<table >
						<tr>
							<td colspan="3"><b><s:property value="userName[0].firstVal"/> <s:property value="userName[0].secondVal"/> <s:property value="userName[0].thredVal"/> </b></td>
						</tr>
						<tr class="even">
							<td>Standard Matrix:</td>
							<td><sx:autocompleter headerKey="" headerValue="Select" name="standardMat" id="standardMat" onchange="loadNewValueFor4(this.value,document.getElementById('academicYear').value,'%{Id}','subjectNew','standard.html')" list="standardList" listKey="firstVal" listValue="secondVal" cssClass="combobox" ></sx:autocompleter></td>
							<td>&nbsp;</td>							
						</tr>
						<tr >
							<td>Academic Year:</td>
							<td><sx:autocompleter headerKey="" headerValue="Select" name="academicYear" id="academicYear" onchange="loadNewValueFor4(document.getElementById('standardMat').value,this.value,'%{Id}','subjectNew','standard.html')" list="yearList"  cssClass="combobox" ></sx:autocompleter></td>
							<td>&nbsp;</td>							
						</tr>						
						<tr class="even">
							<td>Subject:</td>
							<td id="subjectNew"><s:select multiple="true" name="subject" id="subject" list="{}" cssStyle="height:100px" cssClass="combobox"></s:select></td>
							<td>&nbsp;</td>	
						</tr >							
							<tr >
								<td colspan="3">								
									<s:submit  value="Save" cssClass="blue-button" action="saveAssignSubject" ></s:submit>																									
									<s:reset  value="Reset" cssClass="blue-button" ></s:reset>								
									<br class="clear" />
								</td>
							</tr>
						</table>												
                    </div>			 
			</s:div>
		</s:div>
	</s:div>	
</sx:div>
</s:form>
</body> 
</html>