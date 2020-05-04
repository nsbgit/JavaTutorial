<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
	<script type="text/javascript">
		function validation(){
			if(document.getElementById('stName').value==""){
				alert('Please enter name');
				document.getElementById('stName').focus();
				return false;
			}
			if(document.getElementById('add').value==""){
				alert('Please enter address');
				document.getElementById('add').focus();
				return false;
			}
			if(document.getElementById('stand').value=="0"){
				alert('Please select standard');
				document.getElementById('stand').focus();
				return false;
			}
			if(document.getElementById('gen').checked==false && document.getElementById('gen1').checked==false)
			{
				alert('please select Gender');
				return false;
			}
			
			
		}
	</script>
	<link href="style.css" rel="stylesheet">
	
</head>
<body >
	<form action="<%=request.getContextPath()%>/MyFirst.do?var=1" method="post">
	<div class="body">
	<table align="center"  width="400px" class="box">
		<tr>
			<th colspan="2" class="header">Student Registration
			</th>
			
		</tr>
		<tr>
			<td width="30%" class="lbl">Name<font color="red">*</font> </td>
			<td>
				<input type="text" name="abcd" id="stName">
				
			</td>
		</tr>
		<tr>
			<td width="50%" class="lbl">Address<font color="red">*</font></td>
			<td>
				<textarea rows="4" cols="16" name="add" id="add"></textarea>
			</td>
		</tr>
		<tr>
			<td width="50%" class="lbl">Gender<font color="red">*</font></td>
			<td>
				<input type="radio" value="m" name="gen" id="gen">Male
				<input type="radio" value="f" name="gen" id="gen1">Female
			</td>
		</tr>
		<tr>
			<td width="50%" class="lbl">Standard<font color="red">*</font></td>
			<td>
				<select name="stand" id="stand">
					<option value="0">Select</option>
					<option value="stand1">Standard I</option>
					<option value="s2">Standard II</option>
					<option value="s3">Standard III</option>
					<option value="s4">Standard IV</option>
				</select>
			</td>
		</tr>
		<tr>
			<td colspan="2" align="center" style="color: red;">&nbsp;<%=session.getAttribute("msg")==null?"":session.getAttribute("msg") %></td>
		</tr>
																		<%
																			session.removeAttribute("msg");
																		%>
		<tr>
			<td colspan="2" align="center">
				<input type="submit" value="Save" class="btn" onclick="return validation()">
				
				<input type="reset" value="Reset" class="btn">
			</td>
		</tr>
		<tr>
			<td>
				<a href="viewData.jsp">View </a>
			</td>
			<td>
				<img alt="No image" width="50px" height="30px" title="abcd" src="images/img.jpg">
			</td>
		</tr>
	</table>
	</div>
	</form>
</body>
</html>






















