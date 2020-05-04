package org.apache.jsp.adminSection;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Iterator;
import logic.DatabaseToArrayListConversion;
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
	
      out.write("\tProfile of ");
      out.print( session.getAttribute("organisationName") );
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
      out.write("<script type=\"text/javascript\" src=\"../js/imageColck.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<div id=\"container\">\r\n");
      out.write("\t\t<header id=\"page_header\">\r\n");
      out.write("\t\t\t<img src=\"../logo/download.jpg\" alt=\"logo\" width='232' height='100' class=\"logo\" />\r\n");
      out.write("\t\t\t<h1 class=\"head_text\">WELCOME TO ONLINE VOTING</h1>\r\n");
      out.write("\t\t</header>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div id=\"container\">\r\n");
      out.write("\t<div id=\"header\"></div>\r\n");
      out.write("\t<div id=\"menuBar\">\r\n");
      out.write("\t\t<div id='cssmenu'>\r\n");
      out.write("\t\t\t<ul>\r\n");
      out.write("\t\t\t\t<li class='active'>\r\n");
      out.write("\t\t\t\t\t<a href='#'><span>Home</span></a>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t<a href='#'><span>Gallery</span></a>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t<li class='has-sub'>\r\n");
      out.write("\t\t\t\t\t<a href='#'><span>Registration</span></a>\r\n");
      out.write("\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t<a href='../mainToAdminSection/adminSignUp.jsp'><span>Organisation Registration</span></a>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t<li class='last'>\r\n");
      out.write("\t\t\t\t\t\t\t<a href='../mainToVoterSection/voterSignUp.jsp'><span>Voter Registration</span></a>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t<li class='has-sub'>\r\n");
      out.write("\t\t\t\t\t<a href='#'><span>Log in</span></a>\r\n");
      out.write("\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t<a href='../mainToAdminSection/adminSignIn.jsp'><span>Admin Login</span></a>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t<li class='last'>\r\n");
      out.write("\t\t\t\t\t\t\t<a href='../mainToVoterSection/voterSignIn.jsp'><span>Voter Login</span></a>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t<a href='../contactUs.jsp'><span>Contact Us</span></a>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t<li class='last'>\r\n");
      out.write("\t\t\t\t\t<a href='#'><span>About Us</span></a>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t<div id=\"leftSideBar\">");
      out.write("\r\n");
      out.write("\t\t<div id=\"menuBar\">\r\n");
      out.write("\t\t\t<div id='cssmenu'>\r\n");
      out.write("\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t<li class='has-sub'><a href='#'><span>Admin Section</span></a>\r\n");
      out.write("\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"../adminSection/adminHomePage.jsp\"><span>Admin Home Page</span></a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"../adminSection/changePassword.jsp\"><span>Change Password</span></a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"../adminSection/createVoteEvent.jsp\"><span>Crete Vote Event</span></a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"../adminSection/editProfile.jsp\"><span>Edit Profile</span></a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"../adminSection/viewProfile.jsp\"><span>View Profile</span></a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a><span>\r\n");
      out.write("\t\t\t\t\t\t\t\t<form action=\"");
      out.print( request.getContextPath() );
      out.write("/SAdmin.do?linkId=3\" method=\"post\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"submit\" class=\"btn\" value=\"Sign Out\" onclick=\"\">\r\n");
      out.write("\t\t\t\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\t\t\t</span></a>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t");
      out.write("\r\n");
      out.write("\t<div id=\"contentAdminHomePage\">\r\n");
      out.write("\t");
      out.write("\r\n");
      out.write("\t\t<div>\r\n");
      out.write("\t\t");

			if(session.getAttribute("accId") != null) {
		
      out.write("\t<h1 align=\"center\" class=\"pageHeader\">Edit profile of  ");
      out.print( session.getAttribute("organisationName") );
      out.write("</h1>\r\n");
      out.write("\t\t");
	}
		
      out.write("\r\n");
      out.write("\t\t<hr>\r\n");
      out.write("\t\t<hr>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t<div style=\"text-align: center; padding-bottom: 20px;\" class=\"\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<script type=\"text/javascript\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tnew imageclock.display()\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</script>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t");

			String sql = "SELECT id, firstName, lastName, organisationName, eMail, organisationAddress FROM admin_registration_information";
			ArrayList arrayList = new DatabaseToArrayListConversion().convertToArrayListBySession(sql, (String)session.getAttribute("accId"));
			Iterator iterator = arrayList.iterator();
			String[] data;
			while(iterator.hasNext()) {
				data = (String[])iterator.next();
		
      out.write("\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<form action=\"");
      out.print( request.getContextPath() );
      out.write("/SAdmin.do?linkId=4\" method=\"post\">\r\n");
      out.write("\t\t\t<table class=\"box\" align=\"center\" width=\"500px\">\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<th colspan=\"2\" class=\"header\" align=\"center\">Profile update</th>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t<label>First Name</label><em>*</em>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<td class=\"required\">\r\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" name=\"firstName\" id=\"firstName\" placeholder=\"Enter First Name\" style=\"width: 100%\" value=\"");
      out.print(data[0] );
      out.write("\">\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t<label>Last Name</label><em>*</em>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<td class=\"required\">\r\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" name=\"lastName\" id=\"lastName\" placeholder=\"Enter Last Name\" style=\"width: 100%\" value=\"");
      out.print(data[1] );
      out.write("\">\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t<label>Upload Photo</label><em>*</em>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t<input type=\"file\" placeholder = \"Upload Photo\">\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t<label>Organisation Name</label><em>*</em>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<td class=\"required\">\r\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" name=\"organisationName\" id=\"organisationName\" placeholder=\"Enter Organisation Name\"  style=\"width: 100%\" value=\"");
      out.print(data[2] );
      out.write("\">\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t<label>E-mail</label><em>*</em>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<td class=\"required email\">\r\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" name=\"eMail\" id=\"eMail\" style=\"width: 100%\" placeholder=\"Enter e-mail address\" value=\"");
      out.print(data[3] );
      out.write("\">\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t<label>Organisation Address</label><em>*</em>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<td class=\"required\">\r\n");
      out.write("\t\t\t\t\t\t<textarea rows=\"4\" cols=\"15\" name=\"organisationAddress\" id=\"organisationAddress\" style=\"width: 100%\" placeholder=\"Enter Organisation Address\">");
      out.print(data[4] );
      out.write("</textarea>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td colspan=\"2\" align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t<input type=\"submit\" value=\"Save\" class=\"btn\" onclick=\"return validation()\">\r\n");
      out.write("\t\t\t\t\t\t<input type=\"reset\" value=\"Reset\" class=\"btn\"><br><br>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t");

						if(session.getAttribute("registrationMsg") != null) {
					
      out.write("\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td colspan=\"2\" align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<font color=\"green\"><b>");
      out.print( session.getAttribute("registrationMsg") );
      out.write("</b></font>\r\n");
      out.write("\t\t\t\t\t\t\t\t");
 session.removeAttribute("registrationMsg"); 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t");
	}
					
      out.write("\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t\t");
	}
		
      out.write("\r\n");
      out.write("\t\t\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div id=\"footer\">\r\n");
      out.write("\t<p align=\"center\">\r\n");
      out.write("\t\tOnline Voting Portal<br />\r\n");
      out.write("\t\tall copyrights are reserved&copy;\r\n");
      out.write("\t</p>\r\n");
      out.write("</div>\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("\t");
      out.write('\r');
      out.write('\n');
      out.write('	');
      out.write("\r\n");
      out.write("\t\t\t\t");
      out.write('\r');
      out.write('\n');
      out.write('	');
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
 } else {
	session.setAttribute("redirect", "Please sign-in again");
	response.sendRedirect("../mainToAdminSection/adminSignIn.jsp");
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
