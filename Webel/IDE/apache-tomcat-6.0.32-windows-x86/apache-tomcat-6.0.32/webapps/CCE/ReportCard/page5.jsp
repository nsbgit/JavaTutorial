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
							<tr class="space" valign="top">
								<th colspan="3" align="left" height="30px" style="padding-top: 5px ;padding-left: 10px;">
									<s:property value="areaList[7][1]"/>: 
									<s:property value="areaList[7][2]"/>
								</th>
							</tr>
							<tr valign="top">
								<th style="font-weight: normal" align="left" height="50px">
								<s:set name="count" value="0"></s:set>
									<s:iterator value="subAreaList" status="subAreaStatus">
										<s:if test="subAreaList[#subAreaStatus.index][1]==areaList[7][0]">
											<s:set name="count" value="#count+1"></s:set>
											<s:property value="#count"/>. 
											<s:property value="subAreaList[#subAreaStatus.index][2]"/>
									 </s:if>
									</s:iterator>
								</th>
							</tr>	
							<tr valign="top">
								<th colspan="3">
									<table cellpadding="0" class="pdfdesign" height="100%" cellspacing="0" width="100%">
										<tr valign="top" class="space" align="center" height="10px">
											<td width="10%">S. No.</td>										
											<td width="70%"><b>Descriptive Indicators</b></td>
											<td width="20%"><b>Grade</b></td>
										</tr>										
										<s:iterator value="assignSubArea" status="assignSubAreaStatus">										
											<s:if test="assignSubArea[#assignSubAreaStatus.index][0]==areaList[7][0]">
												<tr valign="top">										
													<td><s:property value="%{getText('{0,number,#,##00}',{#assignSubAreaStatus.index+1})}"/>  </td>
													<td align="left" style="padding: 5px"><s:property value="assignSubArea[#assignSubAreaStatus.index][2]"/> :<br>
														<s:iterator value="indicatorList" status="indicatorStatus">													
															<s:if test="indicatorList[#indicatorStatus.index][2]==areaList[7][0] && indicatorList[#indicatorStatus.index][3]==assignSubArea[#assignSubAreaStatus.index][1]">
																<div style="padding: 5px"><s:property value="indicatorList[#indicatorStatus.index][0]"/> </div>
																<s:set value="indicatorList[#indicatorStatus.index][1]" name="gradeIndi"></s:set>
															</s:if>			
														</s:iterator> 
													</td>
													<td><s:property value="#gradeIndi"/> </td>
													<s:set value="" name="gradeIndi"></s:set>
												</tr>
											</s:if>
										</s:iterator>										
									</table> 
								</th>
							</tr>
							
							<tr valign="middle" class="space" >
								<th align="left" height="90px" style="padding: 10px ">
									<div>&nbsp;</div><br>
									Suggestive Activities:<br></br>
									<s:iterator value="subAreaList" status="subAreaStatus">
										<s:if test="subAreaList[#subAreaStatus.index][1]==areaList[7][0]">										
											<div style="float: left;font-weight: normal;padding-bottom: 10px"  >
												<b><s:property value="subAreaList[#subAreaStatus.index][2]"/></b> : 
												<s:property value="subAreaList[#subAreaStatus.index][3]"/></div><br>
									 </s:if>
									</s:iterator>											
								</th>
							</tr>							
							<tr class="space" valign="top" height="30px">
								<th colspan="3" align="left" style="padding-top: 5px ;padding-left: 10px;">
									<s:property value="areaList[8][1]"/>: 
									<s:property value="areaList[8][2]"/>
								</th>
							</tr>
							<tr valign="top" height="50px">
								<th style="font-weight: normal" align="left">
								<s:set name="count" value="0"></s:set>
									<s:iterator value="subAreaList" status="subAreaStatus">
										<s:if test="subAreaList[#subAreaStatus.index][1]==areaList[8][0]">
											<s:set name="count" value="#count+1"></s:set>
											<s:property value="#count"/>. 
											<s:property value="subAreaList[#subAreaStatus.index][2]"/>
									 </s:if>
									</s:iterator>
								</th>
							</tr>
							<tr valign="top">
								<th colspan="3">
									<table cellpadding="0" class="pdfdesign" height="100%" cellspacing="0" width="100%">
										<tr valign="top" class="space" align="center" height="10px">
											<td width="10%">S. No.</td>										
											<td width="70%"><b>Descriptive Indicators</b></td>
											<td width="20%"><b>Grade</b></td>
										</tr>
										<s:iterator value="assignSubArea" status="assignSubAreaStatus">										
											<s:if test="assignSubArea[#assignSubAreaStatus.index][0]==areaList[8][0]">
												<tr valign="top">										
													<td><s:property value="%{getText('{0,number,#,##00}',{#assignSubAreaStatus.index-1})}"/> </td>
													<td align="left" style="padding: 5px"><s:property value="assignSubArea[#assignSubAreaStatus.index][2]"/> : <br>
														<s:iterator value="indicatorList" status="indicatorStatus">													
															<s:if test="indicatorList[#indicatorStatus.index][2]==areaList[8][0] && indicatorList[#indicatorStatus.index][3]==assignSubArea[#assignSubAreaStatus.index][1]">
																<div style="padding: 5px"><s:property value="indicatorList[#indicatorStatus.index][0]"/> </div>
																<s:set value="indicatorList[#indicatorStatus.index][1]" name="gradeIndi"></s:set>
															</s:if>			
														</s:iterator> 
													</td>
													<td><s:property value="#gradeIndi"/> </td>
													<s:set value="" name="gradeIndi"></s:set>
												</tr>
											</s:if>
										</s:iterator>	
									</table> 
								</th>
							</tr>																																	
						</table>		
</body>
</html>