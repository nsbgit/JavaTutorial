<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags"%>
    <%@ taglib prefix="sx" uri="/struts-dojo-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>CCE | Assign  Descriptive Indicators</title>
<link rel="stylesheet" type="text/css" href="<s:url value="../css/style.css"/>" />
 <script type="text/javascript" src="<s:url value="../js/General/Validation.js"/>"></script>
</head>
<body>
	<s:form    theme="simple"  method="post" validate="true">
		<h1 style="padding-left: 5px"> Assign  Descriptive Indicators </h1>
			<div class="grid">
				<s:set value="1" name="count"></s:set>				
				<s:div>												
						<s:hidden name="standard" value="%{standard}"></s:hidden> 
						<s:hidden name="academicYear" value="%{academicYear}"></s:hidden>
						<s:hidden name="area"></s:hidden>		
						<s:hidden name="subArea"></s:hidden>					
						<s:iterator value="areaList" status="areaStatus" >	
							<s:hidden name="areaId" value="%{areaList[#areaStatus.index][0]}"></s:hidden>												
						</s:iterator>					
				</s:div>
				<div align="center"><s:actionerror cssClass="error" /><s:actionmessage cssClass="msg"/></div> 
					<s:if test="%{!studentList.isEmpty() && !indicatorList.isEmpty()}"  >																	
					<table class="tablegrid" width="100%">
						<tr valign="top">
							<th width="5%" >Sl No.</th>
							<th width="10%" >Admission No</th>
							<th width="30%" >Student Name</th>	
							<th width="10%" >Grade</th>																					
							<th width="30%">Indicators</th>																
						</tr>						
						<s:iterator value="studentList" status="studentIndex">
							<tr valign="top" class="<s:if test="#studentIndex.odd == true ">odd</s:if><s:else>even</s:else>">
								<td>
									<s:property value="#studentIndex.index+1"/>
									<s:hidden name="studentId" value="%{studentList[#studentIndex.index][0]}" ></s:hidden>									
								 </td>
								 <td>
								 	<s:property value="studentList[#studentIndex.index][3] "  />								 	
								 </td>
								<td>
									<s:property value="studentList[#studentIndex.index][2] "  />
								</td>
								<td>
									<s:property value="studentList[#studentIndex.index][1] "  />
								</td>
								<td>								
									<SELECT class="combobox" 
												name="assignIndicator<s:property value="%{studentList[#studentIndex.index][0]}"/>" 												
												style="height: 50px" multiple="multiple" >
											<s:iterator value="indicatorList" status="indicatorStatus">
												<s:property value="indicatorList[#indicatorStatus.index][1]"/>
												<s:if test="indicatorList[#indicatorStatus.index][2].equals(studentList[#studentIndex.index][1])">
													<option value="<s:property value="indicatorList[#indicatorStatus.index][0]"/>">
														<s:property value="indicatorList[#indicatorStatus.index][1]"/>
													</option>
												</s:if>											
											</s:iterator>											
										</SELECT> 
								</td>																																			
							</tr>
						</s:iterator>					
					</table>
					<div align="center" style="height: 50px;padding-top: 10px">
						<s:submit  value="Save" cssClass="blue-button" action="save" ></s:submit>																
						<s:reset  value="Reset" cssClass="blue-button" ></s:reset>	
					</div>	
					</s:if>
					<s:else>
						<div style="width: 100%" align="center" class="error">Record already submitted or record does note exist.</div>
					</s:else>
																	
	         </div>			 
	</s:form>
</body>
</html>