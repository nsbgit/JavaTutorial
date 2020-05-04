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
			alert('Please enter name');
			document.getElementById('name').focus();
			return false;
		}
		
		if(document.getElementById('address').value == "") {
			alert('Please enter address');
			document.getElementById('address').focus();
			return false;
		}
		
		if(document.getElementById('genderMale').checked == false && document.getElementById('genderFemale').checked == false) {
			alert('Please select gender');
			return false;
		}
		
		if(document.getElementById('standard').value == "0") {
			alert('Please select standard');
			return false;
		}
	}
</script>

</head>
<body>
	<form action="<%= request.getContextPath()%>/MFS.do" method="post">
	<%--
	We have to draw or make a table inside form tag because this tag is required to pass the value into SERVLET
	 --%>
		<table border="2" width="400px" align="center">
		<%--
		Table is created into a row and column manner
		 --%>
			<h1 align="center"><font color="blue">Registration Form</font></h1> <%-- This is for heading of the page --%>
			
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
				<td>Address<font color="red">*</font></td>
				<td>
					<textarea rows="5" cols="15" style="width: 100%" name="address" id="address"></textarea> <%-- Syntax for TEXT AREA --%>
				</td>
			</tr>
			
			
			<tr>
				<td>Gender<font color="red">*</font></td>
				<td align="center">
					<input type="radio" <%-- checked="checked" --%> name="gender" id="genderMale" value="male">Male <%-- Syntax for RADIO BUTTON --%>
					<input type="radio" name="gender" id="genderFemale" value="female">Female
				</td>
			</tr>
			
			<tr>
				<td>Standard<font color="red">*</font></td>
				<td>
					<select style="width: 100%" name="standard" id="standard">
					<%--
					This tag is used for creation of drop down list but the option will be not created through it.
					 --%>
						<option value="0">------------------Select--------------------</option>
						<%--
						Options will be created by this tag
						 --%>
						<option value="1">Standard 1</option>
						<option value="2">Standard 2</option>
						<option value="3">Standard 3</option>
						<option value="4">Standard 4</option>
					</select>
				</td>
			</tr>
			
			<tr>
				<td>Contact Number</td>
				<td>
					<input type="text" style="80%" name="conNum" id="conNum"><input type="button" value="Add More" style="20%"><%-- Syntax for BUTTON --%>
				</td>
			</tr>
			
			<tr>
				<td align="center" colspan="2">
					<input type="submit" value="Save" onclick=" return validation()">
					<input type="reset" value="Reset">
				</td>
			</tr>
			
			
			
		</table>
	</form>
</body>
</html>