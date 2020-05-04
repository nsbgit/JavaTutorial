<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags"%>
    <%@ taglib prefix="sx" uri="/struts-dojo-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>CCE | <s:if test="(paperID == null || paperID.equals('') ||paperID.equals('-1'))">Add</s:if><s:else>Edit</s:else> Scholastic Paper</title>
</head>
<body>
	<s:form    theme="simple"  method="post" validate="true">
	<s:div>
	<s:div>
	 <s:div cssClass="main1" >
    	<s:include value="../UserControler/Header.jsp"></s:include>
	</s:div>
	   <s:div cssClass="container">
		<s:div cssClass="container1">
			<s:div cssClass="wrapper">
			    <s:include value="../UserControler/LeftPanel.jsp"></s:include>
				</s:div>
				<s:div cssClass="rightside">
						<h1><s:if test="(paperID == null || paperID.equals('')||paperID.equals('-1'))">Add</s:if><s:else>Edit</s:else> Scholastic Paper  </h1>
						<div class="form">
							<table >						
								<tr>
									<td colspan="3" align="center"><s:hidden value="%{paperID}" name="paperID"/><s:actionerror cssClass="error" /><s:actionmessage cssClass="msg"/> </td>								
								</tr>
								<tr >
									<td style="width: 25%">Exam Category <em>*</em> :</td>
									<td style="width: 35%"><sx:autocompleter    headerKey="" headerValue="Select" list="categoryList" listKey="firstVal" listValue="secondVal"   name="examCategory" cssClass="combobox"></sx:autocompleter></td>
									<td style="width: 40%"><s:fielderror  fieldName="examCategory" theme="simple" cssClass="error" /></td>
								</tr>							
								<tr class="even" >
									<td>Academic Year <em>*</em> :</td>
									<td><sx:autocompleter    headerKey="" headerValue="Select" list="academicYearList"    name="academicYear" cssClass="combobox"></sx:autocompleter></td>
									<td><s:fielderror  fieldName="academicYear" theme="simple" cssClass="error" /></td>
								</tr>
								<tr >
									<td>Standard<em>*</em> :</td>
									<td><sx:autocompleter    headerKey="" headerValue="Select" list="standardList" listKey="firstVal" listValue="secondVal" onchange="loadNewValue(this.value,'sub','subjectBind.html')"   name="standard" cssClass="combobox"></sx:autocompleter></td>
									<td><s:fielderror  fieldName="standard" theme="simple" cssClass="error" /></td>
								</tr>
								<tr class="even">
									<td>Subject<em>*</em> :</td>
									<td id="sub"><sx:autocompleter   headerKey="" headerValue="Select" list="subjectList" listKey="firstVal" listValue="secondVal"    name="subject" cssClass="combobox"></sx:autocompleter></td>
									<td><s:fielderror  fieldName="subject" theme="simple" cssClass="error" /></td>
								</tr>
								<tr  >
									<td>Paper <em>*</em> :</td>
									<td><s:textfield name="paperName" required="true" key="paperName"  cssClass="textbox" maxlength="200" ></s:textfield></td>
									<td><s:fielderror  fieldName="paperName" theme="simple" cssClass="error" /></td>
								</tr>
								<tr  >
									<td>Paper Short Name <em>*</em> :</td>
									<td><s:textfield name="paperShortName" required="true" key="paperShortName"  cssClass="textbox" maxlength="200" ></s:textfield></td>
									<td><s:fielderror  fieldName="paperShortName" theme="simple" cssClass="error" /></td>
								</tr>
								<tr class="even" >
									<td>Marks <em>*</em> :</td>
									<td><s:textfield name="marks" required="true" key="marks"  cssClass="textbox" onkeypress="return isNumberKey(event)" maxlength="3"></s:textfield></td>
									<td><s:fielderror  fieldName="marks" theme="simple" cssClass="error" /></td>
								</tr>
								<tr>
									<td>Sub Paper :</td>
									<td><s:textfield name="subPaperName" id="subPaperName" required="true" key="subPaperName"  cssClass="textbox" maxlength="200" ></s:textfield></td>
									<td><s:hidden name="oddeven" id="oddeven" value="even"></s:hidden></td>
								</tr>
								<tr>
									<td>Sub Paper Short Name :</td>
									<td><s:textfield name="subPaperShortName" id="subPaperShortName" required="true" key="subPaperShortName"  cssClass="textbox" maxlength="200" ></s:textfield></td>
									<td><s:hidden name="oddeven" id="oddeven" value="even"></s:hidden><input  value="Add" class="blue-button" style="width: 30px"  name="add" onclick="addNew()" /></td>
								</tr>
								<tr valign="top">
									<td colspan="3" style="width: 100%">									
										<table cellpadding="0" cellspacing="0" border="1" width="100%" >
											<tr valign="top" align="center">
												<th width="5%">#</th>
												<th width="50%">Sub Paper Name</th>
												<th width="45%">Sub Paper Short Name</th>																																													
											</tr>
											<tr>
												<td colspan="3" valign="top" width="100%">
													<div style="overflow:auto; height:130px;width:100%;" >
														<table  align="center" border="1" cellpadding="0" cellspacing="0" width="100%">
															<tbody id="addShow">						
																	<s:if test="splitValue!=null || splitShrotValue!=null">
																		<s:if test="!splitValue.equals('') || !splitShrotValue.equals('')">
																	<s:set name="splitValue"  value="splitValue.split('<>')"/>																	
																	<s:set name="splitShortValue"  value="splitShrotValue.split('<>')"/>
																		<s:set value="#splitValue.length" name="noOfsubPaper"></s:set>
																		<s:iterator var="counter" begin="0" end="#noOfsubPaper-1" >
																			<tr><td></td><td><s:textfield name="subPaper"  required="true" key="subPaper" value="%{#splitValue[#counter]}"  cssClass="textbox" maxlength="200" ></s:textfield></td>
																			<td><s:textfield name="subShortPaper"  required="true" key="subShortPaper" value="%{#splitShortValue[#counter]}"  cssClass="textbox" maxlength="200" ></s:textfield></td></tr>
																		</s:iterator>
																		</s:if>	 																						
																	</s:if>
															</tbody>										
														</table>
													</div>													
												</td>											
											</tr>																
										</table>								
									</td>																					
								</tr>														
								<tr class="even">
									<td colspan="3">
										<s:if test="(paperID == null || paperID.equals('') ||paperID.equals('-1'))">
											<s:submit  value="Save" cssClass="blue-button" action="savePaper" ></s:submit>
											<s:reset  value="Reset" cssClass="blue-button" ></s:reset>
											<s:submit  value="Close" cssClass="blue-button" action="CLOSE" ></s:submit>
										</s:if>
										<s:else>
											<s:submit  value="Update" action="savePaper" cssClass="blue-button" ></s:submit>
											<s:reset  value="Reset" cssClass="blue-button" ></s:reset>
											<s:submit  value="Close" cssClass="blue-button" action="revert" ></s:submit>
										</s:else>
										
										<br class="clear" />
									</td>
								</tr>							
							</table>													
                        </div>
			   </s:div>
				<s:div cssClass="clear"></s:div>
			</s:div>
		</s:div>
	</s:div>
	<s:include value="../UserControler/Footer.jsp"></s:include>
