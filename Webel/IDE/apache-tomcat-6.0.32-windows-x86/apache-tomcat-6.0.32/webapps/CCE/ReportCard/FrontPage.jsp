<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags"%>
    <%@ taglib prefix="sx" uri="/struts-dojo-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>CCE | Student Profile </title>
<link rel="stylesheet" type="text/css" href="<s:url value="../css/reportHeader.css"/>" />	
    <link rel="stylesheet" type="text/css" href="<s:url value="../css/thickbox.css"/>"/>   
    <script type="text/javascript" src="<s:url value="../js/General/jquery-1.3.2.min.js"/>"></script>
    <script type="text/javascript" src="<s:url value="../js/General/thickbox.js"/>"></script>
    <script type="text/javascript" src="<s:url value="../js/General/Validation.js"/>"></script>
<STYLE type="text/css">
		.pdfdesign1{border-collapse:collapse; width:100%}       
        .pdfdesign1 .noborder{border:none !important}
        .pdfdesign1 tr.space td{padding:12px 10px 5px }
        .pdfdesign1 tr .nospac{padding:0 !important}
        .pdfdesign1 .total span{display:block; float:left; width:150px}
       body{font-size: 14px ;font-family: arial}	
</STYLE>
</head>
	<body>							
		<table width="100%" class="pdfdesign1"   height="850px">
			<tr class="space"><td colspan="4" align="center"><img alt="" src="../Upload/SchoolLogo/logo.GIF" height="75px" width="75px"> </td></tr>
			 <s:iterator value="reportHeaderList" status="headerIndex">
			<tr class="space">				
				<td width="35%">
					<b>Affiliation No. </b> 
				</td> 
				<td width="65%" style="border-bottom: 1px solid;"><I><s:property value="reportHeaderList[#headerIndex.index][1]"/></I></td>				
			</tr>
			<tr class="space">				
				<td width="35%">
					<b>Name of School </b> 
				</td> 
				<td width="65%" style="border-bottom: 1px solid;"><I><s:property value="reportHeaderList[#headerIndex.index][0]"/></I></td>
				
			</tr>
			<tr class="space">				
				<td width="35%">
					<b>Complete Address </b> 
				</td> 
				<td width="65%" style="border-bottom: 1px solid;"><i> <s:property value="reportHeaderList[#headerIndex.index][5]"/></i></td>
				
			</tr>
			<tr class="space">				
				<td width="35%">
					<b>Email Id </b> 
				</td> 
				<td width="65%" style="border-bottom: 1px solid;"><i> <s:property value="reportHeaderList[#headerIndex.index][4]"/></i></td>
				
			</tr>
			<tr class="space">				
				<td width="35%">
					<b>Telephone No. </b> 
				</td> 
				<td width="65%" style="border-bottom: 1px solid;"><i><s:property value="reportHeaderList[#headerIndex.index][2]"/></i></td>
				
			</tr>
			</s:iterator>
			<tr ><td colspan="4">&nbsp;</td></tr>
			<tr class="space">
				<td colspan="3" align="center" style="font-size: 18px">
					<b>Report Book</b>
				 </td>
			</tr>
			<tr class="nospac">
				<td colspan="3" align="center">
					CLASSES
				 </td>
			</tr>
			<tr class="space">
				<td colspan="3" align="center">
					<div style="width: 100%">
						<div style="float: left;padding-left: 40%">Session :</div>
						<div style="float: left;width: 120px;border-bottom: 1px solid;" align="center"><i><s:property value="academicYear"/> </i></div>
						<div style="float: right;"></div>
					</div>	
				 </td>
			</tr>
			<tr><td colspan="3">&nbsp;</td></tr>
			<tr class="space" >				
				<td colspan="2" align="left" style="font-size: 18px"><b>Student Profile :</b></td>
				
			</tr>
			<s:iterator value="studentProfile" status="count">
				<tr class="space">					
					<td width="35%">
						<b>Name of Student </b> 
					</td> 
					<td width="65%" style="border-bottom: 1px solid;"><i><s:property value="studentProfile[#count.index][0]"/></i></td>
					
				</tr>
				<tr class="space">					
					<td width="35%">
						<b>Class/House </b> 
					</td> 
					<td width="65%" style="border-bottom: 1px solid;"><i><s:property value="studentProfile[#count.index][28]"/> / <s:property value="studentProfile[#count.index][8]"/></i></td>
					
				</tr>
				<tr class="space">					
					<td width="35%">
						<b>Admission No. </b> 
					</td> 
					<td width="65%" style="border-bottom: 1px solid;"><i><s:property value="studentProfile[#count.index][1]"/></i></td>
					
				</tr>
				<tr class="space">					
					<td width="35%">
						<b>Date of Birth </b> 
					</td> 
					<td width="65%" style="border-bottom: 1px solid;"><i><s:property value="studentProfile[#count.index][9]"/></i></td>
					
				</tr>
				<tr class="space">					
					<td width="35%">
						<b>Mother's Name </b> 
					</td> 
					<td width="65%" style="border-bottom: 1px solid;"><i><s:property value="studentProfile[#count.index][19]"/></i></td>
					
				</tr>
				<tr class="space">					
					<td width="35%">
						<b>Father's Name </b> 
					</td> 
					<td width="65%" style="border-bottom: 1px solid;"><i><s:property value="studentProfile[#count.index][16]"/></i></td>
					
				</tr>
				<tr class="space">				
					<td width="35%">
						<b>Residential Address </b> 
					</td> 
					<td width="65%" style="border-bottom: 1px solid;"><i><s:property value="studentProfile[#count.index][24]"/></i></td>
					
				</tr>
				<tr class="space">					
					<td width="35%">
						<b>and Telephone NO. </b> 
					</td> 
					<td width="65%" style="border-bottom: 1px solid;"><i><s:property value="studentProfile[#count.index][25]"/></i></td>
					
				</tr>
			</s:iterator>
			
					<tr class="space" >						
						<td colspan="2" align="left" style="font-size: 18px">
							<div style="float: left;"> <b>Attendance :</b></div>
							<div style="float: left;padding-left: 210px"><b>Term I</b></div>
							<div style="float: left;padding-left: 65px"><b>Term II</b></div>
						</td>
						
					</tr>
			
			<tr class="space" >			
				<td colspan="2" align="left" >
					<div style="float: left;"> <b>&nbsp;&nbsp;&nbsp;Total attendance of the student : </b></div>
					<div style="float: left;padding-left: 65px">&nbsp;</div>
					<s:iterator value="attendanceList" status="attenIndex">
						<s:if test="attendanceList[#attenIndex.index][2]==1">
							<div style="float: left;border-bottom: 1px solid;width: 100px" align="center">
								<s:property value="attendanceList[#attenIndex.index][1]"/> 
							</div>
							<div style="float: left;padding-left: 10px">&nbsp;</div>
						</s:if>	
						<s:else>	
							<div style="float: left;border-bottom: 1px solid;width: 100px" align="center">
								<s:property value="attendanceList[#attenIndex.index][1]"/>
							</div>
						</s:else>
					</s:iterator>
				</td>
				
			</tr>
			
			<tr class="space" >				
				<td colspan="2" align="left" >
					<div style="float: left;"> <b>&nbsp;&nbsp;&nbsp;Total working days :</b></div>
					<div style="float: left;padding-left: 147px">&nbsp;</div>
					<s:iterator value="attendanceList" status="attenIndex">
						<s:if test="attendanceList[#attenIndex.index][2]==1">
						<div style="float: left;border-bottom: 1px solid;width: 100px" align="center" >
							<s:property value="attendanceList[#attenIndex.index][0]"/>
						</div>
						<div style="float: left;padding-left: 10px">&nbsp;</div>
						</s:if>
						<s:else>
							<div style="float: left;border-bottom: 1px solid;width: 100px" align="center">
								<s:property value="attendanceList[#attenIndex.index][0]"/>
							</div>
						</s:else>
					</s:iterator>
					
				</td>
				
			</tr>
			<tr class="space" valign="bottom">				
				<td colspan="2" align="center" style="font-size: 12px;" height="100%">
					<div style="float: left;"><b>Signature:</b></div>
					<div style="float: left;padding-left: 65px"><b>Student</b></div>
					<div style="float: left;padding-left: 65px"><b>Class Teacher</b></div>
					<div style="float: left;padding-left: 65px"><b>Principal</b></div>
					<div style="float: left;padding-left: 65px"><b>Parent</b></div>
				</td>
				
			</tr>
		</table>																							        	
	</body>
</html>