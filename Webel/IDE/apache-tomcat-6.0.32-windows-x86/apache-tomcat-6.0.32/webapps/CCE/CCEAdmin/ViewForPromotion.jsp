<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags"%>
    <%@ taglib prefix="sx" uri="/struts-dojo-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>CCE | Promotion Profile</title>
<link rel="stylesheet" type="text/css" href="<s:url value="../css/style.css"/>" />
 <script type="text/javascript" src="<s:url value="../js/General/Validation.js"/>"></script>
</head>
<body>
	<s:form    theme="simple"  method="post" validate="true">
		<h1>&nbsp;&nbsp;Student List For Promotion</h1>
			<div class="grid">
				<s:set value="1" name="count"></s:set>	
				 <table width="100%" class="tablegrid">
				 <tr>
				 <th>
				 	<div style="float: left">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Standard :&nbsp;&nbsp;&nbsp;<s:property value="standardText"/> </div>
				 	<div style="float: right">Session :&nbsp;&nbsp;&nbsp;<s:property value="acaYearForView"/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</div>
				 	</th>
				 </tr>
				 <tr><td>&nbsp;</td></tr>
				 </table>
				 
				<div align="center"><s:actionerror cssClass="error" /><s:actionmessage cssClass="msg"/></div> 								
				<div align="center">
					<s:fielderror  fieldName="checkedStudent" theme="simple" cssClass="error" />
					<s:fielderror  fieldName="newacademicYear" theme="simple" cssClass="error" />
					<s:fielderror  fieldName="newstandard" theme="simple" cssClass="error" /> 
				</div>
								
				<table class="tablegrid" width="100%">
				<s:if test="%{!studentList.isEmpty()}"  >														
					<tr>							
						<th width="15%">SL NO</th>
						<th width="25%">ADMISSION NO</th>															
						<th width="45%">NAME</th>
						<th width="15%">OPTION&nbsp;&nbsp;&nbsp;&nbsp;<input type="checkbox" name="selectAll" id="selectAll" onclick="selectAll1('selectAll','checkedStudent')"/></th>							
					</tr>	
					
															
					<s:iterator value="studentList" status="studentListStatus">
				  		<tr class="<s:if test="#studentListStatus.odd == true ">odd</s:if><s:else>even</s:else>">
				  			<td><s:property value="#studentListStatus.index+1"/> </td>
				  			<td><s:property value="studentList[#studentListStatus.index][2]"/><s:hidden name="studentId" value="studentList[#studentListStatus.index][0]" ></s:hidden> <s:set name="stuId" value="secondVal"></s:set> </td>
				  			<td><s:property value="studentList[#studentListStatus.index][1]"/></td>
				  			
				  			<td><s:checkbox name="checkedStudent" id="checkedStudent%{#studentListStatus.index}"  value="%{studentList[#studentListStatus.index][0] in selected}" fieldValue="%{studentList[#studentListStatus.index][0]}"></s:checkbox></td>
				  			
				  		</tr>				  	
					</s:iterator>
					<tr>
						<th>&nbsp;</th>
						<th colspan="2">
							<div style="float: left;padding-left: 120px">Academic Year<em>*</em> :</div>
							<div style="float: right;padding-right: 120px"><sx:autocompleter    headerKey="" headerValue="Select" list="acaYearList" id="newacademicYear"   name="newacademicYear" cssClass="combobox" ></sx:autocompleter></div>
							
						</th>
						<th>&nbsp;</th>
					</tr>
					<tr>
						<th>&nbsp;</th>
						<th colspan="2">
							<div style="float: left;padding-left: 120px">Standard<em>*</em> :</div>
							<div style="float: right;padding-right: 120px">
							<SELECT class="combobox" name="newstandard" id="newstandard" onchange="getSelectText('newsStandardText','newstandard')" >
								<option value="">Select</option>
								<s:iterator value="standardList" status="standardIndex">															
									<option value="<s:property value="standardList[#standardIndex.index][0]"/>"><s:property value="standardList[#standardIndex.index][1]"/></option>
								</s:iterator>
							</SELECT>	
							<s:hidden name="newsStandardText" id="newsStandardText"></s:hidden>						
							</div>
						</th>
						<th>&nbsp;</th>
					</tr>
					<tr>										
						<td colspan="30">
								<s:submit  value="Promote" cssClass="blue-button" action="Promote" ></s:submit>
								<s:reset  value="Reset" cssClass="blue-button" ></s:reset>															
						</td>
					</tr>
					</s:if>
					<s:else>
						<tr>							
						<th align="center" width="100%">Student does Not Exist.</th>						
					</tr>	
					</s:else>					
				</table>													
	         </div>			 
	</s:form>
</body>
<SCRIPT type="text/javascript">
	function marksChk(marks,totMarks){
		if(marks.value !=''){
			if(parseInt(marks.value)>parseInt(totMarks)){			
				alert(marks.value+' Greater Then  '+totMarks);
				marks.value=totMarks;
				marks.focus();			
			}		
		}
		else{
			marks.value='0';
		}		
	}
	function clearFun(objVal){		
		if(objVal.value=='0')
			objVal.value='';
	}
	
</SCRIPT>
</html>