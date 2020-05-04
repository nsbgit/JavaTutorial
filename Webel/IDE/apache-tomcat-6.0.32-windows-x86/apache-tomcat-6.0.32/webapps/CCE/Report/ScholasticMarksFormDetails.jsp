<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags"%>
    <%@ taglib prefix="sx" uri="/struts-dojo-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>CCE | Scholastic Marks Form </title>
</head>
	<body>			
				<s:set value="1" name="count"></s:set>
				<div>
					<s:include value="../UserControler/ReportHeader.jsp"></s:include>
					<div align="center"><s:property value="academicYear"/> </div>				
					<div ><div style="float: left;">Class : <s:property value="standardText"/> </div>  <div style="float: right">Exam Type : <s:property value="examTypeText"/></div></div><br>
					<div ><div style="float: left;"><b>Subject : <s:property value="subjectText"/></b></div>  <div style="float: right">Exam Name : <s:property value="examNameText"/> </div></div>	
				</div>
				
						<s:hidden name="category" value="%{category}"></s:hidden> 
						<s:hidden name="subject" value="%{subject}"></s:hidden> 
						<s:hidden name="academicYear" value="%{academicYear}"></s:hidden> 
						<s:hidden name="standard" value="%{standard}"></s:hidden> 
						<s:hidden name="examType" value="%{examType}"></s:hidden> 
						<s:hidden name="examName" value="%{examName}"></s:hidden> 
						<s:hidden name="marksId" value="%{marksId}"></s:hidden>
						
				<table  width="100%" class="pdfdesign">										
				<s:if test="%{!paperList.isEmpty() && !studentList.isEmpty()}"  >														
					<tr class="space">							
						<td><b>SL</b></td>
						<td><b>NAME</b></td>															
						<s:iterator value="paperList">
							<td><b><s:property value="thredVal"/> (<s:property value="fourthVal"/>M)</b></td>															
						</s:iterator>							
					</tr>	
					<tr class="space">
						<td>&nbsp;</td>
						<td>&nbsp;</td>
						<s:iterator value="paperList">																	
							<td><b>
								<s:set name="splitValue" value="fiveVal.split('<>')"/>
								<s:if test="#splitValue!=null"> <img src="../images/Bullets.png"></img>
									<s:set value="#splitValue.length" name="noOfsubPaper"></s:set>
										<s:iterator var="counter" begin="0" end="#noOfsubPaper-1" >
										 <s:hidden name="paper" value="%{secondVal}"></s:hidden>     																										
											<s:property value="#splitValue[#counter]"/> <img src="../images/Bullets.png"></img>
										</s:iterator>	 																						
								</s:if>
								<s:else>
									<s:hidden name="paper" value="%{secondVal}"></s:hidden>	
								</s:else>
								</b> 
							</td>	
						</s:iterator>
					</tr>										
					<s:iterator value="studentList" status="studentListStatus">
				  		<tr class="<s:if test="#studentListStatus.odd == true ">odd</s:if><s:else>even</s:else>">
				  			<td><s:property value="#count"/> </td>
				  			<td><s:property value="thredVal"/><s:hidden name="studentId" value="%{secondVal}" ></s:hidden> <s:set name="stuId" value="secondVal"></s:set> </td>
				  			<s:iterator value="paperList">
				  				<td>				  					
				  					<s:set name="splitValue" value="fiveVal.split('<>')"/>
									<s:if test="#splitValue!=null">&nbsp;&nbsp;|
									<s:set value="#splitValue.length" name="noOfsubPaper"></s:set>
										<s:iterator var="counter" begin="0" end="#noOfsubPaper-1" >     																																					
											&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|
										</s:iterator>	 																						
									</s:if>
									<s:else>
				  						&nbsp;
				  					</s:else>
				  				</td>
				  			</s:iterator>
				  		</tr>
				  	<s:set value="#count=#count+1" name="count"></s:set>
					</s:iterator>					
					</s:if>
					<s:else>
						<tr>							
						<th align="center" width="100%">Paper Name Or Student does Not Exist.</th>						
					</tr>	
					</s:else>					
				</table>
				<div align="center" style="padding:10px 0" id="ptnPrint"><input id="print" class="blue-button" value="Print" onclick="WindowPrint('ptnPrint');" type="button" /> </div>														        		
</body>
<SCRIPT type="text/javascript"></SCRIPT>
</html>