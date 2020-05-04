package org.apache.jsp.CCEAdmin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class AddPaper_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fif_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005felse;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fform_0026_005fvalidate_005ftheme_005fmethod;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fdiv;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fdiv_0026_005fcssClass;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005finclude_0026_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005factionerror_0026_005fcssClass_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005factionmessage_0026_005fcssClass_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fsx_005fautocompleter_0026_005fname_005flistValue_005flistKey_005flist_005fheaderValue_005fheaderKey_005fcssClass_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005ffielderror_0026_005ftheme_005ffieldName_005fcssClass_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fsx_005fautocompleter_0026_005fname_005flist_005fheaderValue_005fheaderKey_005fcssClass_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fsx_005fautocompleter_0026_005fonchange_005fname_005flistValue_005flistKey_005flist_005fheaderValue_005fheaderKey_005fcssClass_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005ftextfield_0026_005frequired_005fname_005fmaxlength_005fkey_005fcssClass_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005ftextfield_0026_005frequired_005fonkeypress_005fname_005fmaxlength_005fkey_005fcssClass_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005ftextfield_0026_005frequired_005fname_005fmaxlength_005fkey_005fid_005fcssClass_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fset_0026_005fvalue_005fname_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fiterator_0026_005fvar_005fend_005fbegin;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005frequired_005fname_005fmaxlength_005fkey_005fcssClass_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fsubmit_0026_005fvalue_005fcssClass_005faction_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005freset_0026_005fvalue_005fcssClass_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fdiv_0026_005fcssClass_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fs_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005felse = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005fform_0026_005fvalidate_005ftheme_005fmethod = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005fdiv = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005fdiv_0026_005fcssClass = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005finclude_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005factionerror_0026_005fcssClass_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005factionmessage_0026_005fcssClass_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fsx_005fautocompleter_0026_005fname_005flistValue_005flistKey_005flist_005fheaderValue_005fheaderKey_005fcssClass_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005ffielderror_0026_005ftheme_005ffieldName_005fcssClass_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fsx_005fautocompleter_0026_005fname_005flist_005fheaderValue_005fheaderKey_005fcssClass_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fsx_005fautocompleter_0026_005fonchange_005fname_005flistValue_005flistKey_005flist_005fheaderValue_005fheaderKey_005fcssClass_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005frequired_005fname_005fmaxlength_005fkey_005fcssClass_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005frequired_005fonkeypress_005fname_005fmaxlength_005fkey_005fcssClass_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005frequired_005fname_005fmaxlength_005fkey_005fid_005fcssClass_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005fset_0026_005fvalue_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005fiterator_0026_005fvar_005fend_005fbegin = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005frequired_005fname_005fmaxlength_005fkey_005fcssClass_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005fsubmit_0026_005fvalue_005fcssClass_005faction_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005freset_0026_005fvalue_005fcssClass_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005fdiv_0026_005fcssClass_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.release();
    _005fjspx_005ftagPool_005fs_005felse.release();
    _005fjspx_005ftagPool_005fs_005fform_0026_005fvalidate_005ftheme_005fmethod.release();
    _005fjspx_005ftagPool_005fs_005fdiv.release();
    _005fjspx_005ftagPool_005fs_005fdiv_0026_005fcssClass.release();
    _005fjspx_005ftagPool_005fs_005finclude_0026_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fnobody.release();
    _005fjspx_005ftagPool_005fs_005factionerror_0026_005fcssClass_005fnobody.release();
    _005fjspx_005ftagPool_005fs_005factionmessage_0026_005fcssClass_005fnobody.release();
    _005fjspx_005ftagPool_005fsx_005fautocompleter_0026_005fname_005flistValue_005flistKey_005flist_005fheaderValue_005fheaderKey_005fcssClass_005fnobody.release();
    _005fjspx_005ftagPool_005fs_005ffielderror_0026_005ftheme_005ffieldName_005fcssClass_005fnobody.release();
    _005fjspx_005ftagPool_005fsx_005fautocompleter_0026_005fname_005flist_005fheaderValue_005fheaderKey_005fcssClass_005fnobody.release();
    _005fjspx_005ftagPool_005fsx_005fautocompleter_0026_005fonchange_005fname_005flistValue_005flistKey_005flist_005fheaderValue_005fheaderKey_005fcssClass_005fnobody.release();
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005frequired_005fname_005fmaxlength_005fkey_005fcssClass_005fnobody.release();
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005frequired_005fonkeypress_005fname_005fmaxlength_005fkey_005fcssClass_005fnobody.release();
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005frequired_005fname_005fmaxlength_005fkey_005fid_005fcssClass_005fnobody.release();
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.release();
    _005fjspx_005ftagPool_005fs_005fset_0026_005fvalue_005fname_005fnobody.release();
    _005fjspx_005ftagPool_005fs_005fiterator_0026_005fvar_005fend_005fbegin.release();
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005frequired_005fname_005fmaxlength_005fkey_005fcssClass_005fnobody.release();
    _005fjspx_005ftagPool_005fs_005fsubmit_0026_005fvalue_005fcssClass_005faction_005fnobody.release();
    _005fjspx_005ftagPool_005fs_005freset_0026_005fvalue_005fcssClass_005fnobody.release();
    _005fjspx_005ftagPool_005fs_005fdiv_0026_005fcssClass_005fnobody.release();
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
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>CCE | ");
      if (_jspx_meth_s_005fif_005f0(_jspx_page_context))
        return;
      if (_jspx_meth_s_005felse_005f0(_jspx_page_context))
        return;
      out.write(" Scholastic Paper</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t");
      if (_jspx_meth_s_005fform_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("<SCRIPT type=\"text/javascript\">\r\n");
      out.write("function addNew(){\r\n");
      out.write("\tvar addId=document.getElementById('addShow');\r\n");
      out.write("\tvar subPaperName=document.getElementById('subPaperName');\t\r\n");
      out.write("\tvar subPaperShortName=document.getElementById('subPaperShortName');\r\n");
      out.write("\tif(subPaperName.value !=''){\r\n");
      out.write("\t\tif(subPaperShortName.value !=''){\r\n");
      out.write("\t\tvar oddeven=document.getElementById('oddeven');\t\t\t\r\n");
      out.write("\t\tif(oddeven.value =='even'){\r\n");
      out.write("\t\t\taddId.innerHTML +=\"<tr class='even' align='left'>\"+\r\n");
      out.write("\t\t\t\t\t\t\t\t\"<td width='5%'>\"+uniqueID()+\"</td>\"+\r\n");
      out.write("\t\t\t\t\t\t\t\t\"<td width='50%' align='left'>\"+subPaperName.value+\"<input type='hidden' name='subPaper' value='\"+subPaperName.value+\"'/></td>\"+\r\n");
      out.write("\t\t\t\t\t\t\t\t\"<td width='45%' align='left'>\"+subPaperShortName.value+\"<input type='hidden' name='subShortPaper' value='\"+subPaperShortName.value+\"'/></td>\"+\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\"</tr>\";\r\n");
      out.write("\t\t\toddeven.value='odd';\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\telse if(oddeven.value =='odd'){\r\n");
      out.write("\t\t\taddId.innerHTML +=\"<tr class='odd' align='left'>\"+\r\n");
      out.write("\t\t\t\t\t\t\t\t\"<td width='5%'>\"+uniqueID()+\"</td>\"+\r\n");
      out.write("\t\t\t\t\t\t\t\t\"<td width='50%' align='left'>\"+subPaperName.value+\"<input type='hidden' name='subPaper' value='\"+subPaperName.value+\"'/></td>\"+\r\n");
      out.write("\t\t\t\t\t\t\t\t\"<td width='45%' align='left'>\"+subPaperShortName.value+\"<input type='hidden' name='subShortPaper' value='\"+subPaperShortName.value+\"'/></td>\"+\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\"</tr>\";\r\n");
      out.write("\t\t\toddeven.value='even';\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tsubPaperName.value ='';\r\n");
      out.write("\t\tsubPaperShortName.value ='';\t\t\r\n");
      out.write("\t}\r\n");
      out.write("\t\telse\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\talert('Enter both sub paper and it\\'s short name');\r\n");
      out.write("\t\t\tdocument.getElementById('subPaperShortName').focus();\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\telse\r\n");
      out.write("\t{\r\n");
      out.write("\t\talert('Enter both sub paper and it\\'s short name');\r\n");
      out.write("\t\tdocument.getElementById('subPaperName').focus();\r\n");
      out.write("\t}\r\n");
      out.write("\t\t\r\n");
      out.write("}\r\n");
      out.write("var uniqueID = (function() {\r\n");
      out.write("\t   var id = 1; \r\n");
      out.write("\t   return function() { return id++; };  \r\n");
      out.write("\t  })();\t\r\n");
      out.write("</SCRIPT>\r\n");
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

  private boolean _jspx_meth_s_005fif_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:if
    org.apache.struts2.views.jsp.IfTag _jspx_th_s_005fif_005f0 = (org.apache.struts2.views.jsp.IfTag) _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.get(org.apache.struts2.views.jsp.IfTag.class);
    _jspx_th_s_005fif_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005fif_005f0.setParent(null);
    // /CCEAdmin/AddPaper.jsp(9,13) name = test type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fif_005f0.setTest("(paperID == null || paperID.equals('') ||paperID.equals('-1'))");
    int _jspx_eval_s_005fif_005f0 = _jspx_th_s_005fif_005f0.doStartTag();
    if (_jspx_eval_s_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fif_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fif_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fif_005f0.doInitBody();
      }
      do {
        out.write('A');
        out.write('d');
        out.write('d');
        int evalDoAfterBody = _jspx_th_s_005fif_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005fif_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.reuse(_jspx_th_s_005fif_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.reuse(_jspx_th_s_005fif_005f0);
    return false;
  }

  private boolean _jspx_meth_s_005felse_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:else
    org.apache.struts2.views.jsp.ElseTag _jspx_th_s_005felse_005f0 = (org.apache.struts2.views.jsp.ElseTag) _005fjspx_005ftagPool_005fs_005felse.get(org.apache.struts2.views.jsp.ElseTag.class);
    _jspx_th_s_005felse_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005felse_005f0.setParent(null);
    int _jspx_eval_s_005felse_005f0 = _jspx_th_s_005felse_005f0.doStartTag();
    if (_jspx_eval_s_005felse_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005felse_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005felse_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005felse_005f0.doInitBody();
      }
      do {
        out.write("Edit");
        int evalDoAfterBody = _jspx_th_s_005felse_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005felse_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005felse_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005felse.reuse(_jspx_th_s_005felse_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005felse.reuse(_jspx_th_s_005felse_005f0);
    return false;
  }

  private boolean _jspx_meth_s_005fform_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:form
    org.apache.struts2.views.jsp.ui.FormTag _jspx_th_s_005fform_005f0 = (org.apache.struts2.views.jsp.ui.FormTag) _005fjspx_005ftagPool_005fs_005fform_0026_005fvalidate_005ftheme_005fmethod.get(org.apache.struts2.views.jsp.ui.FormTag.class);
    _jspx_th_s_005fform_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005fform_005f0.setParent(null);
    // /CCEAdmin/AddPaper.jsp(12,1) name = theme type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fform_005f0.setTheme("simple");
    // /CCEAdmin/AddPaper.jsp(12,1) name = method type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fform_005f0.setMethod("post");
    // /CCEAdmin/AddPaper.jsp(12,1) name = validate type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fform_005f0.setValidate("true");
    int _jspx_eval_s_005fform_005f0 = _jspx_th_s_005fform_005f0.doStartTag();
    if (_jspx_eval_s_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fform_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fform_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fform_005f0.doInitBody();
      }
      do {
        out.write('\r');
        out.write('\n');
        out.write('	');
        if (_jspx_meth_s_005fdiv_005f0(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write('\r');
        out.write('\n');
        int evalDoAfterBody = _jspx_th_s_005fform_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005fform_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005fform_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fform_0026_005fvalidate_005ftheme_005fmethod.reuse(_jspx_th_s_005fform_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fform_0026_005fvalidate_005ftheme_005fmethod.reuse(_jspx_th_s_005fform_005f0);
    return false;
  }

  private boolean _jspx_meth_s_005fdiv_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:div
    org.apache.struts2.views.jsp.ui.DivTag _jspx_th_s_005fdiv_005f0 = (org.apache.struts2.views.jsp.ui.DivTag) _005fjspx_005ftagPool_005fs_005fdiv.get(org.apache.struts2.views.jsp.ui.DivTag.class);
    _jspx_th_s_005fdiv_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005fdiv_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    int _jspx_eval_s_005fdiv_005f0 = _jspx_th_s_005fdiv_005f0.doStartTag();
    if (_jspx_eval_s_005fdiv_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fdiv_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fdiv_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fdiv_005f0.doInitBody();
      }
      do {
        out.write('\r');
        out.write('\n');
        out.write('	');
        if (_jspx_meth_s_005fdiv_005f1(_jspx_th_s_005fdiv_005f0, _jspx_page_context))
          return true;
        out.write('\r');
        out.write('\n');
        out.write('	');
        if (_jspx_meth_s_005finclude_005f2(_jspx_th_s_005fdiv_005f0, _jspx_page_context))
          return true;
        out.write('\r');
        out.write('\n');
        int evalDoAfterBody = _jspx_th_s_005fdiv_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005fdiv_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005fdiv_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fdiv.reuse(_jspx_th_s_005fdiv_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fdiv.reuse(_jspx_th_s_005fdiv_005f0);
    return false;
  }

  private boolean _jspx_meth_s_005fdiv_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fdiv_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:div
    org.apache.struts2.views.jsp.ui.DivTag _jspx_th_s_005fdiv_005f1 = (org.apache.struts2.views.jsp.ui.DivTag) _005fjspx_005ftagPool_005fs_005fdiv.get(org.apache.struts2.views.jsp.ui.DivTag.class);
    _jspx_th_s_005fdiv_005f1.setPageContext(_jspx_page_context);
    _jspx_th_s_005fdiv_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fdiv_005f0);
    int _jspx_eval_s_005fdiv_005f1 = _jspx_th_s_005fdiv_005f1.doStartTag();
    if (_jspx_eval_s_005fdiv_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fdiv_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fdiv_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fdiv_005f1.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t ");
        if (_jspx_meth_s_005fdiv_005f2(_jspx_th_s_005fdiv_005f1, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t   ");
        if (_jspx_meth_s_005fdiv_005f3(_jspx_th_s_005fdiv_005f1, _jspx_page_context))
          return true;
        out.write('\r');
        out.write('\n');
        out.write('	');
        int evalDoAfterBody = _jspx_th_s_005fdiv_005f1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005fdiv_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005fdiv_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fdiv.reuse(_jspx_th_s_005fdiv_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fdiv.reuse(_jspx_th_s_005fdiv_005f1);
    return false;
  }

  private boolean _jspx_meth_s_005fdiv_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fdiv_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:div
    org.apache.struts2.views.jsp.ui.DivTag _jspx_th_s_005fdiv_005f2 = (org.apache.struts2.views.jsp.ui.DivTag) _005fjspx_005ftagPool_005fs_005fdiv_0026_005fcssClass.get(org.apache.struts2.views.jsp.ui.DivTag.class);
    _jspx_th_s_005fdiv_005f2.setPageContext(_jspx_page_context);
    _jspx_th_s_005fdiv_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fdiv_005f1);
    // /CCEAdmin/AddPaper.jsp(15,2) name = cssClass type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fdiv_005f2.setCssClass("main1");
    int _jspx_eval_s_005fdiv_005f2 = _jspx_th_s_005fdiv_005f2.doStartTag();
    if (_jspx_eval_s_005fdiv_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fdiv_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fdiv_005f2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fdiv_005f2.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("    \t");
        if (_jspx_meth_s_005finclude_005f0(_jspx_th_s_005fdiv_005f2, _jspx_page_context))
          return true;
        out.write('\r');
        out.write('\n');
        out.write('	');
        int evalDoAfterBody = _jspx_th_s_005fdiv_005f2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005fdiv_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005fdiv_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fdiv_0026_005fcssClass.reuse(_jspx_th_s_005fdiv_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fdiv_0026_005fcssClass.reuse(_jspx_th_s_005fdiv_005f2);
    return false;
  }

  private boolean _jspx_meth_s_005finclude_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fdiv_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:include
    org.apache.struts2.views.jsp.IncludeTag _jspx_th_s_005finclude_005f0 = (org.apache.struts2.views.jsp.IncludeTag) _005fjspx_005ftagPool_005fs_005finclude_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.IncludeTag.class);
    _jspx_th_s_005finclude_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005finclude_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fdiv_005f2);
    // /CCEAdmin/AddPaper.jsp(16,5) name = value type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005finclude_005f0.setValue("../UserControler/Header.jsp");
    int _jspx_eval_s_005finclude_005f0 = _jspx_th_s_005finclude_005f0.doStartTag();
    if (_jspx_th_s_005finclude_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005finclude_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005finclude_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005finclude_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005finclude_005f0);
    return false;
  }

  private boolean _jspx_meth_s_005fdiv_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fdiv_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:div
    org.apache.struts2.views.jsp.ui.DivTag _jspx_th_s_005fdiv_005f3 = (org.apache.struts2.views.jsp.ui.DivTag) _005fjspx_005ftagPool_005fs_005fdiv_0026_005fcssClass.get(org.apache.struts2.views.jsp.ui.DivTag.class);
    _jspx_th_s_005fdiv_005f3.setPageContext(_jspx_page_context);
    _jspx_th_s_005fdiv_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fdiv_005f1);
    // /CCEAdmin/AddPaper.jsp(18,4) name = cssClass type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fdiv_005f3.setCssClass("container");
    int _jspx_eval_s_005fdiv_005f3 = _jspx_th_s_005fdiv_005f3.doStartTag();
    if (_jspx_eval_s_005fdiv_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fdiv_005f3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fdiv_005f3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fdiv_005f3.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t");
        if (_jspx_meth_s_005fdiv_005f4(_jspx_th_s_005fdiv_005f3, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t");
        int evalDoAfterBody = _jspx_th_s_005fdiv_005f3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005fdiv_005f3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005fdiv_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fdiv_0026_005fcssClass.reuse(_jspx_th_s_005fdiv_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fdiv_0026_005fcssClass.reuse(_jspx_th_s_005fdiv_005f3);
    return false;
  }

  private boolean _jspx_meth_s_005fdiv_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fdiv_005f3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:div
    org.apache.struts2.views.jsp.ui.DivTag _jspx_th_s_005fdiv_005f4 = (org.apache.struts2.views.jsp.ui.DivTag) _005fjspx_005ftagPool_005fs_005fdiv_0026_005fcssClass.get(org.apache.struts2.views.jsp.ui.DivTag.class);
    _jspx_th_s_005fdiv_005f4.setPageContext(_jspx_page_context);
    _jspx_th_s_005fdiv_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fdiv_005f3);
    // /CCEAdmin/AddPaper.jsp(19,2) name = cssClass type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fdiv_005f4.setCssClass("container1");
    int _jspx_eval_s_005fdiv_005f4 = _jspx_th_s_005fdiv_005f4.doStartTag();
    if (_jspx_eval_s_005fdiv_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fdiv_005f4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fdiv_005f4.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fdiv_005f4.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\t");
        if (_jspx_meth_s_005fdiv_005f5(_jspx_th_s_005fdiv_005f4, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t");
        if (_jspx_meth_s_005fdiv_005f6(_jspx_th_s_005fdiv_005f4, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t");
        if (_jspx_meth_s_005fdiv_005f7(_jspx_th_s_005fdiv_005f4, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t");
        int evalDoAfterBody = _jspx_th_s_005fdiv_005f4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005fdiv_005f4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005fdiv_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fdiv_0026_005fcssClass.reuse(_jspx_th_s_005fdiv_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fdiv_0026_005fcssClass.reuse(_jspx_th_s_005fdiv_005f4);
    return false;
  }

  private boolean _jspx_meth_s_005fdiv_005f5(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fdiv_005f4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:div
    org.apache.struts2.views.jsp.ui.DivTag _jspx_th_s_005fdiv_005f5 = (org.apache.struts2.views.jsp.ui.DivTag) _005fjspx_005ftagPool_005fs_005fdiv_0026_005fcssClass.get(org.apache.struts2.views.jsp.ui.DivTag.class);
    _jspx_th_s_005fdiv_005f5.setPageContext(_jspx_page_context);
    _jspx_th_s_005fdiv_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fdiv_005f4);
    // /CCEAdmin/AddPaper.jsp(20,3) name = cssClass type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fdiv_005f5.setCssClass("wrapper");
    int _jspx_eval_s_005fdiv_005f5 = _jspx_th_s_005fdiv_005f5.doStartTag();
    if (_jspx_eval_s_005fdiv_005f5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fdiv_005f5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fdiv_005f5.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fdiv_005f5.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\t    ");
        if (_jspx_meth_s_005finclude_005f1(_jspx_th_s_005fdiv_005f5, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t");
        int evalDoAfterBody = _jspx_th_s_005fdiv_005f5.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005fdiv_005f5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005fdiv_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fdiv_0026_005fcssClass.reuse(_jspx_th_s_005fdiv_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fdiv_0026_005fcssClass.reuse(_jspx_th_s_005fdiv_005f5);
    return false;
  }

  private boolean _jspx_meth_s_005finclude_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fdiv_005f5, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:include
    org.apache.struts2.views.jsp.IncludeTag _jspx_th_s_005finclude_005f1 = (org.apache.struts2.views.jsp.IncludeTag) _005fjspx_005ftagPool_005fs_005finclude_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.IncludeTag.class);
    _jspx_th_s_005finclude_005f1.setPageContext(_jspx_page_context);
    _jspx_th_s_005finclude_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fdiv_005f5);
    // /CCEAdmin/AddPaper.jsp(21,7) name = value type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005finclude_005f1.setValue("../UserControler/LeftPanel.jsp");
    int _jspx_eval_s_005finclude_005f1 = _jspx_th_s_005finclude_005f1.doStartTag();
    if (_jspx_th_s_005finclude_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005finclude_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005finclude_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005finclude_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005finclude_005f1);
    return false;
  }

  private boolean _jspx_meth_s_005fdiv_005f6(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fdiv_005f4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:div
    org.apache.struts2.views.jsp.ui.DivTag _jspx_th_s_005fdiv_005f6 = (org.apache.struts2.views.jsp.ui.DivTag) _005fjspx_005ftagPool_005fs_005fdiv_0026_005fcssClass.get(org.apache.struts2.views.jsp.ui.DivTag.class);
    _jspx_th_s_005fdiv_005f6.setPageContext(_jspx_page_context);
    _jspx_th_s_005fdiv_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fdiv_005f4);
    // /CCEAdmin/AddPaper.jsp(23,4) name = cssClass type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fdiv_005f6.setCssClass("rightside");
    int _jspx_eval_s_005fdiv_005f6 = _jspx_th_s_005fdiv_005f6.doStartTag();
    if (_jspx_eval_s_005fdiv_005f6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fdiv_005f6 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fdiv_005f6.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fdiv_005f6.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t<h1>");
        if (_jspx_meth_s_005fif_005f1(_jspx_th_s_005fdiv_005f6, _jspx_page_context))
          return true;
        if (_jspx_meth_s_005felse_005f1(_jspx_th_s_005fdiv_005f6, _jspx_page_context))
          return true;
        out.write(" Scholastic Paper  </h1>\r\n");
        out.write("\t\t\t\t\t\t<div class=\"form\">\r\n");
        out.write("\t\t\t\t\t\t\t<table >\t\t\t\t\t\t\r\n");
        out.write("\t\t\t\t\t\t\t\t<tr>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t<td colspan=\"3\" align=\"center\">");
        if (_jspx_meth_s_005fhidden_005f0(_jspx_th_s_005fdiv_005f6, _jspx_page_context))
          return true;
        if (_jspx_meth_s_005factionerror_005f0(_jspx_th_s_005fdiv_005f6, _jspx_page_context))
          return true;
        if (_jspx_meth_s_005factionmessage_005f0(_jspx_th_s_005fdiv_005f6, _jspx_page_context))
          return true;
        out.write(" </td>\t\t\t\t\t\t\t\t\r\n");
        out.write("\t\t\t\t\t\t\t\t</tr>\r\n");
        out.write("\t\t\t\t\t\t\t\t<tr >\r\n");
        out.write("\t\t\t\t\t\t\t\t\t<td style=\"width: 25%\">Exam Category <em>*</em> :</td>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t<td style=\"width: 35%\">");
        if (_jspx_meth_sx_005fautocompleter_005f0(_jspx_th_s_005fdiv_005f6, _jspx_page_context))
          return true;
        out.write("</td>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t<td style=\"width: 40%\">");
        if (_jspx_meth_s_005ffielderror_005f0(_jspx_th_s_005fdiv_005f6, _jspx_page_context))
          return true;
        out.write("</td>\r\n");
        out.write("\t\t\t\t\t\t\t\t</tr>\t\t\t\t\t\t\t\r\n");
        out.write("\t\t\t\t\t\t\t\t<tr class=\"even\" >\r\n");
        out.write("\t\t\t\t\t\t\t\t\t<td>Academic Year <em>*</em> :</td>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t<td>");
        if (_jspx_meth_sx_005fautocompleter_005f1(_jspx_th_s_005fdiv_005f6, _jspx_page_context))
          return true;
        out.write("</td>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t<td>");
        if (_jspx_meth_s_005ffielderror_005f1(_jspx_th_s_005fdiv_005f6, _jspx_page_context))
          return true;
        out.write("</td>\r\n");
        out.write("\t\t\t\t\t\t\t\t</tr>\r\n");
        out.write("\t\t\t\t\t\t\t\t<tr >\r\n");
        out.write("\t\t\t\t\t\t\t\t\t<td>Standard<em>*</em> :</td>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t<td>");
        if (_jspx_meth_sx_005fautocompleter_005f2(_jspx_th_s_005fdiv_005f6, _jspx_page_context))
          return true;
        out.write("</td>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t<td>");
        if (_jspx_meth_s_005ffielderror_005f2(_jspx_th_s_005fdiv_005f6, _jspx_page_context))
          return true;
        out.write("</td>\r\n");
        out.write("\t\t\t\t\t\t\t\t</tr>\r\n");
        out.write("\t\t\t\t\t\t\t\t<tr class=\"even\">\r\n");
        out.write("\t\t\t\t\t\t\t\t\t<td>Subject<em>*</em> :</td>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t<td id=\"sub\">");
        if (_jspx_meth_sx_005fautocompleter_005f3(_jspx_th_s_005fdiv_005f6, _jspx_page_context))
          return true;
        out.write("</td>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t<td>");
        if (_jspx_meth_s_005ffielderror_005f3(_jspx_th_s_005fdiv_005f6, _jspx_page_context))
          return true;
        out.write("</td>\r\n");
        out.write("\t\t\t\t\t\t\t\t</tr>\r\n");
        out.write("\t\t\t\t\t\t\t\t<tr  >\r\n");
        out.write("\t\t\t\t\t\t\t\t\t<td>Paper <em>*</em> :</td>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t<td>");
        if (_jspx_meth_s_005ftextfield_005f0(_jspx_th_s_005fdiv_005f6, _jspx_page_context))
          return true;
        out.write("</td>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t<td>");
        if (_jspx_meth_s_005ffielderror_005f4(_jspx_th_s_005fdiv_005f6, _jspx_page_context))
          return true;
        out.write("</td>\r\n");
        out.write("\t\t\t\t\t\t\t\t</tr>\r\n");
        out.write("\t\t\t\t\t\t\t\t<tr  >\r\n");
        out.write("\t\t\t\t\t\t\t\t\t<td>Paper Short Name <em>*</em> :</td>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t<td>");
        if (_jspx_meth_s_005ftextfield_005f1(_jspx_th_s_005fdiv_005f6, _jspx_page_context))
          return true;
        out.write("</td>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t<td>");
        if (_jspx_meth_s_005ffielderror_005f5(_jspx_th_s_005fdiv_005f6, _jspx_page_context))
          return true;
        out.write("</td>\r\n");
        out.write("\t\t\t\t\t\t\t\t</tr>\r\n");
        out.write("\t\t\t\t\t\t\t\t<tr class=\"even\" >\r\n");
        out.write("\t\t\t\t\t\t\t\t\t<td>Marks <em>*</em> :</td>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t<td>");
        if (_jspx_meth_s_005ftextfield_005f2(_jspx_th_s_005fdiv_005f6, _jspx_page_context))
          return true;
        out.write("</td>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t<td>");
        if (_jspx_meth_s_005ffielderror_005f6(_jspx_th_s_005fdiv_005f6, _jspx_page_context))
          return true;
        out.write("</td>\r\n");
        out.write("\t\t\t\t\t\t\t\t</tr>\r\n");
        out.write("\t\t\t\t\t\t\t\t<tr>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t<td>Sub Paper :</td>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t<td>");
        if (_jspx_meth_s_005ftextfield_005f3(_jspx_th_s_005fdiv_005f6, _jspx_page_context))
          return true;
        out.write("</td>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t<td>");
        if (_jspx_meth_s_005fhidden_005f1(_jspx_th_s_005fdiv_005f6, _jspx_page_context))
          return true;
        out.write("</td>\r\n");
        out.write("\t\t\t\t\t\t\t\t</tr>\r\n");
        out.write("\t\t\t\t\t\t\t\t<tr>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t<td>Sub Paper Short Name :</td>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t<td>");
        if (_jspx_meth_s_005ftextfield_005f4(_jspx_th_s_005fdiv_005f6, _jspx_page_context))
          return true;
        out.write("</td>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t<td>");
        if (_jspx_meth_s_005fhidden_005f2(_jspx_th_s_005fdiv_005f6, _jspx_page_context))
          return true;
        out.write("<input  value=\"Add\" class=\"blue-button\" style=\"width: 30px\"  name=\"add\" onclick=\"addNew()\" /></td>\r\n");
        out.write("\t\t\t\t\t\t\t\t</tr>\r\n");
        out.write("\t\t\t\t\t\t\t\t<tr valign=\"top\">\r\n");
        out.write("\t\t\t\t\t\t\t\t\t<td colspan=\"3\" style=\"width: 100%\">\t\t\t\t\t\t\t\t\t\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t<table cellpadding=\"0\" cellspacing=\"0\" border=\"1\" width=\"100%\" >\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t<tr valign=\"top\" align=\"center\">\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t<th width=\"5%\">#</th>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t<th width=\"50%\">Sub Paper Name</th>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t<th width=\"45%\">Sub Paper Short Name</th>\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td colspan=\"3\" valign=\"top\" width=\"100%\">\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div style=\"overflow:auto; height:130px;width:100%;\" >\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<table  align=\"center\" border=\"1\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\">\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<tbody id=\"addShow\">\t\t\t\t\t\t\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
        if (_jspx_meth_s_005fif_005f2(_jspx_th_s_005fdiv_005f6, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</tbody>\t\t\t\t\t\t\t\t\t\t\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</table>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t</td>\t\t\t\t\t\t\t\t\t\t\t\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t</tr>\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t</table>\t\t\t\t\t\t\t\t\r\n");
        out.write("\t\t\t\t\t\t\t\t\t</td>\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
        out.write("\t\t\t\t\t\t\t\t</tr>\t\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
        out.write("\t\t\t\t\t\t\t\t<tr class=\"even\">\r\n");
        out.write("\t\t\t\t\t\t\t\t\t<td colspan=\"3\">\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t");
        if (_jspx_meth_s_005fif_005f4(_jspx_th_s_005fdiv_005f6, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t");
        if (_jspx_meth_s_005felse_005f2(_jspx_th_s_005fdiv_005f6, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t<br class=\"clear\" />\r\n");
        out.write("\t\t\t\t\t\t\t\t\t</td>\r\n");
        out.write("\t\t\t\t\t\t\t\t</tr>\t\t\t\t\t\t\t\r\n");
        out.write("\t\t\t\t\t\t\t</table>\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
        out.write("                        </div>\r\n");
        out.write("\t\t\t   ");
        int evalDoAfterBody = _jspx_th_s_005fdiv_005f6.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005fdiv_005f6 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005fdiv_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fdiv_0026_005fcssClass.reuse(_jspx_th_s_005fdiv_005f6);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fdiv_0026_005fcssClass.reuse(_jspx_th_s_005fdiv_005f6);
    return false;
  }

  private boolean _jspx_meth_s_005fif_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fdiv_005f6, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:if
    org.apache.struts2.views.jsp.IfTag _jspx_th_s_005fif_005f1 = (org.apache.struts2.views.jsp.IfTag) _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.get(org.apache.struts2.views.jsp.IfTag.class);
    _jspx_th_s_005fif_005f1.setPageContext(_jspx_page_context);
    _jspx_th_s_005fif_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fdiv_005f6);
    // /CCEAdmin/AddPaper.jsp(24,10) name = test type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fif_005f1.setTest("(paperID == null || paperID.equals('')||paperID.equals('-1'))");
    int _jspx_eval_s_005fif_005f1 = _jspx_th_s_005fif_005f1.doStartTag();
    if (_jspx_eval_s_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fif_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fif_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fif_005f1.doInitBody();
      }
      do {
        out.write('A');
        out.write('d');
        out.write('d');
        int evalDoAfterBody = _jspx_th_s_005fif_005f1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005fif_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005fif_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.reuse(_jspx_th_s_005fif_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.reuse(_jspx_th_s_005fif_005f1);
    return false;
  }

  private boolean _jspx_meth_s_005felse_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fdiv_005f6, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:else
    org.apache.struts2.views.jsp.ElseTag _jspx_th_s_005felse_005f1 = (org.apache.struts2.views.jsp.ElseTag) _005fjspx_005ftagPool_005fs_005felse.get(org.apache.struts2.views.jsp.ElseTag.class);
    _jspx_th_s_005felse_005f1.setPageContext(_jspx_page_context);
    _jspx_th_s_005felse_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fdiv_005f6);
    int _jspx_eval_s_005felse_005f1 = _jspx_th_s_005felse_005f1.doStartTag();
    if (_jspx_eval_s_005felse_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005felse_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005felse_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005felse_005f1.doInitBody();
      }
      do {
        out.write("Edit");
        int evalDoAfterBody = _jspx_th_s_005felse_005f1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005felse_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005felse_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005felse.reuse(_jspx_th_s_005felse_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005felse.reuse(_jspx_th_s_005felse_005f1);
    return false;
  }

  private boolean _jspx_meth_s_005fhidden_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fdiv_005f6, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:hidden
    org.apache.struts2.views.jsp.ui.HiddenTag _jspx_th_s_005fhidden_005f0 = (org.apache.struts2.views.jsp.ui.HiddenTag) _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fnobody.get(org.apache.struts2.views.jsp.ui.HiddenTag.class);
    _jspx_th_s_005fhidden_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005fhidden_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fdiv_005f6);
    // /CCEAdmin/AddPaper.jsp(28,40) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f0.setValue("%{paperID}");
    // /CCEAdmin/AddPaper.jsp(28,40) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f0.setName("paperID");
    int _jspx_eval_s_005fhidden_005f0 = _jspx_th_s_005fhidden_005f0.doStartTag();
    if (_jspx_th_s_005fhidden_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fnobody.reuse(_jspx_th_s_005fhidden_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fnobody.reuse(_jspx_th_s_005fhidden_005f0);
    return false;
  }

  private boolean _jspx_meth_s_005factionerror_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fdiv_005f6, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:actionerror
    org.apache.struts2.views.jsp.ui.ActionErrorTag _jspx_th_s_005factionerror_005f0 = (org.apache.struts2.views.jsp.ui.ActionErrorTag) _005fjspx_005ftagPool_005fs_005factionerror_0026_005fcssClass_005fnobody.get(org.apache.struts2.views.jsp.ui.ActionErrorTag.class);
    _jspx_th_s_005factionerror_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005factionerror_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fdiv_005f6);
    // /CCEAdmin/AddPaper.jsp(28,85) name = cssClass type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005factionerror_005f0.setCssClass("error");
    int _jspx_eval_s_005factionerror_005f0 = _jspx_th_s_005factionerror_005f0.doStartTag();
    if (_jspx_th_s_005factionerror_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005factionerror_0026_005fcssClass_005fnobody.reuse(_jspx_th_s_005factionerror_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005factionerror_0026_005fcssClass_005fnobody.reuse(_jspx_th_s_005factionerror_005f0);
    return false;
  }

  private boolean _jspx_meth_s_005factionmessage_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fdiv_005f6, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:actionmessage
    org.apache.struts2.views.jsp.ui.ActionMessageTag _jspx_th_s_005factionmessage_005f0 = (org.apache.struts2.views.jsp.ui.ActionMessageTag) _005fjspx_005ftagPool_005fs_005factionmessage_0026_005fcssClass_005fnobody.get(org.apache.struts2.views.jsp.ui.ActionMessageTag.class);
    _jspx_th_s_005factionmessage_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005factionmessage_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fdiv_005f6);
    // /CCEAdmin/AddPaper.jsp(28,119) name = cssClass type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005factionmessage_005f0.setCssClass("msg");
    int _jspx_eval_s_005factionmessage_005f0 = _jspx_th_s_005factionmessage_005f0.doStartTag();
    if (_jspx_th_s_005factionmessage_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005factionmessage_0026_005fcssClass_005fnobody.reuse(_jspx_th_s_005factionmessage_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005factionmessage_0026_005fcssClass_005fnobody.reuse(_jspx_th_s_005factionmessage_005f0);
    return false;
  }

  private boolean _jspx_meth_sx_005fautocompleter_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fdiv_005f6, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sx:autocompleter
    org.apache.struts2.dojo.views.jsp.ui.AutocompleterTag _jspx_th_sx_005fautocompleter_005f0 = (org.apache.struts2.dojo.views.jsp.ui.AutocompleterTag) _005fjspx_005ftagPool_005fsx_005fautocompleter_0026_005fname_005flistValue_005flistKey_005flist_005fheaderValue_005fheaderKey_005fcssClass_005fnobody.get(org.apache.struts2.dojo.views.jsp.ui.AutocompleterTag.class);
    _jspx_th_sx_005fautocompleter_005f0.setPageContext(_jspx_page_context);
    _jspx_th_sx_005fautocompleter_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fdiv_005f6);
    // /CCEAdmin/AddPaper.jsp(32,32) name = headerKey type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sx_005fautocompleter_005f0.setHeaderKey("");
    // /CCEAdmin/AddPaper.jsp(32,32) name = headerValue type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sx_005fautocompleter_005f0.setHeaderValue("Select");
    // /CCEAdmin/AddPaper.jsp(32,32) name = list type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sx_005fautocompleter_005f0.setList("categoryList");
    // /CCEAdmin/AddPaper.jsp(32,32) name = listKey type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sx_005fautocompleter_005f0.setListKey("firstVal");
    // /CCEAdmin/AddPaper.jsp(32,32) name = listValue type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sx_005fautocompleter_005f0.setListValue("secondVal");
    // /CCEAdmin/AddPaper.jsp(32,32) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sx_005fautocompleter_005f0.setName("examCategory");
    // /CCEAdmin/AddPaper.jsp(32,32) name = cssClass type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sx_005fautocompleter_005f0.setCssClass("combobox");
    int _jspx_eval_sx_005fautocompleter_005f0 = _jspx_th_sx_005fautocompleter_005f0.doStartTag();
    if (_jspx_th_sx_005fautocompleter_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fsx_005fautocompleter_0026_005fname_005flistValue_005flistKey_005flist_005fheaderValue_005fheaderKey_005fcssClass_005fnobody.reuse(_jspx_th_sx_005fautocompleter_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fsx_005fautocompleter_0026_005fname_005flistValue_005flistKey_005flist_005fheaderValue_005fheaderKey_005fcssClass_005fnobody.reuse(_jspx_th_sx_005fautocompleter_005f0);
    return false;
  }

  private boolean _jspx_meth_s_005ffielderror_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fdiv_005f6, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:fielderror
    org.apache.struts2.views.jsp.ui.FieldErrorTag _jspx_th_s_005ffielderror_005f0 = (org.apache.struts2.views.jsp.ui.FieldErrorTag) _005fjspx_005ftagPool_005fs_005ffielderror_0026_005ftheme_005ffieldName_005fcssClass_005fnobody.get(org.apache.struts2.views.jsp.ui.FieldErrorTag.class);
    _jspx_th_s_005ffielderror_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005ffielderror_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fdiv_005f6);
    // /CCEAdmin/AddPaper.jsp(33,32) name = fieldName type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ffielderror_005f0.setFieldName("examCategory");
    // /CCEAdmin/AddPaper.jsp(33,32) name = theme type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ffielderror_005f0.setTheme("simple");
    // /CCEAdmin/AddPaper.jsp(33,32) name = cssClass type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ffielderror_005f0.setCssClass("error");
    int _jspx_eval_s_005ffielderror_005f0 = _jspx_th_s_005ffielderror_005f0.doStartTag();
    if (_jspx_th_s_005ffielderror_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ffielderror_0026_005ftheme_005ffieldName_005fcssClass_005fnobody.reuse(_jspx_th_s_005ffielderror_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ffielderror_0026_005ftheme_005ffieldName_005fcssClass_005fnobody.reuse(_jspx_th_s_005ffielderror_005f0);
    return false;
  }

  private boolean _jspx_meth_sx_005fautocompleter_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fdiv_005f6, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sx:autocompleter
    org.apache.struts2.dojo.views.jsp.ui.AutocompleterTag _jspx_th_sx_005fautocompleter_005f1 = (org.apache.struts2.dojo.views.jsp.ui.AutocompleterTag) _005fjspx_005ftagPool_005fsx_005fautocompleter_0026_005fname_005flist_005fheaderValue_005fheaderKey_005fcssClass_005fnobody.get(org.apache.struts2.dojo.views.jsp.ui.AutocompleterTag.class);
    _jspx_th_sx_005fautocompleter_005f1.setPageContext(_jspx_page_context);
    _jspx_th_sx_005fautocompleter_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fdiv_005f6);
    // /CCEAdmin/AddPaper.jsp(37,13) name = headerKey type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sx_005fautocompleter_005f1.setHeaderKey("");
    // /CCEAdmin/AddPaper.jsp(37,13) name = headerValue type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sx_005fautocompleter_005f1.setHeaderValue("Select");
    // /CCEAdmin/AddPaper.jsp(37,13) name = list type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sx_005fautocompleter_005f1.setList("academicYearList");
    // /CCEAdmin/AddPaper.jsp(37,13) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sx_005fautocompleter_005f1.setName("academicYear");
    // /CCEAdmin/AddPaper.jsp(37,13) name = cssClass type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sx_005fautocompleter_005f1.setCssClass("combobox");
    int _jspx_eval_sx_005fautocompleter_005f1 = _jspx_th_sx_005fautocompleter_005f1.doStartTag();
    if (_jspx_th_sx_005fautocompleter_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fsx_005fautocompleter_0026_005fname_005flist_005fheaderValue_005fheaderKey_005fcssClass_005fnobody.reuse(_jspx_th_sx_005fautocompleter_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fsx_005fautocompleter_0026_005fname_005flist_005fheaderValue_005fheaderKey_005fcssClass_005fnobody.reuse(_jspx_th_sx_005fautocompleter_005f1);
    return false;
  }

  private boolean _jspx_meth_s_005ffielderror_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fdiv_005f6, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:fielderror
    org.apache.struts2.views.jsp.ui.FieldErrorTag _jspx_th_s_005ffielderror_005f1 = (org.apache.struts2.views.jsp.ui.FieldErrorTag) _005fjspx_005ftagPool_005fs_005ffielderror_0026_005ftheme_005ffieldName_005fcssClass_005fnobody.get(org.apache.struts2.views.jsp.ui.FieldErrorTag.class);
    _jspx_th_s_005ffielderror_005f1.setPageContext(_jspx_page_context);
    _jspx_th_s_005ffielderror_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fdiv_005f6);
    // /CCEAdmin/AddPaper.jsp(38,13) name = fieldName type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ffielderror_005f1.setFieldName("academicYear");
    // /CCEAdmin/AddPaper.jsp(38,13) name = theme type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ffielderror_005f1.setTheme("simple");
    // /CCEAdmin/AddPaper.jsp(38,13) name = cssClass type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ffielderror_005f1.setCssClass("error");
    int _jspx_eval_s_005ffielderror_005f1 = _jspx_th_s_005ffielderror_005f1.doStartTag();
    if (_jspx_th_s_005ffielderror_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ffielderror_0026_005ftheme_005ffieldName_005fcssClass_005fnobody.reuse(_jspx_th_s_005ffielderror_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ffielderror_0026_005ftheme_005ffieldName_005fcssClass_005fnobody.reuse(_jspx_th_s_005ffielderror_005f1);
    return false;
  }

  private boolean _jspx_meth_sx_005fautocompleter_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fdiv_005f6, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sx:autocompleter
    org.apache.struts2.dojo.views.jsp.ui.AutocompleterTag _jspx_th_sx_005fautocompleter_005f2 = (org.apache.struts2.dojo.views.jsp.ui.AutocompleterTag) _005fjspx_005ftagPool_005fsx_005fautocompleter_0026_005fonchange_005fname_005flistValue_005flistKey_005flist_005fheaderValue_005fheaderKey_005fcssClass_005fnobody.get(org.apache.struts2.dojo.views.jsp.ui.AutocompleterTag.class);
    _jspx_th_sx_005fautocompleter_005f2.setPageContext(_jspx_page_context);
    _jspx_th_sx_005fautocompleter_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fdiv_005f6);
    // /CCEAdmin/AddPaper.jsp(42,13) name = headerKey type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sx_005fautocompleter_005f2.setHeaderKey("");
    // /CCEAdmin/AddPaper.jsp(42,13) name = headerValue type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sx_005fautocompleter_005f2.setHeaderValue("Select");
    // /CCEAdmin/AddPaper.jsp(42,13) name = list type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sx_005fautocompleter_005f2.setList("standardList");
    // /CCEAdmin/AddPaper.jsp(42,13) name = listKey type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sx_005fautocompleter_005f2.setListKey("firstVal");
    // /CCEAdmin/AddPaper.jsp(42,13) name = listValue type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sx_005fautocompleter_005f2.setListValue("secondVal");
    // /CCEAdmin/AddPaper.jsp(42,13) name = onchange type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sx_005fautocompleter_005f2.setOnchange("loadNewValue(this.value,'sub','subjectBind.html')");
    // /CCEAdmin/AddPaper.jsp(42,13) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sx_005fautocompleter_005f2.setName("standard");
    // /CCEAdmin/AddPaper.jsp(42,13) name = cssClass type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sx_005fautocompleter_005f2.setCssClass("combobox");
    int _jspx_eval_sx_005fautocompleter_005f2 = _jspx_th_sx_005fautocompleter_005f2.doStartTag();
    if (_jspx_th_sx_005fautocompleter_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fsx_005fautocompleter_0026_005fonchange_005fname_005flistValue_005flistKey_005flist_005fheaderValue_005fheaderKey_005fcssClass_005fnobody.reuse(_jspx_th_sx_005fautocompleter_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fsx_005fautocompleter_0026_005fonchange_005fname_005flistValue_005flistKey_005flist_005fheaderValue_005fheaderKey_005fcssClass_005fnobody.reuse(_jspx_th_sx_005fautocompleter_005f2);
    return false;
  }

  private boolean _jspx_meth_s_005ffielderror_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fdiv_005f6, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:fielderror
    org.apache.struts2.views.jsp.ui.FieldErrorTag _jspx_th_s_005ffielderror_005f2 = (org.apache.struts2.views.jsp.ui.FieldErrorTag) _005fjspx_005ftagPool_005fs_005ffielderror_0026_005ftheme_005ffieldName_005fcssClass_005fnobody.get(org.apache.struts2.views.jsp.ui.FieldErrorTag.class);
    _jspx_th_s_005ffielderror_005f2.setPageContext(_jspx_page_context);
    _jspx_th_s_005ffielderror_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fdiv_005f6);
    // /CCEAdmin/AddPaper.jsp(43,13) name = fieldName type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ffielderror_005f2.setFieldName("standard");
    // /CCEAdmin/AddPaper.jsp(43,13) name = theme type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ffielderror_005f2.setTheme("simple");
    // /CCEAdmin/AddPaper.jsp(43,13) name = cssClass type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ffielderror_005f2.setCssClass("error");
    int _jspx_eval_s_005ffielderror_005f2 = _jspx_th_s_005ffielderror_005f2.doStartTag();
    if (_jspx_th_s_005ffielderror_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ffielderror_0026_005ftheme_005ffieldName_005fcssClass_005fnobody.reuse(_jspx_th_s_005ffielderror_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ffielderror_0026_005ftheme_005ffieldName_005fcssClass_005fnobody.reuse(_jspx_th_s_005ffielderror_005f2);
    return false;
  }

  private boolean _jspx_meth_sx_005fautocompleter_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fdiv_005f6, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sx:autocompleter
    org.apache.struts2.dojo.views.jsp.ui.AutocompleterTag _jspx_th_sx_005fautocompleter_005f3 = (org.apache.struts2.dojo.views.jsp.ui.AutocompleterTag) _005fjspx_005ftagPool_005fsx_005fautocompleter_0026_005fname_005flistValue_005flistKey_005flist_005fheaderValue_005fheaderKey_005fcssClass_005fnobody.get(org.apache.struts2.dojo.views.jsp.ui.AutocompleterTag.class);
    _jspx_th_sx_005fautocompleter_005f3.setPageContext(_jspx_page_context);
    _jspx_th_sx_005fautocompleter_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fdiv_005f6);
    // /CCEAdmin/AddPaper.jsp(47,22) name = headerKey type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sx_005fautocompleter_005f3.setHeaderKey("");
    // /CCEAdmin/AddPaper.jsp(47,22) name = headerValue type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sx_005fautocompleter_005f3.setHeaderValue("Select");
    // /CCEAdmin/AddPaper.jsp(47,22) name = list type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sx_005fautocompleter_005f3.setList("subjectList");
    // /CCEAdmin/AddPaper.jsp(47,22) name = listKey type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sx_005fautocompleter_005f3.setListKey("firstVal");
    // /CCEAdmin/AddPaper.jsp(47,22) name = listValue type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sx_005fautocompleter_005f3.setListValue("secondVal");
    // /CCEAdmin/AddPaper.jsp(47,22) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sx_005fautocompleter_005f3.setName("subject");
    // /CCEAdmin/AddPaper.jsp(47,22) name = cssClass type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sx_005fautocompleter_005f3.setCssClass("combobox");
    int _jspx_eval_sx_005fautocompleter_005f3 = _jspx_th_sx_005fautocompleter_005f3.doStartTag();
    if (_jspx_th_sx_005fautocompleter_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fsx_005fautocompleter_0026_005fname_005flistValue_005flistKey_005flist_005fheaderValue_005fheaderKey_005fcssClass_005fnobody.reuse(_jspx_th_sx_005fautocompleter_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fsx_005fautocompleter_0026_005fname_005flistValue_005flistKey_005flist_005fheaderValue_005fheaderKey_005fcssClass_005fnobody.reuse(_jspx_th_sx_005fautocompleter_005f3);
    return false;
  }

  private boolean _jspx_meth_s_005ffielderror_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fdiv_005f6, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:fielderror
    org.apache.struts2.views.jsp.ui.FieldErrorTag _jspx_th_s_005ffielderror_005f3 = (org.apache.struts2.views.jsp.ui.FieldErrorTag) _005fjspx_005ftagPool_005fs_005ffielderror_0026_005ftheme_005ffieldName_005fcssClass_005fnobody.get(org.apache.struts2.views.jsp.ui.FieldErrorTag.class);
    _jspx_th_s_005ffielderror_005f3.setPageContext(_jspx_page_context);
    _jspx_th_s_005ffielderror_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fdiv_005f6);
    // /CCEAdmin/AddPaper.jsp(48,13) name = fieldName type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ffielderror_005f3.setFieldName("subject");
    // /CCEAdmin/AddPaper.jsp(48,13) name = theme type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ffielderror_005f3.setTheme("simple");
    // /CCEAdmin/AddPaper.jsp(48,13) name = cssClass type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ffielderror_005f3.setCssClass("error");
    int _jspx_eval_s_005ffielderror_005f3 = _jspx_th_s_005ffielderror_005f3.doStartTag();
    if (_jspx_th_s_005ffielderror_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ffielderror_0026_005ftheme_005ffieldName_005fcssClass_005fnobody.reuse(_jspx_th_s_005ffielderror_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ffielderror_0026_005ftheme_005ffieldName_005fcssClass_005fnobody.reuse(_jspx_th_s_005ffielderror_005f3);
    return false;
  }

  private boolean _jspx_meth_s_005ftextfield_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fdiv_005f6, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_s_005ftextfield_005f0 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _005fjspx_005ftagPool_005fs_005ftextfield_0026_005frequired_005fname_005fmaxlength_005fkey_005fcssClass_005fnobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    _jspx_th_s_005ftextfield_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftextfield_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fdiv_005f6);
    // /CCEAdmin/AddPaper.jsp(52,13) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f0.setName("paperName");
    // /CCEAdmin/AddPaper.jsp(52,13) name = required type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f0.setRequired("true");
    // /CCEAdmin/AddPaper.jsp(52,13) name = key type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f0.setKey("paperName");
    // /CCEAdmin/AddPaper.jsp(52,13) name = cssClass type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f0.setCssClass("textbox");
    // /CCEAdmin/AddPaper.jsp(52,13) name = maxlength type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f0.setMaxlength("200");
    int _jspx_eval_s_005ftextfield_005f0 = _jspx_th_s_005ftextfield_005f0.doStartTag();
    if (_jspx_th_s_005ftextfield_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftextfield_0026_005frequired_005fname_005fmaxlength_005fkey_005fcssClass_005fnobody.reuse(_jspx_th_s_005ftextfield_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005frequired_005fname_005fmaxlength_005fkey_005fcssClass_005fnobody.reuse(_jspx_th_s_005ftextfield_005f0);
    return false;
  }

  private boolean _jspx_meth_s_005ffielderror_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fdiv_005f6, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:fielderror
    org.apache.struts2.views.jsp.ui.FieldErrorTag _jspx_th_s_005ffielderror_005f4 = (org.apache.struts2.views.jsp.ui.FieldErrorTag) _005fjspx_005ftagPool_005fs_005ffielderror_0026_005ftheme_005ffieldName_005fcssClass_005fnobody.get(org.apache.struts2.views.jsp.ui.FieldErrorTag.class);
    _jspx_th_s_005ffielderror_005f4.setPageContext(_jspx_page_context);
    _jspx_th_s_005ffielderror_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fdiv_005f6);
    // /CCEAdmin/AddPaper.jsp(53,13) name = fieldName type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ffielderror_005f4.setFieldName("paperName");
    // /CCEAdmin/AddPaper.jsp(53,13) name = theme type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ffielderror_005f4.setTheme("simple");
    // /CCEAdmin/AddPaper.jsp(53,13) name = cssClass type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ffielderror_005f4.setCssClass("error");
    int _jspx_eval_s_005ffielderror_005f4 = _jspx_th_s_005ffielderror_005f4.doStartTag();
    if (_jspx_th_s_005ffielderror_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ffielderror_0026_005ftheme_005ffieldName_005fcssClass_005fnobody.reuse(_jspx_th_s_005ffielderror_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ffielderror_0026_005ftheme_005ffieldName_005fcssClass_005fnobody.reuse(_jspx_th_s_005ffielderror_005f4);
    return false;
  }

  private boolean _jspx_meth_s_005ftextfield_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fdiv_005f6, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_s_005ftextfield_005f1 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _005fjspx_005ftagPool_005fs_005ftextfield_0026_005frequired_005fname_005fmaxlength_005fkey_005fcssClass_005fnobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    _jspx_th_s_005ftextfield_005f1.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftextfield_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fdiv_005f6);
    // /CCEAdmin/AddPaper.jsp(57,13) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f1.setName("paperShortName");
    // /CCEAdmin/AddPaper.jsp(57,13) name = required type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f1.setRequired("true");
    // /CCEAdmin/AddPaper.jsp(57,13) name = key type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f1.setKey("paperShortName");
    // /CCEAdmin/AddPaper.jsp(57,13) name = cssClass type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f1.setCssClass("textbox");
    // /CCEAdmin/AddPaper.jsp(57,13) name = maxlength type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f1.setMaxlength("200");
    int _jspx_eval_s_005ftextfield_005f1 = _jspx_th_s_005ftextfield_005f1.doStartTag();
    if (_jspx_th_s_005ftextfield_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftextfield_0026_005frequired_005fname_005fmaxlength_005fkey_005fcssClass_005fnobody.reuse(_jspx_th_s_005ftextfield_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005frequired_005fname_005fmaxlength_005fkey_005fcssClass_005fnobody.reuse(_jspx_th_s_005ftextfield_005f1);
    return false;
  }

  private boolean _jspx_meth_s_005ffielderror_005f5(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fdiv_005f6, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:fielderror
    org.apache.struts2.views.jsp.ui.FieldErrorTag _jspx_th_s_005ffielderror_005f5 = (org.apache.struts2.views.jsp.ui.FieldErrorTag) _005fjspx_005ftagPool_005fs_005ffielderror_0026_005ftheme_005ffieldName_005fcssClass_005fnobody.get(org.apache.struts2.views.jsp.ui.FieldErrorTag.class);
    _jspx_th_s_005ffielderror_005f5.setPageContext(_jspx_page_context);
    _jspx_th_s_005ffielderror_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fdiv_005f6);
    // /CCEAdmin/AddPaper.jsp(58,13) name = fieldName type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ffielderror_005f5.setFieldName("paperShortName");
    // /CCEAdmin/AddPaper.jsp(58,13) name = theme type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ffielderror_005f5.setTheme("simple");
    // /CCEAdmin/AddPaper.jsp(58,13) name = cssClass type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ffielderror_005f5.setCssClass("error");
    int _jspx_eval_s_005ffielderror_005f5 = _jspx_th_s_005ffielderror_005f5.doStartTag();
    if (_jspx_th_s_005ffielderror_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ffielderror_0026_005ftheme_005ffieldName_005fcssClass_005fnobody.reuse(_jspx_th_s_005ffielderror_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ffielderror_0026_005ftheme_005ffieldName_005fcssClass_005fnobody.reuse(_jspx_th_s_005ffielderror_005f5);
    return false;
  }

  private boolean _jspx_meth_s_005ftextfield_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fdiv_005f6, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_s_005ftextfield_005f2 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _005fjspx_005ftagPool_005fs_005ftextfield_0026_005frequired_005fonkeypress_005fname_005fmaxlength_005fkey_005fcssClass_005fnobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    _jspx_th_s_005ftextfield_005f2.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftextfield_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fdiv_005f6);
    // /CCEAdmin/AddPaper.jsp(62,13) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f2.setName("marks");
    // /CCEAdmin/AddPaper.jsp(62,13) name = required type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f2.setRequired("true");
    // /CCEAdmin/AddPaper.jsp(62,13) name = key type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f2.setKey("marks");
    // /CCEAdmin/AddPaper.jsp(62,13) name = cssClass type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f2.setCssClass("textbox");
    // /CCEAdmin/AddPaper.jsp(62,13) name = onkeypress type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f2.setOnkeypress("return isNumberKey(event)");
    // /CCEAdmin/AddPaper.jsp(62,13) name = maxlength type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f2.setMaxlength("3");
    int _jspx_eval_s_005ftextfield_005f2 = _jspx_th_s_005ftextfield_005f2.doStartTag();
    if (_jspx_th_s_005ftextfield_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftextfield_0026_005frequired_005fonkeypress_005fname_005fmaxlength_005fkey_005fcssClass_005fnobody.reuse(_jspx_th_s_005ftextfield_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005frequired_005fonkeypress_005fname_005fmaxlength_005fkey_005fcssClass_005fnobody.reuse(_jspx_th_s_005ftextfield_005f2);
    return false;
  }

  private boolean _jspx_meth_s_005ffielderror_005f6(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fdiv_005f6, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:fielderror
    org.apache.struts2.views.jsp.ui.FieldErrorTag _jspx_th_s_005ffielderror_005f6 = (org.apache.struts2.views.jsp.ui.FieldErrorTag) _005fjspx_005ftagPool_005fs_005ffielderror_0026_005ftheme_005ffieldName_005fcssClass_005fnobody.get(org.apache.struts2.views.jsp.ui.FieldErrorTag.class);
    _jspx_th_s_005ffielderror_005f6.setPageContext(_jspx_page_context);
    _jspx_th_s_005ffielderror_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fdiv_005f6);
    // /CCEAdmin/AddPaper.jsp(63,13) name = fieldName type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ffielderror_005f6.setFieldName("marks");
    // /CCEAdmin/AddPaper.jsp(63,13) name = theme type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ffielderror_005f6.setTheme("simple");
    // /CCEAdmin/AddPaper.jsp(63,13) name = cssClass type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ffielderror_005f6.setCssClass("error");
    int _jspx_eval_s_005ffielderror_005f6 = _jspx_th_s_005ffielderror_005f6.doStartTag();
    if (_jspx_th_s_005ffielderror_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ffielderror_0026_005ftheme_005ffieldName_005fcssClass_005fnobody.reuse(_jspx_th_s_005ffielderror_005f6);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ffielderror_0026_005ftheme_005ffieldName_005fcssClass_005fnobody.reuse(_jspx_th_s_005ffielderror_005f6);
    return false;
  }

  private boolean _jspx_meth_s_005ftextfield_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fdiv_005f6, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_s_005ftextfield_005f3 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _005fjspx_005ftagPool_005fs_005ftextfield_0026_005frequired_005fname_005fmaxlength_005fkey_005fid_005fcssClass_005fnobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    _jspx_th_s_005ftextfield_005f3.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftextfield_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fdiv_005f6);
    // /CCEAdmin/AddPaper.jsp(67,13) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f3.setName("subPaperName");
    // /CCEAdmin/AddPaper.jsp(67,13) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f3.setId("subPaperName");
    // /CCEAdmin/AddPaper.jsp(67,13) name = required type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f3.setRequired("true");
    // /CCEAdmin/AddPaper.jsp(67,13) name = key type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f3.setKey("subPaperName");
    // /CCEAdmin/AddPaper.jsp(67,13) name = cssClass type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f3.setCssClass("textbox");
    // /CCEAdmin/AddPaper.jsp(67,13) name = maxlength type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f3.setMaxlength("200");
    int _jspx_eval_s_005ftextfield_005f3 = _jspx_th_s_005ftextfield_005f3.doStartTag();
    if (_jspx_th_s_005ftextfield_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftextfield_0026_005frequired_005fname_005fmaxlength_005fkey_005fid_005fcssClass_005fnobody.reuse(_jspx_th_s_005ftextfield_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005frequired_005fname_005fmaxlength_005fkey_005fid_005fcssClass_005fnobody.reuse(_jspx_th_s_005ftextfield_005f3);
    return false;
  }

  private boolean _jspx_meth_s_005fhidden_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fdiv_005f6, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:hidden
    org.apache.struts2.views.jsp.ui.HiddenTag _jspx_th_s_005fhidden_005f1 = (org.apache.struts2.views.jsp.ui.HiddenTag) _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.get(org.apache.struts2.views.jsp.ui.HiddenTag.class);
    _jspx_th_s_005fhidden_005f1.setPageContext(_jspx_page_context);
    _jspx_th_s_005fhidden_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fdiv_005f6);
    // /CCEAdmin/AddPaper.jsp(68,13) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f1.setName("oddeven");
    // /CCEAdmin/AddPaper.jsp(68,13) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f1.setId("oddeven");
    // /CCEAdmin/AddPaper.jsp(68,13) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f1.setValue("even");
    int _jspx_eval_s_005fhidden_005f1 = _jspx_th_s_005fhidden_005f1.doStartTag();
    if (_jspx_th_s_005fhidden_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f1);
    return false;
  }

  private boolean _jspx_meth_s_005ftextfield_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fdiv_005f6, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_s_005ftextfield_005f4 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _005fjspx_005ftagPool_005fs_005ftextfield_0026_005frequired_005fname_005fmaxlength_005fkey_005fid_005fcssClass_005fnobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    _jspx_th_s_005ftextfield_005f4.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftextfield_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fdiv_005f6);
    // /CCEAdmin/AddPaper.jsp(72,13) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f4.setName("subPaperShortName");
    // /CCEAdmin/AddPaper.jsp(72,13) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f4.setId("subPaperShortName");
    // /CCEAdmin/AddPaper.jsp(72,13) name = required type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f4.setRequired("true");
    // /CCEAdmin/AddPaper.jsp(72,13) name = key type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f4.setKey("subPaperShortName");
    // /CCEAdmin/AddPaper.jsp(72,13) name = cssClass type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f4.setCssClass("textbox");
    // /CCEAdmin/AddPaper.jsp(72,13) name = maxlength type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f4.setMaxlength("200");
    int _jspx_eval_s_005ftextfield_005f4 = _jspx_th_s_005ftextfield_005f4.doStartTag();
    if (_jspx_th_s_005ftextfield_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftextfield_0026_005frequired_005fname_005fmaxlength_005fkey_005fid_005fcssClass_005fnobody.reuse(_jspx_th_s_005ftextfield_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005frequired_005fname_005fmaxlength_005fkey_005fid_005fcssClass_005fnobody.reuse(_jspx_th_s_005ftextfield_005f4);
    return false;
  }

  private boolean _jspx_meth_s_005fhidden_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fdiv_005f6, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:hidden
    org.apache.struts2.views.jsp.ui.HiddenTag _jspx_th_s_005fhidden_005f2 = (org.apache.struts2.views.jsp.ui.HiddenTag) _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.get(org.apache.struts2.views.jsp.ui.HiddenTag.class);
    _jspx_th_s_005fhidden_005f2.setPageContext(_jspx_page_context);
    _jspx_th_s_005fhidden_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fdiv_005f6);
    // /CCEAdmin/AddPaper.jsp(73,13) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f2.setName("oddeven");
    // /CCEAdmin/AddPaper.jsp(73,13) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f2.setId("oddeven");
    // /CCEAdmin/AddPaper.jsp(73,13) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f2.setValue("even");
    int _jspx_eval_s_005fhidden_005f2 = _jspx_th_s_005fhidden_005f2.doStartTag();
    if (_jspx_th_s_005fhidden_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f2);
    return false;
  }

  private boolean _jspx_meth_s_005fif_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fdiv_005f6, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:if
    org.apache.struts2.views.jsp.IfTag _jspx_th_s_005fif_005f2 = (org.apache.struts2.views.jsp.IfTag) _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.get(org.apache.struts2.views.jsp.IfTag.class);
    _jspx_th_s_005fif_005f2.setPageContext(_jspx_page_context);
    _jspx_th_s_005fif_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fdiv_005f6);
    // /CCEAdmin/AddPaper.jsp(88,17) name = test type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fif_005f2.setTest("splitValue!=null || splitShrotValue!=null");
    int _jspx_eval_s_005fif_005f2 = _jspx_th_s_005fif_005f2.doStartTag();
    if (_jspx_eval_s_005fif_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fif_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fif_005f2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fif_005f2.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
        if (_jspx_meth_s_005fif_005f3(_jspx_th_s_005fif_005f2, _jspx_page_context))
          return true;
        out.write("\t \t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_s_005fif_005f2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005fif_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005fif_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.reuse(_jspx_th_s_005fif_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.reuse(_jspx_th_s_005fif_005f2);
    return false;
  }

  private boolean _jspx_meth_s_005fif_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fif_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:if
    org.apache.struts2.views.jsp.IfTag _jspx_th_s_005fif_005f3 = (org.apache.struts2.views.jsp.IfTag) _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.get(org.apache.struts2.views.jsp.IfTag.class);
    _jspx_th_s_005fif_005f3.setPageContext(_jspx_page_context);
    _jspx_th_s_005fif_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fif_005f2);
    // /CCEAdmin/AddPaper.jsp(89,18) name = test type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fif_005f3.setTest("!splitValue.equals('') || !splitShrotValue.equals('')");
    int _jspx_eval_s_005fif_005f3 = _jspx_th_s_005fif_005f3.doStartTag();
    if (_jspx_eval_s_005fif_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fif_005f3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fif_005f3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fif_005f3.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
        if (_jspx_meth_s_005fset_005f0(_jspx_th_s_005fif_005f3, _jspx_page_context))
          return true;
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
        if (_jspx_meth_s_005fset_005f1(_jspx_th_s_005fif_005f3, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
        if (_jspx_meth_s_005fset_005f2(_jspx_th_s_005fif_005f3, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
        if (_jspx_meth_s_005fiterator_005f0(_jspx_th_s_005fif_005f3, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_s_005fif_005f3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005fif_005f3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005fif_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.reuse(_jspx_th_s_005fif_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.reuse(_jspx_th_s_005fif_005f3);
    return false;
  }

  private boolean _jspx_meth_s_005fset_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fif_005f3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:set
    org.apache.struts2.views.jsp.SetTag _jspx_th_s_005fset_005f0 = (org.apache.struts2.views.jsp.SetTag) _005fjspx_005ftagPool_005fs_005fset_0026_005fvalue_005fname_005fnobody.get(org.apache.struts2.views.jsp.SetTag.class);
    _jspx_th_s_005fset_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005fset_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fif_005f3);
    // /CCEAdmin/AddPaper.jsp(90,17) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fset_005f0.setName("splitValue");
    // /CCEAdmin/AddPaper.jsp(90,17) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fset_005f0.setValue("splitValue.split('<>')");
    int _jspx_eval_s_005fset_005f0 = _jspx_th_s_005fset_005f0.doStartTag();
    if (_jspx_th_s_005fset_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fset_0026_005fvalue_005fname_005fnobody.reuse(_jspx_th_s_005fset_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fset_0026_005fvalue_005fname_005fnobody.reuse(_jspx_th_s_005fset_005f0);
    return false;
  }

  private boolean _jspx_meth_s_005fset_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fif_005f3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:set
    org.apache.struts2.views.jsp.SetTag _jspx_th_s_005fset_005f1 = (org.apache.struts2.views.jsp.SetTag) _005fjspx_005ftagPool_005fs_005fset_0026_005fvalue_005fname_005fnobody.get(org.apache.struts2.views.jsp.SetTag.class);
    _jspx_th_s_005fset_005f1.setPageContext(_jspx_page_context);
    _jspx_th_s_005fset_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fif_005f3);
    // /CCEAdmin/AddPaper.jsp(91,17) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fset_005f1.setName("splitShortValue");
    // /CCEAdmin/AddPaper.jsp(91,17) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fset_005f1.setValue("splitShrotValue.split('<>')");
    int _jspx_eval_s_005fset_005f1 = _jspx_th_s_005fset_005f1.doStartTag();
    if (_jspx_th_s_005fset_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fset_0026_005fvalue_005fname_005fnobody.reuse(_jspx_th_s_005fset_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fset_0026_005fvalue_005fname_005fnobody.reuse(_jspx_th_s_005fset_005f1);
    return false;
  }

  private boolean _jspx_meth_s_005fset_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fif_005f3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:set
    org.apache.struts2.views.jsp.SetTag _jspx_th_s_005fset_005f2 = (org.apache.struts2.views.jsp.SetTag) _005fjspx_005ftagPool_005fs_005fset_0026_005fvalue_005fname_005fnobody.get(org.apache.struts2.views.jsp.SetTag.class);
    _jspx_th_s_005fset_005f2.setPageContext(_jspx_page_context);
    _jspx_th_s_005fset_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fif_005f3);
    // /CCEAdmin/AddPaper.jsp(92,18) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fset_005f2.setValue("#splitValue.length");
    // /CCEAdmin/AddPaper.jsp(92,18) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fset_005f2.setName("noOfsubPaper");
    int _jspx_eval_s_005fset_005f2 = _jspx_th_s_005fset_005f2.doStartTag();
    if (_jspx_th_s_005fset_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fset_0026_005fvalue_005fname_005fnobody.reuse(_jspx_th_s_005fset_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fset_0026_005fvalue_005fname_005fnobody.reuse(_jspx_th_s_005fset_005f2);
    return false;
  }

  private boolean _jspx_meth_s_005fiterator_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fif_005f3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:iterator
    org.apache.struts2.views.jsp.IteratorTag _jspx_th_s_005fiterator_005f0 = (org.apache.struts2.views.jsp.IteratorTag) _005fjspx_005ftagPool_005fs_005fiterator_0026_005fvar_005fend_005fbegin.get(org.apache.struts2.views.jsp.IteratorTag.class);
    _jspx_th_s_005fiterator_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005fiterator_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fif_005f3);
    // /CCEAdmin/AddPaper.jsp(93,18) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fiterator_005f0.setVar("counter");
    // /CCEAdmin/AddPaper.jsp(93,18) name = begin type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fiterator_005f0.setBegin("0");
    // /CCEAdmin/AddPaper.jsp(93,18) name = end type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fiterator_005f0.setEnd("#noOfsubPaper-1");
    int _jspx_eval_s_005fiterator_005f0 = _jspx_th_s_005fiterator_005f0.doStartTag();
    if (_jspx_eval_s_005fiterator_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fiterator_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fiterator_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fiterator_005f0.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<tr><td></td><td>");
        if (_jspx_meth_s_005ftextfield_005f5(_jspx_th_s_005fiterator_005f0, _jspx_page_context))
          return true;
        out.write("</td>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td>");
        if (_jspx_meth_s_005ftextfield_005f6(_jspx_th_s_005fiterator_005f0, _jspx_page_context))
          return true;
        out.write("</td></tr>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_s_005fiterator_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005fiterator_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005fiterator_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fiterator_0026_005fvar_005fend_005fbegin.reuse(_jspx_th_s_005fiterator_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fiterator_0026_005fvar_005fend_005fbegin.reuse(_jspx_th_s_005fiterator_005f0);
    return false;
  }

  private boolean _jspx_meth_s_005ftextfield_005f5(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fiterator_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_s_005ftextfield_005f5 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005frequired_005fname_005fmaxlength_005fkey_005fcssClass_005fnobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    _jspx_th_s_005ftextfield_005f5.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftextfield_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fiterator_005f0);
    // /CCEAdmin/AddPaper.jsp(94,36) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f5.setName("subPaper");
    // /CCEAdmin/AddPaper.jsp(94,36) name = required type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f5.setRequired("true");
    // /CCEAdmin/AddPaper.jsp(94,36) name = key type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f5.setKey("subPaper");
    // /CCEAdmin/AddPaper.jsp(94,36) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f5.setValue("%{#splitValue[#counter]}");
    // /CCEAdmin/AddPaper.jsp(94,36) name = cssClass type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f5.setCssClass("textbox");
    // /CCEAdmin/AddPaper.jsp(94,36) name = maxlength type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f5.setMaxlength("200");
    int _jspx_eval_s_005ftextfield_005f5 = _jspx_th_s_005ftextfield_005f5.doStartTag();
    if (_jspx_th_s_005ftextfield_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005frequired_005fname_005fmaxlength_005fkey_005fcssClass_005fnobody.reuse(_jspx_th_s_005ftextfield_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005frequired_005fname_005fmaxlength_005fkey_005fcssClass_005fnobody.reuse(_jspx_th_s_005ftextfield_005f5);
    return false;
  }

  private boolean _jspx_meth_s_005ftextfield_005f6(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fiterator_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_s_005ftextfield_005f6 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005frequired_005fname_005fmaxlength_005fkey_005fcssClass_005fnobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    _jspx_th_s_005ftextfield_005f6.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftextfield_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fiterator_005f0);
    // /CCEAdmin/AddPaper.jsp(95,23) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f6.setName("subShortPaper");
    // /CCEAdmin/AddPaper.jsp(95,23) name = required type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f6.setRequired("true");
    // /CCEAdmin/AddPaper.jsp(95,23) name = key type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f6.setKey("subShortPaper");
    // /CCEAdmin/AddPaper.jsp(95,23) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f6.setValue("%{#splitShortValue[#counter]}");
    // /CCEAdmin/AddPaper.jsp(95,23) name = cssClass type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f6.setCssClass("textbox");
    // /CCEAdmin/AddPaper.jsp(95,23) name = maxlength type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f6.setMaxlength("200");
    int _jspx_eval_s_005ftextfield_005f6 = _jspx_th_s_005ftextfield_005f6.doStartTag();
    if (_jspx_th_s_005ftextfield_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005frequired_005fname_005fmaxlength_005fkey_005fcssClass_005fnobody.reuse(_jspx_th_s_005ftextfield_005f6);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005frequired_005fname_005fmaxlength_005fkey_005fcssClass_005fnobody.reuse(_jspx_th_s_005ftextfield_005f6);
    return false;
  }

  private boolean _jspx_meth_s_005fif_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fdiv_005f6, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:if
    org.apache.struts2.views.jsp.IfTag _jspx_th_s_005fif_005f4 = (org.apache.struts2.views.jsp.IfTag) _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.get(org.apache.struts2.views.jsp.IfTag.class);
    _jspx_th_s_005fif_005f4.setPageContext(_jspx_page_context);
    _jspx_th_s_005fif_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fdiv_005f6);
    // /CCEAdmin/AddPaper.jsp(109,10) name = test type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fif_005f4.setTest("(paperID == null || paperID.equals('') ||paperID.equals('-1'))");
    int _jspx_eval_s_005fif_005f4 = _jspx_th_s_005fif_005f4.doStartTag();
    if (_jspx_eval_s_005fif_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fif_005f4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fif_005f4.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fif_005f4.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t");
        if (_jspx_meth_s_005fsubmit_005f0(_jspx_th_s_005fif_005f4, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t");
        if (_jspx_meth_s_005freset_005f0(_jspx_th_s_005fif_005f4, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t");
        if (_jspx_meth_s_005fsubmit_005f1(_jspx_th_s_005fif_005f4, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_s_005fif_005f4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005fif_005f4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005fif_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.reuse(_jspx_th_s_005fif_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.reuse(_jspx_th_s_005fif_005f4);
    return false;
  }

  private boolean _jspx_meth_s_005fsubmit_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fif_005f4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:submit
    org.apache.struts2.views.jsp.ui.SubmitTag _jspx_th_s_005fsubmit_005f0 = (org.apache.struts2.views.jsp.ui.SubmitTag) _005fjspx_005ftagPool_005fs_005fsubmit_0026_005fvalue_005fcssClass_005faction_005fnobody.get(org.apache.struts2.views.jsp.ui.SubmitTag.class);
    _jspx_th_s_005fsubmit_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005fsubmit_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fif_005f4);
    // /CCEAdmin/AddPaper.jsp(110,11) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fsubmit_005f0.setValue("Save");
    // /CCEAdmin/AddPaper.jsp(110,11) name = cssClass type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fsubmit_005f0.setCssClass("blue-button");
    // /CCEAdmin/AddPaper.jsp(110,11) name = action type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fsubmit_005f0.setAction("savePaper");
    int _jspx_eval_s_005fsubmit_005f0 = _jspx_th_s_005fsubmit_005f0.doStartTag();
    if (_jspx_th_s_005fsubmit_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fsubmit_0026_005fvalue_005fcssClass_005faction_005fnobody.reuse(_jspx_th_s_005fsubmit_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fsubmit_0026_005fvalue_005fcssClass_005faction_005fnobody.reuse(_jspx_th_s_005fsubmit_005f0);
    return false;
  }

  private boolean _jspx_meth_s_005freset_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fif_005f4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:reset
    org.apache.struts2.views.jsp.ui.ResetTag _jspx_th_s_005freset_005f0 = (org.apache.struts2.views.jsp.ui.ResetTag) _005fjspx_005ftagPool_005fs_005freset_0026_005fvalue_005fcssClass_005fnobody.get(org.apache.struts2.views.jsp.ui.ResetTag.class);
    _jspx_th_s_005freset_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005freset_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fif_005f4);
    // /CCEAdmin/AddPaper.jsp(111,11) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005freset_005f0.setValue("Reset");
    // /CCEAdmin/AddPaper.jsp(111,11) name = cssClass type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005freset_005f0.setCssClass("blue-button");
    int _jspx_eval_s_005freset_005f0 = _jspx_th_s_005freset_005f0.doStartTag();
    if (_jspx_th_s_005freset_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005freset_0026_005fvalue_005fcssClass_005fnobody.reuse(_jspx_th_s_005freset_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005freset_0026_005fvalue_005fcssClass_005fnobody.reuse(_jspx_th_s_005freset_005f0);
    return false;
  }

  private boolean _jspx_meth_s_005fsubmit_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fif_005f4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:submit
    org.apache.struts2.views.jsp.ui.SubmitTag _jspx_th_s_005fsubmit_005f1 = (org.apache.struts2.views.jsp.ui.SubmitTag) _005fjspx_005ftagPool_005fs_005fsubmit_0026_005fvalue_005fcssClass_005faction_005fnobody.get(org.apache.struts2.views.jsp.ui.SubmitTag.class);
    _jspx_th_s_005fsubmit_005f1.setPageContext(_jspx_page_context);
    _jspx_th_s_005fsubmit_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fif_005f4);
    // /CCEAdmin/AddPaper.jsp(112,11) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fsubmit_005f1.setValue("Close");
    // /CCEAdmin/AddPaper.jsp(112,11) name = cssClass type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fsubmit_005f1.setCssClass("blue-button");
    // /CCEAdmin/AddPaper.jsp(112,11) name = action type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fsubmit_005f1.setAction("CLOSE");
    int _jspx_eval_s_005fsubmit_005f1 = _jspx_th_s_005fsubmit_005f1.doStartTag();
    if (_jspx_th_s_005fsubmit_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fsubmit_0026_005fvalue_005fcssClass_005faction_005fnobody.reuse(_jspx_th_s_005fsubmit_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fsubmit_0026_005fvalue_005fcssClass_005faction_005fnobody.reuse(_jspx_th_s_005fsubmit_005f1);
    return false;
  }

  private boolean _jspx_meth_s_005felse_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fdiv_005f6, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:else
    org.apache.struts2.views.jsp.ElseTag _jspx_th_s_005felse_005f2 = (org.apache.struts2.views.jsp.ElseTag) _005fjspx_005ftagPool_005fs_005felse.get(org.apache.struts2.views.jsp.ElseTag.class);
    _jspx_th_s_005felse_005f2.setPageContext(_jspx_page_context);
    _jspx_th_s_005felse_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fdiv_005f6);
    int _jspx_eval_s_005felse_005f2 = _jspx_th_s_005felse_005f2.doStartTag();
    if (_jspx_eval_s_005felse_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005felse_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005felse_005f2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005felse_005f2.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t");
        if (_jspx_meth_s_005fsubmit_005f2(_jspx_th_s_005felse_005f2, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t");
        if (_jspx_meth_s_005freset_005f1(_jspx_th_s_005felse_005f2, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t");
        if (_jspx_meth_s_005fsubmit_005f3(_jspx_th_s_005felse_005f2, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_s_005felse_005f2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005felse_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005felse_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005felse.reuse(_jspx_th_s_005felse_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005felse.reuse(_jspx_th_s_005felse_005f2);
    return false;
  }

  private boolean _jspx_meth_s_005fsubmit_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005felse_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:submit
    org.apache.struts2.views.jsp.ui.SubmitTag _jspx_th_s_005fsubmit_005f2 = (org.apache.struts2.views.jsp.ui.SubmitTag) _005fjspx_005ftagPool_005fs_005fsubmit_0026_005fvalue_005fcssClass_005faction_005fnobody.get(org.apache.struts2.views.jsp.ui.SubmitTag.class);
    _jspx_th_s_005fsubmit_005f2.setPageContext(_jspx_page_context);
    _jspx_th_s_005fsubmit_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005felse_005f2);
    // /CCEAdmin/AddPaper.jsp(115,11) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fsubmit_005f2.setValue("Update");
    // /CCEAdmin/AddPaper.jsp(115,11) name = action type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fsubmit_005f2.setAction("savePaper");
    // /CCEAdmin/AddPaper.jsp(115,11) name = cssClass type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fsubmit_005f2.setCssClass("blue-button");
    int _jspx_eval_s_005fsubmit_005f2 = _jspx_th_s_005fsubmit_005f2.doStartTag();
    if (_jspx_th_s_005fsubmit_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fsubmit_0026_005fvalue_005fcssClass_005faction_005fnobody.reuse(_jspx_th_s_005fsubmit_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fsubmit_0026_005fvalue_005fcssClass_005faction_005fnobody.reuse(_jspx_th_s_005fsubmit_005f2);
    return false;
  }

  private boolean _jspx_meth_s_005freset_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005felse_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:reset
    org.apache.struts2.views.jsp.ui.ResetTag _jspx_th_s_005freset_005f1 = (org.apache.struts2.views.jsp.ui.ResetTag) _005fjspx_005ftagPool_005fs_005freset_0026_005fvalue_005fcssClass_005fnobody.get(org.apache.struts2.views.jsp.ui.ResetTag.class);
    _jspx_th_s_005freset_005f1.setPageContext(_jspx_page_context);
    _jspx_th_s_005freset_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005felse_005f2);
    // /CCEAdmin/AddPaper.jsp(116,11) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005freset_005f1.setValue("Reset");
    // /CCEAdmin/AddPaper.jsp(116,11) name = cssClass type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005freset_005f1.setCssClass("blue-button");
    int _jspx_eval_s_005freset_005f1 = _jspx_th_s_005freset_005f1.doStartTag();
    if (_jspx_th_s_005freset_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005freset_0026_005fvalue_005fcssClass_005fnobody.reuse(_jspx_th_s_005freset_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005freset_0026_005fvalue_005fcssClass_005fnobody.reuse(_jspx_th_s_005freset_005f1);
    return false;
  }

  private boolean _jspx_meth_s_005fsubmit_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005felse_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:submit
    org.apache.struts2.views.jsp.ui.SubmitTag _jspx_th_s_005fsubmit_005f3 = (org.apache.struts2.views.jsp.ui.SubmitTag) _005fjspx_005ftagPool_005fs_005fsubmit_0026_005fvalue_005fcssClass_005faction_005fnobody.get(org.apache.struts2.views.jsp.ui.SubmitTag.class);
    _jspx_th_s_005fsubmit_005f3.setPageContext(_jspx_page_context);
    _jspx_th_s_005fsubmit_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005felse_005f2);
    // /CCEAdmin/AddPaper.jsp(117,11) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fsubmit_005f3.setValue("Close");
    // /CCEAdmin/AddPaper.jsp(117,11) name = cssClass type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fsubmit_005f3.setCssClass("blue-button");
    // /CCEAdmin/AddPaper.jsp(117,11) name = action type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fsubmit_005f3.setAction("revert");
    int _jspx_eval_s_005fsubmit_005f3 = _jspx_th_s_005fsubmit_005f3.doStartTag();
    if (_jspx_th_s_005fsubmit_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fsubmit_0026_005fvalue_005fcssClass_005faction_005fnobody.reuse(_jspx_th_s_005fsubmit_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fsubmit_0026_005fvalue_005fcssClass_005faction_005fnobody.reuse(_jspx_th_s_005fsubmit_005f3);
    return false;
  }

  private boolean _jspx_meth_s_005fdiv_005f7(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fdiv_005f4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:div
    org.apache.struts2.views.jsp.ui.DivTag _jspx_th_s_005fdiv_005f7 = (org.apache.struts2.views.jsp.ui.DivTag) _005fjspx_005ftagPool_005fs_005fdiv_0026_005fcssClass_005fnobody.get(org.apache.struts2.views.jsp.ui.DivTag.class);
    _jspx_th_s_005fdiv_005f7.setPageContext(_jspx_page_context);
    _jspx_th_s_005fdiv_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fdiv_005f4);
    // /CCEAdmin/AddPaper.jsp(126,4) name = cssClass type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fdiv_005f7.setCssClass("clear");
    int _jspx_eval_s_005fdiv_005f7 = _jspx_th_s_005fdiv_005f7.doStartTag();
    if (_jspx_th_s_005fdiv_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fdiv_0026_005fcssClass_005fnobody.reuse(_jspx_th_s_005fdiv_005f7);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fdiv_0026_005fcssClass_005fnobody.reuse(_jspx_th_s_005fdiv_005f7);
    return false;
  }

  private boolean _jspx_meth_s_005finclude_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fdiv_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:include
    org.apache.struts2.views.jsp.IncludeTag _jspx_th_s_005finclude_005f2 = (org.apache.struts2.views.jsp.IncludeTag) _005fjspx_005ftagPool_005fs_005finclude_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.IncludeTag.class);
    _jspx_th_s_005finclude_005f2.setPageContext(_jspx_page_context);
    _jspx_th_s_005finclude_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fdiv_005f0);
    // /CCEAdmin/AddPaper.jsp(130,1) name = value type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005finclude_005f2.setValue("../UserControler/Footer.jsp");
    int _jspx_eval_s_005finclude_005f2 = _jspx_th_s_005finclude_005f2.doStartTag();
    if (_jspx_th_s_005finclude_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005finclude_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005finclude_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005finclude_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005finclude_005f2);
    return false;
  }
}
