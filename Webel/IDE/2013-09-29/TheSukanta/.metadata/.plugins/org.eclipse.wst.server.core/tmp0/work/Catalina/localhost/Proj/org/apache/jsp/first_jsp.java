package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class first_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title>Insert title here</title>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("\t.hd {\r\n");
      out.write("\t\tbackground-color: #5E610B;\r\n");
      out.write("\t\tcolor: white;\r\n");
      out.write("\t\tfont-size:  26px;\r\n");
      out.write("\t\tfont-weight: bold;\r\n");
      out.write("\t}\r\n");
      out.write("\t.lbl {\r\n");
      out.write("\t\tfont-weight: bold; color: #5E610B; padding-left: 25px;\r\n");
      out.write("\t}\r\n");
      out.write("\t.tab {\r\n");
      out.write("\t\tborder: 2px solid red;\r\n");
      out.write("\t}\r\n");
      out.write("\t.odd {\r\n");
      out.write("\t\tbackground-color: #BDBDBD;\r\n");
      out.write("\t}\r\n");
      out.write("\t.even {\r\n");
      out.write("\t\tbackground-color: #A9BCF5;\r\n");
      out.write("\t}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<form action=\"2nd.jsp\">\r\n");
      out.write("\t<table width=\"500px\" align=\"center\" class=\"tab\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td align=\"center\" colspan=\"2\" class=\"hd\"> REGISTRATION  </td>\r\n");
      out.write("\t\t</tr>\t\r\n");
      out.write("\t\t<tr class=\"odd\">\r\n");
      out.write("\t\t\t<td width=\"50%\" class=\"lbl\">Name<font color=\"red\">*</font> </td>\r\n");
      out.write("\t\t\t<td>\r\n");
      out.write("\t\t\t\t<input type=\"text\" name=\"sName\" id=\"sName\" style=\"width: 100%\">\r\n");
      out.write("\t\t\t</td> \r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr class=\"even\">\r\n");
      out.write("\t\t\t<td width=\"50%\" class=\"lbl\">Address<font color=\"red\">*</font> </td>\r\n");
      out.write("\t\t\t<td>\r\n");
      out.write("\t\t\t\t<textarea rows=\"4\" cols=\"20\" name=\"add\" id=\"add\"  style=\"width: 100%\"></textarea>\r\n");
      out.write("\t\t\t</td> \r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr class=\"odd\">\r\n");
      out.write("\t\t\t<td width=\"50%\" class=\"lbl\">Stream <font color=\"red\">*</font> </td>\r\n");
      out.write("\t\t\t<td>\r\n");
      out.write("\t\t\t\t<select name=\"stream\" id=\"stream\"  style=\"width: 100%\">\r\n");
      out.write("\t\t\t\t\t<option value=\"\">------Select One------</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"Computer Science\">Computer Science</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"Information Technology\">Information Technology</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"mca\">MCA</option>\r\n");
      out.write("\t\t\t\t</select>\r\n");
      out.write("\t\t\t</td> \r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr class=\"even\">\r\n");
      out.write("\t\t\t<td width=\"50%\" class=\"lbl\">Gender <font color=\"red\">*</font> </td>\r\n");
      out.write("\t\t\t<td>\r\n");
      out.write("\t\t\t\t<input type=\"radio\" name=\"gen\" value=\"m\"> Male\r\n");
      out.write("\t\t\t\t<input type=\"radio\" name=\"gen\" value=\"f\"> Female\r\n");
      out.write("\t\t\t</td> \r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr class=\"odd\">\r\n");
      out.write("\t\t\t<td colspan=\"2\" align=\"center\">\r\n");
      out.write("\t\t\t\t<input type=\"submit\" value=\"Save\">\r\n");
      out.write("\t\t\t\t<input type=\"reset\" value=\"Reset\">\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t</table>\r\n");
      out.write("\t</form>\r\n");
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
