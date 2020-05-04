<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags"%>
    <%@ taglib prefix="sx" uri="/struts-dojo-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>CCE | <s:if test="(scholasticMarksID == null || scholasticMarksID.equals('') ||scholasticMarksID.equals('-1'))">Add</s:if><s:else>Edit</s:else>Co-Scholastic Marks</title>
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
						<h1><s:if test="(scholasticMarksID == null || scholasticMarksID.equals('')||scholasticMarksID.equals('-1'))">Add</s:if><s:else>Edit</s:else> Co-Scholastic Marks  </h1>
						<div class="form">
							<table >						
								<tr>
									<td colspan="3" align="center"><s:hidden value="%{scholasticMarksID}" name="scholasticMarksID"/><s:actionerror cssClass="error" /><s:actionmessage cssClass="msg"/> </td>								
								</tr>
							<!-- 	<tr >
									<td style="width: 25%">Standard Category <em>*</em> :</td>
									<td style="width: 35%"><sx:autocompleter    headerKey="" headerValue="Select" list="categoryList" id="category" listKey="firstVal" listValue="secondVal"    name="category" cssClass="combobox" ></sx:autocompleter></td>
									<td style="width: 40%"><s:fielderror  fieldName="category" theme="simple" cssClass="error" /><s:hidden name="categoryText" id="categoryText" /></td>
								</tr>
							 -->		
								<tr  >
									<td>Academic Year<em>*</em> :</td>
									<td><sx:autocompleter    headerKey="" headerValue="Select" list="academicYearList" id="academicYear"   name="academicYear" cssClass="combobox" ></sx:autocompleter></td>
									<td><s:fielderror  fieldName="academicYear" theme="simple" cssClass="error" /></td>
								</tr>							
								<tr class="even">
									<td >Standard<em>*</em> :</td>
									<td ><sx:autocompleter    headerKey="" headerValue="Select"  list="standardList"  listKey="firstVal" listValue="secondVal" id="standard"   name="standard" cssClass="combobox" onchange="javascript:loadNewValue(this.value,'newArea','getArea.html');getSelectText('standardText','standard');"  ></sx:autocompleter></td>
									<td ><s:fielderror  fieldName="standard" theme="simple" cssClass="error" /><s:hidden name="standardText" id="standardText" /></td>
								</tr>
								<tr >
									<td>Area<em>*</em> :</td>
									<td id="newArea"><sx:autocompleter    headerKey="" headerValue="Select" list="{}"  name="area" id="area" cssClass="combobox" onchange="getSelectText('areaText','area')"></sx:autocompleter></td>
									<td ><s:fielderror  fieldName="subject" theme="simple" cssClass="error" /> <s:hidden name="areaText" id="areaText" /></td>
								</tr>	
								<tr class="even">
									<td>Admission No<em>*</em> :</td>
									<td><s:textfield name="adNo" id="adNo" required="true" key="adNo"  cssClass="textbox" maxlength="200" ></s:textfield></td>
									<td><s:fielderror  fieldName="adNo" theme="simple" cssClass="error" /></td>
								</tr>									
								<tr >
									<td colspan="3">									
											<a href="#" id="a" onclick="redirect()"  class="thickbox" >        								
        										<input type="button" value="Marks Report"  class="blue-button " >    
        									</a>          									    										
											<s:reset  value="Reset" cssClass="blue-button" ></s:reset>
											<s:submit  value="Close" cssClass="blue-button" action="CLOSE" ></s:submit>																											
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
	function redirect(){		
		var academicYear=document.getElementById('academicYear').value;
		var standard=document.getElementById('standard').value;
		var standardText=document.getElementById('standardText').value;
		var area=document.getElementById('area').value;
		var areaText=document.getElementById('areaText').value;
		var adNo=document.getElementById('adNo').value;		
		if(academicYear !='' && standard !='' && area !='' && adNo !=''  ){				
				document.getElementById('a').href="marksEntryReport.html?academicYear="+academicYear+"&standard="+standard+"&standardText="+standardText+"&area="+area+"&areaText="+areaText+"&adNo="+adNo+"&keepThis=true&TB_iframe=true&height=550&width=950";						
				return true;
			}
			else
			{	
				alert('Please select all field');				
				return false;
			}
	}
</SCRIPT>
</html>