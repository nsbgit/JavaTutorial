package org.apache.jsp.adminSection;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class createVoteEvent_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\r');
      out.write('\n');
if(session.getAttribute("accId") != null) {
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>Create vote event</title>\r\n");
      out.write("<link href=\"../css/mainWebPage.css\" rel=\"stylesheet\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"../css/index.css\" type=\"text/css\" />\r\n");
      out.write("<script type=\"text/javascript\" src=\"../js/jquery-1.7.1.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"../js/Validation.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"../js/datetimepicker_css.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("var counter=2;\r\n");
      out.write("\tfunction addMore(){\r\n");
      out.write("\t\tcounter=parseInt(counter)+1;\r\n");
      out.write("\t\t//alert(counter);\r\n");
      out.write("\t\tvar counter1 = parseInt(counter) + 1;\r\n");
      out.write("\t\t//alert(counter1);\r\n");
      out.write("\t\tvar addCode=document.getElementById('addCode'+counter);\r\n");
      out.write("\t\taddCode.innerHTML+='<tr>'+\r\n");
      out.write("\t\t\t'<td><label>'+counter+'</label><em style=\"padding-right: 90px;\">*</em></td>'+\r\n");
      out.write("\t\t\t'<td class=\"required\">'+\r\n");
      out.write("\t\t\t\t'<input type=\"text\" style=\"width: 100%; padding-right: 42px;\" placeholder=\"Enter Party ' + counter + ' Name\" name=\"partyName\" id=\"partyName'+counter+'\">'+\r\n");
      out.write("\t\t\t'</td><td class=\"required\">'+\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\t'<input type=\"text\" style=\"width: 100%; padding-right: 21px;\" placeholder=\"Enter Party ' + counter + ' Leader\" name=\"partLeader\" id=\"partLeader'+counter+'\">'+\r\n");
      out.write("\t\t\t'</td></tr>' +\r\n");
      out.write("\t\t\t'<td colspan=\"3\" width=\"100%\"><table cellpadding=\"0\" cellspacing=\"0\" border=\"0\" id=\"addCode'+ counter1 +'\"></table></td></tr>';\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\tfunction endTimeFun(startwith){\r\n");
      out.write("\t\t//var rem=24-startwith;\r\n");
      out.write("\t\tvar addPos=document.getElementById(\"endTimeHour\");\r\n");
      out.write("\t\tvar addText=\"<option value=''>-- Select Hour ---</option>\";\r\n");
      out.write("\t\tstartwith=parseInt(startwith);\r\n");
      out.write("\t\tfor(var i=startwith;i<=23;i++){\r\n");
      out.write("\t\t\tif(i<10) {\r\n");
      out.write("\t\t\t\t//addText+='<option value=\"0' + i '\">0' + i + '</option>'\r\n");
      out.write("\t\t\t\taddText+=\"<option value=0\"+i+\">0\"+i+\"</option>\"\r\n");
      out.write("\t\t\t} else {\r\n");
      out.write("\t\t\t\taddText+=\"<option value='\"+i+\"'>\"+i+\"</option>\"\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\taddPos.innerHTML=addText;\r\n");
      out.write("\t}\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div id=\"container\">\r\n");
      out.write("\t<header id=\"page_header\">\r\n");
      out.write("\t\t<img src=\"../logo/download.jpg\" alt=\"logo\" width='232' height='100' class=\"logo\" />\r\n");
      out.write("\t\t<h1 class=\"head_text\">WELCOME TO ONLINE VOTING</h1>\r\n");
      out.write("\t</header>\r\n");
      out.write("</div>\r\n");
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
      out.write("\t<div id=\"content\">\r\n");
      out.write("\t");
      out.write("\r\n");
      out.write("\t\t<div>\r\n");
      out.write("\t\t\t<hr>\r\n");
      out.write("\t\t\t<hr>\r\n");
      out.write("\t\t\t<h1 align=\"center\">Create Vote Event</h1>\r\n");
      out.write("\t\t\t<hr>\r\n");
      out.write("\t\t\t<hr>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<form action=\"");
      out.print( request.getContextPath() );
      out.write("/SAdmin.do?linkId=7\" method=\"post\">\r\n");
      out.write("\t\t\t\t<table class=\"box\" align=\"center\" style=\"width: 500px;\">\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<th class=\"header\" colspan=\"3\">Register for a vote</th>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t<label>Vote Name</label><em>*</em>\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t<td class=\"required\" colspan=\"2\">\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" name=\"voteName\" id=\"voteName\" placeholder = \"Enter vote name\" style=\"width: 100%\"><br><br>\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<th class=\"header\">S No.</th>\r\n");
      out.write("\t\t\t\t\t\t<th class=\"header\">Party Name</th>\r\n");
      out.write("\t\t\t\t\t\t<th class=\"header\">Party Leader</th>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td><label>1</label><em>*</em></td>\r\n");
      out.write("\t\t\t\t\t\t<td class=\"required\">\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" style=\"width: 100%\" placeholder=\"Enter Party 1 Name\" name=\"partyName\" id=\"partyName1\">\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t<td class=\"required\">\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" style=\"width: 100%\" placeholder=\"Enter Party 1 Leader\" name=\"partLeader\" id=\"partLeader1\">\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td><label>2</label><em>*</em></td>\r\n");
      out.write("\t\t\t\t\t\t<td class=\"required\">\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" style=\"width: 100%\" placeholder=\"Enter Party 2 Name\" name=\"partyName\" id=\"partyName2\">\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t<td class=\"required\">\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" style=\"width: 100%\" placeholder=\"Enter Party 2 Leader\" name=\"partLeader\" id=\"partLeader2\">\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr><td colspan=\"3\" width=\"100%\"><table cellpadding=\"0\" cellspacing=\"0\" border=\"0\" id=\"addCode3\"></table></td></tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td colspan=\"3\" align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"button\" class=\"btn\" onclick=\"addMore()\" value=\"Add More...\"><br><br>\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t<label>Election Date</label><em>*</em>\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t<td class=\"required\" colspan=\"3\">\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" name=\"electionDate\" id=\"electionDate\" placeholder=\"Enter date of birth\" readonly=\"readonly\" style=\"width: 261px;\">\r\n");
      out.write("\t\t\t\t\t\t\t<img alt=\"Cal\" src=\"../images/cal.gif\" style=\"cursor:pointer;\"  onclick=\"javascript:NewCssCal('electionDate','ddMMyyyy')\">\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t<label>Start time</label><em>*</em>\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t<td class=\"required\" colspan=\"2\">\r\n");
      out.write("\t\t\t\t\t\t\t<select name=\"startTimeHour\" id=\"startTimeHour\" onchange=\"endTimeFun(this.value)\" style=\"width 40%\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"\">-- Select Hour ---</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t");

									for(int i=0; i<=23; i++) {
										if(i<10) {
								
      out.write("\t\t\t<option value=\"0");
      out.print( i );
      out.write('"');
      out.write('>');
      out.write('0');
      out.print( i );
      out.write("</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t");
		} else {
								
      out.write("\t\t\t<option value=\"");
      out.print(i);
      out.write('"');
      out.write('>');
      out.print(i);
      out.write("</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t");
		}
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t");
	}
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<select name=\"startTimeMinute\" id=\"startTimeMinute\" style=\"width 40%\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"\">-- Select Minute ---</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t");

									for(int i=0; i<=59; i++) {
										if(i<10) {
								
      out.write("\t\t\t<option value=\"0");
      out.print( i );
      out.write('"');
      out.write('>');
      out.write('0');
      out.print( i );
      out.write("</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t");
		} else {
								
      out.write("\t\t\t<option value=\"");
      out.print(i);
      out.write('"');
      out.write('>');
      out.print(i);
      out.write("</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t");
		}
									}
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t<label>End time</label><em>*</em>\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t<td class=\"required\" colspan=\"2\">\r\n");
      out.write("\t\t\t\t\t\t\t<select name=\"endTimeHour\" id=\"endTimeHour\" style=\"width 40%\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"\">-- Select Hour ---</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"\">First select start time</option>\r\n");
      out.write("\t\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<select name=\"endTimeMinute\" id=\"endTimeMinute\" style=\"width 40%\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"\">-- Select Minute ---</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t");

									for(int i=0; i<=59; i++) {
										if(i<10) {
								
      out.write("\t\t\t<option value=\"0");
      out.print( i );
      out.write('"');
      out.write('>');
      out.write('0');
      out.print( i );
      out.write("</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t");
		} else {
								
      out.write("\t\t\t<option value=\"");
      out.print(i);
      out.write('"');
      out.write('>');
      out.print(i);
      out.write("</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t");
		}
									}
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td colspan=\"3\" align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"submit\" class=\"btn\" value=\"Save\" onclick=\"return validation()\">\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"reset\" class=\"btn\" value=\"Reset\">\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t");

						if(session.getAttribute("voteMsgS") != null) {
					
      out.write("\t\t<br>\r\n");
      out.write("\t\t\t\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td colspan=\"2\" align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<font color=\"green\"><b>");
      out.print( session.getAttribute("voteMsgS") );
      out.write("</b></font>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");
 session.removeAttribute("voteMsgS"); 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t");
	}
					
      out.write("\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t");

						if(session.getAttribute("voteMsgN") != null) {
					
      out.write("\t\t<br>\r\n");
      out.write("\t\t\t\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td colspan=\"2\" align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<font color=\"red\"><b>");
      out.print( session.getAttribute("voteMsgN") );
      out.write("</b></font>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");
 session.removeAttribute("voteMsgN"); 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t");
	}
					
      out.write("\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div id=\"footer\">\r\n");
      out.write("\t<p align=\"center\">\r\n");
      out.write("\t\tOnline Voting Portal<br />\r\n");
      out.write("\t\tall copyrights are reserved&copy;\r\n");
      out.write("\t</p>\r\n");
      out.write("</div>\r\n");
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
