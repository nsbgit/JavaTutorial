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
								<s:property value="areaList[#areaIndex.index][1]"/>: 
								<s:property value="areaList[#areaIndex.index][2]"/>
							</th>
						</tr>
						<tr valign="top" class="space" align="center" height="10px"> 
							<td width="10%"><b>S. No.</b></td>
							<td width="70%"><b>Descriptive Indicators*</b></td>
							<td width="20%"><b>Grade</b></td>
						</tr>	
						<s:iterator value="subAreaList" status="subAreaIndex">
							<s:if test="subAreaList[#subAreaIndex.index][1]==areaList[#areaIndex.index][0]">
								<s:set value="#counter+1" name="counter"></s:set>
								<tr valign="top" class="space" align="center">
									<td><s:property value="%{getText('{0,number,#,##00}',{#counter})}"/> </td>
									<td align="left" >
										<s:property value="subAreaList[#subAreaIndex.index][2]"/>: <br>
										<s:iterator value="indicatorList" status="indicatorStatus">										
											<s:if test="indicatorList[#indicatorStatus.index][3]==subAreaList[#subAreaIndex.index][0]">
												<div style="padding: 5px"><s:property value="indicatorList[#indicatorStatus.index][0]"/> </div>
												<s:set value="indicatorList[#indicatorStatus.index][1]" name="gradeIndi"></s:set>
											</s:if>											
										</s:iterator>
									</td>
									<td><s:property value="#gradeIndi"/></td>
								</tr>
								<s:set value="" name="gradeIndi"></s:set>	
							</s:if>
						</s:iterator>																
						<tr>
							<th colspan="3" height="50px" width="100%" align="left" style="font-weight: normal">
								*Descriptive Indicators are statement used to describe each learner
							</th>
						</tr>							 		
					</table>						
</body>
</html>