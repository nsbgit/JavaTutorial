<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" errorPage="error.jsp"%>
    <%@ taglib prefix="s" uri="/struts-tags"%>
    <%@ page language="java"  import="java.util.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">	
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>CCE | Home</title>			
</head>
<body>
	<s:form theme="simple" action="" method="post">
	<s:div>
	<s:div>
	 <s:div cssClass="main1" >
    	<s:include value="/UserControler/Header.jsp"></s:include>
	</s:div>
	   <s:div cssClass="container">
		<s:div cssClass="container1">
			<s:div cssClass="wrapper">
			    <s:include value="/UserControler/LeftPanel.jsp"></s:include>
				</s:div>
				<s:div cssClass="rightside">
						<h1>Home</h1>
						<img src="../images/home.jpg" width="100%"></img>
         				<s:div cssClass="dashboardbody">
         				<ul class="icons">
							<li>This is a dummy software</li>
							<li>If any problem occurs please contact - </li>
							<li>Email: aritra@aimpl.co.in</li>
							<li>Mob: 09339898949</li>
						</ul>
                        <s:div cssClass="clear"></s:div>
					</s:div>
			   </s:div>
				<s:div cssClass="clear"></s:div>
			</s:div>
		</s:div>
	</s:div>
	<s:include value="/UserControler/Footer.jsp"></s:include>
</s:div>
</s:form>
</body>
</html>