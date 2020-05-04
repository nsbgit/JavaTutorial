<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration of Student</title>

<script type="text/javascript">
	function validation() {
		if (document.getElementById('firstName').value == "") {
			alert('Please enter first name');
			document.getElementById('firstName').focus();
			return false;
		}
		
		if (document.getElementById('address').value == "") {
			alert('Please enter address');
			document.getElementById('address').focus();
			return false;
		}
		
		if (document.getElementById('genderMale').checked == false && document.getElementById('genderFemale').checked == false) {
			alert('Please select gender');
			return false;
		}
		
		if (document.getElementById('dobDate').value == "" || document.getElementById('dobMonth').value == "" || document.getElementById('dobYear').value == "") {
			alert('Please select date of birth');
			return false;
		}
		
		if (document.getElementById('college').value == "") {
			alert('Please enter college name');
			document.getElementById('college').focus();
			return false;
		}
		
		if (document.getElementById('stream').value == "") {
			alert('Please select stream');
			return false;
		}
	}

</script>

</head>
<body>
	<h1 align="center"><font color="#2952CC">Student Registration Form</font></h1>
	<hr>
	<hr>
	
	<div align="center">
		<p>
			<font color="#CF4141" size="4">
				<b>
					<i>
						<u>Step:1 -</u> Enter your details in appropriate places.<br>
						<u>Step:2 -</u> Then click on the submit button.
					</i>
				</b>
			</font>
		</p>
	</div>
	<hr>
	<hr>
	
	<form action="<%= request.getContextPath() %>/MFS2.do" method="post">
		<table align="center" width="600px">
			<tr>
				<th colspan="2" align="center"><font color="#005C00" size="6">Registration</font></th>
			</tr>
			<tr>
				<td><b>First Name<font color="red">*</font></b></td>&nbsp;&nbsp;
				<td>
					<input type="text" placeholder="Enter first name" style="width: 100%" name="firstName" id="firstName">
				</td>
			</tr>
			
			<tr>
				<td><b>Middle Name</b></td>&nbsp;&nbsp;
				<td>
					<input type="text" placeholder="Enter middle name" style="width: 100%" name="middleName" id="middleName">
				</td>
			</tr>
			
			<tr>
				<td><b>Last Name</b></td>
				<td>
					<input type="text" placeholder="Enter last name" style="width: 100%" name="lastName" id="lastName">
				</td>
			</tr>
			
			<tr>
				<td><b>Address<font color="red">*</font></b></td>
				<td>
					<textarea rows="4" cols="15" placeholder="Enter address" style="width: 100%" name="address" id="address"></textarea>
				</td>
			</tr>
			
			<tr>
				<td><b>Gender<font color="red">*</font></b></td>
				<td>
					<input type="radio" name="gender" id="genderMale" value="Male"><label>Male</label>&nbsp;&nbsp;
					<input type="radio" name="gender" id="genderFemale" value="Female"><label>Female</label>
				</td>
			</tr>
			
			<tr>
				<td><b>Date of birth<font color="red">*</font></b></td>
				<td>
					<select name="dobDate" id="dobDate">
						<option value=""> -- Select Date --</option>
						<option value="01"> 1</option>
						<option value="02"> 2</option>
						<option value="03"> 3</option>
						<option value="04"> 4</option>
						<option value="05"> 5</option>
						<option value="06"> 6</option>
						<option value="07"> 7</option>
						<option value="08"> 8</option>
						<option value="09"> 9</option>
						<option value="10"> 10</option>
						<option value="11"> 11</option>
						<option value="12"> 12</option>
						<option value="13"> 13</option>
						<option value="14"> 14</option>
						<option value="15"> 15</option>
						<option value="16"> 16</option>
						<option value="17"> 17</option>
						<option value="18"> 18</option>
						<option value="19"> 19</option>
						<option value="20"> 20</option>
						<option value="21"> 21</option>
						<option value="22"> 22</option>
						<option value="23"> 23</option>
						<option value="24"> 24</option>
						<option value="25"> 25</option>
						<option value="26"> 26</option>
						<option value="27"> 27</option>
						<option value="28"> 28</option>
						<option value="29"> 29</option>
						<option value="30"> 30</option>
						<option value="31"> 31</option>
					</select>
					&nbsp;&nbsp;
					<select name="dobMonth" id="dobMonth">
						<option value=""> -- Select Month --</option>
						<option value="01"> January</option>
						<option value="02"> February</option>
						<option value="03"> March</option>
						<option value="04"> April</option>
						<option value="05"> May</option>
						<option value="06"> June</option>
						<option value="07"> July</option>
						<option value="08"> August</option>
						<option value="09"> September</option>
						<option value="10"> October</option>
						<option value="11"> November</option>
						<option value="12"> December</option>
					</select>
					&nbsp;&nbsp;
					<select name="dobYear" id="dobYear">
						<option value=""> -- Select Year --</option><option value="2013" >2013</option><option value="2012" >2012</option><option value="2011" >2011</option><option value="2010" >2010</option><option value="2009" >2009</option><option value="2008" >2008</option><option value="2007" >2007</option><option value="2006" >2006</option><option value="2005" >2005</option><option value="2004" >2004</option><option value="2003" >2003</option><option value="2002" >2002</option><option value="2001" >2001</option><option value="2000" >2000</option><option value="1999" >1999</option><option value="1998" >1998</option><option value="1997" >1997</option><option value="1996" >1996</option><option value="1995" >1995</option><option value="1994" >1994</option><option value="1993" >1993</option><option value="1992" >1992</option><option value="1991" >1991</option><option value="1990" >1990</option><option value="1989" >1989</option><option value="1988" >1988</option><option value="1987" >1987</option><option value="1986" >1986</option><option value="1985" >1985</option><option value="1984" >1984</option><option value="1983" >1983</option><option value="1982" >1982</option><option value="1981" >1981</option><option value="1980" >1980</option><option value="1979" >1979</option><option value="1978" >1978</option><option value="1977" >1977</option><option value="1976" >1976</option><option value="1975" >1975</option><option value="1974" >1974</option><option value="1973" >1973</option><option value="1972" >1972</option><option value="1971" >1971</option><option value="1970" >1970</option><option value="1969" >1969</option><option value="1968" >1968</option><option value="1967" >1967</option><option value="1966" >1966</option><option value="1965" >1965</option><option value="1964" >1964</option><option value="1963" >1963</option><option value="1962" >1962</option><option value="1961" >1961</option><option value="1960" >1960</option><option value="1959" >1959</option><option value="1958" >1958</option><option value="1957" >1957</option><option value="1956" >1956</option><option value="1955" >1955</option><option value="1954" >1954</option><option value="1953" >1953</option><option value="1952" >1952</option><option value="1951" >1951</option><option value="1950" >1950</option>
					</select>
				</td>
			</tr>
			
			<tr>
				<td><b>College<font color="red">*</font></b></td>
				<td>
					<input type="text" placeholder="Enter college name" style="width: 100%" name="college" id="college">
				</td>
			</tr>
			
			
			<tr>
				<td><b>Stream<font color="red">*</font></b></td>
				<td>
					<select name="stream" id="stream">
						<option value="">--Select Stream--</option>
						
						<option value="COMPUTER SCIENCE AND ENGINEERING" > COMPUTER SCIENCE AND ENGINEERING</option>
						<option value="INFORMATION TECHNOLOGY" > INFORMATION TECHNOLOGY</option>
						<option value="CIVIL ENGINEERING" > CIVIL ENGINEERING</option>
						<option value="ELECTRICAL ENGINEERING" > ELECTRICAL ENGINEERING</option>
						<option value="ELECTRONICS AND COMMUNICATION ENGINEERING" > ELECTRONICS AND COMMUNICATION ENGINEERING</option>
						<option value="MECHANICAL ENGINEERING" > MECHANICAL ENGINEERING</option>
						<option value="APPLIED ELECTRONICS AND INSTRUMENTATION ENGINEERING" > APPLIED ELECTRONICS AND INSTRUMENTATION ENGINEERING</option>
						<option value="TEXTILE TECHNOLOGY" > TEXTILE TECHNOLOGY</option>
						<option value="LEATHER TECHNOLOGY" > LEATHER TECHNOLOGY</option>
						<option value="CERAMIC ENGINEERING AND TECHNOLOGY" > CERAMIC ENGINEERING AND TECHNOLOGY</option>
						<option value="BIOTECHNOLOGY" > BIOTECHNOLOGY</option>
						<option value="MCA" > MCA</option>
						<option value="BCA" > BCA</option>
						<option value="COMPUTER SCIENCE HONOURS (DEGREE COURSE" > COMPUTER SCIENCE HONOURS (DEGREE COURSE)</option>
					</select>
				</td>
			</tr>
			
			<tr>
				<td align="center" colspan="2">
					<input type="submit" value="Submit" onclick="return validation()">
					<input type="reset" value="Reset">
				</td>
			</tr>
			
			<%
				if(session.getAttribute("msg") != null) {
			%>		<tr>
						<td colspan="2" align="center">
							<font color="green"><b><%= session.getAttribute("msg") %></b></font>
							<% session.removeAttribute("msg"); %>
						</td>
					</tr>
			<%	}
			%>
			<tr>
				<td colspan="2" align="center">
					<a href="viewAllRecords.jsp">
						<font color="blue">
							<i>View all records</i>
						</font>
					</a>
				</td>
			</tr>
		
		</table>
	</form>
</body>
</html>