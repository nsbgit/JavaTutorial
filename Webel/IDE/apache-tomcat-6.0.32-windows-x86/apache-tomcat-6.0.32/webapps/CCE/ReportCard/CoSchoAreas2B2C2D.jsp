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
       
</STYLE>
</head>
	<body>			
		<table width="100%"  style="border: 10px maroon solid ;" bgcolor="#FFFFB7" height="900px">
		<tr><th align="left">
			<div style="padding-top: 5px ;padding-left: 10px;"><b style="font-size: 18px">Part 2 : Co-Scholastic Areas</b><b>( to be assessed on a 5 point scale once </br> in a session )</b></div>						
		</th></tr>
			<tr >
				<td width="100%" style="padding: 10px 10px 10px">
				<s:iterator value="areaList" status="areaIndex">					
					<table width="100%" class="pdfdesign" height="850px">
						<tr class="space">
							<th colspan="3" align="left" style="padding-top: 5px ;padding-left: 10px;">
								<s:property value="areaList[#areaIndex.index][1]"/>: 
								<s:property value="areaList[#areaIndex.index][2]"/>
							</th>
						</tr>
						<tr valign="top" class="space" align="center">
							<td width="10%"><b>S. No.</b></td>
							<td width="70%"><b>Descriptive Indicators*</b></td>
							<td width="20%"><b>Grade</b></td>
						</tr>	
						<s:iterator value="subAreaList" status="subAreaIndex">
							<s:if test="subAreaList[#subAreaIndex.index][1]==areaList[#areaIndex.index][0]">
								<tr valign="top" class="space" align="center">
									<td><s:property value="%{getText('{0,number,#,##00}',{#subAreaIndex.index+1})}"/> </td>
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
				</s:iterator>		
				</td>
			</tr>
		</table>						
		
							
		<div align="center" style="padding:10px 0" id="ptnPrint"><input id="print" class="blue-button" value="Print" onclick="WindowPrint('ptnPrint');" type="button" /> </div>														        		
	</body>
</html>