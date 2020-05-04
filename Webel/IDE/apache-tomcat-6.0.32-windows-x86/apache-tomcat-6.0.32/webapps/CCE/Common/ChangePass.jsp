<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags"%>
    <%@ taglib prefix="sx" uri="/struts-dojo-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>CCE | Change Password </title>	    
</head>
<body>	
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
						<h1>Change Password</h1>
						<div class="form">
						<s:form    theme="simple" action="saveChangePass" method="post" validate="true" enctype="multipart/form-data">
							<table >
								<tr>
									<td colspan="3" align="center"><s:fielderror cssClass="error" /><s:actionmessage cssClass="msg"/> </td>								
								</tr>								
								<tr>
									<td style="width: 25%">Old Password  :</td>
									<td style="width: 35%"><s:password name="oldPass" required="true" key="oldPass"  cssClass="textbox" maxlength="200"></s:password> </td>
									<td style="width: 40%">&nbsp;</td>
								</tr>	
								<tr class="even">
									<td>New Password  :</td>
									<td><s:password name="newPass" id="newPass" onblur="chkPasswordMatch()"  required="true" key="newPass"  cssClass="textbox" maxlength="200"></s:password> </td>
									<td>&nbsp;</td>
								</tr>	
								<tr>
									<td>Confirm Password  :</td>
									<td><s:password name="confPass" id="confPass"  onblur="chkPasswordMatch()" required="true" key="confPass"  cssClass="textbox" maxlength="200"></s:password> </td>
									<td><SPAN id="passMsg"> <s:fielderror  fieldName="originalPass" theme="simple" cssClass="error" /></SPAN><s:hidden name="originalPass" id="originalPass"></s:hidden> </td>
								</tr>																											
								<tr class="even">
									<td colspan="3">
										<s:submit  value="Save"  cssClass="blue-button" ></s:submit>
										<s:reset  value="Reset" cssClass="blue-button" ></s:reset>
										<s:submit  value="Close" cssClass="blue-button" action="revert" ></s:submit>
										<br class="clear" />
									</td>
								</tr>
							</table>
						</s:form>							
                      </div>
			   		</s:div>
				<s:div cssClass="clear"></s:div>
			</s:div>
		</s:div>
	</s:div>
	<s:include value="../UserControler/Footer.jsp"></s:include>
</s:div>
<SCRIPT type="text/javascript">
	function chkPasswordMatch(){
		var pass=document.getElementById('newPass');
		var cofPass=document.getElementById('confPass');
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
</body> 
</html>