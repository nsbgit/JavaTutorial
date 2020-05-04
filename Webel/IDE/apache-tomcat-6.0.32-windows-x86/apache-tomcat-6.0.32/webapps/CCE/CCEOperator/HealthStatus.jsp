<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags"%>
    <%@ taglib prefix="sx" uri="/struts-dojo-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>CCE | Add Health Status</title>
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
						<h1>Add Health Status</h1>
						<div style="width: 100%">
							<s:hidden value="%{scholasticMarksID}" name="scholasticMarksID"/>
							<s:actionerror cssClass="error" />
							<s:actionmessage cssClass="msg"/>
						</div>
						<div class="form">
							<table >																																			
								<tr  >
									<td >Standard<em>*</em> :</td>
									<td ><sx:autocompleter    headerKey="" headerValue="Select" list="standardList"  listKey="firstVal" listValue="secondVal" id="standard"   name="standard" cssClass="combobox"  ></sx:autocompleter></td>
									<td ><s:fielderror  fieldName="standard" theme="simple" cssClass="error" /></td>
								</tr>								
								<tr >
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
		var standard=document.getElementById('standard').value;		
			if(standard !=''){				
				document.getElementById('a').href="healthEntryForm.html?standard="+standard+"&keepThis=true&TB_iframe=true&height=550&width=950";						
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