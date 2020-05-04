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
					<s:include value="page3.jsp"></s:include>
				</td>
			</tr>							
			</s:if>
			</s:iterator>
			<s:if test="#pageNo==4">
				<tr >
					<td width="100%" style="padding: 10px 10px 10px">										
						<s:include value="page4.jsp"></s:include>		
					</td>
				</tr>
			
			</s:if>	
			
			<s:if test="#pageNo==5">
				<tr >
					<td width="100%" style="padding: 10px 10px 10px">										
							<s:include value="page5.jsp"></s:include>			
					</td>
				</tr>
			</s:if>	
			
			<s:if test="#pageNo==6">
				<tr >
					<td width="100%" style="padding: 10px 10px 10px">										
						<s:include value="page6.jsp"></s:include>					
					</td>
				</tr>
			</s:if>			
			<s:if test="#pageNo==7">
			<tr >
					<td width="100%" style="padding: 10px 10px 10px" align="left">					
						<s:include value="page7.jsp"></s:include>
					</td>
			</tr>								
			</s:if>			
		</table>						
		</th></tr></table>
		</s:iterator>					
		<div align="center" style="padding:10px 0" id="ptnPrint"><input id="print" class="blue-button" value="Print" onclick="WindowPrint('ptnPrint');" type="button" /> </div>														        		
	</body>
</html>