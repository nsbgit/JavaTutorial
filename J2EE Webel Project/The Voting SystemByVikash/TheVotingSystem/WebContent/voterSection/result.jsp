<%@page import="logic.DatabaseToArrayListConversion"%>
<%@page import="logic.LVoter"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%if(session.getAttribute("accId") != null) {%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Result</title>
<link href="../css/mainWebPage.css" rel="stylesheet">
<script type="text/javascript" src="../js/jquery-1.7.1.min.js"></script>
<script type="text/javascript" src="../js/Validation.js"></script>
<script type="text/javascript" src="../js/datetimepicker_css.js"></script>
<script type="text/javascript" src="../js/imageColck.js"></script>
</head>
<body>
	<div class="body">
		<h1 align="center">Result</h1>
		<hr>
		<hr>
		<br>
		<br>
		
								<div style="text-align: center; padding-bottom: 20px;" class="">
									<script type="text/javascript">
																	
										new imageclock.display()
									
									</script>
								</div>
								
		
		<%
			
			
			//int count = 0;
			//String sessionId = session.getAttribute("accId").toString();
			//String sq = "SELECT fIdAdminRegInfo FROM voter_registration_information WHERE idVoterRegistrationInformation = " + sessionId;
			//ArrayList alist = new DatabaseToArrayListConversion().convertToArrayList(sq);
			//Iterator itr = alist.iterator();
			//String accId = "";
			//String[] dt = null;
			//if(itr.hasNext()) {
				//dt = (String[])itr.next();
			//}
			//accId = dt[0];
			//session.setAttribute("fIdAdmin", accId);
		
		%>	<form action="<%= request.getContextPath() %>/SVoter.do?linkId=3" method="post"></form>
				<table align="center" class="box" width="500px">
					<tr>
						<th colspan="4" class="header" align="center">Result</th>
					</tr>
						
					<tr>
						<td>
							<label>Select Schedule</label>
						</td>
						<td colspan="1" align="center">
							<select name="schName" id="schName" onchange="checkSchResult('<%= request.getContextPath()%>/SVoter.do?linkId=5',this.value)">
								<option value=""> -- Select --</option>
								
								<%
									String sql = "SELECT idVotingSchedule, concat(voteName, ' (', date_format(electionDate, '%d/%m/%Y'), ')'), endTime FROM voting_schedule WHERE   STR_TO_DATE(CONCAT(DATE_FORMAT(electionDate, '%d/%m/%y') ,DATE_FORMAT(endTime, '%h%l%p') ), '%d/%m/%y %h%l%p') <= curdate() and fidAdminRegistrationInformation = 1 order by electionDate desc";
									//String sql = "SELECT idVotingSchedule, concat(voteName, ' (', date_format(electionDate, '%d/%m/%Y'), ')') FROM voting_schedule WHERE electionDate < curdate()";
									//String sql = "SELECT DISTINCT (vs.idVotingSchedule) FROM voting_schedule vs, vote v WHERE vs.idVotingSchedule = v.fIdVotingSchedule";
									ArrayList arVtSch = new DatabaseToArrayListConversion().convertToArrayList(sql);
									Iterator itVtSch = arVtSch.iterator();
									String[] dataVtSch;
									while(itVtSch.hasNext()) {
										dataVtSch = (String[])itVtSch.next();
								%>		<option value="<%= dataVtSch[0]%>"><%= dataVtSch[1] %></option>
								<%	}	
								%>	
								
							</select>
						</td>
					</tr>
					
					<tr>
						<td colspan="4"><div id="resultid">
						<%-- 
							<table>
								<tr>
									<th>Serial No.</th>
									<th>Party Name</th>
									<th>Party Leader</th>
									<th>Total vote</th>
								</tr>
							
								<tr>
									<td>1</td>
									<td>Jis</td>
									<td>Sukanta</td>
									<td>100</td>
								</tr>
							</table>
							--%>
						
						</div></td>
						<td colspan="4"><div id="resultid2"></div></td>
					</tr>
				
				</table>
		
		</div>
</body>
</html>
<% } else {
	session.setAttribute("redirect", "Please sign-in again");
	response.sendRedirect("../mainToVoterSection/voterSignIn.jsp");
}%>