</s:div>
</s:form>
</body>
<SCRIPT type="text/javascript">
function addNew(){
	var addId=document.getElementById('addShow');
	var subPaperName=document.getElementById('subPaperName');	
	var subPaperShortName=document.getElementById('subPaperShortName');
	if(subPaperName.value !=''){
		if(subPaperShortName.value !=''){
		var oddeven=document.getElementById('oddeven');			
		if(oddeven.value =='even'){
			addId.innerHTML +="<tr class='even' align='left'>"+
								"<td width='5%'>"+uniqueID()+"</td>"+
								"<td width='50%' align='left'>"+subPaperName.value+"<input type='hidden' name='subPaper' value='"+subPaperName.value+"'/></td>"+
								"<td width='45%' align='left'>"+subPaperShortName.value+"<input type='hidden' name='subShortPaper' value='"+subPaperShortName.value+"'/></td>"+																																													
							"</tr>";
			oddeven.value='odd';
		}
		else if(oddeven.value =='odd'){
			addId.innerHTML +="<tr class='odd' align='left'>"+
								"<td width='5%'>"+uniqueID()+"</td>"+
								"<td width='50%' align='left'>"+subPaperName.value+"<input type='hidden' name='subPaper' value='"+subPaperName.value+"'/></td>"+
								"<td width='45%' align='left'>"+subPaperShortName.value+"<input type='hidden' name='subShortPaper' value='"+subPaperShortName.value+"'/></td>"+																																						
							"</tr>";
			oddeven.value='even';
		}
		subPaperName.value ='';
		subPaperShortName.value ='';		
	}
		else
		{
			alert('Enter both sub paper and it\'s short name');
			document.getElementById('subPaperShortName').focus();
		}
	}
	else
	{
		alert('Enter both sub paper and it\'s short name');
		document.getElementById('subPaperName').focus();
	}
		
}
var uniqueID = (function() {
	   var id = 1; 
	   return function() { return id++; };  
	  })();	
</SCRIPT>
</html>