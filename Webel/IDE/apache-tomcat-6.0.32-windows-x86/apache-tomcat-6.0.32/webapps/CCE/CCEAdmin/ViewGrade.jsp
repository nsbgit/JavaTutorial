<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" errorPage="../error.jsp"%>
    <%@ taglib prefix="s" uri="/struts-tags"%>
    <%@ taglib prefix="sx" uri="/struts-dojo-tags"%>
     <%@ taglib uri="/WEB-INF/displaytag.tld" prefix="display" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>CCE | View Grade ( <s:property value="scale"/> point scale )</title>
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
						<h1>View Grade ( <s:property value="scale"/> point scale )</h1>																							
						<div class="grid">
						<sx:div theme="ajax">												
						<display:table id="viewDetails"    id="row" export="false"  requestURI="view.html"   name="sessionScope.viewDetails"  class="tablegrid" style="width:100%"    pagesize="10" >
								<display:column property="thredVal" title="Marks" />								
								<display:column property="secondVal" title="Grade" />
								<s:if test="%{scale==9}">
									<display:column property="fourthVal" title="Grade Point" />
								</s:if>	
								<display:column property="fiveVal" title="Created On" />
								<display:column property="sixVal" title="Created By" />																															            								 									
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