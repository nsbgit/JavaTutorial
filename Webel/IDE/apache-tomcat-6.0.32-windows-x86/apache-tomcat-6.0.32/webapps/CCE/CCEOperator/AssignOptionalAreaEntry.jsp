<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags"%>
    <%@ taglib prefix="sx" uri="/struts-dojo-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>CCE | Assign Optional Area Entry</title>
<link rel="stylesheet" type="text/css" href="<s:url value="../css/style.css"/>" />
 <script type="text/javascript" src="<s:url value="../js/General/Validation.js"/>"></script>
</head>
<body>
	<s:form    theme="simple"  method="post" validate="true">
		<h1 style="padding-left: 5px"> Assign Optional Area Entry </h1>
			<div class="grid">
				<s:set value="1" name="count"></s:set>				
				<s:div>												
						<s:hidden name="standard" value="%{standard}"></s:hidden> 	
						<s:iterator value="areaList" status="areaStatus" >	
							<s:hidden name="areaId" value="%{areaList[#areaStatus.index][0]}"></s:hidden>										
						</s:iterator>					
				</s:div>
				<div align="center"><s:actionerror cssClass="error" /><s:actionmessage cssClass="msg"/></div> 											
					<table class="tablegrid" width="100%">
						<tr valign="top">
							<th width="5%" >Sl No.</th>
							<th width="10%" >Admission No</th>
							<th width="30%" >Student Name</th>																				
							
							<s:iterator value="areaList" status="areaStatus">	
								<th>
									 <s:property value="areaList[#areaStatus.index][2]"/> 
									 <s:property value="areaList[#areaStatus.index][3]"/><br>
									 (Any  <s:property value="areaList[#areaStatus.index][5]"/> to be assessed  )									  
								 </th>	
							</s:iterator>										
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
								<s:set name="flag" value="true"></s:set>																	
									<s:iterator value="areaList" status="areaStatus" >
									<s:if test="#flag==true">
									<td>
										<SELECT class="combobox" 
												name="subArea<s:property value="%{studentList[#studentIndex.index][0]}"/><s:property value="%{areaList[#areaStatus.index][0]}"/>" 
												id="area<s:property value="#areaStatus.index"/><s:property value="#studentIndex.index"/>" 
												style="height: 50px" multiple="multiple" 
												onblur="couter(this,'<s:property value="areaList[#areaStatus.index][5] "/>'); check(this,'<s:property value="areaList[#areaStatus.index][5] "/>')" 
												onclick="return couter(this,'<s:property value="areaList[#areaStatus.index][5] "/>' )">
											<s:iterator value="subAreaList" status="subAreaStatus">
												<s:if test="areaList[#areaStatus.index][0]==subAreaList[#subAreaStatus.index][2] && #flag==true">
													<option value="<s:property value="subAreaList[#subAreaStatus.index][0]"/>">
														<s:property value="subAreaList[#subAreaStatus.index][1]"/>
													</option>
												</s:if>											
											</s:iterator>
											<s:set name="flag" value="false"></s:set>
										</SELECT>  <label style="cursor: pointer;"  onclick="Clear('area<s:property value="#areaStatus.index"/><s:property value="#studentIndex.index"/>')"><img alt="" title="Clear" src="../images/clear.png"></label >
									</td>
									</s:if>
									<s:else>																		
									<td>
										<SELECT class="combobox" 
												name="subArea<s:property value="%{studentList[#studentIndex.index][0]}"/><s:property value="%{areaList[#areaStatus.index][0]}"/>" 
												id="area<s:property value="#areaStatus.index"/><s:property value="#studentIndex.index"/>" 
												style="height: 50px" multiple="multiple"
												onblur="couter(this,'<s:property value="areaList[#areaStatus.index][5] "/>'); check(this,'<s:property value="areaList[#areaStatus.index][5] "/>')" 
												onclick="return couter(this,'<s:property value="areaList[#areaStatus.index][5] "/>')">
											<s:iterator value="subAreaList" status="subAreaStatus">
												<s:if test="areaList[#areaStatus.index][0]==subAreaList[#subAreaStatus.index][2] && #flag==false">
													<option value="<s:property value="subAreaList[#subAreaStatus.index][0]"/>">
														<s:property value="subAreaList[#subAreaStatus.index][1]"/>
													</option>
												</s:if>											
											</s:iterator>
										</SELECT> <label style="cursor: pointer;" onclick="Clear('area<s:property value="#areaStatus.index"/><s:property value="#studentIndex.index"/>')">										
											<img alt="" title="Clear" src="../images/clear.png">										
										</label>
									</td>
									</s:else>	
									</s:iterator>																															
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