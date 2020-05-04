<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" errorPage="../error.jsp"%>
    <%@ taglib prefix="s" uri="/struts-tags"%>
    <%@ taglib prefix="sx" uri="/struts-dojo-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>CCE | <s:if test="(studentId == null || studentId.equals('') ||studentId.equals('-1'))">Add</s:if><s:else>Edit</s:else> Student </title>	    
</head>
<body>
	<s:form     method="post" validate="true" enctype="multipart/form-data">
	<sx:div theme="ajax">
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
						<h1><s:if test="(studentId == null || studentId.equals('') ||studentId.equals('-1'))">Add</s:if><s:else>Edit</s:else> Student</h1>
						<div class="form">
						<table >
							<tr>
								<td colspan="3" align="center"><s:hidden  name="studentId" id="studentId"/>
								<s:hidden name="hiddStandard" id="hiddStandard"></s:hidden>
									<s:hidden name="hiddAdmYear" id="hiddAdmYear" ></s:hidden>
								<s:actionerror cssClass="error" /><s:actionmessage cssClass="msg"/> </td>								
							</tr>
							<tr>
								<td style="width: 25%">Student Name <em>*</em> : </td>
								<td style="width: 35%"><s:textfield  name="studentName"  required="true" key="studentName" maxlength="500" cssClass="textbox" ></s:textfield></td>
								<td style="width: 40%"><s:fielderror  fieldName="studentName" theme="simple" cssClass="error" /></td>
							</tr>
							<tr class="even">
								<td>Admission Year <em>*</em> : </td>
								<td>
									<s:if test="(promoteStatus.equals('NO'))">
									<s:hidden id="admissionYear" name="admissionYear"></s:hidden>
										<sx:autocompleter disabled="true"   headerKey="" headerValue="Select" list="admissionYearList" id="admissionYear"    name="admissionYear" cssClass="combobox" onchange="loadNewValueFor3(document.getElementById('standard').value,this.value,'admNo','admNoBind.html')"></sx:autocompleter>
									</s:if>
									<s:else>
									
										<sx:autocompleter   headerKey="" headerValue="Select" list="admissionYearList" id="admissionYear"    name="admissionYear" cssClass="combobox" onchange="loadNewValueFor3(document.getElementById('standard').value,this.value,document.getElementById('hiddAdmYear').value,document.getElementById('hiddStandard').value,document.getElementById('studentId').value,'admNo','admNoBind.html')"></sx:autocompleter>
									</s:else>
									
								</td>
								<td><s:fielderror  fieldName="admissionYear" theme="simple" cssClass="error" /></td>
							</tr>
							<tr>
								<td>Standard <em>*</em> :</td>
								<td>
									<s:if test="(promoteStatus.equals('NO'))">
										<s:hidden id="standard" name="standard"></s:hidden>
										<sx:autocompleter disabled="true"   headerKey="" headerValue="Select" list="standardList"  listKey="firstVal" listValue="secondVal"  name="standard" id="standard"  cssClass="combobox" onchange="loadNewValueFor3(this.value,document.getElementById('admissionYear').value,'admNo','admNoBind.html')"></sx:autocompleter>
									</s:if>
									<s:else>
										<sx:autocompleter    headerKey="" headerValue="Select" list="standardList"  listKey="firstVal" listValue="secondVal"  name="standard" id="standard"  cssClass="combobox" onchange="loadNewValueFor3(this.value,document.getElementById('admissionYear').value,document.getElementById('hiddAdmYear').value,document.getElementById('hiddStandard').value,document.getElementById('studentId').value,'admNo','admNoBind.html')"></sx:autocompleter>
									</s:else>
									</td>
								<td><s:fielderror  fieldName="standard" theme="simple" cssClass="error" /></td>
							</tr>
							<tr class="even">
								<td>Admission No <em>*</em> : </td>
								<td id="admNo">
									<s:if test="(promoteStatus.equals('NO'))">
										<s:textfield readonly="true"  name="admissionNo"  required="true" key="admissionNo" cssClass="textbox" maxlength="500" ></s:textfield>
									</s:if>
									<s:else>
										<s:textfield readonly="true"  name="admissionNo"  required="true" key="admissionNo" cssClass="textbox" maxlength="500" ></s:textfield>
									</s:else>
									</td>
									
								<td><s:fielderror  fieldName="admissionNo" theme="simple" cssClass="error" /></td>
							</tr>
							
							<tr>
								<td>Religion  <em>*</em> :</td>
								<td><sx:autocompleter    headerKey="" headerValue="Select" list="{'Buddhism','Christians','Hinduism','Islam','Jainism','Sikhism','Zoroastrian','Guru Nanak Dev','Lord Mahavira','Adi Shankaracharya'}"   name="religion" cssClass="combobox"></sx:autocompleter> </td>
								<td><s:fielderror  fieldName="religion"   theme="simple" cssClass="error" /></td>
							</tr>
							<tr class="even">
								<td>Category <em>*</em> :</td>
								<td><sx:autocompleter    headerKey="" headerValue="Select" list="{'Genral','OBC','SC','ST','Others'}"    name="category" cssClass="combobox"></sx:autocompleter></td>
								<td><s:fielderror  fieldName="category" theme="simple" cssClass="error" /></td>
							</tr>
							<tr>
								<td>Rural/Urban <em>*</em> :</td>
								<td><sx:autocompleter    headerKey="" headerValue="Select" list="{'Rural','Urban'}"    name="ruralUrban" cssClass="combobox"></sx:autocompleter></td>
								<td><s:fielderror  fieldName="ruralUrban" theme="simple" cssClass="error" /></td>
							</tr>
							<tr class="even">
								<td>House <em>*</em> :</td>
								<td><sx:autocompleter    headerKey="" headerValue="Select" list="houseList" listKey="firstVal" listValue="secondVal"    name="house" cssClass="combobox"></sx:autocompleter></td>
								<td><s:fielderror  fieldName="house" theme="simple" cssClass="error" /></td>
							</tr>
							<tr >
								<td>Gender <em>*</em>  :</td>
								<td><s:radio list="#{'1':'Male','2':'Female'}" name="gender" value="1" ></s:radio> </td>
								<td><s:fielderror  fieldName="gender" theme="simple" cssClass="error" /></td>
							</tr>
							<tr class="even">
								<td>Date Of Birth <em>*</em> :</td>
								<td><s:textfield     onfocus="showCalendarControl(this);" name="dob" key="registrationDate" cssClass="textbox"  ></s:textfield></td>
								<td><s:fielderror  fieldName="dob" theme="simple" cssClass="error" /></td>
							</tr>
							<tr >
								<td>CBSE Registration No  :</td>
								<td><s:textfield name="registrationNo" key="registrationNo" cssClass="textbox" ></s:textfield></td>
								<td>(For Class IX)</td>
							</tr>
							<tr class="even">
								<td>Blood Group  <em>*</em>  :</td>
								<td><sx:autocompleter    headerKey="" headerValue="Select" list="{'O-','O+','A-','A+','B-','B+','AB-','AB+'}"    name="bloodGroup" cssClass="combobox"></sx:autocompleter></td>
								<td><s:fielderror  fieldName="bloodGroup" theme="simple" cssClass="error" /></td>
							</tr>
							<tr >
								<td>Identification Marks :</td>
								<td><s:textarea name="identificationMarks" key="identificationMarks" cssClass="textbox" ></s:textarea></td>
								<td>&nbsp;</td>
							</tr >	
							<tr class="even">
								<td>Hobbies &amp; Interests :</td>
								<td><s:textarea name="hobbies" key="hobbies" cssClass="textbox" ></s:textarea></td>
								<td>&nbsp;</td>
							</tr >	
							<tr  >
								<td>Goal  :</td>
								<td><s:textarea name="goal" key="goal" cssClass="textbox" ></s:textarea></td>
								<td>&nbsp;</td>
							</tr>
							<tr class="even">
								<td>Strengths  :</td>
								<td><s:textarea name="strengths" key="strengths" cssClass="textbox" ></s:textarea></td>
								<td>&nbsp;</td>
							</tr>																	
							<tr class="even">
								<td>Photo  :</td>
								<td><s:file name="studentPhoto" key="studentPhoto" size="43px" accept="image/jpeg" cssClass="textbox" ></s:file></td>
								<td>&nbsp;</td>
							</tr>																											
							<tr class="even">
								<td colspan="3">
								<s:if test="(studentId == null || studentId.equals('') ||studentId.equals('-1'))">
										<s:submit  value="Save & Next" cssClass="blue-button" action="saveStudent" ></s:submit>
									</s:if>
									<s:else>
										<s:submit  value="Update" action="saveStudent" cssClass="blue-button" ></s:submit>
									</s:else>									
								<s:reset  value="Reset" cssClass="blue-button" ></s:reset>
								<s:submit  value="Close" action="CLOSE" cssClass="blue-button" action="revert"></s:submit>
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
</sx:div>
</s:form>
</body> 
</html>