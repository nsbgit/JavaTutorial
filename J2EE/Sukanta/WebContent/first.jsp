<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration</title>

<style type="text/css">
	.hd {
		background-color: #5E610B;
		color: white;
		font-size: 26px;
	}
	
	.lbl {
		font-weight: bold; color: #5E610B; padding-left: 25px;
	}
	
	.tab {
		border: 2px solid red;
	}
	
	.odd {
		background-color: #BDBDBD;
	}
	
	.even {
		background-color: #A9BCF5;
	}
	
</style>

</head>
<body>
	<form action="">
		<table width="500px" align="center" class="tab" border="0" cellpadding="0" cellspacing="0">
			<tr class="odd">
				<td align="center" colspan="2" class="hd">REGISTRATION</td>
			</tr>
		
			<tr class="even">
				<td width="50%" class="lbl">Name <font color="red">*</font> </td>
				<td>
					<input type="text" name="sName" id="sName" style="width: 98%">
				</td>
			</tr>
		
			<tr class="odd">
				<td width="50%" class="lbl">Address <font color="red">*</font></td>
				<td>
					<textarea rows="4" cols="20" name="add" id="add" style="width: 98%"></textarea>
				</td>
			</tr>
		
			<tr class="even">
				<td width="50%" class="lbl">Stream <font color="red">*</font></td>
				<td>
					<select name="sName" id="sName" style="width: 100%">
						<option value="">------Select One------</option>
						<option value="Computer Science & Engineering">Computer Science & Engineering</option>
						<option value="Information Technology">Information Technology</option>
						<option value="Mechanical Engineering">Mechanical Engineering</option>
						<option value="Civil Engineering">Civil Engineering</option>
						<option value="Electrical Engineering">Electrical Engineering</option>
						<option value="Electronics & Communication Engineering">Electronics & Communication Engineering</option>
				</select>
				</td>
			</tr>
		
			<tr class="odd">
				<td width="50%" class="lbl">Gender <font color="red">*</font></td>
				<td>
					<input type="radio" name="gen" value="Male">Male
					<input type="radio" name="gen" value="Female">Female
				</td>
			</tr>
		
			<tr class="even">
				<td colspan="2" align="center">
					<input type="submit" value="Save">
					<input type="submit" value="Reset">
			</tr>
		
		</table>
	</form>
</body>
</html>