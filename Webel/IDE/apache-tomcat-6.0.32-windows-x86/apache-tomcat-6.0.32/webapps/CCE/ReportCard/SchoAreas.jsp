<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags"%>
    <%@ taglib prefix="sx" uri="/struts-dojo-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>CCE | Scholastic Marks </title>
<link rel="stylesheet" type="text/css" href="<s:url value="../css/reportHeader.css"/>" />	
    <link rel="stylesheet" type="text/css" href="<s:url value="../css/thickbox.css"/>"/>   
    <script type="text/javascript" src="<s:url value="../js/General/jquery-1.3.2.min.js"/>"></script>
    <script type="text/javascript" src="<s:url value="../js/General/thickbox.js"/>"></script>
    <script type="text/javascript" src="<s:url value="../js/General/Validation.js"/>"></script>
<STYLE type="text/css">
		.pdfdesign{border-collapse:collapse; width:100%;font-size: 14px;font-weight: 500;}
        .pdfdesign td{border:1px solid #555 ;}
        .pdfdesign .noborder{border:none !important}
        .pdfdesign tr.space td{padding:2px 3px}
        .pdfdesign tr.space1 td{padding:10px 10px}
        .pdfdesign tr .nospac{padding:0 !important}
        .pdfdesign .total span{display:block; float:left; width:150px}
       body{font-size: 14px ;font-family: arial}
       
</STYLE>
</head>
	<body>			
		<table width="100%"   height="850px">
		<tr><th align="left">
			<div style="padding-top: 5px ;padding-left: 10px;font-size: 18px"><b>Part-1 : Academic Performance : Scholastic Areas</b></div>
			<div style="padding-left: 10px"><b>( 9 point scale )</b></div>
			<div>&nbsp;</div>
		</th></tr>
			<tr >
				<td width="100%" style="padding: 5px 5px 5px">
					<table width="100%" class="pdfdesign" height="850px">
						<tr valign="top" class="space" align="center">
							<td width="7%" rowspan="2"><b>S. No.</b></td>
							<td width="20%" rowspan="2"><b>Subject</b></td>
							<s:iterator value="examTypeList" ></s:iterator>
							<td width="26%" colspan="4"><b><s:property value="examTypeList[0][0]"/> </b></td>
							<td width="26%" colspan="4"><b><s:property value="examTypeList[1][0]"/></b></td>
							<td width="23%" colspan="3"><b><s:property value="examTypeList[0][0]"/> + <s:property value="examTypeList[1][0]"/></b></td>
						</tr>
						<tr class="space" >
							<s:iterator value="examNameList"></s:iterator>
							<td width="8px"><s:property value="examNameList[0][0]"/></td>
							<td width="8px"><s:property value="examNameList[1][0]"/></td>
							<td width="8px"><s:property value="examNameList[2][0]"/></td>
							<td width="28px"> 
									<s:property value="examNameList[0][0]"/> +<br>
									<s:property value="examNameList[1][0]"/> +<br> 
									<s:property value="examNameList[2][0]"/>
							</td>
							<td width="8px"><s:property value="examNameList[3][0]"/></td>
							<td width="8px"><s:property value="examNameList[4][0]"/></td>
							<td width="8px"><s:property value="examNameList[5][0]"/></td>
							<td width="28px"> 
									<s:property value="examNameList[3][0]"/> +<br>
									<s:property value="examNameList[4][0]"/> +<br> 
									<s:property value="examNameList[5][0]"/>
							</td>
							<td width="50px"> 
									<s:property value="examNameList[0][0]"/> +<br>
									<s:property value="examNameList[1][0]"/> +<br>
									<s:property value="examNameList[3][0]"/> +<br>
									<s:property value="examNameList[4][0]"/> 
							</td>
							<td width="45px">
								<s:property value="examNameList[2][0]"/> +<br>
								<s:property value="examNameList[5][0]"/>
							</td>
							<td width="35px" align="center">Overall Grade</td>
						</tr>
						<s:set value="0" name="overallMarks"></s:set>
						<s:set value="0" name="ovCount"></s:set>
						<s:iterator value="subjectList" status="subIndex">
							<s:set value="0" name="remain"></s:set>
						<tr align="center" class="space" height="12%" >						
							<td><s:property value="%{getText('{0,number,#,##00}',{#subIndex.index+1})}"/> </td>
							<td align="left"><s:property value="subjectList[#subIndex.index][1]"/> </td>
							<s:iterator value="marksList" status="marksIndex">																													
								<s:if test="marksList[#marksIndex.index][3].equals(subjectList[#subIndex.index][1]) && marksList[#marksIndex.index][2]==examNameList[0][2]">
									<td><s:property value="%{getText('{0}',{marksList[#marksIndex.index][0]})}"/> </td>
									<s:set value="marksList[#marksIndex.index][0]" name="fa1"></s:set>
									<s:set value="#remain+1" name="remain"></s:set>
								</s:if>	
								<s:elseif test="marksList[#marksIndex.index][3].equals(subjectList[#subIndex.index][1]) && marksList[#marksIndex.index][2]==examNameList[1][2]">
									<td><s:property value="%{getText('{0}',{marksList[#marksIndex.index][0]})}"/> </td>
									<s:set value="marksList[#marksIndex.index][0]" name="fa2"></s:set>
									<s:set value="#remain+1" name="remain"></s:set>
								</s:elseif>	
								<s:elseif test="marksList[#marksIndex.index][3].equals(subjectList[#subIndex.index][1]) && marksList[#marksIndex.index][2]==examNameList[2][2]">
									<td><s:property value="%{getText('{0}',{marksList[#marksIndex.index][0]})}"/> </td>
									<s:set value="marksList[#marksIndex.index][0]" name="sa1"></s:set>
									<s:set value="#remain+1" name="remain"></s:set>
								</s:elseif>
								<s:elseif test="marksList[#marksIndex.index][3].equals(subjectList[#subIndex.index][1]) && marksList[#marksIndex.index][2]==examNameList[3][2]">
									<td><s:property value="%{getText('{0}',{#fa1+#fa2+#sa1})}"/></td>	
									<td><s:property value="%{getText('{0}',{marksList[#marksIndex.index][0]})}"/> </td>
									<s:set value="marksList[#marksIndex.index][0]" name="fa3"></s:set>
									<s:set value="#remain+2" name="remain"></s:set>													
								</s:elseif>								
								<s:elseif test="marksList[#marksIndex.index][3].equals(subjectList[#subIndex.index][1]) && marksList[#marksIndex.index][2]==examNameList[4][2]">
									<td><s:property value="%{getText('{0}',{marksList[#marksIndex.index][0]})}"/> </td>
									<s:set value="marksList[#marksIndex.index][0]" name="fa4"></s:set>	
									<s:set value="#remain+1" name="remain"></s:set>					
								</s:elseif>								
								<s:elseif test="marksList[#marksIndex.index][3].equals(subjectList[#subIndex.index][1]) && marksList[#marksIndex.index][2]==examNameList[5][2]">
									<td><s:property value="%{getText('{0}',{marksList[#marksIndex.index][0]})}"/> </td>
									<s:set value="#remain+4" name="remain"></s:set>									
									<s:set value="marksList[#marksIndex.index][0]" name="sa2"></s:set>	
									<td><s:property value="%{getText('{0}',{#fa3+#fa4+#sa2})}"/></td>	
									<td><s:property value="%{getText('{0}',{#fa1+#fa2+#fa3+#fa4})}"/></td>
									<td><s:property value="%{getText('{0}',{#sa1+#sa2})}"/></td>
									<s:set value="#overallMarks+#fa1+#fa2+#fa3+#fa4+#sa1+#sa2" name="overallMarks"></s:set>	
									<s:set value="#ovCount+1" name="ovCount"></s:set>									
									<s:iterator value="gradeList" status="gradeIndex">
										<s:if test="(#fa1+#fa2+#fa3+#fa4+#sa1+#sa2)>=gradeList[#gradeIndex.index][0] && (#fa1+#fa2+#fa3+#fa4+#sa1+#sa2)<=gradeList[#gradeIndex.index][1]">
											<td ><s:property value="gradeList[#gradeIndex.index][2]"/></td>	
										</s:if>			
									</s:iterator>					
								</s:elseif>																						
							</s:iterator>							
							<s:if test="#remain !=10">
								<s:iterator begin="#remain" step="1" end="10">
									<td>&nbsp;</td>
								</s:iterator>				
							</s:if>			
						</tr>
						</s:iterator>						
						<tr>
							<th colspan="7" height="90px" width="100%" align="left">
								<table>								
									<tr>
										<td  height="50px" width="300px" style="padding-left: 10px "><div style="float: left;">Overall Grade:</div>
											<div style="float: left;border-bottom: 1px black solid; width: 150px" align="center">
												<s:iterator value="gradeList" status="gradeIndex">
													<s:if test="(#overallMarks/#ovCount)>=gradeList[#gradeIndex.index][0] && (#overallMarks/#ovCount)<=gradeList[#gradeIndex.index][1]">
														<i style="font-weight: normal"><s:property value="gradeList[#gradeIndex.index][2]"/></i>	
													</s:if>
												</s:iterator>	
											</div>
										 </td>							
									</tr>
								</table> 
							</th>
						</tr>							 		
					</table>	
				</td>
			</tr>
		</table>																															        	
	</body>
</html>