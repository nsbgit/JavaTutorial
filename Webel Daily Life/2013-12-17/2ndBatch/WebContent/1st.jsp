<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>First Page</title>

<script type="text/javascript">
	function validation() {
		if(document.getElementById('stName').value == ""){
			alert('Please enter name');
		}

	}

</script>

</head>
<body>
<form action="#" method="post">
	<table border="1" width="400px" align="center">
		<h1 >Registration Form</h1>
		
		<tr>
			<th align="center" colspan="2">Registration</th>
		</tr>
		<tr>
			<td>Name<font color="red">*</font></td>
			<td>
				<input type = "text" style="width: 100%" name="stName" id="stName">
			</td>
		</tr>
		
		<tr>
			<td>Address<font color="red">*</font></td>
			<td> <textarea rows="5" cols="15" style="width: 100%" name="address" id="address"></textarea> </td>
		</tr>
		
		<tr>
			<td>Gender<font color="red">*</font></td>
			<td>
			 <input type="radio" checked="checked" name="gender" id="gender" value="male">Male
			 <input type="radio" name="gender" id="gender" value="female">Female
			 </td>
			<td> </td>
		</tr>
		
		<tr>
			<td>Standard<font color="red">*</font></td>
			<td>
				<select style="width: 100%" name="standard" id="standard">
					<option value="select"> ------------------------Select------------------------ </option>
					<option value="standardI"> Standard I </option>
					<option value="standardII"> Standard II </option>
					<option value="standardIII"> Standard III </option>
					<option value="standardIV"> Standard IV </option>
				</select>
				
			</td>
		</tr>
		
		<tr>
			<td>Contact Number</td>
			<td>
				<input type="text" style="80%"><input type="button" value="Add More" style="20%">
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