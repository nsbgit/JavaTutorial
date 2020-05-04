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
		<h1><s:if test="(scholasticMarksID == null || scholasticMarksID.equals('')||scholasticMarksID.equals('-1'))">Add</s:if><s:else>Edit</s:else> Scholastic Marks  </h1>
			<div class="grid">
				<s:set value="1" name="count"></s:set>				
				<s:div>
						<s:hidden name="category" value="%{category}"></s:hidden> 
						<s:hidden name="subject" value="%{subject}"></s:hidden> 
						<s:hidden name="academicYear" value="%{academicYear}"></s:hidden> 
						<s:hidden name="standard" value="%{standard}"></s:hidden> 
						<s:hidden name="examType" value="%{examType}"></s:hidden> 
						<s:hidden name="examName" value="%{examName}"></s:hidden> 
						<s:hidden name="marksId" value="%{marksId}"></s:hidden>
						<s:hidden name="type" value="Scholastic"></s:hidden>		
				</s:div>
				<div align="center"><s:actionerror cssClass="error" /><s:actionmessage cssClass="msg"/></div> 								
			
				<table class="tablegrid" width="100%">
				<s:if test="%{!paperList.isEmpty() && !studentList.isEmpty()}"  >														
					<tr>							
						<th>SL</th>
						<th>NAME</th>															
						<s:iterator value="paperList">
							<th><s:property value="thredVal"/> (<s:property value="fourthVal"/>M)</th>															
						</s:iterator>							
					</tr>	
					<tr>
						<th>&nbsp;</th>
						<th>&nbsp;</th>
						<s:iterator value="paperList">																	
							<th> 
								<s:set name="splitValue" value="fiveVal.split('<>')"/>
								<s:if test="#splitValue!=null"> <img src="../images/Bullets.png"></img>
									<s:set value="#splitValue.length" name="noOfsubPaper"></s:set>
									<s:set value="1" name="var"></s:set>
										<s:iterator var="counter" begin="0" end="#noOfsubPaper-1" >
										 <s:hidden name="paper" value="%{secondVal+'-'+#var}"></s:hidden>     																										
											<s:property value="#splitValue[#counter]"/> <img src="../images/Bullets.png"></img>
											<s:set value="#var=#var+1" name="var"></s:set>
										</s:iterator>	 																						
								</s:if>
								<s:else>
									<s:hidden name="paper" value="%{secondVal}"></s:hidden>	
								</s:else>
							</th>	
						</s:iterator>
					</tr>										
					<s:iterator value="studentList" status="studentListStatus">
				  		<tr class="<s:if test="#studentListStatus.odd == true ">odd</s:if><s:else>even</s:else>">
				  			<td><s:property value="#count"/> </td>
				  			<td><s:property value="thredVal"/><s:hidden name="studentId" value="%{secondVal}" ></s:hidden> <s:set name="stuId" value="secondVal"></s:set> </td>
				  			<s:iterator value="paperList">
				  				<td>				  					
				  					<s:set name="splitValue" value="fiveVal.split('<>')"/>
									<s:if test="#splitValue!=null">
									<s:set value="#splitValue.length" name="noOfsubPaper"></s:set>
										<s:iterator var="counter" begin="0" end="#noOfsubPaper-1" >     																										
											<s:textfield  name="marks" value="" cssClass="smallTextBox" onfocus="clearFun(this)" maxlength="3" onkeypress="return isNumberKey(event)" onblur="marksChk(this,'%{fourthVal/#noOfsubPaper}' )"></s:textfield>
											&nbsp;&nbsp;
										</s:iterator>	 																						
									</s:if>
									<s:else>
				  						<s:textfield  name="marks" value="" cssClass="smallTextBox" onfocus="clearFun(this)" maxlength="3" onkeypress="return isNumberKey(event)" onblur="marksChk(this,'%{fourthVal}' )"></s:textfield>
				  					</s:else>
				  				</td>
				  			</s:iterator>
				  		</tr>
				  	<s:set value="#count=#count+1" name="count"></s:set>
					</s:iterator>
					<tr>
						<td colspan="30">
							<s:if test="(uid == null || uid.equals('') ||uid.equals('-1'))">
								<s:submit  value="Save" cssClass="blue-button" action="save" ></s:submit>
									</s:if>
									<s:else>
										<s:submit  value="Update" action="saveUser" cssClass="blue-button" ></s:submit>
									</s:else>									
								<s:reset  value="Reset" cssClass="blue-button" ></s:reset>															
						</td>
					</tr>
					</s:if>
					<s:else>
						<tr>							
						<th align="center" width="100%">Paper Name Or Student does Not Exist.</th>						
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
				
	}
	function clearFun(objVal){		
		if(objVal.value=='0')
			objVal.value='';
	}
</SCRIPT>
</html>