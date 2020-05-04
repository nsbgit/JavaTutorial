<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="s" uri="/struts-tags"%>
    <%@ taglib prefix="sx" uri="/struts-dojo-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table width="100%" class="pdfdesign" height="850px">						
								<tr height="10px" class="space">
									<th>Self Awareness</th>
								</tr>						
								<tr valign="top" align="left" class="space">
									<td>My Goals: <s:property value="studentProfile[0][13]" /> </td>
								</tr>
								<tr valign="top" align="left" class="space">
									<td>Strengths: <s:property value="studentProfile[0][14]" /></td>
								</tr>	
								<tr valign="top" align="left" class="space">
									<td>My Interests and Hobbies: <s:property value="studentProfile[0][12]" /></td>
								</tr>	
								<tr valign="top" align="left" class="space">
									<td>Responsibilities Discharged/Exceptional Achievement:</td>
								</tr>																					
						</table>	
</body>
</html>