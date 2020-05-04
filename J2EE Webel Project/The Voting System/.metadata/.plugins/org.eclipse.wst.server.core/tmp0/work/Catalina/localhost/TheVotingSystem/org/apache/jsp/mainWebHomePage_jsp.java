package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class mainWebHomePage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>Welcome To Online Voting</title>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("<!--\r\n");
      out.write(".button {\r\n");
      out.write("   display:block;\r\n");
      out.write("   padding: 0;\r\n");
      out.write("   height: 30px;\r\n");
      out.write("   background: url(images/bg-button.png) no-repeat top left;\r\n");
      out.write("   text-family: Arial, sans-serif;\r\n");
      out.write("}\r\n");
      out.write(".button a {\r\n");
      out.write("\tdisplay: block;\r\n");
      out.write("\tpadding: 0;\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write(".button a:LINK,\r\n");
      out.write(".button a:VISITED\r\n");
      out.write(".button a:HOVER\r\n");
      out.write(".button a:ACTIVE {\r\n");
      out.write("     color: #696;\r\n");
      out.write("     text-decoration: none;\r\n");
      out.write("}\r\n");
      out.write(".button a span {\r\n");
      out.write("\tdisplay: block;\r\n");
      out.write("\tpadding: 6px 15px 0 0;\r\n");
      out.write("\tcolor: #666;\r\n");
      out.write("\ttext-shadow: 1px 1px 1px #fff;\r\n");
      out.write("\tfont-size: 10pt;\r\n");
      out.write("\tfont-weight: bold;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("-->\r\n");
      out.write("</style>\r\n");
      out.write("<link href=\"css/mainWebPage.css\" rel=\"stylesheet\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t\r\n");
      out.write("\t<hr>\r\n");
      out.write("\t\t<hr>\r\n");
      out.write("\t\t<div class=\"hyperLink\">\r\n");
      out.write("\t\t\t<p>\r\n");
      out.write("\t\t\t\t<a href=\"../mainWebsitePages/mainWebHomePage.jsp\">Home</a>\r\n");
      out.write("\t\t\t</p>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<hr>\r\n");
      out.write("\t<hr>\r\n");
      out.write("\t\r\n");
      out.write("\t<table border=\"0\" align=\"center\" width=\"300px\">\r\n");
      out.write("\t\t<tbody>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td height=\"152\" colspan=\"2\" align=\"center\" valign=\"top\">\r\n");
      out.write("\t\t\t\t<img border=\"0\" src=\"images/wel-come.jpg\" width=\"525\" height=\"150\">\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td colspan=\"2\" height=\"40\">\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td height=\"255\" colspan=\"2\" align=\"center\" valign=\"middle\">\r\n");
      out.write("\t\t\t\t<img alt=\"logo\" src=\"images/india-vote101.jpg\">\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td colspan=\"2\" height=\"40\"></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td align=\"center\" valign=\"middle\">\r\n");
      out.write("\t\t\t\t\t<div class=\"button\" style=\"float: left; width: 150px; margin-left:300px; \">\r\n");
      out.write("\t\t\t\t\t\t<a href=\"FirstPage1.jsp\">\r\n");
      out.write("\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t<a href=\"mainToAdminSection/adminSignIn.jsp\">\r\n");
      out.write("\t\t\t\t\t\t\t<span>ORGANISATION</span>\r\n");
      out.write("\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t<td align=\"center\" valign=\"middle\">\r\n");
      out.write("\t\t\t\t\t<div class=\"button\" style=\"float: right; width: 150px; margin-right: 300px;\">\r\n");
      out.write("\t\t\t\t\t\t<a href=\"mainToVoterSection/voterSignIn.jsp\">\r\n");
      out.write("\t\t\t\t\t\t<span>VOTER</span>\r\n");
      out.write("\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td align=\"center\" valign=\"middle\" colspan=\"2\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"button\" style=\"float: right; width: 150px; margin-right: 300px;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"extra.jsp\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<span>EXTRA</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t</tbody>\r\n");
      out.write("\t</table>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
