<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Webdisign</title>
<script type="text/javascript">
function validation() {
	if(document.getElementById('name').value == "") {
		alert('Please enter name');
		document.getElementById('name').focus();
		return false;
	}
}
</script>
</head>
<body>
	<h1 align="center"><font color="#833059">Registration Form</font></h1> <%-- This is for heading of the page --%>
	
	<form action="<%= request.getContextPath()%>/MFS.do" method="post">
	
		<table border="2" width="400px" align="center">
	
			<tr>
		
				<th align="center" colspan="2">Registration</th> 
			</tr>
			
			<tr>
				<td>Name<font color="red">*</font></td>
				<td>
					<input type="text" style="width: 100%" name="name" id="name"> 
				</td>
			</tr>
			
			<tr>
				<td>Address<font color="red">*</font></td>
				<td>
					<textarea rows="5" cols="15" style="width: 100%" name="address" id="address"></textarea> 
				</td>
			</tr>
			
			
			<tr>
				<td>Gender<font color="red">*</font></td>
				<td align="center">
					<input type="radio" name="gender" id="gender" value="male">Male<br> 
					<input type="radio" name="gender" id="gender" value="female">Female
				</td>
			</tr>
			
			<tr>
				<td>Standard<font color="red">*</font></td>
				<td>
					<select style="width: 100%" name="standard" id="standard">
					
						<option value="0">------------------Select--------------------</option>
						
						<option value="1">Standard 1</option>
						<option value="2">Standard 2</option>
						<option value="3">Standard 3</option>
						<option value="4">Standard 4</option>
					</select>
				</td>
			</tr>
			
			<tr>
				<ol>
				<td align="center" colspan="2">
					<li><input type="submit" value="Save" onclick="return validation()"></li>
					<li><input type="reset" value="Reset"></li>
				</td>
				</ol>
			
			</tr>
			
		</table>
	</form>	
</body>
</html>