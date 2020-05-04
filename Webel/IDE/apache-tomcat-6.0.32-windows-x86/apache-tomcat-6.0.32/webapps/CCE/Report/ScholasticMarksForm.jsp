<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags"%>
    <%@ taglib prefix="sx" uri="/struts-dojo-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>CCE | Scholastic Marks Form</title>
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
						<h1>Scholastic Marks Form </h1>
						<div class="form">
							<table >						
								<tr>
									<td colspan="3" align="center"><s:hidden value="%{scholasticMarksID}" name="scholasticMarksID"/><s:actionerror cssClass="error" /><s:actionmessage cssClass="msg"/> </td>								
								</tr>
							<!-- 	<tr >
									<td style="width: 25%">Standard Category <em>*</em> :</td>
									<td style="width: 35%"><sx:autocompleter    headerKey="" headerValue="Select" list="categoryList" id="category" listKey="firstVal" listValue="secondVal"    name="category" cssClass="combobox"></sx:autocompleter></td>
									<td style="width: 40%"><s:fielderror  fieldName="category" theme="simple" cssClass="error" /></td>
								</tr>
							 -->		
								<tr >
									<td>Academic Year<em>*</em> :</td>
									<td><sx:autocompleter    headerKey="" headerValue="Select" list="academicYearList" id="academicYear"   name="academicYear" cssClass="combobox" onchange="loadNewValue(this.value,'newStand','standardBind.html')"></sx:autocompleter></td>
									<td><s:fielderror  fieldName="academicYear" theme="simple" cssClass="error" /></td>
								</tr>							
								<tr  class="even" >
									<td >Standard<em>*</em> :</td>
									<td id="newStand"><sx:autocompleter    headerKey="" headerValue="Select" list="{}"  id="standard"    name="standard" cssClass="combobox" onchange="getSelectText('standardText','standard');loadNewValueFor2(this.value,document.getElementById('academicYear').value,'newSubject','subjectBind.html')" ></sx:autocompleter></td>
									<td ><s:fielderror  fieldName="standard" theme="simple" cssClass="error" /><s:hidden name="standardText" id="standardText" /> </td>
								</tr>
								<tr>
									<td>Subject<em>*</em> :</td>
									<td id="newSubject"><sx:autocompleter    headerKey="" headerValue="Select" list="{}"  name="subject" id="subject" cssClass="combobox"></sx:autocompleter></td>
									<td ><s:fielderror  fieldName="subject" theme="simple" cssClass="error" /><s:hidden name="subjectText" id="subjectText"></s:hidden> </td>
								</tr>	
								<tr  class="even" >
									<td>Exam Type<em>*</em> :</td>
									<td><sx:autocompleter    headerKey="" headerValue="Select" list="examTypeList"  listKey="firstVal" listValue="secondVal" onchange="javascript:getSelectText('examTypeText','examType');loadNewValue(this.value,'newExamName','examNameBind.html')" name="examType" id="examType" cssClass="combobox"></sx:autocompleter></td>
									<td><s:fielderror  fieldName="examType" theme="simple" cssClass="error" /><s:hidden name="examTypeText" id="examTypeText" ></s:hidden></td>
								</tr>	
								<tr >
									<td>Exam Name<em>*</em> :</td>
									<td id="newExamName"  ><sx:autocompleter    headerKey="" headerValue="Select" list="{}"   name="examName" id="examName" cssClass="combobox"></sx:autocompleter></td>
									<td><s:fielderror  fieldName="examName" theme="simple" cssClass="error" /> <s:hidden name="examNameText" id="examNameText"></s:hidden> </td>
								</tr>	
								<tr class="even">
									<td colspan="3">									
											<a href="#" id="a" onclick="redirect()"  class="thickbox" >        								
        										<input type="button" value="Search"  class="blue-button " >    
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
		var subject=document.getElementById('subject').value;
		var subjectText=document.getElementById('subjectText').value;
		var examType=document.getElementById('examType').value;
		var examTypeText=document.getElementById('examTypeText').value;
		var examName=document.getElementById('examName').value;
		var examNameText=document.getElementById('examNameText').value;
			if(academicYear !='' && standard !='' && subject !='' && examType !='' && examName !=''){
				var url="marksForm.html?academicYear="+academicYear+"&standard="+standard+"&standardText="+standardText+"&subject="+subject+"&subjectText="+subjectText+"&examTypeText="+examTypeText+"&examNameText="+examNameText+"&keepThis=true&TB_iframe=true&height=550&width=950";				
				document.getElementById('a').href=	url	;				
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