package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class _1st_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\t\tfunction validation(){\r\n");
      out.write("\t\t\tif(document.getElementById('stName').value==\"\"){\r\n");
      out.write("\t\t\t\talert('Please enter name');\r\n");
      out.write("\t\t\t\tdocument.getElementById('stName').focus();\r\n");
      out.write("\t\t\t\treturn false;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tif(document.getElementById('add').value==\"\"){\r\n");
      out.write("\t\t\t\talert('Please enter address');\r\n");
      out.write("\t\t\t\tdocument.getElementById('add').focus();\r\n");
      out.write("\t\t\t\treturn false;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tif(document.getElementById('stand').value==\"0\"){\r\n");
      out.write("\t\t\t\talert('Please select standard');\r\n");
      out.write("\t\t\t\tdocument.getElementById('stand').focus();\r\n");
      out.write("\t\t\t\treturn false;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tif(document.getElementById('gen').checked==false && document.getElementById('gen1').checked==false)\r\n");
      out.write("\t\t\t{\r\n");
      out.write("\t\t\t\talert('please select Gender');\r\n");
      out.write("\t\t\t\treturn false;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t}\r\n");
      out.write("\t</script>\r\n");
      out.write("\t<link href=\"style.css\" rel=\"stylesheet\">\r\n");
      out.write("\t\r\n");
      out.write("</head>\r\n");
      out.write("<body >\r\n");
      out.write("\t<form action=\"");
      out.print(request.getContextPath());
      out.write("/MyFirst.do?var=1\" method=\"post\">\r\n");
      out.write("\t<div class=\"body\">\r\n");
      out.write("\t<table align=\"center\"  width=\"400px\" class=\"box\">\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<th colspan=\"2\" class=\"header\">Student Registration\r\n");
      out.write("\t\t\t</th>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td width=\"30%\" class=\"lbl\">Name<font color=\"red\">*</font> </td>\r\n");
      out.write("\t\t\t<td>\r\n");
      out.write("\t\t\t\t<input type=\"text\" name=\"abcd\" id=\"stName\">\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td width=\"50%\" class=\"lbl\">Address<font color=\"red\">*</font></td>\r\n");
      out.write("\t\t\t<td>\r\n");
      out.write("\t\t\t\t<textarea rows=\"4\" cols=\"16\" name=\"add\" id=\"add\"></textarea>\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td width=\"50%\" class=\"lbl\">Gender<font color=\"red\">*</font></td>\r\n");
      out.write("\t\t\t<td>\r\n");
      out.write("\t\t\t\t<input type=\"radio\" value=\"m\" name=\"gen\" id=\"gen\">Male\r\n");
      out.write("\t\t\t\t<input type=\"radio\" value=\"f\" name=\"gen\" id=\"gen1\">Female\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td width=\"50%\" class=\"lbl\">Standard<font color=\"red\">*</font></td>\r\n");
      out.write("\t\t\t<td>\r\n");
      out.write("\t\t\t\t<select name=\"stand\" id=\"stand\">\r\n");
      out.write("\t\t\t\t\t<option value=\"0\">Select</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"stand1\">Standard I</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"s2\">Standard II</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"s3\">Standard III</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"s4\">Standard IV</option>\r\n");
      out.write("\t\t\t\t</select>\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td colspan=\"2\" align=\"center\" style=\"color: red;\">&nbsp;");
      out.print(session.getAttribute("msg")==null?"":session.getAttribute("msg") );
      out.write("</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");

																			session.removeAttribute("msg");
																		
      out.write("\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td colspan=\"2\" align=\"center\">\r\n");
      out.write("\t\t\t\t<input type=\"submit\" value=\"Save\" class=\"btn\" onclick=\"return validation()\">\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<input type=\"reset\" value=\"Reset\" class=\"btn\">\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td>\r\n");
      out.write("\t\t\t\t<a href=\"viewData.jsp\">View </a>\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t\t<td>\r\n");
      out.write("\t\t\t\t<img alt=\"No image\" width=\"50px\" height=\"30px\" title=\"abcd\" src=\"images/img.jpg\">\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t</table>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t</form>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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
