/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2020-05-31 02:17:47 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

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

      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta charset=\"utf-8\">\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("\n");
      out.write("<title>数据 - 项目练习 | Log in</title>\n");
      out.write("\n");
      out.write("<meta\n");
      out.write("\tcontent=\"width=device-width,initial-scale=1,maximum-scale=1,user-scalable=no\"\n");
      out.write("\tname=\"viewport\">\n");
      out.write("\n");
      out.write("<link rel=\"stylesheet\"\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/plugins/bootstrap/css/bootstrap.min.css\">\n");
      out.write("<link rel=\"stylesheet\"\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/plugins/font-awesome/css/font-awesome.min.css\">\n");
      out.write("<link rel=\"stylesheet\"\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/plugins/ionicons/css/ionicons.min.css\">\n");
      out.write("<link rel=\"stylesheet\"\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/plugins/adminLTE/css/AdminLTE.css\">\n");
      out.write("<link rel=\"stylesheet\"\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/plugins/iCheck/square/blue.css\">\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body class=\"hold-transition login-page\">\n");
      out.write("\t<div class=\"login-box\">\n");
      out.write("\t\t<div class=\"login-logo\">\n");
      out.write("\t\t\t<a href=\"all-admin-index.html\"><b>项目练习</b>后台管理系统</a>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<!-- /.login-logo -->\n");
      out.write("\t\t<div class=\"login-box-body\">\n");
      out.write("\t\t\t<p class=\"login-box-msg\">登录系统</p>\n");
      out.write("\n");
      out.write("\t\t\t<form action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/login.do\" method=\"post\">\n");
      out.write("\t\t\t\t<div class=\"form-group has-feedback\">\n");
      out.write("\t\t\t\t\t<input type=\"text\" name=\"username\" class=\"form-control\"\n");
      out.write("\t\t\t\t\t\tplaceholder=\"用户名\"> <span\n");
      out.write("\t\t\t\t\t\tclass=\"glyphicon glyphicon-envelope form-control-feedback\"></span>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"form-group has-feedback\">\n");
      out.write("\t\t\t\t\t<input type=\"password\" name=\"password\" class=\"form-control\"\n");
      out.write("\t\t\t\t\t\tplaceholder=\"密码\"> <span\n");
      out.write("\t\t\t\t\t\tclass=\"glyphicon glyphicon-lock form-control-feedback\"></span>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t<div class=\"col-xs-8\">\n");
      out.write("\t\t\t\t\t\t<div class=\"checkbox icheck\">\n");
      out.write("\t\t\t\t\t\t\t<label><input type=\"checkbox\"> 记住 下次自动登录</label>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<!-- /.col -->\n");
      out.write("\t\t\t\t\t<div class=\"col-xs-4\">\n");
      out.write("\t\t\t\t\t\t<button type=\"submit\" class=\"btn btn-primary btn-block btn-flat\">登录</button>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<!-- /.col -->\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</form>\n");
      out.write("\n");
      out.write("\t\t\t<a href=\"#\">忘记密码</a><br>\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<!-- /.login-box-body -->\n");
      out.write("\t</div>\n");
      out.write("\t<!-- /.login-box -->\n");
      out.write("\n");
      out.write("\t<!-- jQuery 2.2.3 -->\n");
      out.write("\t<!-- Bootstrap 3.3.6 -->\n");
      out.write("\t<!-- iCheck -->\n");
      out.write("\t<script\n");
      out.write("\t\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/plugins/jQuery/jquery-2.2.3.min.js\"></script>\n");
      out.write("\t<script\n");
      out.write("\t\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/plugins/bootstrap/js/bootstrap.min.js\"></script>\n");
      out.write("\t<script\n");
      out.write("\t\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/plugins/iCheck/icheck.min.js\"></script>\n");
      out.write("\t<script>\n");
      out.write("\t\t$(function() {\n");
      out.write("\t\t\t$('input').iCheck({\n");
      out.write("\t\t\t\tcheckboxClass : 'icheckbox_square-blue',\n");
      out.write("\t\t\t\tradioClass : 'iradio_square-blue',\n");
      out.write("\t\t\t\tincreaseArea : '20%' // optional\n");
      out.write("\t\t\t});\n");
      out.write("\t\t});\n");
      out.write("\t</script>\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
