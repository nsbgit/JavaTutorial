package org.apache.jsp.voterSection;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import logic.DatabaseToArrayListConversion;
import logic.LVoter;
import java.util.Iterator;
import java.util.ArrayList;

public final class result_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
if(session.getAttribute("accId") != null) {
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>Result</title>\r\n");
      out.write("<link href=\"../css/mainWebPage.css\" rel=\"stylesheet\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"../css/index.css\" type=\"text/css\" />\r\n");
      out.write("<script type=\"text/javascript\" src=\"../js/jquery-1.7.1.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"../js/Validation.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"../js/datetimepicker_css.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"../js/imageColck.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div id=\"container\">\r\n");
      out.write("\t\t<header id=\"page_header\">\r\n");
      out.write("\t\t\t<img src=\"../logo/download.jpg\" alt=\"logo\" width='232' height='100' class=\"logo\" />\r\n");
      out.write("\t\t\t<h1 class=\"head_text\">WELCOME TO ONLINE VOTING</h1>\r\n");
      out.write("\t\t</header>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t<div id=\"container\">\r\n");
      out.write("\t\t<div id=\"header\"></div>\r\n");
      out.write("\t\t<div id=\"menuBar\">\r\n");
      out.write("\t\t\t<div id='cssmenu'>\r\n");
      out.write("\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t<li class='active'>\r\n");
      out.write("\t\t\t\t\t\t<a href='#'><span>Home</span></a>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t<a href='#'><span>Gallery</span></a>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t<li class='has-sub'>\r\n");
      out.write("\t\t\t\t\t\t<a href='#'><span>Registration</span></a>\r\n");
      out.write("\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href='../mainToAdminSection/adminSignUp.jsp'><span>Organisation Registration</span></a>\r\n");
      out.write("\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t<li class='last'>\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href='../mainToVoterSection/voterSignUp.jsp'><span>Voter Registration</span></a>\r\n");
      out.write("\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t<li class='has-sub'>\r\n");
      out.write("\t\t\t\t\t\t<a href='#'><span>Log in</span></a>\r\n");
      out.write("\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href='../mainToAdminSection/adminSignIn.jsp'><span>Admin Login</span></a>\r\n");
      out.write("\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t<li class='last'>\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href='../mainToVoterSection/voterSignIn.jsp'><span>Voter Login</span></a>\r\n");
      out.write("\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t<a href='../contactUs.jsp'><span>Contact Us</span></a>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t<li class='last'>\r\n");
      out.write("\t\t\t\t\t\t<a href='#'><span>About Us</span></a>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div id=\"leftSideBarGiveVote\">\r\n");
      out.write("\t\t\t<div id=\"menuBar\">\r\n");
      out.write("\t\t\t\t<div id='cssmenu'>\r\n");
      out.write("\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t<li class='has-sub'><a href='#'><span>Voter Section</span></a>\r\n");
      out.write("\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"../voterSection/voterHomePage.jsp\"><span>Voter Home Page</span></a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"../voterSection/editProfile.jsp\"><span>Edit Profile</span></a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"../voterSection/giveVote.jsp\"><span>Give Vote</span></a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"../voterSection/result.jsp\"><span>Result</span></a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"../voterSection/viewProfile.jsp\"><span>View Profile</span></a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"../voterSection/changePassword.jsp\"><span>Change Password</span></a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<a><span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<form action=\"");
      out.print( request.getContextPath() );
      out.write("\" method=\"post\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"submit\" class=\"btn\" value=\"Sign Out\" onclick=\"\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\t\t\t\t</span></a>\r\n");
      out.write("\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t");
      out.write("\r\n");
      out.write("\t\t<div id=\"contentGiveVote\">\r\n");
      out.write("\t\t");
      out.write("\r\n");
      out.write("\t\t\t<div>\r\n");
      out.write("\t\t\t\t<h1 align=\"center\">Result</h1>\r\n");
      out.write("\t\t\t\t<hr>\r\n");
      out.write("\t\t\t\t<hr>\r\n");
      out.write("\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div style=\"text-align: center; padding-bottom: 20px;\" class=\"\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<script type=\"text/javascript\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tnew imageclock.display()\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</script>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t");

					
					
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
				
				
      out.write("\t<form action=\"");
      out.print( request.getContextPath() );
      out.write("/SVoter.do?linkId=3\" method=\"post\"></form>\r\n");
      out.write("\t\t\t\t\t\t<table align=\"center\" class=\"box\" width=\"500px\">\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<th colspan=\"4\" class=\"header\" align=\"center\">Result</th>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<label>Select Schedule</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td colspan=\"1\" align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<select name=\"schName\" id=\"schName\" onchange=\"checkSchResult('");
      out.print( request.getContextPath());
      out.write("/SVoter.do?linkId=5',this.value)\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"\"> -- Select --</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");

											String sql = "SELECT idVotingSchedule, concat(voteName, ' (', date_format(electionDate, '%d/%m/%Y'), ')'), endTime FROM voting_schedule WHERE   STR_TO_DATE(CONCAT(DATE_FORMAT(electionDate, '%d/%m/%y') ,DATE_FORMAT(endTime, '%h%l%p') ), '%d/%m/%y %h%l%p') <= curdate() and fidAdminRegistrationInformation = 1 order by electionDate desc";
											//String sql = "SELECT idVotingSchedule, concat(voteName, ' (', date_format(electionDate, '%d/%m/%Y'), ')') FROM voting_schedule WHERE electionDate < curdate()";
											//String sql = "SELECT DISTINCT (vs.idVotingSchedule) FROM voting_schedule vs, vote v WHERE vs.idVotingSchedule = v.fIdVotingSchedule";
											ArrayList arVtSch = new DatabaseToArrayListConversion().convertToArrayList(sql);
											Iterator itVtSch = arVtSch.iterator();
											String[] dataVtSch;
											while(itVtSch.hasNext()) {
												dataVtSch = (String[])itVtSch.next();
										
      out.write("\t\t<option value=\"");
      out.print( dataVtSch[0]);
      out.write('"');
      out.write('>');
      out.print( dataVtSch[1] );
      out.write("</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");
	}	
										
      out.write("\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td colspan=\"4\"><div id=\"resultid\">\r\n");
      out.write("\t\t\t\t\t\t\t\t");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t</div></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td colspan=\"4\"><div id=\"resultid2\"></div></td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t");
      out.write("\r\n");
      out.write("\t\t\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t<div id=\"footer\">\r\n");
      out.write("\t\t<p align=\"center\">\r\n");
      out.write("\t\t\tOnline Voting Portal<br />\r\n");
      out.write("\t\t\tall copyrights are reserved&copy;\r\n");
      out.write("\t\t</p>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t");
      out.write('\r');
      out.write('\n');
      out.write('	');
      out.write("\r\n");
      out.write("\t\t\t\t\t\t");
      out.write("\r\n");
      out.write("\t\t");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
 } else {
	session.setAttribute("redirect", "Please sign-in again");
	response.sendRedirect("../mainToVoterSection/voterSignIn.jsp");
}
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
