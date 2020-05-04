<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags"%>
    <%@ taglib prefix="sx" uri="/struts-dojo-tags"%>
     <%@ taglib uri="/WEB-INF/displaytag.tld" prefix="display" %>
     
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script type="text/javascript" src="<s:url value="../js/General/Validation.js"/>"></script>
<link rel="stylesheet" type="text/css" href="<s:url value="../css/style.css"/>" />
<title>&nbsp;&nbsp;&nbsp;&nbsp;CCE | View Scholastics Marks</title>
<sx:head/>
</head>
<body>
	<s:form method="post" validate="true"> 
	<sx:div >
	<s:div>
	 <s:div cssClass="main1" >    	
	    </s:div>	  
						<h1>View Scholastics Marks</h1>
						<div class="search">						
						<table style="width:auto; margin:0 auto">
                           <tr id="msgEmp"><td colspan="3" align="center"></td></tr>
							<tr >
								<td style="width:60px"><span>&nbsp;</span></td>
								<td style="padding-right:20px;"><s:textfield cssStyle="textAlign:center" value="Enter Searching Keyword Here" id="searchKey" name="searchingKey" cssClass="fed" onfocus="searchingBlank(this.id)" onblur="searchingFill(this.id)"></s:textfield>                                                                       </td>
								<td><s:submit value="Search"   name="search" cssClass="blue-button" action="search" ></s:submit></td>
								<s:hidden name="standard" ></s:hidden>
								<s:hidden name="examType"></s:hidden>
								<s:hidden name="examName"></s:hidden>
								<s:hidden name="subject"></s:hidden>
								<s:hidden name="academicYear"></s:hidden>
						   </tr>                                                     
						</table>
												
						</div>																		
						<div class="grid">
						<sx:div theme="ajax">												
						<display:table id="viewDetails"    id="row" export="false"  requestURI="marksEdit.html"   name="sessionScope.viewDetails"  class="tablegrid" style="width:100%"    pagesize="10" >
								<display:column property="secondVal" title="Name" sortable="true"/>
								<display:column property="thredVal" title="Standard" sortable="true"/>
								<display:column property="fourthVal" title="Total" sortable="true"/>
								<display:column property="fiveVal" title="Created On" sortable="true"/>
								<display:column property="sixVal" title="Created By" sortable="true"/>															
								<display:column   title="Option"     sortable="false"  >																 	
        							<a href="edit.html?typeId=${row.firstVal}" onmouseover="window.status='false'">
        								<img src="../images/edit.png" alt="Edit" title="Edit"/>
        							</a> 
        							<a href="show.html?typeId=${row.firstVal}">
        								<img src="../images/view.png" alt="Delete" title="View"/>
        							</a>
        							<a href="delete.html?typeId=${row.firstVal}" >
        								<img src="../images/delete.png" alt="Delete" title="Delete" onclick="return delConfirm()"/>
        							</a>             							        							   																	 									 									 										 									 
								 </display:column>																            								 										
					</display:table>
					<div>&nbsp;</div>
					<div align="center"></div>
					</sx:div>
                        </div>
                        
			   </s:div>
				<s:div cssClass="clear"></s:div>
	
</sx:div>
</s:form>
</body>

</html>