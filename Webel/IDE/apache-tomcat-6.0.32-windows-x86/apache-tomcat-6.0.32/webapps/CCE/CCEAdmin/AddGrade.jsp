<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags"%>
    <%@ taglib prefix="sx" uri="/struts-dojo-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>CCE | <s:if test="(gradeId == null || gradeId.equals('') ||gradeId.equals('-1'))">Add</s:if><s:else>Edit</s:else> Grade(9 point scale)</title>
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
			    <s:hidden name="scale" value="9 point" ></s:hidden>
				</s:div>
				<s:div cssClass="rightside">
						<h1><s:if test="(gradeId == null || gradeId.equals('')||gradeId.equals('-1'))">Add</s:if><s:else>Edit</s:else> Grade(9 point scale)  </h1>
						<div class="form">
							<table >						
								<tr>
									<td colspan="3" align="center"><s:hidden value="%{gradeId}" name="gradeId"/><s:actionerror cssClass="error" /><s:actionmessage cssClass="msg"/> </td>								
								</tr>
								<tr >
									<td style="width: 25%">Lower Marks <em>*</em> :</td>
									<td style="width: 35%"><s:textfield name="txtlowerMarks" id="txtlowerMarks" required="true" key="lowerMarks" value="0" readonly="true"  cssClass="textbox"  ></s:textfield></td>
									<td style="width: 40%"><s:fielderror  fieldName="lowerMarks" theme="simple" cssClass="error" /></td>
								</tr>							
								<tr class="even" >
									<td>Upper Marks <em>*</em> :</td>
									<td><s:textfield name="txtupperMarks" id="txtupperMarks" required="true" key="upperMarks"  cssClass="textbox" onkeypress="return isNumberKey(event)" maxlength="3"></s:textfield></td>
									<td><s:fielderror  fieldName="upperMarks" theme="simple" cssClass="error" /></td>
								</tr>
								<tr >
									<td>Grade<em>*</em> :</td>
									<td><s:textfield name="txtgrade" id="txtgrade" required="true" key="grade" onkeypress="return isAlphaNumeric(event);"  cssClass="textbox" maxlength="3" ></s:textfield></td>
									<td><s:fielderror  fieldName="grade" theme="simple" cssClass="error" /></td>
								</tr>
								<tr class="even">
									<td>Grade Point<em>*</em> :</td>
									<td><s:textfield name="txtgradePoint" id="txtgradePoint" required="true" key="gradePoint"  cssClass="textbox" onkeypress="return isNumberKey(event)" maxlength="2"></s:textfield></td>
									<td><s:fielderror  fieldName="gradePoint" theme="simple" cssClass="error" /><s:hidden name="oddeven" id="oddeven" value="even"></s:hidden><input  value="Add" class="blue-button" style="width: 30px"  name="add" onclick="addNew()" /></td>
								</tr>								
								<tr valign="top">
									<td colspan="3" style="width: 100%">									
										<table cellpadding="0" cellspacing="0" border="1" width="100%" >
											<tr valign="top" align="center">
												<th width="10%">#</th>
												<th width="60%">Marks</th>												
												<th width="20%">Grade</th>
												<th width="10%">Grade Point</th>																																																							
											</tr>
											<tr>
												<td colspan="4" valign="top" width="100%">
													<div style="overflow:auto; height:130px;width:100%;" >
														<table  align="center" border="1" cellpadding="0" cellspacing="0" width="100%">
															<tbody id="addShow"></tbody>										
														</table>
													</div>													
												</td>											
											</tr>																
										</table>								
									</td>																					
								</tr>														
								<tr class="even">
									<td colspan="3">
										<s:if test="(gradeId == null || gradeId.equals('') ||gradeId.equals('-1'))">
											<s:submit  value="Save" cssClass="blue-button" action="save" ></s:submit>
											<s:reset  value="Reset" cssClass="blue-button" ></s:reset>
											<s:submit  value="Close" cssClass="blue-button" action="CLOSE" ></s:submit>
										</s:if>
										<s:else>
											<s:submit  value="Update" action="save" cssClass="blue-button" ></s:submit>
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
	var lowerMarks=document.getElementById('txtlowerMarks');
	var upperMarks=document.getElementById('txtupperMarks');	
	var grade=document.getElementById('txtgrade');	
	var gradePoint=document.getElementById('txtgradePoint');			
	if(lowerMarks.value !='' && upperMarks.value !='' && grade.value !='' &&  gradePoint.value != ''){	
		if(parseInt(lowerMarks.value) <= parseInt(upperMarks.value)){	
		var oddeven=document.getElementById('oddeven');			
			if(oddeven.value =='even'){
				addId.innerHTML +="<tr class='even' align='left'>"+
									"<td width='10%'>"+uniqueID()+"</td>"+
									"<td width='60%' align='center'>"+lowerMarks.value+'-'+upperMarks.value+"<input type='hidden' name='lowerMarks' value='"+lowerMarks.value+"'/><input type='hidden' name='upperMarks' value='"+upperMarks.value+"'/></td>"+																																													
									"<td width='20%' align='center'>"+grade.value+"<input type='hidden' name='grade' value='"+grade.value+"'/></td>"+
									"<td width='10%' align='center'>"+gradePoint.value+"<input type='hidden' name='gradePoint' value='"+gradePoint.value+"'/></td>"+								
								"</tr>";
				oddeven.value='odd';
			}
			else if(oddeven.value =='odd'){
				addId.innerHTML +="<tr class='odd' align='left'>"+
									"<td width='10%'>"+uniqueID()+"</td>"+
									"<td width='60%' align='center'>"+lowerMarks.value+'-'+upperMarks.value+"<input type='hidden' name='lowerMarks' value='"+lowerMarks.value+"'/><input type='hidden' name='upperMarks' value='"+upperMarks.value+"'/></td>"+																																													
									"<td width='20%' align='center'>"+grade.value+"<input type='hidden' name='grade' value='"+grade.value+"'/></td>"+
									"<td width='10%' align='center'>"+gradePoint.value+"<input type='hidden' name='gradePoint' value='"+gradePoint.value+"'/></td>"+																																						
								"</tr>";
				oddeven.value='even';
			}	
			lowerMarks.value = parseInt(upperMarks.value)+1;
			upperMarks.value='';
			grade.value='';	
			gradePoint.value=''
		}	
	}
	
}
var uniqueID = (function() {
	   var id = 1; 
	   return function() { return id++; };  
	  })();	
</SCRIPT>
</html>