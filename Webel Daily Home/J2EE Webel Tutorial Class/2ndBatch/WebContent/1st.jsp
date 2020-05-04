<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Webel Tutorial</title>

<script type="text/javascript">
	function validation() {
		if(document.getElementById('name').value == "") {
			alert('Please enter name')
		}
	}
</script>

</head>
<body>
	<form action="#" method="post">
	<%--
	We have to draw or make a table inside form tag because this tag is required to pass the value into SERVLET
	 --%>
		<table border="2" width="400px" align="center">
		<%--
		Table is created into a row and column manner
		 --%>
			<h1 >Registration Form</h1> <%-- This is for heading of the page --%>
			
			<tr>
			<%--
			This tag is used for creation of a new row
			 --%>
				<th align="center" colspan="2">Registration</th> <%-- This tag is used for table header --%>			
			</tr>
			
			<tr>
				<td>Name<font color="red">*</font></td> <%-- This tag is for the new column for a particular row --%>
				<td>
					<input type="text" style="width: 100%" name="name" id="name"> <%-- Syntax for TEXTBOX --%>
				</td>
			</tr>
			
			<tr>
				<td>Address</td>
				<td>
					<textarea rows="5" cols="15" style="width: 100%" name="address" id="address"></textarea> <%-- Syntax for TEXT AREA --%>
				</td>
			</tr>
			
			
			<tr>
				<td>Gender</td>
				<td align="center">
					<input type="radio" checked="checked" name="gender" id="gender" value="male">Male <%-- Syntax for RADIO BUTTON --%>
					<input type="radio" name="gender" id="gender" value="female">Female
				</td>
			</tr>
			
			<tr>
				<td>Standard</td>
				<td>
					<select style="width: 100%">
					<%--
					This tag is used for creation of drop down list but the option will be not created through it.
					 --%>
						<option>------------------Select--------------------</option>
						<%--
						Options will be created by this tag
						 --%>
						<option>Standard 1</option>
						<option>Standard 2</option>
						<option>Standard 3</option>
						<option>Standard 4</option>
					</select>
				</td>
			</tr>
			
			<tr>
				<td>Contact Number</td>
				<td>
					<input type="text" style="80%"><input type="button" value="Add More" style="20%"><%-- Syntax for BUTTON --%>
				</td>
			</tr>
			
			<tr>
				<td align="center" colspan="2">
					<input type="submit" value="Save" onclick="validation()">
					<input type="reset" value="Reset">
				</td>
			</tr>
			
			
			
		</table>
	</form>
</body>
</html>