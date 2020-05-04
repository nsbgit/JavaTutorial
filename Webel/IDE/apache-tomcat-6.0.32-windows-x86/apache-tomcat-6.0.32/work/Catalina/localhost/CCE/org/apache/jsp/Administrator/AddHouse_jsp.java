package org.apache.jsp.Administrator;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class AddHouse_jsp extends org.apache.jasper.runtime.HttpJspBase
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
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005ftextfield_0026_005frequired_005fname_005fmaxlength_005fkey_005fcssClass_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005ffielderror_0026_005ftheme_005ffieldName_005fcssClass_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005ftextarea_0026_005fname_005fkey_005fcssClass_005fnobody;
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
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005frequired_005fname_005fmaxlength_005fkey_005fcssClass_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005ffielderror_0026_005ftheme_005ffieldName_005fcssClass_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005ftextarea_0026_005fname_005fkey_005fcssClass_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
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
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005frequired_005fname_005fmaxlength_005fkey_005fcssClass_005fnobody.release();
    _005fjspx_005ftagPool_005fs_005ffielderror_0026_005ftheme_005ffieldName_005fcssClass_005fnobody.release();
    _005fjspx_005ftagPool_005fs_005ftextarea_0026_005fname_005fkey_005fcssClass_005fnobody.release();
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
      out.write(" House</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t");
      if (_jspx_meth_s_005fform_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
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

  private boolean _jspx_meth_s_005fif_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:if
    org.apache.struts2.views.jsp.IfTag _jspx_th_s_005fif_005f0 = (org.apache.struts2.views.jsp.IfTag) _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.get(org.apache.struts2.views.jsp.IfTag.class);
    _jspx_th_s_005fif_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005fif_005f0.setParent(null);
    // /Administrator/AddHouse.jsp(9,13) name = test type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fif_005f0.setTest("(houseID == null || houseID.equals('') ||houseID.equals('-1'))");
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
    // /Administrator/AddHouse.jsp(12,1) name = theme type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fform_005f0.setTheme("simple");
    // /Administrator/AddHouse.jsp(12,1) name = method type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fform_005f0.setMethod("post");
    // /Administrator/AddHouse.jsp(12,1) name = validate type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
    // /Administrator/AddHouse.jsp(15,2) name = cssClass type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
    // /Administrator/AddHouse.jsp(16,5) name = value type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
    // /Administrator/AddHouse.jsp(18,4) name = cssClass type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
    // /Administrator/AddHouse.jsp(19,2) name = cssClass type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
    // /Administrator/AddHouse.jsp(20,3) name = cssClass type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
    // /Administrator/AddHouse.jsp(21,7) name = value type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
    // /Administrator/AddHouse.jsp(23,4) name = cssClass type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
        out.write(" House  </h1>\r\n");
        out.write("\t\t\t\t\t\t<div></div>\r\n");
        out.write("\t\t\t\t\t\t<div class=\"form\">\r\n");
        out.write("\t\t\t\t\t\t<table >\t\t\t\t\t\t\r\n");
        out.write("\t\t\t\t\t\t<tr>\r\n");
        out.write("\t\t\t\t\t\t\t\t<td colspan=\"3\" align=\"center\">");
        if (_jspx_meth_s_005fhidden_005f0(_jspx_th_s_005fdiv_005f6, _jspx_page_context))
          return true;
        if (_jspx_meth_s_005factionerror_005f0(_jspx_th_s_005fdiv_005f6, _jspx_page_context))
          return true;
        if (_jspx_meth_s_005factionmessage_005f0(_jspx_th_s_005fdiv_005f6, _jspx_page_context))
          return true;
        out.write(" </td>\t\t\t\t\t\t\t\t\r\n");
        out.write("\t\t\t\t\t\t\t</tr>\t\t\t\t\t\t\t\r\n");
        out.write("\t\t\t\t\t\t\t<tr >\r\n");
        out.write("\t\t\t\t\t\t\t\t<td style=\"width: 25%\">House <em>*</em> :</td>\r\n");
        out.write("\t\t\t\t\t\t\t\t<td style=\"width: 35%\">");
        if (_jspx_meth_s_005ftextfield_005f0(_jspx_th_s_005fdiv_005f6, _jspx_page_context))
          return true;
        out.write("</td>\r\n");
        out.write("\t\t\t\t\t\t\t\t<td style=\"width: 40%\">");
        if (_jspx_meth_s_005ffielderror_005f0(_jspx_th_s_005fdiv_005f6, _jspx_page_context))
          return true;
        out.write("</td>\r\n");
        out.write("\t\t\t\t\t\t\t</tr>\r\n");
        out.write("\t\t\t\t\t\t\t<tr valign=\"top\" class=\"even\">\r\n");
        out.write("\t\t\t\t\t\t\t\t<td>Description :</td>\t\t\t\t\t\t\t\t\r\n");
        out.write("\t\t\t\t\t\t\t\t<td>");
        if (_jspx_meth_s_005ftextarea_005f0(_jspx_th_s_005fdiv_005f6, _jspx_page_context))
          return true;
        out.write("</td>\r\n");
        out.write("\t\t\t\t\t\t\t\t<td></td>\r\n");
        out.write("\t\t\t\t\t\t\t</tr>\r\n");
        out.write("\t\t\t\t\t\t\t\r\n");
        out.write("\t\t\t\t\t\t\t<tr >\r\n");
        out.write("\t\t\t\t\t\t\t\t<td colspan=\"3\">\r\n");
        out.write("\t\t\t\t\t\t\t\t\t");
        if (_jspx_meth_s_005fif_005f2(_jspx_th_s_005fdiv_005f6, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t\t");
        if (_jspx_meth_s_005felse_005f2(_jspx_th_s_005fdiv_005f6, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\r\n");
        out.write("\t\t\t\t\t\t\t\t\t<br class=\"clear\" />\r\n");
        out.write("\t\t\t\t\t\t\t\t</td>\r\n");
        out.write("\t\t\t\t\t\t\t</tr>\t\t\t\t\t\t\t\r\n");
        out.write("\t\t\t\t\t\t</table>\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
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
    // /Administrator/AddHouse.jsp(24,10) name = test type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fif_005f1.setTest("(houseID == null || houseID.equals('')||houseID.equals('-1'))");
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
    // /Administrator/AddHouse.jsp(29,39) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f0.setValue("%{houseID}");
    // /Administrator/AddHouse.jsp(29,39) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f0.setName("houseID");
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
    // /Administrator/AddHouse.jsp(29,84) name = cssClass type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
    // /Administrator/AddHouse.jsp(29,118) name = cssClass type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005factionmessage_005f0.setCssClass("msg");
    int _jspx_eval_s_005factionmessage_005f0 = _jspx_th_s_005factionmessage_005f0.doStartTag();
    if (_jspx_th_s_005factionmessage_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005factionmessage_0026_005fcssClass_005fnobody.reuse(_jspx_th_s_005factionmessage_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005factionmessage_0026_005fcssClass_005fnobody.reuse(_jspx_th_s_005factionmessage_005f0);
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
    // /Administrator/AddHouse.jsp(33,31) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f0.setName("house");
    // /Administrator/AddHouse.jsp(33,31) name = required type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f0.setRequired("true");
    // /Administrator/AddHouse.jsp(33,31) name = key type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f0.setKey("house");
    // /Administrator/AddHouse.jsp(33,31) name = cssClass type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f0.setCssClass("textbox");
    // /Administrator/AddHouse.jsp(33,31) name = maxlength type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f0.setMaxlength("200");
    int _jspx_eval_s_005ftextfield_005f0 = _jspx_th_s_005ftextfield_005f0.doStartTag();
    if (_jspx_th_s_005ftextfield_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftextfield_0026_005frequired_005fname_005fmaxlength_005fkey_005fcssClass_005fnobody.reuse(_jspx_th_s_005ftextfield_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005frequired_005fname_005fmaxlength_005fkey_005fcssClass_005fnobody.reuse(_jspx_th_s_005ftextfield_005f0);
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
    // /Administrator/AddHouse.jsp(34,31) name = fieldName type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ffielderror_005f0.setFieldName("house");
    // /Administrator/AddHouse.jsp(34,31) name = theme type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ffielderror_005f0.setTheme("simple");
    // /Administrator/AddHouse.jsp(34,31) name = cssClass type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ffielderror_005f0.setCssClass("error");
    int _jspx_eval_s_005ffielderror_005f0 = _jspx_th_s_005ffielderror_005f0.doStartTag();
    if (_jspx_th_s_005ffielderror_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ffielderror_0026_005ftheme_005ffieldName_005fcssClass_005fnobody.reuse(_jspx_th_s_005ffielderror_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ffielderror_0026_005ftheme_005ffieldName_005fcssClass_005fnobody.reuse(_jspx_th_s_005ffielderror_005f0);
    return false;
  }

  private boolean _jspx_meth_s_005ftextarea_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fdiv_005f6, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:textarea
    org.apache.struts2.views.jsp.ui.TextareaTag _jspx_th_s_005ftextarea_005f0 = (org.apache.struts2.views.jsp.ui.TextareaTag) _005fjspx_005ftagPool_005fs_005ftextarea_0026_005fname_005fkey_005fcssClass_005fnobody.get(org.apache.struts2.views.jsp.ui.TextareaTag.class);
    _jspx_th_s_005ftextarea_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftextarea_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fdiv_005f6);
    // /Administrator/AddHouse.jsp(38,12) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextarea_005f0.setName("description");
    // /Administrator/AddHouse.jsp(38,12) name = key type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextarea_005f0.setKey("description");
    // /Administrator/AddHouse.jsp(38,12) name = cssClass type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextarea_005f0.setCssClass("textbox");
    int _jspx_eval_s_005ftextarea_005f0 = _jspx_th_s_005ftextarea_005f0.doStartTag();
    if (_jspx_th_s_005ftextarea_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftextarea_0026_005fname_005fkey_005fcssClass_005fnobody.reuse(_jspx_th_s_005ftextarea_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftextarea_0026_005fname_005fkey_005fcssClass_005fnobody.reuse(_jspx_th_s_005ftextarea_005f0);
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
    // /Administrator/AddHouse.jsp(44,9) name = test type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fif_005f2.setTest("(houseID == null || houseID.equals('') ||houseID.equals('-1'))");
    int _jspx_eval_s_005fif_005f2 = _jspx_th_s_005fif_005f2.doStartTag();
    if (_jspx_eval_s_005fif_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fif_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fif_005f2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fif_005f2.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t");
        if (_jspx_meth_s_005fsubmit_005f0(_jspx_th_s_005fif_005f2, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t");
        if (_jspx_meth_s_005freset_005f0(_jspx_th_s_005fif_005f2, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t");
        if (_jspx_meth_s_005fsubmit_005f1(_jspx_th_s_005fif_005f2, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t\t");
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

  private boolean _jspx_meth_s_005fsubmit_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fif_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:submit
    org.apache.struts2.views.jsp.ui.SubmitTag _jspx_th_s_005fsubmit_005f0 = (org.apache.struts2.views.jsp.ui.SubmitTag) _005fjspx_005ftagPool_005fs_005fsubmit_0026_005fvalue_005fcssClass_005faction_005fnobody.get(org.apache.struts2.views.jsp.ui.SubmitTag.class);
    _jspx_th_s_005fsubmit_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005fsubmit_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fif_005f2);
    // /Administrator/AddHouse.jsp(45,10) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fsubmit_005f0.setValue("Save");
    // /Administrator/AddHouse.jsp(45,10) name = cssClass type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fsubmit_005f0.setCssClass("blue-button");
    // /Administrator/AddHouse.jsp(45,10) name = action type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fsubmit_005f0.setAction("saveHouse");
    int _jspx_eval_s_005fsubmit_005f0 = _jspx_th_s_005fsubmit_005f0.doStartTag();
    if (_jspx_th_s_005fsubmit_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fsubmit_0026_005fvalue_005fcssClass_005faction_005fnobody.reuse(_jspx_th_s_005fsubmit_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fsubmit_0026_005fvalue_005fcssClass_005faction_005fnobody.reuse(_jspx_th_s_005fsubmit_005f0);
    return false;
  }

  private boolean _jspx_meth_s_005freset_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fif_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:reset
    org.apache.struts2.views.jsp.ui.ResetTag _jspx_th_s_005freset_005f0 = (org.apache.struts2.views.jsp.ui.ResetTag) _005fjspx_005ftagPool_005fs_005freset_0026_005fvalue_005fcssClass_005fnobody.get(org.apache.struts2.views.jsp.ui.ResetTag.class);
    _jspx_th_s_005freset_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005freset_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fif_005f2);
    // /Administrator/AddHouse.jsp(46,10) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005freset_005f0.setValue("Reset");
    // /Administrator/AddHouse.jsp(46,10) name = cssClass type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005freset_005f0.setCssClass("blue-button");
    int _jspx_eval_s_005freset_005f0 = _jspx_th_s_005freset_005f0.doStartTag();
    if (_jspx_th_s_005freset_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005freset_0026_005fvalue_005fcssClass_005fnobody.reuse(_jspx_th_s_005freset_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005freset_0026_005fvalue_005fcssClass_005fnobody.reuse(_jspx_th_s_005freset_005f0);
    return false;
  }

  private boolean _jspx_meth_s_005fsubmit_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fif_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:submit
    org.apache.struts2.views.jsp.ui.SubmitTag _jspx_th_s_005fsubmit_005f1 = (org.apache.struts2.views.jsp.ui.SubmitTag) _005fjspx_005ftagPool_005fs_005fsubmit_0026_005fvalue_005fcssClass_005faction_005fnobody.get(org.apache.struts2.views.jsp.ui.SubmitTag.class);
    _jspx_th_s_005fsubmit_005f1.setPageContext(_jspx_page_context);
    _jspx_th_s_005fsubmit_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fif_005f2);
    // /Administrator/AddHouse.jsp(47,10) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fsubmit_005f1.setValue("Close");
    // /Administrator/AddHouse.jsp(47,10) name = cssClass type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fsubmit_005f1.setCssClass("blue-button");
    // /Administrator/AddHouse.jsp(47,10) name = action type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
        out.write("\t\t\t\t\t\t\t\t\t\t");
        if (_jspx_meth_s_005fsubmit_005f2(_jspx_th_s_005felse_005f2, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t");
        if (_jspx_meth_s_005freset_005f1(_jspx_th_s_005felse_005f2, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t");
        if (_jspx_meth_s_005fsubmit_005f3(_jspx_th_s_005felse_005f2, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t\t");
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
    // /Administrator/AddHouse.jsp(50,10) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fsubmit_005f2.setValue("Update");
    // /Administrator/AddHouse.jsp(50,10) name = action type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fsubmit_005f2.setAction("saveHouse");
    // /Administrator/AddHouse.jsp(50,10) name = cssClass type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
    // /Administrator/AddHouse.jsp(51,10) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005freset_005f1.setValue("Reset");
    // /Administrator/AddHouse.jsp(51,10) name = cssClass type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
    // /Administrator/AddHouse.jsp(52,10) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fsubmit_005f3.setValue("Close");
    // /Administrator/AddHouse.jsp(52,10) name = cssClass type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fsubmit_005f3.setCssClass("blue-button");
    // /Administrator/AddHouse.jsp(52,10) name = action type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
    // /Administrator/AddHouse.jsp(61,4) name = cssClass type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
    // /Administrator/AddHouse.jsp(65,1) name = value type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
