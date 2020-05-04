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
							<tr >
								<td style="padding: 10px" height="120px" >
									<table width="100%" class="pdfdesign" height="100%">
										<tr valign="top">
											<th colspan="6" align="center">Health Status</th>
										</tr>
										<tr class="space">
											<th width="15%" style="font-weight: normal">Height</th>
											<th width="25%" style="border-bottom: 1px solid;font-weight: normal;" align="center">&nbsp;<s:property value="healthStatusList[0][0]"/> </th>
											<th width="15%" style="padding-left: 20px;font-weight: normal">Weight</th>
											<th width="40%" colspan="3" style="border-bottom: 1px solid;font-weight: normal" align="center"><s:property value="healthStatusList[0][1]"/></th>																			
										</tr>
										<tr class="space">
											<th width="15%" style="font-weight: normal">Blood Group</th>
											<th width="25%" style="border-bottom: 1px solid;font-weight: normal;" align="center"><s:property value="studentProfile[0][11]"/>  </th>
											<th width="15%" style="padding-left: 20px;font-weight: normal" >Vision (L)</th>
											<th width="15%" style="border-bottom: 1px solid;font-weight: normal" align="center"><s:property value="healthStatusList[0][2]"/></th>
											<th width="5%" style="padding-left: 20px;font-weight: normal"> (R)</th>
											<th width="15%" style="border-bottom: 1px solid;font-weight: normal" align="center"><s:property value="healthStatusList[0][3]"/></th>																				
										</tr>
										<tr class="space">
											<th width="15%" style="font-weight: normal">Dental Hygiene</th>
											<th width="85%" colspan="5" style="border-bottom: 1px solid;font-weight: normal;"><s:property value="healthStatusList[0][4]"/></th>																													
										</tr>
										<tr><th colspan="6">&nbsp;</th></tr>
									</table>
								</td>
							</tr>
							<tr>
								<th align="center" colspan="3" height="50px">Scholastic Areas(Grading on 9 point scale)</th>
							</tr>
							<tr valign="top">
								<th align="center" width="100px">
									<table  class="pdfdesign" height="100%"  >
										<tr align="center">
											<th>&nbsp;</th>
											<td><b>Grade</b></td>
											<td><b>Marks Range</b></td>
											<td><b>Grade Range</b></td>
											<th>&nbsp;</th>
										</tr>
										<s:iterator value="gradeList" status="gradeStaus">
											<tr align="center">
											<th width="15%">&nbsp;</th>
												<td><s:property value="gradeList[#gradeStaus.index][2]"/> </td>
												<td>
													<s:property value="%{getText('{0}',{gradeList[#gradeStaus.index][0]})}"/>
													 -  
													<s:property value="%{getText('{0}',{gradeList[#gradeStaus.index][1]})}"/> 
												</td>
												<td>
													<s:property value="gradeList[#gradeStaus.index][3]"/>
												</td>
												<th width="15%">&nbsp;</th>
											</tr>
										</s:iterator>
									</table>
								</th>	
							</tr>
							<tr>
								<th align="center" colspan="3" height="50px">Co-Scholastic Areas(Grading on 5 point scale)</th>
							</tr>
							<tr valign="top">
								<th  >
									<table width="100%" class="pdfdesign" height="100%">
										<tr align="center">
											<th width="15%">&nbsp;</th>
											<td width="20%"><b>Grade</b></td>
											<td><b>Grade Points</b></td>
											<th width="15%">&nbsp;</th>											
										</tr>
										<s:iterator value="grade5pointList" status="grade5PointStaus">
											<tr align="center">
											<th width="15%">&nbsp;</th>
												<td><s:property value="grade5pointList[#grade5PointStaus.index][2]"/> </td>
												<td>
													<s:property value="grade5pointList[#grade5PointStaus.index][0]"/>
													 -  
													<s:property value="grade5pointList[#grade5PointStaus.index][1]"/> 
												</td>
												<th width="15%">&nbsp;</th>
											</tr>
										</s:iterator>
									</table>
								</th>	
							</tr>
							<tr ><th height="20px">&nbsp;</th></tr>
							<tr class="space">
								<td align="left" colspan="3" >
									Student must obtain the qualifying grade (minimum grade D) in all the subjects under Scholastic and Co-scholastic Domain.
								</td>
							</tr>
							<tr ><th height="20px">&nbsp;</th></tr>
							<tr class="space">
								<th align="left" style="font-weight: normal;" colspan="3"> * First Term :
								<s:property value="examNameList[0][0]"/> (<s:property value="examNameList[0][3]"/>%) + 
								<s:property value="examNameList[1][0]"/> (<s:property value="examNameList[1][3]"/>%) + 
								<s:property value="examNameList[2][0]"/> (<s:property value="examNameList[2][3]"/>%) = 
								<s:property value="examNameList[0][3]+examNameList[1][3]+examNameList[2][3]"/>%</th>
							</tr>
							<tr>
								<th align="left" style="font-weight: normal;" colspan="3"> * Second Term :
								 <s:property value="examNameList[3][0]"/> (<s:property value="examNameList[3][3]"/>%) + 
								 <s:property value="examNameList[4][0]"/> (<s:property value="examNameList[4][3]"/>%) + 
								 <s:property value="examNameList[5][0]"/> (<s:property value="examNameList[5][3]"/>%) = 
								<s:property value="examNameList[3][3]+examNameList[4][3]+examNameList[5][3]"/>%</th>
							</tr>
							<tr class="space">
								<th align="left" style="font-weight: normal;" colspan="3">Formative Assessment : 
								<s:property value="examNameList[0][0]"/> (<s:property value="examNameList[0][3]"/>%) + 								<s:property value="examNameList[1][0]"/>(<s:property value="examNameList[1][3]"/>%) +
 								<s:property value="examNameList[3][0]"/> (<s:property value="examNameList[3][3]"/>%) + 
								<s:property value="examNameList[4][0]"/> (<s:property value="examNameList[4][3]"/>%) = 
								<s:property value="examNameList[0][3]+examNameList[1][3]+examNameList[3][3]+examNameList[4][3]"/>%</th>
							</tr>
							<tr class="space">
								<th align="left" style="font-weight: normal;" colspan="3">Summative Assessment : 
								<s:property value="examNameList[3][0]"/> (<s:property value="examNameList[2][3]"/>%) +
								<s:property value="examNameList[5][0]"/> (<s:property value="examNameList[5][3]"/>%) =
								<s:property value="examNameList[2][3]+examNameList[5][3]"/>%</th>
							</tr>
						</table>	
</body>
</html>