package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class aboutUs_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title>About Us</title>\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/admin_sign_in.css\" type=\"text/css\"/>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div id=\"container\">\r\n");
      out.write("\t\t\t\t<header id=\"page_header\">\r\n");
      out.write("\t\t\t\t<img src=\"logo/download.jpg\" alt=\"logo\" width='232' height='100' class=\"logo\" />\r\n");
      out.write("\t\t\t\t\t<h1 class=\"head_text\">WELCOME TO ONLINE VOTING</h1>\r\n");
      out.write("\t\t\t\t</header>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("<div id=\"container\">\r\n");
      out.write("  \t\t<div id=\"header\">\r\n");
      out.write("    \r\n");
      out.write("  \t\t</div>\r\n");
      out.write("  \t\t\t<div id=\"menuBar\"><div id='cssmenu'>\r\n");
      out.write("\t\t\t\t<ul>\r\n");
      out.write("   \t\t\t\t\t<li class='active'><a href='mainWebHomePage.jsp'><span>Home</span></a></li>\r\n");
      out.write("   \t\t\t\t\t<li><a href='#'><span>Gallery</span></a></li>\r\n");
      out.write("   \t\t\t\t\t<li class='has-sub'><a href='#'><span>Registration</span></a>\r\n");
      out.write("     \t\t\t<ul>\r\n");
      out.write("         \t\t\t<li><a href='mainToAdminSection/adminSignIn.jsp'><span>Organisation Registration</span></a></li>\r\n");
      out.write("         \t\t\t<li class='last'><a href='mainToVoterSection/voterSignIn.jsp'><span>Voter Registration</span></a></li>\r\n");
      out.write("      \t\t\t</ul>\r\n");
      out.write("   \t\t\t</li>\r\n");
      out.write("   \t\t\t\t<li class='has-sub'><a href='#'><span>Log in</span></a>\r\n");
      out.write("      \t\t<ul>\r\n");
      out.write("         \t\t<li><a href='mainToAdminSection/adminSignIn.jsp'><span>Admin Login</span></a></li>\r\n");
      out.write("         \t\t<li class='last'><a href='mainToVoterSection/voterSignIn.jsp'><span>Voter Login</span></a></li>\r\n");
      out.write("      \t\t</ul>\r\n");
      out.write("   \t\t</li>\r\n");
      out.write("   \t\t\t\t<li><a href='#'><span>Contact Us</span></a></li>\r\n");
      out.write("   \t\t\t\t<li class='last'><a href='about.jsp'><span>About Us</span></a></li>\r\n");
      out.write("\t\t</ul>\r\n");
      out.write("\t</div></div>\r\n");
      out.write("  \t\t<div id=\"leftSideBar\"></div>\r\n");
      out.write("  \t\t\r\n");
      out.write("  \r\n");
      out.write("  \t\t<div id=\"content\">\r\n");
      out.write("\t\t");
      out.write("\r\n");
      out.write("\t\t<div>\r\n");
      out.write("\t\t\t<h1 align=\"center\" style=\"color: #FF0000\"><u>Automated voting system</u></h1>\r\n");
      out.write("\t\t\t<p align=\"center\" style=\"color: #1919D1\"><b>An automated voting system comprising single or multiple voting stations for controlling<br>\r\n");
      out.write("\t\t\t   \t\t\t\t  and being a voting station simultaneously.The voting system ...<br>\r\n");
      out.write("\t\t\t   \t\t\t\t  A voting system or electoral system is a method by which voters make a choice between options,<br>\r\n");
      out.write("\t\t\t   \t\t\t\t  often in an election or on a policy referendum.<br>\r\n");
      out.write("\t\t\t\t\t\t\t  A voting system enforces rules to ensure valid voting,<br>\r\n");
      out.write("\t\t\t\t\t\t\t  and how votes are counted and aggregated to yield a final result.<br>\r\n");
      out.write("\t\t\t\t\t\t\t  Common voting systems are majority rule, proportional representation or plurality voting<br>\r\n");
      out.write("\t\t\t\t\t\t\t  with a number of variations and methods such as first-past-the-post or preferential voting.<br>\r\n");
      out.write("\t\t\t\t\t\t\t  The study of formally defined voting systems is called social choice theory or voting theory,<br>\r\n");
      out.write("\t\t\t\t\t\t\t  a subfield of political science, economics, or mathematics.<br>\r\n");
      out.write("\t\t\t\t\t\t\t  With majority rule, those who are unfamiliar with voting theory are often surprised that<br>\r\n");
      out.write("\t\t\t\t\t\t\t  another voting system exists, or that disagreements may exist over the definition of what<br>\r\n");
      out.write("\t\t\t\t\t\t\t  it means to be supported by a majority[citation needed]. Depending on the meaning chosen,<br>\r\n");
      out.write("\t\t\t\t\t\t\t  the common \"majority rule\" systems can produce results that the majority does not support.<br>\r\n");
      out.write("\t\t\t\t\t\t\t  If every election had only two choices, the winner would be determined using majority rule alone.<br>\r\n");
      out.write("\t\t\t\t\t\t\t  However, when there are three or more options, there may not be<br>\r\n");
      out.write("\t\t\t\t\t\t\t  a single option that is most liked or most disliked by a majority.<br>\r\n");
      out.write("\t\t\t\t\t\t\t  A simple choice does not allow voters to express the ordering or the intensity of their feeling.<br> \r\n");
      out.write("\t\t\t\t\t\t\t  Different voting systems may give very different results,<br>\r\n");
      out.write("\t\t\t\t\t\t\t  particularly in cases where there is no clear majority preference.<br></b>\r\n");
      out.write("\t\t\t </p>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t<div id=\"footer\"><p align=\"center\">Online Voting Portal<br />\r\n");
      out.write("  \t\tall copyrights are reserved&copy;\r\n");
      out.write("  \t\t</p></div>\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
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
