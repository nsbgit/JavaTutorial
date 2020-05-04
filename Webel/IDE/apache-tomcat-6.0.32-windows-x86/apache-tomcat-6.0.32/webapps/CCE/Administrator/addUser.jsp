<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags"%> 
     <%@ taglib prefix="sx" uri="/struts-dojo-tags"%>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>CCE | <s:if test="(uid == null || uid.equals('')||uid.equals('-1'))">Add</s:if><s:else>Edit</s:else> User</title> 
</head>
<body>
	<s:form   method="post" validate="true" >
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
							<h1><s:if test="(uid == null || uid.equals('')||uid.equals('-1'))">Add</s:if><s:else>Edit</s:else> User  </h1>
							<div class="form">
						<table >
						<tr>
								<td colspan="3" align="center"><s:hidden value="%{uid}" name="uid"/><s:actionerror cssClass="error" /><s:actionmessage cssClass="msg"/> </td>								
							</tr>
					<s:if test="(uid == null || uid.equals('')||uid.equals('-1'))">		
						<tr>
							<td colspan="3"><b>Set up your account</b></td>
						</tr>
							<tr >
								<td style="width: 25%">User Id <em>*</em> :</td>
								<td style="width: 35%"><s:textfield name="userId" id="userId" onkeydown="progressBar()"   key="userId" cssClass="textbox" tabindex="1" onblur="loadNewValue(this.value,'msg','emailCheck.html');hideprogressBar();"></s:textfield></td>
								<td style="width: 40%"><SPAN id="msg"><s:hidden name="originalUserId" id="oUserId"></s:hidden><s:fielderror  fieldName="originalUserId" theme="simple" cssClass="error" /> </SPAN> </td>
							</tr>
							<tr >
								<td>Create Password <em>*</em>  :</td>
								<td><s:password name="password" onblur="chkPasswordMatch()" key="password" id="password" cssClass="textbox" tabindex="2"></s:password></td>
								<td>&nbsp;</td>
							</tr>
							<tr >
								<td>Confirm Password  <em>*</em>  :</td>
								<td><s:password name="confPassword" key="confPassword" onblur="chkPasswordMatch()" id="confPassword" cssClass="textbox" tabindex="3"></s:password></td>
								<td><SPAN id="passMsg"> <s:fielderror  fieldName="originalPass" theme="simple" cssClass="error" /></SPAN><s:hidden name="originalPass" id="originalPass"></s:hidden> </td>
							</tr>	
							</s:if>
							<s:else>
							<tr>
								<td colspan="3"><b>Set up your account</b></td>
							</tr>
							<tr >
								<td style="width: 25%">User Id <em>*</em> :</td>
								<td style="width: 35%"><s:hidden name="userId" id="userId" onkeydown="progressBar()"   key="userId" cssClass="textbox" tabindex="1" ></s:hidden ><s:property value="userId"/> </td>
								<td style="width: 40%">&nbsp; </td>
							</tr>
							<tr >
								<td></td>
								<td>
									<s:hidden name="password" onblur="chkPasswordMatch()" key="password" id="password" cssClass="textbox" tabindex="2"></s:hidden>
									<s:hidden name="originalPass" id="originalPass"></s:hidden>									
								</td>
								<td>&nbsp;</td>
							</tr>							
							</s:else>
							<tr class="even">
							<td colspan="3"><b>Personal Details</b></td>
						</tr>						
							<tr class="even">
								<td >First Name <em>*</em> : </td>
								<td ><s:textfield  name="firstName"  required="true" key="firstName" cssClass="textbox" tabindex="4"></s:textfield></td>
								<td ><s:fielderror  fieldName="firstName" theme="simple" cssClass="error" /></td>
							</tr>
							<tr  class="even">
								<td>Middle Name  : </td>
								<td><s:textfield  name="middleName"  required="true" key="middleName" cssClass="textbox"  tabindex="5"></s:textfield></td>
								<td>&nbsp;</td>
							</tr>
							<tr class="even">
								<td>Last Name <em>*</em> : </td>
								<td><s:textfield  name="lastName"  required="true" key="lastName" cssClass="textbox" ></s:textfield></td>
								<td><s:fielderror  fieldName="lastName" theme="simple" cssClass="error" /></td>
							</tr>																					
							<tr class="even">
								<td>Address<em>*</em> :</td>
								<td><s:textarea  name="address" key="address" cssClass="textbox"></s:textarea></td>
								<td><s:fielderror  fieldName="address" theme="simple" cssClass="error" /></td>
							</tr>
							<tr class="even" >
								<td>City <em>*</em> :</td>
								<td><s:textfield name="city" key="city" cssClass="textbox"></s:textfield></td>
								<td><s:fielderror  fieldName="city" theme="simple" cssClass="error" /></td>
							</tr>
							<tr class="even">
								<td>State <em>*</em> :</td>
								<td><sx:autocompleter    headerKey=""  headerValue="Select" list="stateList" onchange="loadNewValue(this.value,'distNew','distBind.html')" listKey="firstVal" listValue="secondVal" name="state" cssClass="combobox"  ></sx:autocompleter></td>
								<td><s:fielderror  fieldName="state"   theme="simple" cssClass="error" /></td>
							</tr>
							<tr class="even">
								<td>District <em>*</em> :</td>
								<td><div id="distNew"><sx:autocompleter id="dist"   headerKey="-1" list="districtList" headerValue="Select" name="district" listKey="firstVal" listValue="secondVal"  cssClass="combobox"></sx:autocompleter></div></td>
								<td><s:fielderror  fieldName="district" theme="simple" cssClass="error" /></td>
							</tr>
							<tr class="even">
								<td>Pin Code <em>*</em> :</td>
								<td><s:textfield name="pinCode" key="pinCode" cssClass="textbox" onkeypress="return isNumberKey(event)" maxlength="6"></s:textfield></td>
								<td><s:fielderror  fieldName="pinCode" theme="simple" cssClass="error" /></td>
							</tr>
							<tr class="even">
								<td>Country <em>*</em> :</td>
								<td><s:textfield name="country" key="country" cssClass="textbox"></s:textfield></td>
								<td><s:fielderror  fieldName="country" theme="simple" cssClass="error" /></td>
							</tr>
							
							<tr class="even">
								<td>Phone No. <em>*</em> :</td>
								<td><s:textfield name="phoneNo" key="phoneNo" cssClass="textbox" onkeypress="return isNumberKey(event)" maxlength="11"></s:textfield></td>
								<td><s:fielderror  fieldName="phoneNo" theme="simple" cssClass="error" /></td>
							</tr>
							<tr class="even">
								<td>Alternative Phone No.  :</td>
								<td><s:textfield name="alternativePhNo" key="alternativePhNo" cssClass="textbox" onkeypress="return isNumberKey(event)" maxlength="11"></s:textfield></td>
								<td><s:fielderror  fieldName="alternativePhNo" theme="simple" cssClass="error" /></td>
							</tr>
							<tr class="even">
								<td>Email Id  :</td>
								<td><s:textfield name="emailId" key="emailId" cssClass="textbox" onblur="return checkEmail(this)"></s:textfield></td>
								<td><s:fielderror  fieldName="emailId" theme="simple" cssClass="error" /></td>
							</tr>																							
							<!--  <tr class="even">
								<td>Image  :</td>
								<td><s:hidden name="userImage" /><s:file name="userImage" key="userImage" accept="image/jpeg" cssClass="textbox"  size="43"></s:file></td>
								<td>&nbsp;</td>
							</tr>-->																									
							<tr>
								<td colspan="3">&nbsp;</td>
							</tr>
							<tr>
								<td colspan="3">
								<s:if test="(uid == null || uid.equals('') ||uid.equals('-1'))">
										<s:submit  value="Save" cssClass="blue-button" action="saveUser" ></s:submit>
									</s:if>
									<s:else>
										<s:submit  value="Update" action="saveUser" cssClass="blue-button" ></s:submit>
									</s:else>									
								<s:reset  value="Reset" cssClass="blue-button" ></s:reset>
								<s:submit  value="Close" action="CLOSE" cssClass="blue-button" ></s:submit>
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
	function progressBar(){
		var iid=document.getElementById('msg');
		iid.innerHTML="<img  src='../images/progressbar.gif'>";
	}
	function hideprogressBar(){
		
		var iid=document.getElementById('msg');
		//alert(iid.value);
		if(document.getElementById('email').value ==''){			
			iid.innerHTML="";
		}
	}
	function chkPasswordMatch(){
		var pass=document.getElementById('password');
		var cofPass=document.getElementById('confPassword');
		var msg=document.getElementById('passMsg');	
		
		if(pass.value !='' && cofPass.value !=''){
			if(pass.value==cofPass.value){
				msg.innerHTML="<img  src='../images/tick.png'>";
				document.getElementById('originalPass').value=pass.value;
			}
			else{
				msg.innerHTML="<img  src='../images/error.png'>";
				document.getElementById('originalPass').value='';
			}		
		}
	}
</SCRIPT>
</html>