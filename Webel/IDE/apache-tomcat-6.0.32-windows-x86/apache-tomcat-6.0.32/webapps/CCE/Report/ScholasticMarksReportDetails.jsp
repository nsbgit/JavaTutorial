<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags"%>
    <%@ taglib prefix="sx" uri="/struts-dojo-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>CCE | Scholastic Marks Form </title>
</head>
	<body>			
				<s:set value="1" name="count"></s:set>
				<div>
					<s:include value="../UserControler/ReportHeader.jsp"></s:include>
					<div align="center" style="padding-bottom: 5px"><s:property value="academicYear"/> </div>				
					
					<s:iterator value="studentList">
					<div align="center" style="padding-bottom: 5px">
						<div style="float: left;" >CLASSES : <s:property value="paperList[0].sixVal"/> </div><br>						
						<div style="float: left;padding-bottom: 5px">NAME OF STUDENT : <s:property value="secondVal"/> </div>
						<div style="float: left;padding-left: 25%;">CLASS &amp; SECTION : <s:property value="thredVal"/> </div>
						<div style="float: right;">HOUSE : <s:property value="fourthVal"/> </div>
					</div>
					</s:iterator><br>
					<div ><div style="float: left;"><b>Subject : <s:property value="subjectText"/></b></div> </div>	
				</div><br>
				
						<s:hidden name="category" value="%{category}"></s:hidden> 
						<s:hidden name="subject" value="%{subject}"></s:hidden> 
						<s:hidden name="academicYear" value="%{academicYear}"></s:hidden> 
						<s:hidden name="standard" value="%{standard}"></s:hidden> 
						<s:hidden name="examType" value="%{examType}"></s:hidden> 
						<s:hidden name="examName" value="%{examName}"></s:hidden> 
						<s:hidden name="marksId" value="%{marksId}"></s:hidden>
				<div>&nbsp;</div>		
				<table  width="100%" class="pdfdesign">										
				<s:if test="%{!paperList.isEmpty() && !studentList.isEmpty()}"  >														
					<tr class="space">							
						<td width="5%"><b>SL</b></td>
						<td width="45%"><b>MODE OF ASSESMENT</b></td>															
						<s:iterator value="examTypeList">						
							<td colspan="3"><b><s:property value="secondVal"/></b></td>															
						</s:iterator>							
					</tr>
					<tr class="space">
						<td>&nbsp;</td>
						<td>&nbsp;</td>
						<s:iterator value="examNameList">						
							<td ><b><s:property value="secondVal"/></b></td>															
						</s:iterator>
					</tr>
					<s:iterator value="paperList">
					<s:set value="%{fiveVal}" name="paperId"></s:set>	
					<s:set name="splitValue" value="fourthVal.split('<>')"/>
						<tr class="space">
							<td><s:property value="#count"/> </td>																											
								<td>
									<s:property value="secondVal"/> ( <s:property value="thredVal"/> M )
								</td>
								<s:iterator value="examNameList">
									<s:set value="%{fourthVal}" name="examId"></s:set>									
									<s:iterator value="marksList">																
										<s:if test="#examId==fiveVal && #paperId==secondVal && #splitValue==null">																			
											<td ><s:property value="thredVal"/> </td>
										</s:if>																																																							
									</s:iterator>																
								</s:iterator>							
						</tr>
						<s:set name="splitValue" value="fourthVal.split('<>')"/>
						<s:if test="#splitValue!=null">
							<s:set value="#splitValue.length" name="noOfsubPaper"></s:set>
							<s:set value="1" name="count1"></s:set>
							<s:iterator var="counter" begin="0" end="#noOfsubPaper-1" >     																																																									 										
								<tr class="space">
									<td>&nbsp;</td>
									<td>
										<s:if test="#count1==1">
											I&nbsp;&nbsp;&nbsp;
										</s:if>
										<s:elseif test="#count1==2">
										 	II&nbsp;&nbsp;
										</s:elseif>	
										<s:elseif test="#count1==3">
										 	III&nbsp;
										</s:elseif>	
										<s:else>
											IV&nbsp;
										</s:else>
										 <s:property value="#splitValue[#counter]"/>
									</td>
									<s:set value="1" name="a"></s:set>	
									<s:iterator value="examNameList">
									<s:set value="%{fourthVal}" name="examId"></s:set>
									<s:set value="#paperId+'-'+#count1" name="paperId1"></s:set>																																
									<s:iterator value="marksList" >																																					
											<s:if test="#examId==fiveVal && #paperId1==secondVal && #splitValue!=null" >																																																											
													<td><s:property value="thredVal"/> </td>																																													
											</s:if>																																																						
									</s:iterator>																										
								</s:iterator>	
								</tr>
								<s:set value="#count1=#count1+1" name="count1"></s:set>
							</s:iterator>	
						</s:if>
						<s:set value="#count=#count+1" name="count"></s:set>							
					</s:iterator>						
					<tr class="space">							
						<td width="5%">&nbsp;</td>
						<td width="45%">TOTAL MARKS( 100M )</td>	
						<s:set value="0" name="term1"></s:set>	
						<s:set value="0" name="term2"></s:set>
						<s:set value="0" name="countT1"></s:set>	
						<s:set value="0" name="countT2"></s:set>																	
						<s:iterator value="totalMarks">							
							<s:if test="%{fourthVal==1}">
								<s:set value="#term1=#term1+secondVal"></s:set>
								<s:set value="#countT1+1" name="countT1"></s:set>
							</s:if>	
							<s:else>
								<s:set value="#term2=#term2+secondVal" name="term2"></s:set>
								<s:set value="#countT2+1" name="countT2"></s:set>	
							</s:else>																																											
							<td ><s:property value="secondVal"/> </td>																																																																																									
						</s:iterator>						
					</tr>																		
					</s:if>
					<s:else>
						<tr>							
						<th align="center" width="100%">Paper Name Or Student does Not Exist.</th>						
					</tr>	
					</s:else>					
				</table>
				<div>&nbsp;</div>
				<table  width="50%" class="pdfdesign">
					<tr class="space">
						<td width="5%">&nbsp;</td>
						<td>MARKS &amp; GRADE</td>
						<td>Marks</td>
						<td>Grade</td>
					</tr>
					<s:set value="false" name="flag"></s:set>
					<tr class="space">
						<td>&nbsp;</td>
						<td>									
								<s:iterator value="examNameList">							
									<s:if test="%{thredVal==1}">
										<s:if test="#flag==true">+</s:if>
										<s:else>
											<s:set value="true" name="flag"></s:set>
										</s:else>
										 <s:property value="secondVal"/>
									</s:if>												 														
								</s:iterator>
						</td>
						<td><s:property value="#term1"/> </td>
						<td>						
							<s:iterator value="gradeList">
								<s:if test="(#term1/#countT1) >= secondVal && (#term1/#countT1) <= thredVal ">
									<s:property value="fourthVal"/>
								</s:if>
							</s:iterator>
						</td>
					</tr>	
					<s:set value="false" name="flag"></s:set>
					<tr class="space">
						<td>&nbsp;</td>
						<td>									
								<s:iterator value="examNameList">							
									<s:if test="%{thredVal==2}">
									<s:if test="#flag==true">+</s:if>
										<s:else>
											<s:set value="true" name="flag"></s:set>
										</s:else>
										 <s:property value="secondVal"/> 
									</s:if>												 														
								</s:iterator>
						</td>
						<td><s:property value="#term2"/></td>
						<td>							
							<s:iterator value="gradeList">
								<s:if test="(#term2/#countT2) >= secondVal && (#term2/#countT2) <= thredVal ">
									<s:property value="fourthVal"/>
								</s:if>
							</s:iterator>
						</td>
					</tr>
					<s:set name="fa" value="0"></s:set>
					<s:set name="sa" value="0"></s:set>
					<s:set name="countFa" value="0"></s:set>
					<s:set name="countSa" value="0"></s:set>
					<s:iterator value="totalMarks">	
							<s:if test="%{thredVal != 3 && thredVal != 6}">
								<s:set value="#fa=#fa+secondVal" name="fa"></s:set>
								<s:set value="#countFa=#countFa+1" name="countFa"></s:set>
							</s:if>	
							<s:else>
								<s:set value="#sa=#sa+secondVal" name="sa"></s:set>
								<s:set value="#countSa=#countSa+1" name="countSa"></s:set>
							</s:else>
					</s:iterator>	
					<tr class="space">
						<td>&nbsp;</td>
						<td>FA(40%)</td>						
						<s:set value="#fa=#fa*4/10" name="fa"></s:set>
						<td><s:property value="#fa"/> </td>
						<td>
							<s:iterator value="gradeList">
								<s:if test="((#fa*10/4)/#countFa) >= secondVal && ((#fa*10/4)/#countFa) <= thredVal ">
									<s:property value="fourthVal"/>
								</s:if>
							</s:iterator>
						</td>
					</tr>	
					<tr class="space">
						<td>&nbsp;</td>
						<td>SA(60%)</td>						
						<s:set value="#sa=#sa*4/10" name="sa"></s:set>
						<td><s:property value="#sa"/> </td>						
						<td>
							<s:iterator value="gradeList">
								<s:if test="((#sa*10/4)/#countSa) >= secondVal && ((#sa*10/4)/#countSa) <= thredVal ">
									<s:property value="fourthVal"/>
								</s:if>
							</s:iterator>
						</td>
					</tr>
					<tr class="space">
						<td>&nbsp;</td>
						<td>OVERALL GRADE(FA+SA)</td>
						<td><s:property value="#term1+#term2"/></td>
						<td>
							<s:iterator value="gradeList">
								<s:if test="((#term1+#term2)/(#countT1+#countT2)) >= secondVal && ((#term1+#term2)/(#countT1+#countT2)) <= thredVal ">
									<s:property value="fourthVal"/>
								</s:if>
							</s:iterator>
						</td>
					</tr>					
				</table>
				<div>
				<div style="height: 60px;float: right;padding-right: 30px;padding-top: 40px;padding-bottom: 30px">SIGNATURE OF THE SUBJECT TEACHER</div>				
				<div  style="padding-top:60px;padding-left: 45% "  id="ptnPrint"><input id="print" class="blue-button" value="Print" onclick="WindowPrint('ptnPrint');" type="button" /> </div>
				</div>														        		
</body>
<SCRIPT type="text/javascript"></SCRIPT>
</html>