package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title>Registration of Student</title>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\tfunction validation() {\r\n");
      out.write("\t\tif (document.getElementById('firstName').value == \"\") {\r\n");
      out.write("\t\t\talert('Please enter first name');\r\n");
      out.write("\t\t\tdocument.getElementById('firstName').focus();\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tif (document.getElementById('address').value == \"\") {\r\n");
      out.write("\t\t\talert('Please enter address');\r\n");
      out.write("\t\t\tdocument.getElementById('address').focus();\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tif (document.getElementById('genderMale').checked == false && document.getElementById('genderFemale').checked == false) {\r\n");
      out.write("\t\t\talert('Please select gender');\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tif (document.getElementById('dobDate').value == \"\" || document.getElementById('dobMonth').value == \"\" || document.getElementById('dobYear').value == \"\") {\r\n");
      out.write("\t\t\talert('Please select date of birth');\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tif (document.getElementById('college').value == \"\") {\r\n");
      out.write("\t\t\talert('Please enter college name');\r\n");
      out.write("\t\t\tdocument.getElementById('college').focus();\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tif (document.getElementById('stream').value == \"\") {\r\n");
      out.write("\t\t\talert('Please select stream');\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<h1 align=\"center\"><font color=\"#2952CC\">Student Registration Form</font></h1>\r\n");
      out.write("\t<hr>\r\n");
      out.write("\t<hr>\r\n");
      out.write("\t\r\n");
      out.write("\t<div align=\"center\">\r\n");
      out.write("\t\t<p>\r\n");
      out.write("\t\t\t<font color=\"#CF4141\" size=\"4\">\r\n");
      out.write("\t\t\t\t<b>\r\n");
      out.write("\t\t\t\t\t<i>\r\n");
      out.write("\t\t\t\t\t\t<u>Step:1 -</u> Enter your details in appropriate places.<br>\r\n");
      out.write("\t\t\t\t\t\t<u>Step:2 -</u> Then click on the submit button.\r\n");
      out.write("\t\t\t\t\t</i>\r\n");
      out.write("\t\t\t\t</b>\r\n");
      out.write("\t\t\t</font>\r\n");
      out.write("\t\t</p>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<hr>\r\n");
      out.write("\t<hr>\r\n");
      out.write("\t\r\n");
      out.write("\t<form action=\"");
      out.print( request.getContextPath() );
      out.write("/MFS2.do\" method=\"post\">\r\n");
      out.write("\t\t<table align=\"center\" width=\"600px\">\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<th colspan=\"2\" align=\"center\"><font color=\"#005C00\" size=\"6\">Registration</font></th>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td><b>First Name<font color=\"red\">*</font></b></td>&nbsp;&nbsp;\r\n");
      out.write("\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t<input type=\"text\" placeholder=\"Enter first name\" style=\"width: 100%\" name=\"firstName\" id=\"firstName\">\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td><b>Middle Name</b></td>&nbsp;&nbsp;\r\n");
      out.write("\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t<input type=\"text\" placeholder=\"Enter middle name\" style=\"width: 100%\" name=\"middleName\" id=\"middleName\">\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td><b>Last Name</b></td>\r\n");
      out.write("\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t<input type=\"text\" placeholder=\"Enter last name\" style=\"width: 100%\" name=\"lastName\" id=\"lastName\">\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td><b>Address<font color=\"red\">*</font></b></td>\r\n");
      out.write("\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t<textarea rows=\"4\" cols=\"15\" placeholder=\"Enter address\" style=\"width: 100%\" name=\"address\" id=\"address\"></textarea>\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td><b>Gender<font color=\"red\">*</font></b></td>\r\n");
      out.write("\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t<input type=\"radio\" name=\"gender\" id=\"genderMale\" value=\"Male\"><label>Male</label>&nbsp;&nbsp;\r\n");
      out.write("\t\t\t\t\t<input type=\"radio\" name=\"gender\" id=\"genderFemale\" value=\"Female\"><label>Female</label>\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td><b>Date of birth<font color=\"red\">*</font></b></td>\r\n");
      out.write("\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t<select name=\"dobDate\" id=\"dobDate\">\r\n");
      out.write("\t\t\t\t\t\t<option value=\"\"> -- Select Date --</option>\r\n");
      out.write("\t\t\t\t\t\t<option value=\"01\"> 1</option>\r\n");
      out.write("\t\t\t\t\t\t<option value=\"02\"> 2</option>\r\n");
      out.write("\t\t\t\t\t\t<option value=\"03\"> 3</option>\r\n");
      out.write("\t\t\t\t\t\t<option value=\"04\"> 4</option>\r\n");
      out.write("\t\t\t\t\t\t<option value=\"05\"> 5</option>\r\n");
      out.write("\t\t\t\t\t\t<option value=\"06\"> 6</option>\r\n");
      out.write("\t\t\t\t\t\t<option value=\"07\"> 7</option>\r\n");
      out.write("\t\t\t\t\t\t<option value=\"08\"> 8</option>\r\n");
      out.write("\t\t\t\t\t\t<option value=\"09\"> 9</option>\r\n");
      out.write("\t\t\t\t\t\t<option value=\"10\"> 10</option>\r\n");
      out.write("\t\t\t\t\t\t<option value=\"11\"> 11</option>\r\n");
      out.write("\t\t\t\t\t\t<option value=\"12\"> 12</option>\r\n");
      out.write("\t\t\t\t\t\t<option value=\"13\"> 13</option>\r\n");
      out.write("\t\t\t\t\t\t<option value=\"14\"> 14</option>\r\n");
      out.write("\t\t\t\t\t\t<option value=\"15\"> 15</option>\r\n");
      out.write("\t\t\t\t\t\t<option value=\"16\"> 16</option>\r\n");
      out.write("\t\t\t\t\t\t<option value=\"17\"> 17</option>\r\n");
      out.write("\t\t\t\t\t\t<option value=\"18\"> 18</option>\r\n");
      out.write("\t\t\t\t\t\t<option value=\"19\"> 19</option>\r\n");
      out.write("\t\t\t\t\t\t<option value=\"20\"> 20</option>\r\n");
      out.write("\t\t\t\t\t\t<option value=\"21\"> 21</option>\r\n");
      out.write("\t\t\t\t\t\t<option value=\"22\"> 22</option>\r\n");
      out.write("\t\t\t\t\t\t<option value=\"23\"> 23</option>\r\n");
      out.write("\t\t\t\t\t\t<option value=\"24\"> 24</option>\r\n");
      out.write("\t\t\t\t\t\t<option value=\"25\"> 25</option>\r\n");
      out.write("\t\t\t\t\t\t<option value=\"26\"> 26</option>\r\n");
      out.write("\t\t\t\t\t\t<option value=\"27\"> 27</option>\r\n");
      out.write("\t\t\t\t\t\t<option value=\"28\"> 28</option>\r\n");
      out.write("\t\t\t\t\t\t<option value=\"29\"> 29</option>\r\n");
      out.write("\t\t\t\t\t\t<option value=\"30\"> 30</option>\r\n");
      out.write("\t\t\t\t\t\t<option value=\"31\"> 31</option>\r\n");
      out.write("\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t&nbsp;&nbsp;\r\n");
      out.write("\t\t\t\t\t<select name=\"dobMonth\" id=\"dobMonth\">\r\n");
      out.write("\t\t\t\t\t\t<option value=\"\"> -- Select Month --</option>\r\n");
      out.write("\t\t\t\t\t\t<option value=\"01\"> January</option>\r\n");
      out.write("\t\t\t\t\t\t<option value=\"02\"> February</option>\r\n");
      out.write("\t\t\t\t\t\t<option value=\"03\"> March</option>\r\n");
      out.write("\t\t\t\t\t\t<option value=\"04\"> April</option>\r\n");
      out.write("\t\t\t\t\t\t<option value=\"05\"> May</option>\r\n");
      out.write("\t\t\t\t\t\t<option value=\"06\"> June</option>\r\n");
      out.write("\t\t\t\t\t\t<option value=\"07\"> July</option>\r\n");
      out.write("\t\t\t\t\t\t<option value=\"08\"> August</option>\r\n");
      out.write("\t\t\t\t\t\t<option value=\"09\"> September</option>\r\n");
      out.write("\t\t\t\t\t\t<option value=\"10\"> October</option>\r\n");
      out.write("\t\t\t\t\t\t<option value=\"11\"> November</option>\r\n");
      out.write("\t\t\t\t\t\t<option value=\"12\"> December</option>\r\n");
      out.write("\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t&nbsp;&nbsp;\r\n");
      out.write("\t\t\t\t\t<select name=\"dobYear\" id=\"dobYear\">\r\n");
      out.write("\t\t\t\t\t\t<option value=\"\"> -- Select Year --</option><option value=\"2013\" >2013</option><option value=\"2012\" >2012</option><option value=\"2011\" >2011</option><option value=\"2010\" >2010</option><option value=\"2009\" >2009</option><option value=\"2008\" >2008</option><option value=\"2007\" >2007</option><option value=\"2006\" >2006</option><option value=\"2005\" >2005</option><option value=\"2004\" >2004</option><option value=\"2003\" >2003</option><option value=\"2002\" >2002</option><option value=\"2001\" >2001</option><option value=\"2000\" >2000</option><option value=\"1999\" >1999</option><option value=\"1998\" >1998</option><option value=\"1997\" >1997</option><option value=\"1996\" >1996</option><option value=\"1995\" >1995</option><option value=\"1994\" >1994</option><option value=\"1993\" >1993</option><option value=\"1992\" >1992</option><option value=\"1991\" >1991</option><option value=\"1990\" >1990</option><option value=\"1989\" >1989</option><option value=\"1988\" >1988</option><option value=\"1987\" >1987</option><option value=\"1986\" >1986</option><option value=\"1985\" >1985</option><option value=\"1984\" >1984</option><option value=\"1983\" >1983</option><option value=\"1982\" >1982</option><option value=\"1981\" >1981</option><option value=\"1980\" >1980</option><option value=\"1979\" >1979</option><option value=\"1978\" >1978</option><option value=\"1977\" >1977</option><option value=\"1976\" >1976</option><option value=\"1975\" >1975</option><option value=\"1974\" >1974</option><option value=\"1973\" >1973</option><option value=\"1972\" >1972</option><option value=\"1971\" >1971</option><option value=\"1970\" >1970</option><option value=\"1969\" >1969</option><option value=\"1968\" >1968</option><option value=\"1967\" >1967</option><option value=\"1966\" >1966</option><option value=\"1965\" >1965</option><option value=\"1964\" >1964</option><option value=\"1963\" >1963</option><option value=\"1962\" >1962</option><option value=\"1961\" >1961</option><option value=\"1960\" >1960</option><option value=\"1959\" >1959</option><option value=\"1958\" >1958</option><option value=\"1957\" >1957</option><option value=\"1956\" >1956</option><option value=\"1955\" >1955</option><option value=\"1954\" >1954</option><option value=\"1953\" >1953</option><option value=\"1952\" >1952</option><option value=\"1951\" >1951</option><option value=\"1950\" >1950</option>\r\n");
      out.write("\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td><b>College<font color=\"red\">*</font></b></td>\r\n");
      out.write("\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t<input type=\"text\" placeholder=\"Enter college name\" style=\"width: 100%\" name=\"college\" id=\"college\">\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td><b>Stream<font color=\"red\">*</font></b></td>\r\n");
      out.write("\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t<select name=\"stream\" id=\"stream\">\r\n");
      out.write("\t\t\t\t\t\t<option value=\"\">--Select Stream--</option>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<option value=\"COMPUTER SCIENCE AND ENGINEERING\" > COMPUTER SCIENCE AND ENGINEERING</option>\r\n");
      out.write("\t\t\t\t\t\t<option value=\"INFORMATION TECHNOLOGY\" > INFORMATION TECHNOLOGY</option>\r\n");
      out.write("\t\t\t\t\t\t<option value=\"CIVIL ENGINEERING\" > CIVIL ENGINEERING</option>\r\n");
      out.write("\t\t\t\t\t\t<option value=\"ELECTRICAL ENGINEERING\" > ELECTRICAL ENGINEERING</option>\r\n");
      out.write("\t\t\t\t\t\t<option value=\"ELECTRONICS AND COMMUNICATION ENGINEERING\" > ELECTRONICS AND COMMUNICATION ENGINEERING</option>\r\n");
      out.write("\t\t\t\t\t\t<option value=\"MECHANICAL ENGINEERING\" > MECHANICAL ENGINEERING</option>\r\n");
      out.write("\t\t\t\t\t\t<option value=\"APPLIED ELECTRONICS AND INSTRUMENTATION ENGINEERING\" > APPLIED ELECTRONICS AND INSTRUMENTATION ENGINEERING</option>\r\n");
      out.write("\t\t\t\t\t\t<option value=\"TEXTILE TECHNOLOGY\" > TEXTILE TECHNOLOGY</option>\r\n");
      out.write("\t\t\t\t\t\t<option value=\"LEATHER TECHNOLOGY\" > LEATHER TECHNOLOGY</option>\r\n");
      out.write("\t\t\t\t\t\t<option value=\"CERAMIC ENGINEERING AND TECHNOLOGY\" > CERAMIC ENGINEERING AND TECHNOLOGY</option>\r\n");
      out.write("\t\t\t\t\t\t<option value=\"BIOTECHNOLOGY\" > BIOTECHNOLOGY</option>\r\n");
      out.write("\t\t\t\t\t\t<option value=\"MCA\" > MCA</option>\r\n");
      out.write("\t\t\t\t\t\t<option value=\"BCA\" > BCA</option>\r\n");
      out.write("\t\t\t\t\t\t<option value=\"COMPUTER SCIENCE HONOURS (DEGREE COURSE\" > COMPUTER SCIENCE HONOURS (DEGREE COURSE)</option>\r\n");
      out.write("\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td align=\"center\" colspan=\"2\">\r\n");
      out.write("\t\t\t\t\t<input type=\"submit\" value=\"Submit\" onclick=\"return validation()\">\r\n");
      out.write("\t\t\t\t\t<input type=\"reset\" value=\"Reset\">\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t");

				if(session.getAttribute("msg") != null) {
			
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td colspan=\"2\" align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t\t<font color=\"green\"><b>");
      out.print( session.getAttribute("msg") );
      out.write("</b></font>\r\n");
      out.write("\t\t\t\t\t\t\t");
 session.removeAttribute("msg"); 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t");
	}
			
      out.write("\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td colspan=\"2\" align=\"center\">\r\n");
      out.write("\t\t\t\t\t<a href=\"viewAllRecords.jsp\">\r\n");
      out.write("\t\t\t\t\t\t<font color=\"blue\">\r\n");
      out.write("\t\t\t\t\t\t\t<i>View all records</i>\r\n");
      out.write("\t\t\t\t\t\t</font>\r\n");
      out.write("\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t</table>\r\n");
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
