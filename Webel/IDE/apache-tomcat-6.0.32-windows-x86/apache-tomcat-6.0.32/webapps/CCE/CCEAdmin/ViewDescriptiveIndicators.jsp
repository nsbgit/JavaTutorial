<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" errorPage="../error.jsp"%>
    <%@ taglib prefix="s" uri="/struts-tags"%>
    <%@ taglib prefix="sx" uri="/struts-dojo-tags"%>
     <%@ taglib uri="/WEB-INF/displaytag.tld" prefix="display" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>CCE | View Descriptive Indicators</title>
<sx:head/>
</head>
<body>
	<s:form      method="post" validate="true"> 
	<sx:div >
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
						<h1>View Descriptive Indicators</h1>
						<div class="search">						
						<table style="width:auto; margin:0 auto">
                           <tr id="msgEmp"><td colspan="3" align="center"></td></tr>
							<tr >
								<td style="width:60px"><span>&nbsp;</span></td>
								<td style="padding-right:20px;"><s:textfield cssStyle="textAlign:center" value="Enter Searching Keyword Here" id="searchKey" name="searchingKey" cssClass="fed" onfocus="searchingBlank(this.id)" onblur="searchingFill(this.id)"></s:textfield>                                                                       </td>
								<td><s:submit value="Search"   name="search" cssClass="blue-button" action="search" ></s:submit></td>
						   </tr>                                                     
						</table>
												
						</div>																		
						<div class="grid">
						<sx:div theme="ajax">												
						<display:table  id="viewDetails" id="row" export="false"  requestURI="view.html"   name="sessionScope.viewDetails"  class="tablegrid" style="width:100%"    pagesize="10" >
								<display:column property="secondVal" title="Grade" sortable="true"/>
								<display:column property="thredVal" title="Area" sortable="true"/>
								<display:column property="fourthVal" title="Sub Area" sortable="true"/>
								<display:column property="fiveVal" title="Indicator" sortable="true"/>
								<display:column property="sixVal" title="Created On" sortable="true"/>
								<display:column property="sevenVal" title="Created By" sortable="true"/>								
								<display:column   title="Option"     sortable="false"  >																 	
        							<a href="edit.html?descIndicatorID=${row.firstVal}" onmouseover="window.status='false'">
        								<img src="../images/edit.png" alt="Edit" title="Edit"/>
        							</a> 
        							<a href="show.html?descIndicatorID=${row.firstVal}">
        								<img src="../images/view.png" alt="Delete" title="View"/>
        							</a>
        							<a href="delete.html?descIndicatorID=${row.firstVal}" >
        								<img src="../images/delete.png" alt="Delete" title="Delete" onclick="return delConfirm()"/>
        							</a>             							        							   																	 									 									 										 									 
								</display:column>																            								 										
					 </display:table>
					<div>&nbsp;</div>
					<div align="center"><s:submit value="Close" action="CLOSE" cssClass="blue-button" ></s:submit></div>
					</sx:div>
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