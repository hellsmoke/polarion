/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.30
 * Generated at: 2017-05-17 10:55:55 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.include.dialog;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class errorContent_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes = null;
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write(" \r\n");
      out.write("                              \r\n");
      org.polarion.svnwebclient.web.controller.ErrorBean errorBean = null;
      errorBean = (org.polarion.svnwebclient.web.controller.ErrorBean) _jspx_page_context.getAttribute("errorBean", javax.servlet.jsp.PageContext.REQUEST_SCOPE);
      if (errorBean == null){
        throw new java.lang.InstantiationException("bean errorBean not found within scope");
      }
      out.write("\r\n");
      out.write("                 \r\n");
      
    String description = errorBean.getDescription();
    String name = errorBean.getName();
    String email = errorBean.getEmail();
    
    String stacktrace = errorBean.getStacktrace();
    String message = errorBean.getMessage();
    String reportId = errorBean.getReportId();           

      out.write("             \r\n");
      out.write("    \r\n");
      out.write("<table  cellspacing=\"0\" cellpadding=\"0\" width=\"100%\" height=\"100%\" border=\"0\" class=\"dialogcontent\">\r\n");
      out.write("    <form name=\"error\" method=\"POST\" action=\"review.jsp\" height=\"100%\">\r\n");
      out.write("        <input type=\"hidden\" name=\"message\" value='");
      out.print(message);
      out.write("'/>  \r\n");
      out.write("        <input type=\"hidden\" name=\"reportId\" value='");
      out.print(reportId);
      out.write("'/>  \r\n");
      out.write("          \r\n");
      out.write("        <tr>\r\n");
      out.write("            <td>\r\n");
      out.write("                <b>Send Error Report</b>\r\n");
      out.write("            </td>\r\n");
      out.write("        </tr>                \r\n");
      out.write("\r\n");
      out.write("        </tr>\r\n");
      out.write("        <tr>\r\n");
      out.write("            <td style=\"font-size:11px;padding-top:10px;\">\r\n");
      out.write("                Errors occured during the operation execution. You can send the error report and your comments to the SVNWebClient developers. \r\n");
      out.write("                This is suggested in order to improve product quality and reliability.\r\n");
      out.write("                The fields below are optional. You can provide us with your e-mail\r\n");
      out.write("\t\t\t\tand name to let us keep you informed about the status of the occured problem solving.\r\n");
      out.write("\t\t\t\tNo confidential information is picked from your computer. The report contents are: the\r\n");
      out.write("\t\t\t\tproject ID, JVM properties and the occured exception stack trace.\r\n");
      out.write("\t\t\t\tYou can preview what exactly will the generated report contain.\r\n");
      out.write("            </td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        \r\n");
      out.write("        <tr>       \r\n");
      out.write("            <td style=\"padding-top:10px;\">\r\n");
      out.write("                <b>Name:</b>\r\n");
      out.write("            </td>    \r\n");
      out.write("        </tr>                    \r\n");
      out.write("        \r\n");
      out.write("        <tr>                \r\n");
      out.write("            <td>\r\n");
      out.write("                <input type=\"text\" name=\"name\" size=\"25\" value=\"");
      out.print(name);
      out.write("\" style=\"margin:0;font-size:11px;\"/>\r\n");
      out.write("            </td>    \r\n");
      out.write("        </tr>    \r\n");
      out.write("         \r\n");
      out.write("        <tr>    \r\n");
      out.write("            <td style=\"padding-top:10px;\">\r\n");
      out.write("                <b>E-mail:</b>\r\n");
      out.write("            </td>    \r\n");
      out.write("        </tr>\r\n");
      out.write("       \r\n");
      out.write("        <tr>\r\n");
      out.write("            <td>\r\n");
      out.write("                <input type=\"text\" name=\"email\" size=\"25\" value=\"");
      out.print(email);
      out.write("\" style=\"width:100%;margin:0;font-size:11px;\"/>\r\n");
      out.write("            </td>    \r\n");
      out.write("        </tr>    \r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("        <tr>\r\n");
      out.write("            <td style=\"padding-top:10px;\">\r\n");
      out.write("                <b>Description:</b>\r\n");
      out.write("            </td>\r\n");
      out.write("        </tr>\r\n");
      out.write("\r\n");
      out.write("        <tr>\r\n");
      out.write("            <td width=\"100%\">    \r\n");
      out.write("                <textarea name=\"description\" rows=\"5\" style=\"width:100%;margin:0;font-size:11px;\">");
      out.print(description);
      out.write("</textarea>\r\n");
      out.write("            </td>    \r\n");
      out.write("        </tr>\r\n");
      out.write("\r\n");
      out.write("        <tr>\r\n");
      out.write("            <td style=\"padding-top:10px;\">\r\n");
      out.write("                <b>Message:</b>\r\n");
      out.write("            </td>\r\n");
      out.write("        </tr>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <tr>\r\n");
      out.write("            <td>                            \r\n");
      out.write("                ");
      out.print(message);
      out.write("\r\n");
      out.write("            </td>\r\n");
      out.write("        </tr>    \r\n");
      out.write("       \r\n");
      out.write("       <tr>\r\n");
      out.write("            <td style=\"padding-top:10px;\">                            \r\n");
      out.write("                <b>Stack trace:</b>\r\n");
      out.write("            </td>\r\n");
      out.write("        </tr> \r\n");
      out.write("\r\n");
      out.write("        <tr>\r\n");
      out.write("            <td height=\"100%\">\r\n");
      out.write("                <textarea readonly \"id=\"stacktrace\" name=\"stacktrace\" style=\"width:100%;height:100%;margin:0;font-size:11px;\">");
      out.print(stacktrace);
      out.write("</textarea>\r\n");
      out.write("            </td>\r\n");
      out.write("        </tr> \r\n");
      out.write("\r\n");
      out.write("        <tr>        \r\n");
      out.write("            <td width=\"100%\" style=\"padding-top:20px;padding-bottom:0px;\" >\r\n");
      out.write("                <table cellspacing=\"0\" cellpadding=\"0\" width=\"100%\" border=\"0\">\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td align=\"left\">\r\n");
      out.write("                            <input type=\"submit\" class=\"button\" value=\"Preview and Send\"/>            \r\n");
      out.write("                        </td>    \r\n");
      out.write("                        <td align=\"left\" style=\"padding-left:10px;\" width=\"100%\">\r\n");
      out.write("                            <input type=\"button\" class=\"button\" value=\"Don't Send\" onclick=\"javascript:window.location='directoryContent.jsp'\"/>            \r\n");
      out.write("                        </td>    \r\n");
      out.write("                    </tr>    \r\n");
      out.write("                </table>    \r\n");
      out.write("            </td>    \r\n");
      out.write("        </tr>           \r\n");
      out.write("    </form>\r\n");
      out.write("</table>              \r\n");
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