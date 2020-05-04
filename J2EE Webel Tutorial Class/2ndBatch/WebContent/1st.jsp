<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Webel Tutorial</title>
<%-- 
	It is called css.
	We use this to design purpose. This is similar to a method which we write once and use it
	as many times as we want. First give  a dot(.) then write the css name and where have to 
	implement it there in that tag we have to add an attribute class = "cssName". It is as follows :-
	
	For best using of this css we have to create a css file in web content and we will import that into every page.
	But if we write that into style tag we have to write this in every page
	
	For importing or implement a css into a page the code is:-
	
	<link href="design.css" rel="stylesheet"> where we was writing style tag i.e. in between head tag.
--%>
<%-- 
	<style type="text/css">
		
		
		.lbl {
			color: blue;
			font-family: cursive;
			padding-left: 15px;
		}
		
		label {
			color: green;
			font-family: cursive;
			padding-left: 15px;
		}
		
		em {
			color: red;
			font-family: cursive;
		}
	</style>
--%>
<link href="css/design.css" rel="stylesheet">
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
	<div class="body">
		<h1 align="center" class="pageHeader">Registration Form</h1> <%-- This is for heading of the page --%>
		
		<form action="<%= request.getContextPath()%>/MFS.do" method="post">
		<%--
		We have to draw or make a table inside form tag because this tag is required to pass the value into SERVLET
		<%= request.getContextPath()%> this command will give the project path
		 --%>
		 	
				<table width="400px" align="center" class="box">
				<%--
				Table is created into a row and column manner
				 --%>
					
					<tr>
					<%--
					This tag is used for creation of a new row
					 --%>
						<th align="center" colspan="2" class="header">Registration</th> <%-- This tag is used for table header --%>			
					</tr>
					
					<tr>
						<td><label>Name</label><em>*</em></td> <%-- This tag is for the new column for a particular row --%>
						<td>
							<input type="text" style="width: 100%" name="name" id="name" placeholder = "Enter name"> <%-- Syntax for TEXTBOX --%>
						</td>
					</tr>
					
					<tr>
						<td><label>Address</label><em>*</em></td>
						<td>
							<textarea rows="5" cols="15" style="width: 100%" name="address" id="address" placeholder = "Enter address"></textarea> <%-- Syntax for TEXT AREA --%>
						</td>
					</tr>
					
					
					<tr>
						<td><label>Gender</label><em>*</em></td>
						<td align="center">
							<input type="radio" <%-- checked="checked" --%> name="gender" id="genderMale" value="male">Male <%-- Syntax for RADIO BUTTON --%>
							<input type="radio" name="gender" id="genderFemale" value="female">Female
						</td>
					</tr>
					
					<tr>
						<td><label>Standard</label><em>*</em></td>
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
						<td><label>Contact Number</label></td>
						<td>
							<input type="text" style="80%" name="conNum" id="conNum" placeholder = "Enter contact number"><input type="button" value="Add More" style="20%"><%-- Syntax for BUTTON --%>
						</td>
					</tr>
					
					<tr>
						<td align="center" colspan="2">
							<input type="submit" value="Save" class="btn" onclick=" return validation()">
							<input type="reset" value="Reset" class="btn">
						</td>
					</tr>
					
					<%
						if(session.getAttribute("msg") != null) {%>
							<tr>
								<td colspan="2" align="center">
									<font color="green"><b><%= session.getAttribute("msg") %></b></font>
									<% session.removeAttribute("msg"); %>
								</td>
							</tr>
					<% 	}
					%>
					
					<tr>
						<td colspan="2" align="center">
							<a href="view.jsp">
								<font color="blue">
									<i>View all records</i>
								</font>
							</a>
						</td>
					</tr>
					
				</table>
		</form>
	</div>
</body>
</html>