<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<link rel="stylesheet" type="text/css" href="<s:url value="../css/reportHeader.css"/>" />	
    <link rel="stylesheet" type="text/css" href="<s:url value="../css/thickbox.css"/>"/>   
    <script type="text/javascript" src="<s:url value="../js/General/jquery-1.3.2.min.js"/>"></script>
    <script type="text/javascript" src="<s:url value="../js/General/thickbox.js"/>"></script>
    <script type="text/javascript" src="<s:url value="../js/General/Validation.js"/>"></script>
    <s:iterator value="reportHeaderList">
	<div align="center">
	
			<span style="font-size:18px; font-weight:bold"><s:property value="secondVal"/> </span><br />
			<span style="font-size:16px; font-weight:bold"><s:property value="thredVal"/> </span><br />
			<!-- <span style="font-size:14px"><s:property value="fourthVal"/>  </span><br />
			<span style="font-size:12px"><b>Contact No.:-</b> <s:property value="fiveVal"/>,<s:property value="sixVal"/>  <b>Email us</b> :- 
            <s:property value="sevenVal"/> </span>  <br />-->
            <SPAN>&nbsp;</SPAN>                     
	</div>
	</s:iterator>     
	<div style="border-bottom: solid;"></div>