/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.30
 * Generated at: 2017-05-15 10:11:11 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class prefetch_jsp extends org.apache.jasper.runtime.HttpJspBase
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

 
response.setHeader("Cache-Control", "no-cache");
response.setHeader("Pragma", "no-cache");
response.setIntHeader("Expires", -1);

      out.write("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\r\n");
      out.write("<!DOCTYPE html \r\n");
      out.write("     PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\"\r\n");
      out.write("    \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\" xml:lang=\"en\" lang=\"en\" >\r\n");
      out.write("\t<head>\r\n");
      out.write("\t\t<link rel=\"shortcut icon\" href=\"/polarion/ria/images/favicon.ico\"></link>\r\n");
      out.write("  \t\t<title></title>\r\n");
      out.write("  \t</head>\r\n");
      out.write("\t<body onload=\"prefetchResources();\" style=\"background:lightgray\">\r\n");
      out.write("\t\t<script type=\"text/javascript\">\r\n");
      out.write("\t\t    function prefetchJS(url){\r\n");
      out.write("\t\t    \tvar element = document.createElement(\"SCRIPT\");\r\n");
      out.write("\t\t    \telement.type = \"text/javascript\";\r\n");
      out.write("\t\t    \telement.src = url + \"?buildId=");
      out.print(com.polarion.portal.jetspeed.gwt.GWTServletProxy.getBuildId());
      out.write("\";\r\n");
      out.write("\t\t    \tdocument.body.appendChild(element);\r\n");
      out.write("\t\t    }\r\n");
      out.write("\t\t    \r\n");
      out.write("\t\t    function prefetchImg(url){\r\n");
      out.write("\t\t    \tvar element = document.createElement(\"IMG\");\r\n");
      out.write("\t\t    \telement.src = url + \"?buildId=");
      out.print(com.polarion.portal.jetspeed.gwt.GWTServletProxy.getBuildId());
      out.write("\"; \r\n");
      out.write("\t\t    \tdocument.body.appendChild(element);\r\n");
      out.write("\t\t    }\r\n");
      out.write("\t\t    \r\n");
      out.write("\t\t    function prefetchImgNoBuildId(url){\r\n");
      out.write("                var element = document.createElement(\"IMG\");\r\n");
      out.write("                element.src = url; \r\n");
      out.write("                document.body.appendChild(element);\r\n");
      out.write("            }\r\n");
      out.write("\t\t    \r\n");
      out.write("\t\t    function prefetchResources(){\r\n");
      out.write("\t\t        \r\n");
      out.write("\t\t        prefetchImgNoBuildId(\"/polarion/ria/images/backgrounds/navigator_bg.png\");\r\n");
      out.write("\t\t        prefetchImgNoBuildId(\"/polarion/ria/images/backgrounds/navigator_dark_bg.png\");\r\n");
      out.write("\t\t        \r\n");
      out.write("\t\t\t\tprefetchImg(\"/polarion/ria/images/progress.gif\");\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\tprefetchImg(\"/polarion/ria/images/error_occured.gif\");\r\n");
      out.write("\t\t\t\tprefetchImg(\"/polarion/ria/images/button_arrow.gif\");\r\n");
      out.write("\t\t\t\tprefetchImg(\"/polarion/ria/images/search_combo_erase.gif\");\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\tprefetchImg(\"/polarion/ria/images/details/tracker.gif\");\r\n");
      out.write("\t\t\t\tprefetchImg(\"/polarion/ria/images/details/wiki_svn.gif\");\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\tprefetchImg(\"/polarion/ria/images/topicIcons/workItems.png\");\r\n");
      out.write("\t\t\t\tprefetchImg(\"/polarion/ria/images/topicIcons/tests.png\");\r\n");
      out.write("\t\t        prefetchImg(\"/polarion/ria/images/topicIcons/testruns.png\");\r\n");
      out.write("                prefetchImg(\"/polarion/ria/images/topicIcons/home.png\");\r\n");
      out.write("                prefetchImg(\"/polarion/ria/images/topicIcons/builds.png\");\r\n");
      out.write("                prefetchImg(\"/polarion/ria/images/topicIcons/baselines.png\");\r\n");
      out.write("                prefetchImg(\"/polarion/ria/images/topicIcons/wiki2.png\");\r\n");
      out.write("                prefetchImg(\"/polarion/ria/images/topicIcons/wiki1.png\");\r\n");
      out.write("                prefetchImg(\"/polarion/ria/images/topicIcons/shortcuts.png\");\r\n");
      out.write("                prefetchImg(\"/polarion/ria/images/topicIcons/repository.png\");\r\n");
      out.write("                prefetchImg(\"/polarion/ria/images/topicIcons/project.png\");\r\n");
      out.write("                prefetchImg(\"/polarion/ria/images/topicIcons/monitor.png\");\r\n");
      out.write("                prefetchImg(\"/polarion/ria/images/topicIcons/index.png\");\r\n");
      out.write("                prefetchImg(\"/polarion/ria/images/topicIcons/documentsAndWiki.png\");\r\n");
      out.write("                prefetchImg(\"/polarion/ria/images/topicIcons/space.png\");\r\n");
      out.write("                prefetchImg(\"/polarion/ria/images/topicIcons/document.png\");\r\n");
      out.write("                prefetchImg(\"/polarion/ria/images/topicIcons/quality.png\");\r\n");
      out.write("                prefetchImg(\"/polarion/ria/images/topicIcons/modules.png\");\r\n");
      out.write("                prefetchImg(\"/polarion/ria/images/topicIcons/dashboard.png\");\r\n");
      out.write("                prefetchImg(\"/polarion/ria/images/topicIcons/reports.png\");\r\n");
      out.write("                prefetchImg(\"/polarion/ria/images/topicIcons/radar.png\");\r\n");
      out.write("                prefetchImg(\"/polarion/ria/images/topicIcons/search.png\");\r\n");
      out.write("                prefetchImg(\"/polarion/ria/images/topicIcons/administrationGlobal.png\");\r\n");
      out.write("                prefetchImg(\"/polarion/ria/images/topicIcons/announcements.png\");\r\n");
      out.write("                prefetchImg(\"/polarion/ria/images/topicIcons/backArrow.png\");\r\n");
      out.write("                prefetchImg(\"/polarion/ria/images/topicIcons/help.png\");\r\n");
      out.write("                prefetchImg(\"/polarion/ria/images/topicIcons/indexAndCache.png\");\r\n");
      out.write("                prefetchImg(\"/polarion/ria/images/topicIcons/license.png\");\r\n");
      out.write("                prefetchImg(\"/polarion/ria/images/topicIcons/notification.png\");\r\n");
      out.write("                prefetchImg(\"/polarion/ria/images/topicIcons/portal.png\");\r\n");
      out.write("                prefetchImg(\"/polarion/ria/images/topicIcons/project.png\");\r\n");
      out.write("                prefetchImg(\"/polarion/ria/images/topicIcons/projectTemplate.png\");\r\n");
      out.write("                prefetchImg(\"/polarion/ria/images/topicIcons/repository.png\");\r\n");
      out.write("                prefetchImg(\"/polarion/ria/images/topicIcons/scheduler.png\");\r\n");
      out.write("                prefetchImg(\"/polarion/ria/images/topicIcons/users.png\");\r\n");
      out.write("                \r\n");
      out.write("                prefetchImg(\"/polarion/ria/images/topicIconsSmall/workItems.png\");\r\n");
      out.write("                prefetchImg(\"/polarion/ria/images/topicIconsSmall/tests.png\");\r\n");
      out.write("                prefetchImg(\"/polarion/ria/images/topicIconsSmall/testruns.png\");\r\n");
      out.write("                prefetchImg(\"/polarion/ria/images/topicIconsSmall/home.png\");\r\n");
      out.write("                prefetchImg(\"/polarion/ria/images/topicIconsSmall/builds.png\");\r\n");
      out.write("                prefetchImg(\"/polarion/ria/images/topicIconsSmall/baselines.png\");\r\n");
      out.write("                prefetchImg(\"/polarion/ria/images/topicIconsSmall/wiki2.png\");\r\n");
      out.write("                prefetchImg(\"/polarion/ria/images/topicIconsSmall/wiki1.png\");\r\n");
      out.write("                prefetchImg(\"/polarion/ria/images/topicIconsSmall/shortcuts.png\");\r\n");
      out.write("                prefetchImg(\"/polarion/ria/images/topicIconsSmall/repository.png\");\r\n");
      out.write("                prefetchImg(\"/polarion/ria/images/topicIconsSmall/project.png\");\r\n");
      out.write("                prefetchImg(\"/polarion/ria/images/topicIconsSmall/monitor.png\");\r\n");
      out.write("                prefetchImg(\"/polarion/ria/images/topicIconsSmall/index.png\");\r\n");
      out.write("                prefetchImg(\"/polarion/ria/images/topicIconsSmall/documentsAndWiki.png\");\r\n");
      out.write("                prefetchImg(\"/polarion/ria/images/topicIconsSmall/space.png\");\r\n");
      out.write("                prefetchImg(\"/polarion/ria/images/topicIconsSmall/document.png\");\r\n");
      out.write("                prefetchImg(\"/polarion/ria/images/topicIconsSmall/quality.png\");\r\n");
      out.write("                prefetchImg(\"/polarion/ria/images/topicIconsSmall/modules.png\");\r\n");
      out.write("                prefetchImg(\"/polarion/ria/images/topicIconsSmall/dashboard.png\");\r\n");
      out.write("                prefetchImg(\"/polarion/ria/images/topicIconsSmall/reports.png\");\r\n");
      out.write("                prefetchImg(\"/polarion/ria/images/topicIconsSmall/radar.png\");\r\n");
      out.write("                prefetchImg(\"/polarion/ria/images/topicIconsSmall/search.png\");\r\n");
      out.write("                prefetchImg(\"/polarion/ria/images/topicIconsSmall/administrationGlobal.png\");\r\n");
      out.write("                prefetchImg(\"/polarion/ria/images/topicIconsSmall/announcements.png\");\r\n");
      out.write("                prefetchImg(\"/polarion/ria/images/topicIconsSmall/backArrow.png\");\r\n");
      out.write("                prefetchImg(\"/polarion/ria/images/topicIconsSmall/help.png\");\r\n");
      out.write("                prefetchImg(\"/polarion/ria/images/topicIconsSmall/indexAndCache.png\");\r\n");
      out.write("                prefetchImg(\"/polarion/ria/images/topicIconsSmall/license.png\");\r\n");
      out.write("                prefetchImg(\"/polarion/ria/images/topicIconsSmall/notification.png\");\r\n");
      out.write("                prefetchImg(\"/polarion/ria/images/topicIconsSmall/portal.png\");\r\n");
      out.write("                prefetchImg(\"/polarion/ria/images/topicIconsSmall/project.png\");\r\n");
      out.write("                prefetchImg(\"/polarion/ria/images/topicIconsSmall/projectTemplate.png\");\r\n");
      out.write("                prefetchImg(\"/polarion/ria/images/topicIconsSmall/repository.png\");\r\n");
      out.write("                prefetchImg(\"/polarion/ria/images/topicIconsSmall/scheduler.png\");\r\n");
      out.write("                prefetchImg(\"/polarion/ria/images/topicIconsSmall/users.png\");\r\n");
      out.write("                \r\n");
      out.write("                prefetchImg(\"/polarion/ria/images/details/quality_sub.gif\");\r\n");
      out.write("                prefetchImg(\"/polarion/ria/images/details/reports_sub.gif\");\r\n");
      out.write("                \r\n");
      out.write("                prefetchImg(\"/polarion/ria/images/documents/type_excel.gif\");\r\n");
      out.write("                prefetchImg(\"/polarion/ria/images/documents/type_excel_invalid.gif\");\r\n");
      out.write("                prefetchImg(\"/polarion/ria/images/documents/type_generic.gif\");\r\n");
      out.write("                prefetchImg(\"/polarion/ria/images/documents/type_msproject.gif\");\r\n");
      out.write("                prefetchImg(\"/polarion/ria/images/documents/type_msproject_invalid.gif\");\r\n");
      out.write("                prefetchImg(\"/polarion/ria/images/documents/type_unknown.gif\");\r\n");
      out.write("                prefetchImg(\"/polarion/ria/images/documents/type_word.gif\");\r\n");
      out.write("                prefetchImg(\"/polarion/ria/images/documents/type_word_invalid.gif\");\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\tprefetchImg(\"/polarion/ria/images/tree/T.gif\");\r\n");
      out.write("\t\t\t\tprefetchImg(\"/polarion/ria/images/tree/T+.gif\");\r\n");
      out.write("\t\t\t\tprefetchImg(\"/polarion/ria/images/tree/T-.gif\");\r\n");
      out.write("\t\t\t\tprefetchImg(\"/polarion/ria/images/tree/L.gif\");\r\n");
      out.write("\t\t\t\tprefetchImg(\"/polarion/ria/images/tree/L+.gif\");\r\n");
      out.write("\t\t\t\tprefetchImg(\"/polarion/ria/images/tree/L-.gif\");\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\tprefetchImg(\"/polarion/ria/images/portal/lite_settings_off.png\");\r\n");
      out.write("\t\t\t\tprefetchImg(\"/polarion/ria/images/portal/lite_add_shortcut.png\");\r\n");
      out.write("\t\t\t\tprefetchImg(\"/polarion/ria/images/portal/settings_off.png\");\r\n");
      out.write("                prefetchImg(\"/polarion/ria/images/portal/add_shortcut.png\");\r\n");
      out.write("\t\t\t\tprefetchImg(\"/polarion/ria/images/control/search_box.png\");\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\tprefetchImg(\"/polarion/ria/images/control/pinned.png\");\r\n");
      out.write("\t\t\t\tprefetchImg(\"/polarion/ria/images/control/unpinned.png\");\r\n");
      out.write("\t\t\t\tprefetchImg(\"/polarion/ria/images/control/expand_morebutton.png\");\r\n");
      out.write("                prefetchImg(\"/polarion/ria/images/control/collapse_morebutton.png\");\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\tprefetchImg(\"/polarion/ria/images/logo.gif\");\r\n");
      out.write("\t\t\t\tprefetchImg(\"/polarion/ria/images/logo2.gif\");\r\n");
      out.write("\t\t\t\tprefetchImg(\"/polarion/ria/images/logos/small/logo_white.png\");\r\n");
      out.write("\t\t\t\tprefetchImg(\"/polarion/ria/images/logos/repo_logo.png\");\r\n");
      out.write("\t\t    \t\r\n");
      out.write("\t\t\t\tprefetchJS(\"/polarion/ria/javascript/pa/toggle.js\");\r\n");
      out.write("\t\t\t\tprefetchJS(\"/polarion/ria/javascript/pa/selection.js\");\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\tprefetchJS(\"/polarion/ria/javascript/rangy/rangy-core.js\");\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\tprefetchImg(\"/polarion/ria/images/portal/user_account.png\");\r\n");
      out.write("\t\t\t\tprefetchImg(\"/polarion/ria/images/portal/manageShortcutsIcon.png\");\r\n");
      out.write("\t\t\t\tprefetchImg(\"/polarion/ria/images/portal/administration.png\");\r\n");
      out.write("\t\t\t\tprefetchImg(\"/polarion/ria/images/portal/help.png\");\r\n");
      out.write("\t\t\t\tprefetchImg(\"/polarion/ria/images/portal/view.png\");\r\n");
      out.write("\t\t\t\tprefetchImg(\"/polarion/ria/images/portal/logout.png\");\r\n");
      out.write("\t\t\t\tprefetchImg(\"/polarion/ria/images/portal/settings_on.png\");\r\n");
      out.write("\t\t    }\r\n");
      out.write("\t\t</script>\r\n");
      out.write("\t</body>\r\n");
      out.write("</html>");
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