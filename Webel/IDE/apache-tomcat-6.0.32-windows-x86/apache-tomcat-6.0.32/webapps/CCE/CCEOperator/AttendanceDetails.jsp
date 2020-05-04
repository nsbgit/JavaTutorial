<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags"%>
    <%@ taglib prefix="sx" uri="/struts-dojo-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>CCE | Student Attendance </title>
<link rel="stylesheet" type="text/css" href="<s:url value="../css/style.css"/>" />
 <script type="text/javascript" src="<s:url value="../js/General/Validation.js"/>"></script>
</head>
<body>
	<s:form    theme="simple"  method="post" validate="true">
		<h1>Student Attendance </h1>
			<div class="grid">
				<s:set value="1" name="count"></s:set>				
				<s:div>
						<s:hidden name="category" value="%{category}"></s:hidden> 						
						<s:hidden name="academicYear" value="%{academicYear}"></s:hidden> 
						<s:hidden name="standard" value="%{standard}"></s:hidden> 
						<s:hidden name="examType" value="%{examType}"></s:hidden> 						 
						<s:hidden name="totWorkingDays" value="%{totWorkingDays}"></s:hidden>						
				</s:div>
				<div align="center"><s:actionerror cssClass="error" /><s:actionmessage cssClass="msg"/></div> 
				<s:if test="%{!studentList.isEmpty()}"  >												
				<table class="tablegrid" width="100%">
					<tr>
						<th>SL</th>
						<th>Admission No.</th>
						<th>Name</th>
						<th>Total Working Days</th>
						<th>Total Attendance</th>
					</tr>
					<s:iterator value="studentList" status="studentListStatus">
				  		<tr class="<s:if test="#studentListStatus.odd == true ">odd</s:if><s:else>even</s:else>">
				  			<td><s:property value="#count"/> </td>
				  			<td><s:property value="fourthVal"/></td>
				  			<td><s:property value="thredVal"/><s:hidden name="studentId" value="%{secondVal}" ></s:hidden> <s:set name="stuId" value="secondVal"></s:set> </td>
				  			<td><s:property value="totWorkingDays"/> </td>
				  			<td><s:textfield  cssClass="smallTextBox" onkeypress="return isNumberKey(event)" value="0" onfocus="clearFun(this)" maxlength="3" name="attandence" onblur="attendanceChk(this,'%{totWorkingDays}')"></s:textfield> </td>
					  			<s:set value="#count+1" name="count"></s:set>
					  	</tr>
						</s:iterator>
						<tr>
						<td colspan="4" align="center">							
								<s:submit  value="Save" cssClass="blue-button" action="save" ></s:submit>																	
								<s:reset  value="Reset" cssClass="blue-button" ></s:reset>															
						</td>
					</tr>
					</table>
					</s:if>
					<s:else>												
							<div class="error" style="width: 100%" align="center">Student does Not Exist.</div>													
					</s:else>													
		         </div>			 
		</s:form>
	</body>
<SCRIPT type="text/javascript">
	function attendanceChk(attendance,totAttendance){
		if(attendance.value !=''){
			if(parseInt(attendance.value)>parseInt(totAttendance)){			
				alert(attendance.value+' Greater Then  '+totAttendance);
				attendance.value=totAttendance;
				attendance.focus();			
			}		
		}
		else{
			attendance.value='0';
		}		
	}
	function clearFun(objVal){		
		if(objVal.value=='0')
			objVal.value='';
	}
</SCRIPT>
</html>