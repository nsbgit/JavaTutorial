<%@page import="logic.LVoter"%>
<%@page import="java.util.Iterator"%>
<%@page import="logic.DatabaseToArrayListConversion"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Give vote</title>
<link href="../css/mainWebPage.css" rel="stylesheet">
<script type="text/javascript" src="../js/jquery-1.7.1.min.js"></script>
<script type="text/javascript" src="../js/Validation.js"></script>
<script type="text/javascript" src="../js/datetimepicker_css.js"></script>
<script type="text/javascript" src="../js/imageColck.js"></script>
<script type="text/javascript">
	function check(){
		var flag="f";
		var count=document.getElementById("count").value;
		for(var i=1;i<=count;i++){
			if(document.getElementById('choose'+ i).checked==true){
				flag="t";
				break;
			}
			
		}
		
	}
</script>
</head>
<body>
	<div class="body">
		<h1 align="center">Vote</h1>
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
			/************************ get admin  info **************************/
			int count = 0;
			String sessionId = session.getAttribute("accId").toString();
			String sq = "SELECT fIdAdminRegInfo FROM voter_registration_information WHERE idVoterRegistrationInformation = " + sessionId;
			ArrayList alist = new DatabaseToArrayListConversion().convertToArrayList(sq);
			Iterator itr = alist.iterator();
			String accId = "";
			String[] dt = null;
			if(itr.hasNext()) {
				dt = (String[])itr.next();
			}
			accId = dt[0];
			session.setAttribute("fIdAdmin", accId);
			/**************************************************/
			
			/*
			String sql = "SELECT vc.idVotingCandidate, vc.partyName, vc.partyLeader, vs.idVotingSchedule FROM voting_schedule vs, voting_candidate vc WHERE vs.idVotingSchedule = vc.fidVotingSchedule AND vs.electionDate = curdate() AND curtime() BETWEEN vs.startTime AND vs.endTime and vs.fidAdminRegistrationInformation = " + accId;
			//String sql = "SELECT vc.idVotingCandidate, vc.partyName, vc.partyLeader FROM voting_schedule vs, voting_candidate vc WHERE vs.idVotingSchedule = vc.fidVotingSchedule AND vs.electionDate = curdate() AND curtime() BETWEEN vs.startTime AND vs.endTime";
			ArrayList ar = new DatabaseToArrayListConversion().convertToArrayList(sql);
			boolean flag = true;
			Iterator it = ar.iterator();
			Iterator temp = ar.iterator();
			String[] data = null;
			String[] sch = null;
			String fIdVotingSchedule = "";
			*/
		%>	<form action="<%= request.getContextPath() %>/SVoter.do?linkId=3" method="post">
				<table align="center" class="box">
				
					<tr>
						<td>
							<label>Select voting schedule</label>
						</td>
						
						<td align="center" colspan="3">
							<select name="schName" id="schName" onchange="checkSch('<%= request.getContextPath()%>/SVoter.do?linkId=4',this.value)">
								<option value=""> -- Select --</option>
								
								<%
									ArrayList alistSch = new LVoter().fetchSch(accId);
									//ArrayList alistSch = new LVoter().fetchSch();
									Iterator itrSch = alistSch.iterator();
									String[] datSch;
									boolean flagSch = false;
									while(itrSch.hasNext()) {
										datSch = (String[])itrSch.next();
								%>		<option value="<%=datSch[0]%>"><%= datSch[1]%> (<%=datSch[2] %>)</option>
								
								<%	}
								%>
								
							</select>
						
						</td>
						
						<tr>
							<td colspan="4"><div id="resultid"></div></td>
							<td colspan="4"><div id="resultid2"></div></td>
						</tr>
						
						
						
					
					
							
							<%--
							<tr>
								<td align="center" colspan="4">
								<input type="hidden" name="count" value="<%= count%>">
									<input type="submit" onclick="return check()" value="Vote" class="btn">
									<input type="reset" value="Reset" class="btn">
								</td>
							</tr>
							 --%>
				</table>
			</form>
	</div>

</body>
</html>