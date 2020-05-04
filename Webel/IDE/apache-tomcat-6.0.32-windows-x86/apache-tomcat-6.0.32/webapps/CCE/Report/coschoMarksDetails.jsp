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
        .pdfdesign1 tr.space td{padding:13px 10px 5px}
        .pdfdesign1 tr .nospac{padding:0 !important}
        .pdfdesign1 .total span{display:block; float:left; width:150px}
        .underLine {border-bottom: 1px solid #000;width:100%;}
        
</STYLE>
</head>
<body>
	
				<s:set value="0" name="count"></s:set>
				 <div><s:actionerror cssClass="error" /><s:actionmessage cssClass="msg"/></div> 
					<div style="padding-top: 15px"></div>
						<s:include value="../UserControler/ReportHeader.jsp"></s:include>
						<div align="center">
					<s:iterator value="partList">
							<td ><B>ASSESSMENT OF CO-SCHOLASTIC AREAS-PART <s:property value="secondVal"/>: <s:property value="areaText"/>
							<s:iterator value="optional" status="optionalIndex"></s:iterator>
									<s:if test="%{optional[#optionalIndex.index].secondVal!=null || !optional[#optionalIndex.index].secondVal.equals('')}">
										(Any <s:property value="secondVal"/> to be assessed)
									</s:if>
								</B></td>															
						</s:iterator>
					 </div>				
					<div>
						<div style="float: left;"  class="">&nbsp;&nbsp;&nbsp;&nbsp;<span class="underLine"><b>Class :</b>
						&nbsp;&nbsp;<s:property value="subAreaList[0].fourthVal"/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						</span> 
						</div>
					 </div>
					<br>
					<div >
						<s:iterator value="studentList">
							<div style="float: left;">
								&nbsp;&nbsp;&nbsp;&nbsp;<b>NAME OF THE STUDENT :</b>
									&nbsp;&nbsp;<s:property value="secondVal"/>															
							</div> 
							 <div style="float: right"><b>CLASS &amp; SECTION :</b> &nbsp;&nbsp;
							 	<s:property value="thredVal"/>&nbsp;&nbsp;&nbsp;&nbsp; 
							 </div>
						</s:iterator>
						</div>		 
				 
				<s:if test="%{!paperList.isEmpty() && !subAreaList.isEmpty() && !studentWiseMarksList.isEmpty}"  >
				<s:iterator value="subAreaList" status="subAreaIndex">		
				
					<s:if test="#count%3==0">
					
						<s:if test="#count>2">
						<s:property value="#subAreaIndex.index"/>
					<div style="padding-top: 155px"></div>
						<s:include value="../UserControler/ReportHeader.jsp"></s:include>
						<div align="center">
						
					<s:iterator value="partList">
					
							<td ><B>ASSESSMENT OF CO-SCHOLASTIC AREAS-PART <s:property value="secondVal"/>: <s:property value="areaText"/>
						 	<s:iterator value="optional" status="optionalIndex"></s:iterator>
									<s:if test="%{optional[#optionalIndex.index].secondVal!=null || !optional[#optionalIndex.index].secondVal.equals('')}">
										(Any <s:property value="secondVal"/> to be assessed)
									</s:if>
							</B></td>															
						</s:iterator>
					 </div>				
					<div>
						<div style="float: left;"  class="">&nbsp;&nbsp;&nbsp;&nbsp;<span class="underLine"><b>Class :</b>
						&nbsp;&nbsp;<s:property value="subAreaList[0].fourthVal"/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						</span> 
						</div>
					 </div>
					<br>
					<div >
						<s:iterator value="studentList">
							<div style="float: left;">
								&nbsp;&nbsp;&nbsp;&nbsp;<b>NAME OF THE STUDENT :</b>
									&nbsp;&nbsp;<s:property value="secondVal"/>															
							</div> 
							 <div style="float: right"><b>CLASS &amp; SECTION :</b> &nbsp;&nbsp;
							 	<s:property value="thredVal"/>&nbsp;&nbsp;&nbsp;&nbsp; 
							 </div>
						</s:iterator>
						</div>	
						</s:if>
					</s:if>	
					<div align="center" class="space" style="padding-top: 20px;font-size: 16px; padding-bottom: 10px">
					 <b><s:property value="thredVal"></s:property></b>
					 </div>
					<table class="pdfdesign1" width="100%">
					<tr  class="space" >
					<td><b>SL.NO.</b></td>
					<s:set value="0" name="cnt"></s:set>
					<s:set value="0" name="avg"></s:set>
					<s:set value="0" name="range"></s:set>
					<s:set value="0" name="total"></s:set>
					<s:iterator value="paperList" status="paperIndex">
					
						<s:if test="%{subAreaList[#subAreaIndex.index].secondVal==paperList[#paperIndex.index].secondVal}">
						<s:set value="#cnt=#cnt+1" name="cnt"></s:set>
						<s:set value="#range=#range+fiveVal" name="range"></s:set>																																									
								<td align="left"><b><s:property value="fourthVal"/> (out of <s:property value="fiveVal"/>)</b></td>
						</s:if>																																					
					</s:iterator>
					<s:set value="#avg=#cnt" name="avg"></s:set>
					<td><b>TOTAL SCORE (out of <s:property value="#range"/>)</b></td>
					<td><b>AVERAGE</b></td>
					<td><b>GRADE</b></td>
					</tr>
					<tr class="space">		
						<td align="center">1</td>
						
							<s:iterator value="paperList" status="paperIndex">
							<s:if test="%{subAreaList[#subAreaIndex.index].secondVal==paperList[#paperIndex.index].secondVal}">
								<s:iterator value="studentWiseMarksList" status="studentWiseMarksIndex">
								 		<s:if test="%{paperList[#paperIndex.index].thredVal==studentWiseMarksList[#studentWiseMarksIndex.index].fourthVal && paperList[#paperIndex.index].secondVal==studentWiseMarksList[#studentWiseMarksIndex.index].fiveVal}">
								 			<td align="center"><s:property value="sevenVal"/>
											</td>
											
											<s:set value="#cnt=#cnt-1" name="cnt"></s:set>
											<s:set value="#total=#total+sevenVal" name="total"></s:set>
										</s:if>
									
								</s:iterator>
								</s:if>
							 
						</s:iterator>
						<s:iterator begin="1" end="#cnt">
							<td>&nbsp;</td>
						</s:iterator>
						<s:if test="%{#total==0}">
							<s:set value="" name="total"></s:set>
							<s:set value="" name="avg"></s:set>
							<s:set value="" name="range"></s:set>
						</s:if>						
						<td align="center"><s:property value="#total"></s:property></td>
						<td align="center">
						<s:if test="%{#total==null}">
							<s:property value=""/>
							</s:if>
							<s:else><s:property value="#total/#avg"/></s:else>
							</td>
						<s:set name="grade" value="#total/#avg"></s:set>
						<td align="center">
						<s:if test="%{#total==null}">
							<s:property value="a"/>
							</s:if>
							<s:else>
							<s:iterator value="gradeList">
								<s:if test="%{secondVal<=#grade && #grade<=thredVal}">
								<s:property value="fourthVal"/> 
								</s:if>
							</s:iterator>
						</s:else>
						</td>
						
					</tr>	
					</table>
					<s:set value="#count=#count+1" name="count"></s:set>
					<s:if test="#count%3==0">
					<div style="float: left;padding-top: 75px">
								&nbsp;&nbsp;&nbsp;&nbsp;<b>SIGNATURE OF THE H.M.</b>
																								
							</div> 
							 <div style="float: right;padding-top: 75px"><b>SIGNATURE OF VICE PRINCIPAL</b> &nbsp;&nbsp;&nbsp;&nbsp;
							 	 
							 </div>
						 </s:if>
					
				</s:iterator>
				</s:if>
				<div style="float: left;padding-top: 75px">
								&nbsp;&nbsp;&nbsp;&nbsp;<b>SIGNATURE OF THE H.M.</b>
																								
							</div> 
							 <div style="float: right;padding-top: 75px"><b>SIGNATURE OF VICE PRINCIPAL</b> &nbsp;&nbsp;&nbsp;&nbsp;
							 	 
							 </div>
						
					
					<s:else>
						<tr>							
						<th align="center" width="100%">Paper Name Or Student does Not Exist.</th>						
					</tr>	
					</s:else>	
				<div align="center" style="padding:80px 0" id="ptnPrint"><input id="print" class="blue-button" value="Print" onclick="WindowPrint('ptnPrint');" type="button" /> </div>													
	
</body>
</html>