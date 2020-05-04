<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags"%>
    <%@ taglib prefix="sx" uri="/struts-dojo-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>CCE | Academic Record </title>
<script type="text/javascript" src="<s:url value="../js/General/Validation.js"/>"></script>
<STYLE type="text/css">
		body{font-size: 12px ;font-family: arial}	
		.pdfdesign{border-collapse:collapse; width:100%}
        .pdfdesign td{border:1px solid #555 ;}
        .pdfdesign .noborder{border:none !important}
        .pdfdesign tr.space td{padding:10px 5px 5px}
        .pdfdesign tr .nospac{padding:0 !important}
        .pdfdesign .total span{display:block; float:left; width:150px}
        .blue-button{margin:0; padding:0; border:1px solid #3079ed; background:url(../images/bluebtn.jpg); height:27px; padding:0 13px; color:#FFF; font-weight:bold; -moz-border-radius: 3px; -webkit-border-radius: 3px; border-radius: 3px; cursor:pointer }
        .blue-button:hover{box-shadow:0 0 5px #CCC; -moz-box-shadow: 0 0 5px #CCC; -webkit-box-shadow: 0 0 5px #ccc; border-color:#0b5587}
</STYLE>
</head>
	<body>									
		<div align="center" style="font-size: 24px"><b>ACADEMIC RECORD</b></div>			
		<table width="100%" class="pdfdesign" >
		<tr class="space" align="center">
				<td width="30%" rowspan="2">SCHOLASTIC/ACADEMIC YEAR</td>
				<td width="55%" colspan="<s:property value="standardList.size"/>" >GRADE / MARKS OBTAINED</td>
				<td width="15%" rowspan="2">REMARKS</td>
		</tr>
		<tr class="space">			
			<s:iterator value="standardList">
				<td align="center" width="<s:property value="55/standardList.size" />%"><s:property value="thredVal"></s:property></td>
			</s:iterator>
		</tr>
		<s:set name="flag" value="true"></s:set>
		<s:iterator value="subjectList" status="subjectIndex">			
			<tr class="space">
				<td><s:property value="secondVal"/></td>
				<s:iterator value="standardList" status="standardIndex">
				<s:set name="flag" value="true"></s:set>					
					<s:iterator value="marksList" status="marksIndex">					
						<s:if test="standardList[#standardIndex.index].secondVal==thredVal">
							<s:if test="subjectList[#subjectIndex.index].secondVal==fourthVal " >	
							<s:set name="flag" value="false"></s:set>							
								<td>  <s:property value="fiveVal"/> / <s:property value="secondVal"/></td>
							</s:if>							
						</s:if>											
					</s:iterator>	
					<s:if test="#flag==true">
						<td>&nbsp;</td>						
					</s:if>
				</s:iterator>
				<td>&nbsp;</td>
			</tr>
		</s:iterator>	
		<tr class="space">
			<td>Additional Optional Subject</td>
			<s:iterator value="standardList">
				<td>&nbsp;</td>
			</s:iterator>
			<td>&nbsp;</td>
		</tr>
		<tr class="space">
			<td>CGPA / AGGREGATE %</td>
			<s:iterator value="standardList">
				<td>&nbsp;</td>
			</s:iterator>
			<td>&nbsp;</td>
		</tr>
		<tr class="space">
			<td>TOTAL ATTENDANCE</td>
			<s:iterator value="standardList">
				<td>&nbsp;</td>
			</s:iterator>
			<td>&nbsp;</td>
		</tr>
		<tr class="space">
			<td>TOTAL WORKING DAYS</td>
			<s:iterator value="standardList">
				<td>&nbsp;</td>
			</s:iterator>
			<td>&nbsp;</td>
		</tr>
		<tr class="space">
			<td>ACHIEVEMENTS</td>
			<s:iterator value="standardList">
				<td>&nbsp;</td>
			</s:iterator>
			<td>&nbsp;</td>
		</tr>
		<tr class="space">
			<td>IF ANY</td>
			<s:iterator value="standardList">
				<td>&nbsp;</td>
			</s:iterator>
			<td>&nbsp;</td>
		</tr>
		<tr class="space">
			<td>WORK EXP.</td>
			<s:iterator value="standardList">
				<td>&nbsp;</td>
			</s:iterator>
			<td>&nbsp;</td>
		</tr>
		<tr class="space">
			<td>ART. EDN.</td>
			<s:iterator value="standardList">
				<td>&nbsp;</td>
			</s:iterator>
			<td>&nbsp;</td>
		</tr>		
		<tr class="space" valign="top" height="<s:property value="320-(standardList.size*10)" />">
			<td>PHY. EDN. </td>
			<s:iterator value="standardList">
				<td>&nbsp;</td>
			</s:iterator>
			<td>&nbsp;</td>
		</tr>
					
		</table>					
		<div align="center" style="padding:10px 0" id="ptnPrint"><input id="print" class="blue-button" value="Print" onclick="WindowPrint('ptnPrint');" type="button" /> </div>														        		
	</body>
</html>