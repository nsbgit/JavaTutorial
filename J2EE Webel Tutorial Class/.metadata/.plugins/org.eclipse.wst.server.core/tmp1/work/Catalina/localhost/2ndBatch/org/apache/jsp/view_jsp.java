package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Iterator;
import logic.MyFirstLogic;
import java.util.ArrayList;

public final class view_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>All records</title>\r\n");
      out.write("<link href=\"css/design.css\" rel=\"stylesheet\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div class=\"recordsBody\">\r\n");
      out.write("\t\t<h1 align=\"center\" class=\"pageHeader\">All records</h1>\r\n");
      out.write("\t\t<hr>\r\n");
      out.write("\t\t<hr>\r\n");
      out.write("\t\t<br>\r\n");
      out.write("\t\t<table align=\"center\" class=\"box\" border=\"1\" bordercolor=\"#ddcef0\">\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<th class=\"header\">Name</th>\r\n");
      out.write("\t\t\t\t<th class=\"header\">Address</th>\r\n");
      out.write("\t\t\t\t<th class=\"header\">Gender</th>\r\n");
      out.write("\t\t\t\t<th class=\"header\">Standard</th>\r\n");
      out.write("\t\t\t\t<th class=\"header\">Contact Number</th>\r\n");
      out.write("\t\t\t\t<th class=\"header\">Option</th>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t");

				ArrayList arrayList = new MyFirstLogic().getRecords(); // Here arrayList holds the data that we have previously fetched from the meta-data
				Iterator iterator = arrayList.iterator(); // Iterator is used to traverse the data in a array list, we can do this also using for each loop but this method is easy to implement
				String[] data;
				while(iterator.hasNext()) {
					data = (String[])iterator.next();
			
      out.write("\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td><b>");
      out.print( data[0] );
      out.write("</b></td>\r\n");
      out.write("\t\t\t\t\t\t<td>");
      out.print( data[1] );
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t<td>");
      out.print( data[2] );
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t<td>");
      out.print( data[3] );
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t<td>");
      out.print( data[4] );
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t<td>Edit | Delete</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t");
 	}
			
      out.write("\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t</div>\r\n");
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
