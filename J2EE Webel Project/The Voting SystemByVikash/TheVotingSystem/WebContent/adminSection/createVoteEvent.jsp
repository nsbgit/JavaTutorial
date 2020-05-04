<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%if(session.getAttribute("accId") != null) {%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Create vote event</title>
<link href="../css/mainWebPage.css" rel="stylesheet">
<script type="text/javascript" src="../js/jquery-1.7.1.min.js"></script>
<script type="text/javascript" src="../js/Validation.js"></script>
<script type="text/javascript" src="../js/datetimepicker_css.js"></script>
<script type="text/javascript">
var counter=2;
	function addMore(){
		counter=parseInt(counter)+1;
		alert(counter);
		var counter1 = parseInt(counter) + 1;
		alert(counter1);
		var addCode=document.getElementById('addCode'+counter);
		addCode.innerHTML+='<tr>'+
			'<td><label>'+counter+'</label><em style="padding-right: 90px;">*</em></td>'+
			'<td class="required">'+
				'<input type="text" style="width: 100%; padding-right: 42px;" placeholder="Enter Party ' + counter + ' Name" name="partyName" id="partyName'+counter+'">'+
			'</td><td class="required">'+
			
				'<input type="text" style="width: 100%; padding-right: 21px;" placeholder="Enter Party ' + counter + ' Leader" name="partLeader" id="partLeader'+counter+'">'+
			'</td></tr>' +
			'<td colspan="3" width="100%"><table cellpadding="0" cellspacing="0" border="0" id="addCode'+ counter1 +'"></table></td></tr>';
	}
	
	
	function endTimeFun(startwith){
		//var rem=24-startwith;
		var addPos=document.getElementById("endTimeHour");
		var addText="<option value=''>-- Select Hour ---</option>";
		startwith=parseInt(startwith);
		for(var i=startwith;i<=23;i++){
			if(i<10) {
				//addText+='<option value="0' + i '">0' + i + '</option>'
				addText+="<option value=0"+i+">0"+i+"</option>"
			} else {
				addText+="<option value='"+i+"'>"+i+"</option>"
			}
		}
		addPos.innerHTML=addText;
	}
</script>

<%--

function endTimeFun(startwith){
	//var rem=24-startwith;
	var addPos=document.getElementById("endTimeHour");
	var addText="<option value=''>-- Select Hour ---</option>";
	startwith=parseInt(startwith)+1;
	for(var i=startwith;i<=12;i++){
		addText+="<option value='"+i+"'>"+i+"</option>"
	}
	addPos.innerHTML=addText;
}




for(var i=startwith;i<=12;i++){
			if(i<10) {
				addText+="<option value=0'"+i+"'>0"+i+"</option>"
			} else {
				addText+="<option value='"+i+"'>"+i+"</option>"
			}
		}

 --%>

</head>
<body>
	<div class="body">
		<hr>
		<hr>
		<h1 align="center">Create Vote Event</h1>
		<hr>
		<hr>
		<br>
		<br>
		
		<form action="<%= request.getContextPath() %>/SAdmin.do?linkId=7" method="post">
			<table class="box" align="center" style="width: 500px;">
				
				<tr>
					<th class="header" colspan="3">Register for a vote</th>
				</tr>
				
				<tr>
					<td>
						<label>Vote Name</label><em>*</em>
					</td>
					<td class="required" colspan="2">
						<input type="text" name="voteName" id="voteName" placeholder = "Enter vote name" style="width: 100%"><br><br>
					</td>
				</tr>
				
				<tr>
					<th class="header">S No.</th>
					<th class="header">Party Name</th>
					<th class="header">Party Leader</th>
				</tr>
				
				<tr>
					<td><label>1</label><em>*</em></td>
					<td class="required">
						<input type="text" style="width: 100%" placeholder="Enter Party 1 Name" name="partyName" id="partyName1">
					</td>
					<td class="required">
						<input type="text" style="width: 100%" placeholder="Enter Party 1 Leader" name="partLeader" id="partLeader1">
					</td>
				</tr>
				
				<tr>
					<td><label>2</label><em>*</em></td>
					<td class="required">
						<input type="text" style="width: 100%" placeholder="Enter Party 2 Name" name="partyName" id="partyName2">
					</td>
					<td class="required">
						<input type="text" style="width: 100%" placeholder="Enter Party 2 Leader" name="partLeader" id="partLeader2">
					</td>
				</tr>
				<tr><td colspan="3" width="100%"><table cellpadding="0" cellspacing="0" border="0" id="addCode3"></table></td></tr>
				<tr>
					<td colspan="3" align="center">
						<input type="button" class="btn" onclick="addMore()" value="Add More..."><br><br>
					</td>
				</tr>
				
				<tr>
					<td>
						<label>Election Date</label><em>*</em>
					</td>
					<td class="required" colspan="3">
						<input type="text" name="electionDate" id="electionDate" placeholder="Enter date of birth" readonly="readonly" style="width: 261px;">
						<img alt="Cal" src="../images/cal.gif" style="cursor:pointer;"  onclick="javascript:NewCssCal('electionDate','ddMMyyyy')">
					</td>
				</tr>
				
				<tr>
					<td>
						<label>Start time</label><em>*</em>
					</td>
					<td class="required" colspan="2">
						<select name="startTimeHour" id="startTimeHour" onchange="endTimeFun(this.value)" style="width 40%">
							<option value="">-- Select Hour ---</option>
							
							<%
								for(int i=0; i<=23; i++) {
									if(i<10) {
							%>			<option value="0<%= i %>">0<%= i %></option>
							<%		} else {
							%>			<option value="<%=i%>"><%=i%></option>
							<%		}
							%>
							<%	}
							%>
						</select>
					
					
					
						<select name="startTimeMinute" id="startTimeMinute" style="width 40%">
							<option value="">-- Select Minute ---</option>
							
							<%
								for(int i=0; i<=59; i++) {
									if(i<10) {
							%>			<option value="0<%= i %>">0<%= i %></option>
							<%		} else {
							%>			<option value="<%=i%>"><%=i%></option>
							<%		}
								}
							%>
						</select>
					</td>
				</tr>
				
				<tr>
					<td>
						<label>End time</label><em>*</em>
					</td>
					<td class="required" colspan="2">
						<select name="endTimeHour" id="endTimeHour" style="width 40%">
							<option value="">-- Select Hour ---</option>
							<option value="">First select start time</option>
						</select>
					
					
					
						<select name="endTimeMinute" id="endTimeMinute" style="width 40%">
							<option value="">-- Select Minute ---</option>
							
							<%
								for(int i=0; i<=59; i++) {
									if(i<10) {
							%>			<option value="0<%= i %>">0<%= i %></option>
							<%		} else {
							%>			<option value="<%=i%>"><%=i%></option>
							<%		}
								}
							%>
						</select>
					</td>
				</tr>
				
				<tr>
					<td colspan="3" align="center">
						<input type="submit" class="btn" value="Save" onclick="return validation()">
						<input type="reset" class="btn" value="Reset">
					</td>
				</tr>
				
				<%
					if(session.getAttribute("voteMsgS") != null) {
				%>		<br>
						<br>
						<tr>
							<td colspan="2" align="center">
								<font color="green"><b><%= session.getAttribute("voteMsgS") %></b></font>
								<% session.removeAttribute("voteMsgS"); %>
							</td>
						</tr>
				<%	}
				%>
				
				<%
					if(session.getAttribute("voteMsgN") != null) {
				%>		<br>
						<br>
						<tr>
							<td colspan="2" align="center">
								<font color="red"><b><%= session.getAttribute("voteMsgN") %></b></font>
								<% session.removeAttribute("voteMsgN"); %>
							</td>
						</tr>
				<%	}
				%>
				
			</table>
		</form>
	</div>
</body>
</html>
<% } else {
	session.setAttribute("redirect", "Please sign-in again");
	response.sendRedirect("../mainToAdminSection/adminSignIn.jsp");
}%>