<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="s" uri="/struts-tags"%>
    <%@ taglib prefix="sx" uri="/struts-dojo-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table width="100%" class="pdfdesign" height="850px">						
							<tr class="space">
								<th colspan="3" align="left" style="padding-top: 5px ;padding-left: 10px;">
									<s:property value="areaList[1][1]"/>: 
									<s:property value="areaList[1][2]"/>
								</th>
							</tr>	
							<tr>
								<th colspan="3">
									<table cellpadding="0" class="pdfdesign" height="100%" cellspacing="0" width="100%">
										<tr valign="top" class="space" align="center" height="10px">										
											<td width="80%"><b>Descriptive Indicators</b></td>
											<td width="20%"><b>Grade</b></td>
										</tr>	
										<tr valign="top">										
											<td  align="left">
												<s:iterator value="indicatorList" status="indicatorStatus">
													<s:if test="indicatorList[#indicatorStatus.index][2]==areaList[1][0]">
														<div style="padding: 5px"><s:property value="indicatorList[#indicatorStatus.index][0]"/> </div>
														<s:set value="indicatorList[#indicatorStatus.index][1]" name="gradeIndi"></s:set>
													</s:if>			
												</s:iterator>
											</td>
											<td><s:property value="#gradeIndi"/> </td>
											<s:set value="" name="gradeIndi"></s:set>
										</tr>
									</table> 
								</th>
							</tr>
							<tr class="space">
								<th colspan="3" align="left" style="padding-top: 5px ;padding-left: 10px;">
									<s:property value="areaList[2][1]"/>:  
									<s:property value="areaList[2][2]"/>
									&amp;									
									<s:property value="areaList[3][2]"/>
								</th>
							</tr>	
							<tr>
								<th colspan="3">
									<table cellpadding="0" class="pdfdesign" height="100%" cellspacing="0" width="100%">
										<tr valign="top" class="space" align="center" height="10px">										
											<td width="80%"><b>Descriptive Indicators</b></td>
											<td width="20%"><b>Grade</b></td>
										</tr>	
										<tr valign="top">										
											<td  align="left">
												<s:iterator value="indicatorList" status="indicatorStatus">												
													<s:if test="indicatorList[#indicatorStatus.index][2]==areaList[2][0] || indicatorList[#indicatorStatus.index][2]==areaList[3][0]">
														<div style="padding: 5px"><s:property value="indicatorList[#indicatorStatus.index][0]"/> </div>
														<s:set value="indicatorList[#indicatorStatus.index][1]" name="gradeIndi"></s:set>
													</s:if>			
												</s:iterator>
											</td>
											<td><s:property value="#gradeIndi"/> </td>
											<s:set value="" name="gradeIndi"></s:set>
										</tr>
									</table> 
								</th>
							</tr>
							<tr valign="middle" class="space" >
								<th align="left" height="90px" style="padding: 10px;">
									<div>&nbsp;</div><br>
									Suggestive Activities:<br></br>
										<div style="float: left;font-weight: normal;padding-bottom: 5px"  ><b><s:property value="areaList[1][2]"/></b> : <s:property value="areaList[1][3]"/></div><br>
										<div style="float: left; font-weight: normal;padding-bottom: 5px"><b><s:property value="areaList[2][2]"/> &amp; <s:property value="areaList[3][2]"/></b> : <s:property value="areaList[2][3]"/></div>
								</th>
							</tr>
							<tr class="space">
								<th colspan="3" align="left" style="padding-top: 5px ;padding-left: 10px;">
									<s:property value="areaList[4][1]"/> 
									<s:property value="areaList[4][2]"/>
									&amp;									
									<s:property value="areaList[5][2]"/>
								</th>
							</tr>	
							<tr>
								<th colspan="3">
									<table cellpadding="0" class="pdfdesign" height="100%" cellspacing="0" width="100%">
										<tr valign="top" class="space" align="center" height="10px">
											<td width="10%"><b>S. No.</b></td>
											<td width="70%"><b>Descriptive Indicators</b></td>
											<td width="20%"><b>Grade</b></td>
										</tr>	
										<s:iterator value="subAreaList" status="subAreaIndex">
										<s:if test="subAreaList[#subAreaIndex.index][1]==areaList[6][0]">
										<s:set value="#counter+1" name="counter"></s:set>
											<tr valign="top" class="space" align="center">
												<td><s:property value="%{getText('{0,number,#,##00}',{#counter})}"/> </td>
												<td align="left">
													<s:property value="subAreaList[#subAreaIndex.index][2]"/>:
													<s:iterator value="indicatorList" status="indicatorStatus">													
														<s:if test="indicatorList[#indicatorStatus.index][2]==areaList[4][0] && indicatorList[#indicatorStatus.index][3] == subAreaList[#subAreaIndex.index][0]">
															<div style="padding: 5px"><s:property value="indicatorList[#indicatorStatus.index][0]"/> </div>
															<s:set value="indicatorList[#indicatorStatus.index][1]" name="gradeIndi"></s:set>
														</s:if>			
													</s:iterator> 
												</td>
												<td><s:property value="#gradeIndi"/></td>
												<s:set value="" name="gradeIndi"></s:set>										
											</tr>										
										</s:if>															
									</s:iterator>
											<tr valign="top" class="space" align="center">
												<td>02 </td>
												<td align="left">
													<s:property value="areaList[5][2]"/>:
													<s:iterator value="indicatorList" status="indicatorStatus">													
														<s:if test="indicatorList[#indicatorStatus.index][2]==areaList[5][0] ">
															<div style="padding: 5px"><s:property value="indicatorList[#indicatorStatus.index][0]"/> </div>
															<s:set value="indicatorList[#indicatorStatus.index][1]" name="gradeIndi"></s:set>
														</s:if>			
													</s:iterator>  
												</td>
												<td><s:property value="#gradeIndi"/></td>	
												<s:set value="" name="gradeIndi"></s:set>															
											</tr>	
									</table> 
								</th>
							</tr>																																
						</table>				
</body>
</html>