<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>First Page</title>

<link href="design.css" rel="stylesheet">

<script type="text/javascript">
	function validation() {
		if(document.getElementById('stName').value == ""){
			alert('Please enter name');
			document.getElementById('stName').focus();
			return false;
		}

		if(document.getElementById('address').value == ""){
			alert('Please enter address');
			document.getElementById('address').focus();
			return false;
		}

		if(document.getElementById('g1').checked== false && document.getElementById('g2').checked== false){
			alert('Please select gender');
			return false;
		}

		if(document.getElementById('standard').value == "0"){
			alert('Please select standard');
			return false;
		}
	}
</script>
</head>
<body>

<div>
	<h1 align="center" class="pageHeader">Registration Form</h1>
	<hr>
	<p></p>
	<p></p>
	<p></p>
	<p></p>
	
</div>

<form action="<%= request.getContextPath()%>/MFS.do" method="post">
<div class="body">
	<table width="500px" align="center" class="box">
		
		<tr>
			<th align="center" colspan="2" class="header">Registration</th>
		</tr>
		<tr>
			<td width="50%"><label>Name</label><em>*</em> </td>
			<td>
				<input type = "text" style="width: 100%" name="stName" id="stName">
			</td>
		</tr>
		
		<tr>
			<td><label class="lbl">Address</label> <em>*</em></td>
			<td> <textarea rows="5" cols="15" style="width: 100%" name="address" id="address"></textarea> </td>
		</tr>
		
		<tr>
			<td><label>Gender</label><em>*</em> </td>
			<td>
			 <input type="radio" name="gender" id="g1" value="male">Male
			 <input type="radio" name="gender" id="g2" value="female">Female
			 </td>
			<td> </td>
		</tr>
		
		<tr>
			<td><label>Standard</label><em>*</em> </td>
			<td>
				<select style="width: 100%" name="standard" id="standard">
					<option value="0"> ------------------------Select------------------------ </option>
					<option value="standardI"> Standard I </option>
					<option value="standardII"> Standard II </option>
					<option value="standardIII"> Standard III </option>
					<option value="standardIV"> Standard IV </option>
				</select>
				
			</td>
		</tr>
		
		<tr>
			<td><label>Contact Number</label><em>*</em> </td>
			<td>
				<input type="text" style="80%"><input type="button" value="Add More" style="20%">
			</td>
		</tr>
		
		<%
			if(session.getAttribute("msg") != null) {%>
				<tr>
					<td colspan="2" class="sessionMessage">
						<%= session.getAttribute("msg") %>
						<% session.removeAttribute("msg"); %>
					</td>
				</tr>
		<%	}%>
		
		<tr>
			<td colspan="2" align="center">
				<a href="view.jsp">View</a>
				
			</td>
		</tr>
		
		<tr>
			<td align="center" colspan="2">
				<input type="submit" value="Save" class="btn" onclick=" return validation()">
				<input type="reset" value="Reset" class="btn">
			</td>
		</tr>
		
		
	</table>
</div>
</form>
</body>
</html>