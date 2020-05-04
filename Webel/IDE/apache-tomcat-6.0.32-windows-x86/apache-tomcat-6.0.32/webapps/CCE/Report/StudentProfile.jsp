<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags"%>
    <%@ taglib prefix="sx" uri="/struts-dojo-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>CCE | Student Profile</title>
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
						<h1>Student Profile </h1>
						<div class="form">
							<table >						
								<tr>
									<td colspan="3" align="center"><s:hidden value="%{scholasticMarksID}" name="scholasticMarksID"/><s:actionerror cssClass="error" /><s:actionmessage cssClass="msg"/> </td>								
								</tr>																
						<!-- 		<tr>
									<td style="width: 25%">Standard Category <em>*</em> :</td>
									<td style="width: 35%"><sx:autocompleter autoComplete="true"   headerKey="" headerValue="Select" list="categoryList" id="category" listKey="firstVal" listValue="secondVal"    name="category" cssClass="combobox" onchange="getSelectText('categoryText','category');"></sx:autocompleter></td>
									<td style="width: 40%"><s:fielderror  fieldName="category" theme="simple" cssClass="error" /><s:hidden name="categoryText" id="categoryText"></s:hidden> </td>
								</tr>
						 -->			
								<tr >
									<td>Academic Year<em>*</em> :</td>
									<td><sx:autocompleter     headerKey="" headerValue="Select" list="academicYearList" id="academicYear"   name="academicYear" cssClass="combobox" ></sx:autocompleter></td>
									<td><s:fielderror  fieldName="academicYear" theme="simple" cssClass="error" /></td>
								</tr>							
								<tr class="even" >
									<td >Standard<em>*</em> :</td>
									<td ><sx:autocompleter     headerKey="" headerValue="Select" list="standardList"  listKey="firstVal" listValue="secondVal" id="standard"    name="standard" cssClass="combobox"  ></sx:autocompleter></td>
									<td ><s:fielderror  fieldName="standard" theme="simple" cssClass="error" /><s:hidden name="standardText" id="standardText" /> </td>
								</tr>								
								<tr >
									<td>Admission No.<em>*</em> :</td>
									<td><s:textfield name="admissionNo" required="true" key="admissionNo" id="admissionNo" cssClass="textbox" maxlength="200" ></s:textfield></td>
									<td><s:fielderror  fieldName="admissionNo" theme="simple" cssClass="error" /></td>
								</tr>									
								<tr class="even">
									<td colspan="3">									
											<a href="#" id="p" onclick="return redirect('1')" class="thickbox"  >        								
        										<input type="button" value="Profile Report"  class="blue-button " >    
        									</a> 
        									<a href="#" id="sm" onclick="redirect('2')" class="thickbox"  >        								
        										<input type="button" value="Overall Marks(Scholastic)"  class="blue-button " >    
        									</a> 
        							<!-- 		<a href="#" id="cm" onclick="redirect('3')" class="thickbox"  >        								
        										<input type="button" value="Overall Marks(Co-Scholastic)"  class="blue-button " >    
        									</a>
        							 -->		         									         									    										
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
	function redirect(urlT){					
		var academicYear=document.getElementById('academicYear').value;
		var standard=document.getElementById('standard').value;
		var standardText=document.getElementById('standardText').value;		
		var admissionNo=document.getElementById('admissionNo').value;		
			if( academicYear !='' && standard !=''  && admissionNo !=''){
				if(urlT==1){
					var url="profile.html?academicYear="+academicYear+"&standard="+standard+"&standardText="+standardText+"&admissionNo="+admissionNo+"&keepThis=true&TB_iframe=true&height=550&width=800";
					document.getElementById('p').setAttribute("class","thickbox");
					document.getElementById('p').href=	url	;					
				}
				else if(urlT==2){
					var url="SchoOverallMarks.html?academicYear="+academicYear+"&standard="+standard+"&standardText="+standardText+"&admissionNo="+admissionNo+"&keepThis=true&TB_iframe=true&height=550&width=850";
					document.getElementById('sm').className='thickbox';
					document.getElementById('sm').href=	url	;					
				}
				else{
					var url="SchoOverallMarks.html?academicYear="+academicYear+"&standard="+standard+"&standardText="+standardText+"&admissionNo="+admissionNo+"&keepThis=true&TB_iframe=true&height=550&width=850";
					document.getElementById('cm').className='thickbox';
					document.getElementById('cm').href=	url	;	
				}						
								
				return true;
			}
			else
			{	
				alert('Please select all field');
				document.getElementById('p').className="";				
				return false;
			}
	}
	
</SCRIPT>
</html>