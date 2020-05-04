<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags"%>
    <%@ taglib prefix="sx" uri="/struts-dojo-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>CCE | Co-Scholastic Marks </title>
<link rel="stylesheet" type="text/css" href="<s:url value="../css/reportHeader.css"/>" />	
    <link rel="stylesheet" type="text/css" href="<s:url value="../css/thickbox.css"/>"/>   
    <script type="text/javascript" src="<s:url value="../js/General/jquery-1.3.2.min.js"/>"></script>
    <script type="text/javascript" src="<s:url value="../js/General/thickbox.js"/>"></script>
    <script type="text/javascript" src="<s:url value="../js/General/Validation.js"/>"></script>
<STYLE type="text/css">
		.pdfdesign{border-collapse:collapse; width:100%;font-size: 14px;font-weight: 500;}
        .pdfdesign td{border:1px solid #555 ;}
        .pdfdesign .noborder{border:none !important}
        .pdfdesign tr.space td{padding:5px 5px}
        .pdfdesign tr.space1 td{padding:10px 10px}
        .pdfdesign tr .nospac{padding:0 !important}
        .pdfdesign .total span{display:block; float:left; width:150px}
       body{font-size: 14px ;font-family: arial}
       .pdfdesign1{border-collapse:collapse; width:100%}       
        .pdfdesign1 .noborder{border:none !important}
        .pdfdesign1 tr.space td{padding:12px 10px 5px }
        .pdfdesign1 tr .nospac{padding:0 !important}
        .pdfdesign1 .total span{display:block; float:left; width:150px}
       body{font-size: 14px ;font-family: arial}
       
</STYLE>
</head>
	<body>	
	
	<s:iterator begin="1" end="7"  var="pageNo">
	<s:set value="true" name="flag"></s:set>
	<s:set value="0" name="counter"></s:set>
	<s:set name="flag2d" value="true"></s:set>
	<table cellspacing="20px" style="width :100%"><tr><th>	
				
		<table width="100%"  style="border: 10px maroon solid ;" bgcolor="#FFFFB7" height="900px">
			<s:if test="#pageNo==1">
				<tr >
						<td width="100%" style="padding: 10px 10px 10px" align="left">					
							<s:include value="FrontPage.jsp"></s:include>
					</td>
				</tr>								
			</s:if>	
			<s:if test="#pageNo==2">
				<tr >
						<td width="100%" style="padding: 10px 10px 10px" align="left">					
							<s:include value="SchoAreas.jsp"></s:include>
					</td>
				</tr>								
			</s:if>	
		<s:iterator value="areaList" status="areaIndex" >		
		<s:if test="areaList[#areaIndex.index][1].equals('2A') && #pageNo==3" >
		<tr><th align="left">
			<div style="padding-top: 5px ;padding-left: 10px;"><b style="font-size: 18px">Part 2 : Co-Scholastic Areas</b><b>( to be assessed on a 5 point scale once <br> in a session )</b></div>						
		</th></tr>
			<tr >
				<td width="100%" style="padding: 10px 10px 10px">									
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
									<td align="left"><s:property value="subAreaList[#subAreaIndex.index][2]"/>: </td>
									<td><s:property value=""/></td>
								</tr>	
							</s:if>
						</s:iterator>																
						<tr>
							<th colspan="3" height="50px" width="100%" align="left" style="font-weight: normal">
								*Descriptive Indicators are statement used to describe each learner
							</th>
						</tr>							 		
					</table>					
				</td>
			</tr>							
			</s:if>
			</s:iterator>
			<s:if test="#pageNo==4">
				<tr >
					<td width="100%" style="padding: 10px 10px 10px">										
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
										<tr>										
											<td>&nbsp;</td>
											<td>&nbsp;</td>
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
										<tr>										
											<td>&nbsp;</td>
											<td>&nbsp;</td>
										</tr>
									</table> 
								</th>
							</tr>
							<tr valign="middle" class="space" >
								<th align="left" height="90px" style="padding-left: 10px;">
									<div>&nbsp;</div><br>
									Suggestive Activities:<br>
										<div style="float: left;font-weight: normal" ><b><s:property value="areaList[1][2]"/></b> : <s:property value="areaList[1][3]"/></div><br>
										<div style="float: left; font-weight: normal"><b><s:property value="areaList[2][2]"/> &amp; <s:property value="areaList[3][2]"/></b> : <s:property value="areaList[2][3]"/></div>
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
												<td align="left"><s:property value="subAreaList[#subAreaIndex.index][2]"/>: </td>
												<td><s:property value=""/></td>										
											</tr>										
										</s:if>															
									</s:iterator>
											<tr valign="top" class="space" align="center">
												<td>02 </td>
												<td align="left"><s:property value="areaList[5][2]"/>: </td>
												<td><s:property value=""/></td>										
											</tr>	
									</table> 
								</th>
							</tr>																																
						</table>						
					</td>
				</tr>
			
			</s:if>	
			
			<s:if test="#pageNo==5">
				<tr >
					<td width="100%" style="padding: 10px 10px 10px">										
						<table width="100%" class="pdfdesign" height="850px">						
																																		
						</table>						
					</td>
				</tr>
			</s:if>	
			
			<s:if test="#pageNo==6">
				<tr >
					<td width="100%" style="padding: 10px 10px 10px">										
						<table width="100%" class="pdfdesign" height="850px">						
								<tr height="10px" class="space">
									<th>Self Awareness</th>
								</tr>						
								<tr valign="top" align="left" class="space">
									<td>My Goals: <s:property value="studentProfile[0][13]" /> </td>
								</tr>
								<tr valign="top" align="left" class="space">
									<td>Strengths: <s:property value="studentProfile[0][14]" /></td>
								</tr>	
								<tr valign="top" align="left" class="space">
									<td>My Interests and Hobbies: <s:property value="studentProfile[0][12]" /></td>
								</tr>	
								<tr valign="top" align="left" class="space">
									<td>Responsibilities Discharged/Exceptional Achievement:</td>
								</tr>																					
						</table>						
					</td>
				</tr>
			</s:if>			
			<s:if test="#pageNo==7">
			<tr >
					<td width="100%" style="padding: 10px 10px 10px" align="left">					
						<table width="100%" class="pdfdesign" height="850px">
							<tr >
								<td style="padding: 10px" height="40%" >
									<table width="100%" class="pdfdesign" height="100%">
										<tr valign="top">
											<th colspan="6" align="center">Health Status</th>
										</tr>
										<tr class="space">
											<th width="15%" style="font-weight: normal">Height</th>
											<th width="25%" style="border-bottom: 1px solid;font-weight: normal;">&nbsp;</th>
											<th width="15%" style="padding-left: 20px;font-weight: normal">Weight</th>
											<th width="40%" colspan="3" style="border-bottom: 1px solid;font-weight: normal">&nbsp;</th>																			
										</tr>
										<tr class="space">
											<th width="15%" style="font-weight: normal">Blood Group</th>
											<th width="25%" style="border-bottom: 1px solid;font-weight: normal;">&nbsp;</th>
											<th width="15%" style="padding-left: 20px;font-weight: normal">Vision (L)</th>
											<th width="15%" style="border-bottom: 1px solid;font-weight: normal">&nbsp;</th>
											<th width="5%" style="padding-left: 20px;font-weight: normal"> (R)</th>
											<th width="15%" style="border-bottom: 1px solid;font-weight: normal">&nbsp;</th>																				
										</tr>
										<tr class="space">
											<th width="15%" style="font-weight: normal">Dental Hygiene</th>
											<th width="85%" colspan="5" style="border-bottom: 1px solid;font-weight: normal;">&nbsp;</th>																													
										</tr>
										<tr><th colspan="6">&nbsp;</th></tr>
									</table>
								</td>
							</tr>
							<tr>
								<th align="center" colspan="3" height="50px">Scholastic Areas(Grading on 9 point scale)</th>
							</tr>
							<tr valign="top">
								<th style="padding: 100px" >
									<table width="100%" class="pdfdesign" height="100%">
										<tr align="center">
											<td><b>Grade</b></td>
											<td><b>Marks Range</b></td>
											<td><b>Grade Range</b></td>
										</tr>
										<s:iterator value="gradeList" status="gradeStaus">
											<tr align="center">
												<td><s:property value="gradeList[#gradeStaus.index][2]"/> </td>
												<td>
													<s:property value="gradeList[#gradeStaus.index][0]"/>
													 -  
													<s:property value="gradeList[#gradeStaus.index][1]"/> 
												</td>
												<td>
													<s:property value="gradeList[#gradeStaus.index][3]"/>
												</td>
											</tr>
										</s:iterator>
									</table>
								</th>	
							</tr>
							<tr>
								<th align="center" colspan="3">Co-Scholastic Areas(Grading on 5 point scale)</th>
							</tr>
							<tr valign="top">
								<th style="padding: 100px" >
									<table width="100%" class="pdfdesign" height="100%">
										<tr align="center">
											<td width="20%"><b>Grade</b></td>
											<td><b>Grade Points</b></td>											
										</tr>
										<s:iterator value="grade5pointList" status="grade5PointStaus">
											<tr align="center">
												<td><s:property value="grade5pointList[#grade5PointStaus.index][2]"/> </td>
												<td>
													<s:property value="grade5pointList[#grade5PointStaus.index][0]"/>
													 -  
													<s:property value="grade5pointList[#grade5PointStaus.index][1]"/> 
												</td>
												
											</tr>
										</s:iterator>
									</table>
								</th>	
							</tr>
							<tr class="space">
								<td align="left" colspan="3" >
									Student must obtain the qualifying grade (minimum grade D) in all the subjects under Scholastic and Co-scholastic Domain.
								</td>
							</tr>
							<tr class="space">
								<th align="left" colspan="3"> * First Term : FA1(10%)+FA2(10%)+SA1(30%)=50%</th>
							</tr>
							<tr>
								<th align="left" colspan="3"> * Second Term : FA3(10%)+FA4(10%)+SA2(30%)=50%</th>
							</tr>
							<tr class="space">
								<th align="left" colspan="3">Formative Assessment : FA1(10%)+FA2(10%)+FA3(10%)+FA4(10%)=40%</th>
							</tr>
							<tr class="space">
								<th align="left" colspan="3">Summative Assessment : SA1(30%)+SA2(30%)=60%</th>
							</tr>
						</table>	
					</td>
			</tr>								
			</s:if>			
		</table>						
		</th></tr></table>
		</s:iterator>					
		<div align="center" style="padding:10px 0" id="ptnPrint"><input id="print" class="blue-button" value="Print" onclick="WindowPrint('ptnPrint');" type="button" /> </div>														        		
	</body>
</html>