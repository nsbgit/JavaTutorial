<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags"%>
    <%@ taglib prefix="sx" uri="/struts-dojo-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<STYLE type="text/css">

</STYLE>
</head>
<body>
	
				<s:set value="1" name="count"></s:set>
				<div>
					<s:include value="../UserControler/ReportHeader.jsp"></s:include>
					<div align="center"><s:property value="academicYear"/> </div>				
					<div ><div style="float: left;">Class : <s:property value="standardText"/> </div>  </div><br>
					<div ><div style="float: left;"><b>Area : <s:property value="areaText"/></b></div>  <div style="float: right">Sub Area : <s:property value="subAreaText"/> </div></div>	
				</div>
				<div>
						<s:hidden name="category" value="%{category}"></s:hidden> 
						<s:hidden name="area" value="%{area}"></s:hidden> 
						<s:hidden name="academicYear" value="%{academicYear}"></s:hidden> 
						<s:hidden name="standard" value="%{standard}"></s:hidden> 
						<s:hidden name="subArea" value="%{subArea}"></s:hidden> 						
				</div>
				 <div><s:actionerror cssClass="error" /><s:actionmessage cssClass="msg"/></div> 
				 <table class="pdfdesign" width="100%">
				<s:if test="%{!paperList.isEmpty() && !studentList.isEmpty()}"  >														
					<tr  class="space" >							
						<td ><b>SL</b></td>
						<td ><b>NAME</b></td>															
						<s:iterator value="paperList">
							<td ><b><s:property value="fourthVal"/> (out of <s:property value="fiveVal"/>)</b></td>															
						</s:iterator>							
					</tr>													
					<s:iterator value="studentList" status="studentListStatus">
				  		<tr class="space">
				  			<td><s:property value="#count"/> </td>
				  			<td><s:property value="thredVal"/><s:hidden name="studentId" value="%{secondVal}" ></s:hidden> <s:set name="stuId" value="secondVal"></s:set> </td>
				  			<s:iterator value="paperList">
				  				<td>				  									  					
				  					&nbsp;				  					
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
</html>