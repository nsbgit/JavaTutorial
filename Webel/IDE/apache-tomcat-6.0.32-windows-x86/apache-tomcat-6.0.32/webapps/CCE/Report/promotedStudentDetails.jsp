<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags"%>
    <%@ taglib prefix="sx" uri="/struts-dojo-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<STYLE type="text/css">
		.pdfdesign1{border-collapse:collapse; width:100%}
        .pdfdesign1 td{border:1px solid #555 ;}
        .pdfdesign1 .noborder{border:none !important}
        .pdfdesign1 tr.space td{padding:3px 10px 5px}
        .pdfdesign1 tr .nospac{padding:0 !important}
        .pdfdesign1 .total span{display:block; float:left; width:150px}
        .underLine {border-bottom: 1px solid #000;width:100%;}
         body{font-size: 18px ;font-family: arial}
        
</STYLE>
<title><s:property value="newsStandardText"/> </title>
</head>

<body>
	
				<s:set value="0" name="count"></s:set>
				
				 <div><s:actionerror cssClass="error" /><s:actionmessage cssClass="msg"/></div> 
					<div style="padding-top: 15px"></div>
						<s:include value="../UserControler/ReportHeader.jsp"></s:include>
										
					<div style="padding-top: 5px">
						<div style="float: left; font-size: 18px">&nbsp;&nbsp;&nbsp;&nbsp;
						<span>
							<b>Standard :</b>&nbsp;&nbsp;<s:property value="newsStandardText"/>&nbsp;&nbsp;&nbsp;
							&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						</span> 
						</div>
						<div style="float: right;font-size: 18px"  class="">&nbsp;&nbsp;&nbsp;&nbsp;
						<span>
							<b>Academic Year :</b>&nbsp;&nbsp;<s:property value="newacademicYear"/>
							&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						</span> 
						</div>
					 </div>
					<br>
				<table width="100%" align="center" class="pdfdesign1">	
				<s:if test="%{!studentList.isEmpty()}">	
				<tr class="space">
					<td width="50%" style="font-size: 18px">
						<div style="float: left;padding-top: 5px;">
							ADMISSION NO
						</div>
					</td>
					<td width="50%" style="font-size: 18px">
						<div style="float: left;padding-top: 5px;">
							NAME
						</div>
					</td>
				</tr>
				<s:iterator value="studentList" status="studentListIndex">	
				<tr class="space">
					<td width="50%" align="center" style="font-size: 16px">
						<div style="float: left;padding-top: 5px;">
							<s:property value="%{studentList[#studentListIndex.index][2]}"/>
						</div>
					</td>
					<td width="50%" align="center" style="font-size: 16px">
						<div style="float: left;padding-top: 5px;">
							<s:property value="%{studentList[#studentListIndex.index][1]}"/>
						</div>
					</td>
				 </tr>
				</s:iterator>
						
					</s:if>
					<s:else>
						<tr>							
						<th align="center" width="100%">Student does Not Exist.</th>						
					</tr>	
					</s:else>
					</table>	
				<div align="center" style="padding:80px 0" id="ptnPrint"><input id="print" class="blue-button" value="Print" onclick="WindowPrint('ptnPrint');" type="button" /> </div>													
	
</body>
</html>