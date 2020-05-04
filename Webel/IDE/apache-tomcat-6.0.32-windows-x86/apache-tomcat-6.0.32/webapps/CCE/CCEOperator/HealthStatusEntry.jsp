<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags"%>
    <%@ taglib prefix="sx" uri="/struts-dojo-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>CCE | <s:if test="(scholasticMarksID == null || scholasticMarksID.equals('') ||scholasticMarksID.equals('-1'))">Add</s:if><s:else>Edit</s:else> Scholastic Marks</title>
<link rel="stylesheet" type="text/css" href="<s:url value="../css/style.css"/>" />
 <script type="text/javascript" src="<s:url value="../js/General/Validation.js"/>"></script>
</head>
<body>
	<s:form    theme="simple"  method="post" validate="true">
		<h1>Health Status </h1>
			<div class="grid">
				<s:set value="1" name="count"></s:set>				
				<s:div>												
						<s:hidden name="standard" value="%{standard}"></s:hidden> 						
				</s:div>
				<div align="center"><s:actionerror cssClass="error" /><s:actionmessage cssClass="msg"/></div> 											
					<table class="tablegrid" width="100%">
						<tr>
							<th width="5%">Sl No.</th>
							<th width="10%">Admission No</th>
							<th width="20%">Student Name</th>
							<th width="5%">Height (ft)</th>
							<th width="5%">Weight (ft)</th>							
							<th width="5%">Vision (L)(D)</th>
							<th width="5%">Vision (R)(D)</th>
							<th width="10%">Dental Hygiene</th>							
						</tr>
						<s:iterator value="studentList" status="studentIndex">
							<tr valign="top" class="<s:if test="#studentIndex.odd == true ">odd</s:if><s:else>even</s:else>">
								<td>
									<s:property value="#studentIndex.index+1"/>
									<s:hidden name="studentId" value="%{studentList[#studentIndex.index][0]}" ></s:hidden>
									<s:hidden name="academicYear" value="%{studentList[#studentIndex.index][3]}"></s:hidden>
								 </td>
								 <td>
								 	<s:property value="studentList[#studentIndex.index][2] "  />
								 </td>
								<td>
									<s:property value="studentList[#studentIndex.index][1] "  />
								</td>
								<td>
									<s:textfield  cssClass="smallTextBox" name="height" onblur="extractNumber(this,2,true);" onkeyup="extractNumber(this,2,true);" onkeypress="return blockNonNumbers(this, event, true, true); " maxlength="5"></s:textfield> 
								</td>
								<td>
									<s:textfield  cssClass="smallTextBox" name="weight" onblur="extractNumber(this,2,true);" onkeyup="extractNumber(this,2,true);" onkeypress="return blockNonNumbers(this, event, true, true);" maxlength="5"></s:textfield>
								</td>								
								<td>
									<s:textfield  cssClass="smallTextBox" name="visionL" onblur="extractNumber(this,2,true);" onkeyup="extractNumber(this,2,true);" onkeypress="return blockNonNumbers(this, event, true, true);" maxlength="5"></s:textfield>
								</td>
								<td>
									<s:textfield  cssClass="smallTextBox" name="visionR" onblur="extractNumber(this,2,true);" onkeyup="extractNumber(this,2,true);" onkeypress="return blockNonNumbers(this, event, true, true);" maxlength="5"></s:textfield>
								</td>
								<td>
									<s:textarea cssClass="textbox" name="dentalHygiene"></s:textarea>
								</td>							
							</tr>
						</s:iterator>					
					</table>
					<div align="center" style="height: 50px;padding-top: 10px">
						<s:submit  value="Save" cssClass="blue-button" action="save" ></s:submit>																
						<s:reset  value="Reset" cssClass="blue-button" ></s:reset>	
					</div>													
	         </div>			 
	</s:form>
</body>
</html>