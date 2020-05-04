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
        .pdfdesign1 tr.space td{padding:8px 10px 5px }
        .pdfdesign1 tr .nospac{padding:0 !important}
        .pdfdesign1 .total span{display:block; float:left; width:150px}
</STYLE>
</head>
	<body>							
		<div>
				
			 <s:iterator value="reportHeaderList" status="headerIndex">
				<div align="center" style="padding: 5px 5px 5px">
				
						<span style="font-size:18px; font-weight:bold"><s:property value="reportHeaderList[#headerIndex.index][0]"/> </span><br><br />						
					<!-- 	<span style="font-size:14px"><s:property value="fourthVal"/>  </span><br />-->  
						<span style="font-size:13px" >AFFILATION NO.:  <s:property value="reportHeaderList[#headerIndex.index][1]"/>&nbsp;&nbsp;&nbsp; EMAIL ID  : 
			            <s:property value="reportHeaderList[#headerIndex.index][4]"/>&nbsp;&nbsp;&nbsp; PHONE NUMBER :  <s:property value="reportHeaderList[#headerIndex.index][2]"/> </span>  <br />   
			            <SPAN>&nbsp;</SPAN>                 
				</div>
			</s:iterator>     
	<div style="border-bottom: solid;"></div>						
		</div>		
		<s:iterator value="studentProfile" status="count">
		<table width="100%" class="pdfdesign1" >
		<tr class="space">
				<td width="45%">&nbsp;</td>
				<td width="40%">&nbsp;</td>
				<td width="15%">&nbsp;</td>
			</tr>
			<tr class="space">
				<td width="45%">&nbsp;</td>
				<td width="40%">&nbsp;</td>
				<td width="15%">&nbsp;</td>
			</tr>
			<tr valign="middle" class="space">
				<td colspan="2">STUDENT NAME : <s:property value="studentProfile[#count.index][0]"/></td>
				<s:if test="%{studentProfile[#count.index][15] !=null}">
					<td rowspan="5" style="border: solid 1px;width: 125px;height: 125px;vertical-align: middle" align="center"><img alt="" width="125px" height="125px" src="../Upload/Student/<s:property value="studentProfile[#count.index][15]"/>"> </td>
				</s:if>
				<s:else>
					<td rowspan="5" style="border: solid 1px;width: 125px;height: 125px;vertical-align: middle" align="center">PHOTO AT THE TIME OF JOINING</td>
				</s:else>
								
			</tr>	
			<tr class="space">
				<td colspan="2">ADMISSION NO : <s:property value="studentProfile[#count.index][1]"/></td>
			</tr>
			<tr class="space">
				<td colspan="2">YEAR &amp; CLASS OF ADMISSION : <s:property value="studentProfile[#count.index][2]"/> ( <s:property value="studentProfile[#count.index][3]"/> ) </td>
			</tr>
			<tr class="space">
				<td colspan="2">RELIGION : <s:property value="studentProfile[#count.index][4]"/></td>
			</tr>
			<tr class="space">
				<td colspan="2">CATEGORY : <s:property value="studentProfile[#count.index][5]"/></td>
			</tr>
			<tr class="space">
				<td colspan="3">RURAL/URBAN : <s:property value="studentProfile[#count.index][6]"/></td>
			</tr>
			<tr class="space">
				<td colspan="3">GENDER : <s:property value="studentProfile[#count.index][7]"/></td>
			</tr>
			<tr class="space">
				<td colspan="3">DATE OF BIRTH : <s:property value="studentProfile[#count.index][9]"/></td>
			</tr>
			<tr class="space">
				<td >CBSE REGISTRATION NO : <s:property value="studentProfile[#count.index][10]"/></td>
				<td colspan="2">( FOR CLASS IX )</td>
			</tr>
			<tr class="space">				
				<td colspan="3">&nbsp;</td>
			</tr>
			<tr class="space">
				<td colspan="3" >BLOOD GROUP : <s:property value="studentProfile[#count.index][11]"/></td>				
			</tr>
			<tr class="space">
				<td colspan="3" >IDENTIFICATION MARKS : <s:property value="studentProfile[#count.index][12]"/></td>				
			</tr>
			<tr class="space">				
				<td colspan="3">&nbsp;</td>
			</tr>
			<tr class="space">
				<td colspan="3" >HOBBIES &amp; INTERESTS : <s:property value="studentProfile[#count.index][12]"/></td>				
			</tr>
			<tr class="space">
				<td colspan="3" >GOLE : <s:property value="studentProfile[#count.index][13]"/></td>				
			</tr>
			<tr class="space">
				<td colspan="3" >STRENGTHS: <s:property value="studentProfile[#count.index][14]"/></td>				
			</tr>
			<tr class="space">
				<td colspan="3" ><b> <u>FAMILY PARTICULAR</u> </b></td>				
			</tr>
			<tr class="space">
				<td colspan="3" >FATHER'S NAME : <s:property value="studentProfile[#count.index][16]"/></td>				
			</tr>
			<tr class="space">
				<td colspan="3" >FATHER'S QUALIFICATION : <s:property value="studentProfile[#count.index][17]"/></td>				
			</tr>
			<tr class="space">
				<td colspan="3" >FATHER'S OCCUPATION : <s:property value="studentProfile[#count.index][18]"/></td>				
			</tr>
			<tr class="space">
				<td colspan="2" >MOTHER'S NAME : <s:property value="studentProfile[#count.index][19]"/></td>
				<td rowspan="5" style="border: solid 1px;width: 125px;height: 125px;vertical-align: middle" align="center">PHOTO AT THE TIME OF LEAVING</td>				
			</tr>
			<tr class="space">
				<td colspan="2">MOTHER'S QUALIFICATION : <s:property value="studentProfile[#count.index][20]"/></td>
			</tr>
			<tr class="space">
				<td colspan="2">MOTHER'S OCCUPATION : <s:property value="studentProfile[#count.index][21]"/></td>
			</tr>
			<tr class="space">
				<td colspan="2">NO. OF BROTHERS : <s:property value="studentProfile[#count.index][22]"/></td>
			</tr>
			<tr class="space">
				<td colspan="2">AND SISTERS : <s:property value="studentProfile[#count.index][23]"/></td>
			</tr>
			<tr class="space">
				<td colspan="3">RESIDENTIAL ADDRESS : <s:property value="studentProfile[#count.index][24]"/></td>
			</tr>
			<tr class="space">				
				<td colspan="3">&nbsp;</td>
			</tr>
			<tr class="space">
				<td colspan="3">PHONE NUMBER : <s:property value="studentProfile[#count.index][25]"/></td>
			</tr>
			<tr class="space">
				<td colspan="3">EMAIL ID : <s:property value="studentProfile[#count.index][26]"/></td>
			</tr>
		</table>			
		</s:iterator>
		
		<div align="center" style="padding:10px 0" id="ptnPrint"><input id="print" class="blue-button" value="Print" onclick="WindowPrint('ptnPrint');" type="button" /> </div>														        		
	</body>
</html>