<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags"%>
    <%@ taglib prefix="sx" uri="/struts-dojo-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>CCE | Teacher Report Card</title>
</head>
	<body>			
				<s:set value="1" name="count"></s:set>
				<div>
					<s:include value="../UserControler/ReportHeader.jsp"></s:include>
					<div align="center" style="padding-top: 5px;padding-bottom: 5px"><u> TEACHER REPORT CARD </u></div>	
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
						<td width="35%"><b>MODE OF ASSESMENT</b></td>
						<s:set value="false" name="flag"></s:set>																									
						<s:iterator value="examTypeList">	
							<s:if test="#flag==false">
								<s:set value="secondVal" name="t1"></s:set>
								<s:set value="true" name="flag"></s:set>	
							</s:if>	
							<s:else>
								<s:set value="secondVal" name="t2"></s:set>	
							</s:else>				
							<td colspan="8"><b><s:property value="secondVal"/></b></td>															
						</s:iterator>	
						<td rowspan="2" colspan="4"><b><s:property value="t1"/> + <s:property value="t2"/></b></td>						
					</tr>
					<s:set value="false" name="flag"></s:set>	
					<tr class="space">
						<td>&nbsp;</td>
						<td>&nbsp;</td>
						<s:set value="false" name="flag"></s:set>	
						<s:set value="false" name="flag1"></s:set>
						<s:set value="''" name="term2"></s:set>	
							<s:set value="''" name="term1"></s:set>				
						<s:iterator value="examNameList">
							<s:if test="%{thredVal==2}">
								<s:if test="#flag1==false">
									<s:set value="true" name="flag"></s:set>
									<s:set value="true" name="flag1"></s:set>
								</s:if>																
								<s:set value="#term2=#term2+' + '+ secondVal" name="term2"></s:set>																
							</s:if>	
							<s:else>							   	
								<s:set value="#term1=#term1+' + '+ secondVal" name="term1"></s:set>
							</s:else>	
							<s:if test="#flag==true">								
								<td colspan="2"><b><s:property value="'( '+#term1+' )'"/></b></td>
								<s:set value="false" name="flag"></s:set>	
							</s:if>																																																	
							<td colspan="2"><b><s:property value="secondVal"/></b></td>																																	
						</s:iterator>						
						<td colspan="2"><b><s:property value="'( '+#term2+' )'"/></b></td>						
					</tr>
					<tr class="space">
						<td>&nbsp;</td>
						<td>&nbsp;</td>
						<s:set value="0" name="totMarks"></s:set>	
						<s:iterator value="examNameList">						
							<td >OUT OF <s:property value="fiveVal"/> %</td>
							<td >GRADE</td>	
							<s:set value="#totMarks=#totMarks+fiveVal" name="totMarks"></s:set>	
							<s:if test="#totMarks==50">
							<td >OUT OF <s:property value="#totMarks"/> %</td>
							<td >GRADE</td>	
								<s:set value="0" name="totMarks"></s:set>	
							</s:if>																					
						</s:iterator>
						<td>FA1 + FA2 + FA3 + FA4</td>
						<td>SA1 + SA2</td>
						<td>OVERALL GRADE</td>
						<td>GRADE POINT</td>
					</tr>
					<s:set name="fa" value="0"></s:set>
					<s:set name="sa" value="0"></s:set>
					<s:set name="countFa" value="0"></s:set>
					<s:set name="countSa" value="0"></s:set>
					<s:iterator value="paperList" status="paperIndex">
					<s:set value="%{fiveVal}" name="paperId"></s:set>	
					<s:set name="splitValue" value="fourthVal.split('<>')"/>
						<tr class="space">
							<td><s:property value="#count"/> </td>																											
								<td>
									<s:property value="secondVal"/> ( <s:property value="thredVal"/> M )
								</td>
								<s:set value="0" name="totMarks"></s:set>
								<s:set value="0" name="t1"></s:set>	
								<s:iterator value="examNameList">
									<s:set value="%{fourthVal}" name="examId"></s:set>	
									<s:set value="%{fiveVal}" name="percentage"></s:set>	
									<s:set value="#totMarks=#totMarks+#percentage" name="totMarks"></s:set>									
									<s:iterator value="marksList" status="marksIndex">																											
										<s:if test="#examId==fiveVal && #paperId==secondVal && #splitValue==null">
												<s:set value="#t1=#t1 + thredVal" name="t1"></s:set>	
												<s:if test="%{fiveVal != 3 && fiveVal != 6}">
													<s:set value="#fa=#fa+thredVal" name="fa"></s:set>
													<s:set value="#countFa=#countFa+1" name="countFa"></s:set>
												</s:if>	
												<s:else>
													<s:set value="#sa=#sa+thredVal" name="sa"></s:set>
													<s:set value="#countSa=#countSa+1" name="countSa"></s:set>
												</s:else>																																								
												<td ><s:property value="thredVal*#percentage/100"/> </td>
												<td>												
													<s:iterator value="gradeList">													
													<s:set value="%{marksList[#marksIndex.index].thredVal/paperList[#paperIndex.index].thredVal*100}" name="gradeRange"></s:set>													
													<s:if test="#gradeRange >= secondVal && #gradeRange <=  thredVal">														
															<s:property value="fourthVal"/>
														</s:if>
													</s:iterator>													
												</td>											
											<s:if test="#totMarks==50">
												<td ><s:property value="#t1*#totMarks/100"/> </td>
												<td>
													<s:iterator value="gradeList">													
														<s:set value="%{#t1/(paperList[#paperIndex.index].thredVal*3)*100}" name="gradeRange"></s:set>													
														<s:if test="#gradeRange >= secondVal && #gradeRange <=  thredVal">														
																<s:property value="fourthVal"/>
															</s:if>
													</s:iterator>
												</td>		
												<s:set value="0" name="totMarks"></s:set>	
												<s:set value="0" name="t1"></s:set>	
											</s:if>																							
										</s:if>																																																																							
									</s:iterator>																					
								</s:iterator>
								<s:set name="splitValue" value="fourthVal.split('<>')"/>
								<s:if test="#splitValue==null">								
									<td><s:property value="#fa" /></td>
									<td><s:property value="#sa" /></td>									
										<s:iterator value="gradeList">																																				
											<s:if test="(#fa+#sa)/(paperList[#paperIndex.index].thredVal*(#countSa+#countFa))*100 >= secondVal && (#fa+#sa)/(paperList[#paperIndex.index].thredVal*(#countSa+#countFa))*100 <=  thredVal">														
													<td><s:property value="fourthVal"/></td>
													<td><s:property value="fiveVal"/></td>
											</s:if>
										</s:iterator>											
								</s:if>	
								<s:set name="fa" value="0"></s:set>
								<s:set name="sa" value="0"></s:set>
								<s:set name="countFa" value="0"></s:set>
								<s:set name="countSa" value="0"></s:set>			
						</tr>
				
						<s:set name="splitValue" value="fourthVal.split('<>')"/>
						<s:if test="#splitValue!=null">
								
							<s:set value="#splitValue.length" name="noOfsubPaper"></s:set>
							<s:set value="1" name="count1"></s:set>
							<s:iterator var="counter" begin="0" end="#noOfsubPaper-1" >  
							<s:set name="fa" value="0"></s:set>
								<s:set name="sa" value="0"></s:set>
								<s:set name="countFa" value="0"></s:set>
								<s:set name="countSa" value="0"></s:set>   																																																									 										
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
									<s:set value="0" name="totMarks"></s:set>	
									<s:set value="0" name="t2"></s:set>	
									<s:iterator value="examNameList">																		
									<s:set value="%{fiveVal}" name="percentage"></s:set>
									<s:set value="%{fourthVal}" name="examId"></s:set>
									<s:set value="#paperId+'-'+#count1" name="paperId1"></s:set>
									<s:set value="#totMarks=#totMarks + #percentage" name="totMarks"></s:set>																																						
									<s:iterator value="marksList" status="marksIndex">																																															
											<s:if test="#examId==fiveVal && #paperId1==secondVal && #splitValue!=null" >
												<s:if test="%{fiveVal != 3 && fiveVal != 6}">
													<s:set value="#fa=#fa+thredVal" name="fa"></s:set>
													<s:set value="#countFa=#countFa+1" name="countFa"></s:set>
												</s:if>	
												<s:else>
													<s:set value="#sa=#sa+thredVal" name="sa"></s:set>
													<s:set value="#countSa=#countSa+1" name="countSa"></s:set>
												</s:else>																																																																																									
												<td ><s:property value="thredVal*#percentage/100"/> </td>
												<td>												
													<s:iterator value="gradeList">													
													<s:set value="%{marksList[#marksIndex.index].thredVal/(paperList[#paperIndex.index].thredVal/#noOfsubPaper)*100}" name="gradeRange"></s:set>													
													<s:if test="#gradeRange >= secondVal && #gradeRange <=  thredVal">														
															<s:property value="fourthVal"/>
														</s:if>
													</s:iterator>													
												</td>		
												<s:set value="#t2=#t2+thredVal" name="t2"></s:set>	
												<s:if test="#totMarks==50">	
													<td ><s:property value="#t2*#totMarks/100"/> </td>
													<td>
														<s:iterator value="gradeList">																									
															<s:set value="%{#t2/(paperList[#paperIndex.index].thredVal)*100}" name="gradeRange"></s:set>													
															<s:if test="#gradeRange >= secondVal && #gradeRange <=  thredVal">														
																<s:property value="fourthVal"/>
															</s:if>
														</s:iterator>
													</td>	
												<s:set value="0" name="totMarks"></s:set>
												<s:set value="0" name="t2"></s:set>		
											</s:if>																																									
											</s:if>																																																						
									</s:iterator>																										
								</s:iterator>
								<td><s:property value="#fa" /></td>
								<td><s:property value="#sa" /></td>
								<s:iterator value="gradeList">																																				
											<s:if test="(#fa+#sa)/(paperList[#paperIndex.index].thredVal*2)*100 >= secondVal && (#fa+#sa)/(paperList[#paperIndex.index].thredVal*2)*100 <=  thredVal">														
													<td><s:property value="fourthVal"/></td>
													<td><s:property value="fiveVal"/></td>
											</s:if>
										</s:iterator>	
								</tr>
								<s:set name="fa" value="0"></s:set>
								<s:set name="sa" value="0"></s:set>
								<s:set name="countFa" value="0"></s:set>
								<s:set name="countSa" value="0"></s:set>
								<s:set value="#count1=#count1+1" name="count1"></s:set>
							</s:iterator>	
						</s:if>
						<s:set value="#count=#count+1" name="count"></s:set>							
					</s:iterator>																						
					</s:if>
					<s:else>
						<tr>							
						<th align="center" width="100%">Paper Name Or Student does Not Exist.</th>						
					</tr>	
					</s:else>					
				</table>
				<div>&nbsp;</div>				
				<div>
				<div style="padding-left: 30px;float: left;padding-top: 50px;">SIGNATURE OF THE SUBJECT TEACHER</div> <div style="float: right;padding-right: 30px;padding-top: 50px;">SIGNATURE OF VICE-PRINCIPAL</div>				
				<div  style="padding-top:50px;padding-left: 45% "  id="ptnPrint"><input id="print" class="blue-button" value="Print" onclick="WindowPrint('ptnPrint');" type="button" /> </div>
				</div>														        		
</body>
<SCRIPT type="text/javascript"></SCRIPT>
</html>