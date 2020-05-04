<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags"%>
    <%@ taglib prefix="sx" uri="/struts-dojo-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>CCE | <s:if test="status.equals('insert')">Add</s:if><s:else>View</s:else> Scholastic Marks</title>
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
						<h1><s:if test="status.equals('insert')">Add</s:if><s:else>View</s:else> Scholastic Marks  </h1>
						<div class="form">
							<table >						
								<tr>
									<td colspan="3" align="center"><s:hidden value="%{scholasticMarksID}" name="scholasticMarksID"/><s:actionerror cssClass="error" /><s:actionmessage cssClass="msg"/> </td>								
								</tr>							
								<tr >
									<td>Academic Year<em>*</em> :</td>
									<td><sx:autocompleter    headerKey="" headerValue="Select" list="academicYearList" id="academicYear"   name="academicYear" cssClass="combobox" onchange="loadNewValue(this.value,'newStand','standardBind.html')"></sx:autocompleter></td>
									<td><s:fielderror  fieldName="academicYear" theme="simple" cssClass="error" /></td>
								</tr>							
								<tr class="even"  >
									<td >Standard<em>*</em> :</td>
									<td id="newStand" ><sx:autocompleter    headerKey="" headerValue="Select" list="{}"   id="standard"   name="standard" cssClass="combobox" onchange="loadNewValueFor2(this.value,document.getElementById('academicYear').value,'newSubject','subjectBind.html')" ></sx:autocompleter></td>
									<td ><s:fielderror  fieldName="standard" theme="simple" cssClass="error" /></td>
								</tr>
								<tr >
									<td>Subject<em>*</em> :</td>
									<td id="newSubject"><sx:autocompleter    headerKey="" headerValue="Select" list="{}"  name="subject" id="subject" cssClass="combobox"></sx:autocompleter></td>
									<td ><s:fielderror  fieldName="subject" theme="simple" cssClass="error" /> </td>
								</tr>	
								<tr class="even">
									<td>Exam Type<em>*</em> :</td>
									<td><sx:autocompleter    headerKey="" headerValue="Select" list="examTypeList"  listKey="firstVal" listValue="secondVal" onchange="javascript:loadNewValue(this.value,'newExamName','examNameBind.html')" name="examType" id="examType" cssClass="combobox"></sx:autocompleter></td>
									<td><s:fielderror  fieldName="examType" theme="simple" cssClass="error" /></td>
								</tr>	
								<tr >
									<td>Exam Name<em>*</em> :</td>
									<td id="newExamName"  ><sx:autocompleter    headerKey="" headerValue="Select" list="{}"   name="examName" id="examName" cssClass="combobox"></sx:autocompleter></td>
									<td><s:fielderror  fieldName="examName" theme="simple" cssClass="error" /></td>
								</tr>	
								<tr class="even">
									<td colspan="3">									
											<a href="#" id="a" onclick="redirect('<s:property value="status"/>' )"  class="thickbox" >        								
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
	function redirect(type){		
		var academicYear=document.getElementById('academicYear').value;
		var standard=document.getElementById('standard').value;
		var subject=document.getElementById('subject').value;
		var examType=document.getElementById('examType').value;
		var examName=document.getElementById('examName').value;
			if(academicYear !='' && standard !='' && subject !='' && examType !='' && examName !=''){
				
				if(type=='insert')				
					document.getElementById('a').href="marksEntry.html?academicYear="+academicYear+"&standard="+standard+"&subject="+subject+"&examType="+examType+"&examName="+examName+"&keepThis=true&TB_iframe=true&height=550&width=950";
				else
					document.getElementById('a').href="marksEdit.html?academicYear="+academicYear+"&standard="+standard+"&subject="+subject+"&examType="+examType+"&examName="+examName+"&keepThis=true&TB_iframe=true&height=550&width=950";						
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