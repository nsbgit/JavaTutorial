package org.apache.jsp.voterSection;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Iterator;
import logic.LVoter;
import java.util.ArrayList;

public final class editProfile_jsp extends org.apache.jasper.runtime.HttpJspBase
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
if(session.getAttribute("accId") != null) {
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>\r\n");
      out.write("\t");

		if(session.getAttribute("accId") != null) {
	
      out.write("\t\tProfile of ");
      out.print( session.getAttribute("voterName") );
      out.write('\r');
      out.write('\n');
      out.write('	');
	}
	
      out.write("\r\n");
      out.write("</title>\r\n");
      out.write("<link href=\"../css/mainWebPage.css\" rel=\"stylesheet\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"../css/index.css\" type=\"text/css\" />\r\n");
      out.write("<script type=\"text/javascript\" src=\"../js/jquery-1.7.1.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"../js/Validation.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"../js/datetimepicker_css.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"../js/imageColck.js\"></script>s\r\n");
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
      out.write("\t\t<div id=\"leftSideBarVoterEdit\">\r\n");
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
      out.write("\t\t<div id=\"contentVoterEdit\">\r\n");
      out.write("\t\t");
      out.write("\r\n");
      out.write("\t\t\t<div>\r\n");
      out.write("\t\t\t\t<hr>\r\n");
      out.write("\t\t\t\t<hr>\r\n");
      out.write("\t\t\t\t");

					if(session.getAttribute("accId") != null) {
				
      out.write("\t<h1 align=\"center\" class=\"pageHeader\">Edit profile of  ");
      out.print( session.getAttribute("voterName") );
      out.write("</h1>\r\n");
      out.write("\t\t\t\t");
	}
				
      out.write("\r\n");
      out.write("\t\t\t\t<hr>\r\n");
      out.write("\t\t\t\t<hr>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div style=\"text-align: center; padding-bottom: 20px;\" class=\"\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<script type=\"text/javascript\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tnew imageclock.display()\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</script>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t");

					String sessionVoterId = session.getAttribute("accId").toString();
					ArrayList alist = new LVoter().getEditRecords(sessionVoterId);
					Iterator it = alist.iterator();
					String[] data;
					while(it.hasNext()) {
						data = (String[])it.next();
				
      out.write("\t\t\r\n");
      out.write("\t\t\t\t\t\t<form action=\"");
      out.print( request.getContextPath() );
      out.write("/SVoter.do?linkId=6\" method=\"post\">\r\n");
      out.write("\t\t\t\t\t\t\t<table class=\"box\" align=\"center\" width=\"500px\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<th colspan=\"2\" class=\"header\" align=\"center\">Profile update</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<label>First Name</label><em>*</em>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td class=\"required\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"text\" name=\"firstName\" id=\"firstName\" placeholder=\"Enter First Name\" style=\"width: 100%\" value=\"");
      out.print( data[0]);
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<label>Last Name</label><em>*</em>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td class=\"required\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"text\" name=\"lastName\" id=\"lastName\" placeholder=\"Enter Last Name\" style=\"width: 100%\" value=\"");
      out.print( data[1]);
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<label>Date of birth</label><em>*</em>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td class=\"required\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"text\" name=\"dob\" id=\"dob\" placeholder=\"Enter date of birth\" readonly=\"readonly\" style=\"width: 100%\" value=\"");
      out.print( data[2]);
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<img alt=\"Cal\" src=\"../images/cal.gif\" style=\"cursor:pointer;\"  onclick=\"javascript:NewCssCal('dob','ddMMyyyy')\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<label>E-mail</label><em>*</em>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td class=\"required email\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"text\" name=\"eMail\" id=\"eMail\" style=\"width: 100%\" placeholder=\"Enter e-mail address\" value=\"");
      out.print( data[3]);
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<label>Address</label><em>*</em>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td class=\"required\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<textarea rows=\"4\" cols=\"15\" name=\"address\" id=\"address\" style=\"width: 100%\" placeholder=\"Enter Address\">");
      out.print( data[4] );
      out.write("</textarea>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<label>P.O.</label><em>*</em>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td class=\"required\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"text\" name=\"po\" id=\"po\" placeholder=\"Enter post office name\" style=\"width: 100%\" value=\"");
      out.print( data[5] );
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<label>Postal Code</label><em>*</em>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"text\" name=\"postalCode\" id=\"postalCode\" placeholder=\"Enter Postal Code\" value=\"");
      out.print( data[6] );
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<label>State</label><em>*</em>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td class=\"required\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<select style=\"width: 100%\" name=\"state\" id=\"state\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<option value=\"");
      out.print( data[7]);
      out.write('"');
      out.write('>');
      out.print( data[7] );
      out.write("</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<option value=\"Andaman and Nicobar Islands\">Andaman and Nicobar Islands</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<option value=\"Andhra Pradesh\">Andhra Pradesh</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<option value=\"Arunachal Pradesh\">Arunachal Pradesh</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<option value=\"Assam\">Assam</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<option value=\"Bihar\">Bihar</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<option value=\"Chandigarh\">Chandigarh</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<option value=\"Chhattisgarh\">Chhattisgarh</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<option value=\"Dadra and Nagar Haveli \">Dadra and Nagar Haveli </option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<option value=\"Daman and Diu\">Daman and Diu</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<option value=\"Delhi\">Delhi</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<option value=\"Goa\">Goa</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<option value=\"Gujarat\">Gujarat</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<option value=\"Haryana\">Haryana</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<option value=\"Himachal Pradesh\">Himachal Pradesh</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<option value=\"Jammu and Kashmir\">Jammu and Kashmir</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<option value=\"Jharkhand\">Jharkhand</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<option value=\"Karnataka[\">Karnataka[</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<option value=\"Kerala\">Kerala</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<option value=\"Lakshadweep\">Lakshadweep</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<option value=\"Madhya Pradesh\">Madhya Pradesh</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<option value=\"Maharashtra\">Maharashtra</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<option value=\"Manipur\">Manipur</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<option value=\"Meghalaya\">Meghalaya</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<option value=\"Mizoram\">Mizoram</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<option value=\"Nagaland\">Nagaland</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<option value=\"Odisha\">Odisha</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<option value=\"Puducherry\">Puducherry</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<option value=\"Punjab\">Punjab</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<option value=\"Rajasthan\">Rajasthan</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<option value=\"Sikkim\">Sikkim</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<option value=\"Tamil Nadu\">Tamil Nadu</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<option value=\"Tripura\">Tripura</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<option value=\"Uttar Pradesh\">Uttar Pradesh</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<option value=\"Uttarakhand\">Uttarakhand</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<option value=\"West Bengal\">West Bengal</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td colspan=\"2\" align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"submit\" value=\"Save\" class=\"btn\" onclick=\"return validation()\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"reset\" value=\"Reset\" class=\"btn\"><br><br>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t");
	}
				
      out.write("\r\n");
      out.write("\t</div>\r\n");
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
      out.write("\t\t\r\n");
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
      out.write('\r');
      out.write('\n');
      out.write('	');
      out.write('\r');
      out.write('\n');
      out.write('	');
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
