/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.30
 * Generated at: 2017-05-15 13:21:12 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.include.info;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.polarion.platform.i18n.Localization;

public final class fileContentInfo_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("com.polarion.platform.i18n.Localization");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
}

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
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
      org.polarion.svnwebclient.web.controller.file.FileContentBean bean = null;
      bean = (org.polarion.svnwebclient.web.controller.file.FileContentBean) _jspx_page_context.getAttribute("bean", javax.servlet.jsp.PageContext.REQUEST_SCOPE);
      if (bean == null){
        throw new java.lang.InstantiationException("bean bean not found within scope");
      }
      out.write("  \r\n");
      out.write("<table class=\"tabcontent\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" border=\"0\">\r\n");
      out.write("    <tr class=\"value\" nowrap=\"true\">\r\n");
      out.write("        <td class=\"value\" style=\"padding-left:20px;\" nowrap=\"true\">\r\n");
      out.write("            <b>");
      out.print( Localization.getString("svnwebclient.revpropscol.revision") );
      out.write("</b>&nbsp;\r\n");
      out.write("            <a href=\"");
      out.print(bean.getFileContent().getRevisionUrl());
      out.write("\">\r\n");
      out.write("                ");
      out.print(bean.getFileContent().getDecoratedRevision());
      out.write("\r\n");
      out.write("            </a>    \r\n");

    if (bean.getFileContent().isHeadRevision()) {

      out.write("\r\n");
      out.write("            &nbsp;");
      out.print( Localization.getString("svnwebclient.directoryCompareInfo.head") );
      out.write('\r');
      out.write('\n');

    }                    

      out.write("            \r\n");
      out.write("        </td>    \r\n");
      out.write("        <td class=\"value\" style=\"padding-left:20px;\" nowrap=\"true\">\r\n");
      out.write("            <b>");
      out.print( Localization.getString("svnwebclient.revpropscol.date") );
      out.write("</b>&nbsp;\r\n");
      out.write("            <span title=\"");
      out.print( Localization.getString("svnwebclient.revprops.ago", bean.getFileContent().getAge()) );
      out.write('"');
      out.write('>');
      out.print(bean.getFileContent().getDate());
      out.write("</span>\r\n");
      out.write("        </td>        \r\n");
      out.write("        <td class=\"value\" style=\"padding-left:20px;\" nowrap=\"true\">\r\n");
      out.write("            <b>");
      out.print( Localization.getString("svnwebclient.revpropscol.author") );
      out.write("</b>&nbsp;\r\n");
      out.write("            ");
      out.print(bean.getFileContent().getAuthor());
      out.write("\r\n");
      out.write("        </td>\r\n");
      out.write("        <td class=\"value\" style=\"padding-left:20px;\" nowrap=\"true\">\r\n");
      out.write("            <b>");
      out.print( Localization.getString("svnwebclient.fileContentInfo.size") );
      out.write("</b>&nbsp;\r\n");
      out.write("            ");
      out.print(bean.getFileContent().getSize());
      out.write("\r\n");
      out.write("        </td>\r\n");
      out.write("        <td width=\"100%\"/>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
                                
			if (bean.getFileContent().isMultiLineComment()) {
				String tool = "tool";
				String cell = "cell";

      out.write("\t\r\n");
      out.write("\r\n");
      out.write("\t\t<td class=\"value\" style=\"padding-left:20px;\" width=\"100%\" colspan=\"5\" id=\"");
      out.print(cell);
      out.write("\" onmouseover=\"xstooltip_show('");
      out.print(tool);
      out.write("', '");
      out.print(cell);
      out.write("');\" onmouseout=\"xstooltip_hide('");
      out.print(tool);
      out.write("');\">\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t<div id=\"");
      out.print(tool);
      out.write("\" class=\"xstooltip\">\r\n");
      out.write("\t\t\t\t");
      out.print(bean.getFileContent().getTooltip());
      out.write("\t\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("            <b>");
      out.print( Localization.getString("svnwebclient.revpropscol.comment") );
      out.write("</b>&nbsp;\r\n");
      out.write("\t\t\t<img src=\"images/multiline_text.gif\" style=\"position:absolute;margin-top:2px\" align=\"middle\" width=\"8\" height=\"9\">\r\n");
      out.write("\t\t\t&nbsp;&nbsp;&nbsp;&nbsp;");
      out.print(bean.getFileContent().getFirstLine());
      out.write("\t\t\t\t\r\n");
      out.write("\t\t</td>\t\r\n");

			} else {								 

      out.write("\t\t\t\t    \r\n");
      out.write("        <td class=\"value\" style=\"padding-left:20px;\" width=\"100%\" colspan=\"5\">\r\n");
      out.write("            <b>");
      out.print( Localization.getString("svnwebclient.revpropscol.comment") );
      out.write("</b>&nbsp;        \r\n");
      out.write("            ");
      out.print(bean.getFileContent().getComment());
      out.write("\r\n");
      out.write("        </td>\r\n");

			}

      out.write(" \r\n");
      out.write("        \r\n");
      out.write("    </tr>    \r\n");
      out.write("</table>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}