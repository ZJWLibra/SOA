/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2018-01-12 08:22:16 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.user;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class userIndex_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fshiro_005fhasPermission_0026_005fname;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fshiro_005fhasPermission_0026_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fshiro_005fhasPermission_0026_005fname.release();
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
      response.setContentType("text/html;charset=UTF-8");
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

String path = request.getContextPath();

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE HTML>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\t<base href=\"");
      out.print(path);
      out.write("/\">\r\n");
      out.write("\t<meta charset=\"utf-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("\r\n");
      out.write("    <title>用户管理</title>\r\n");
      out.write("\r\n");
      out.write("    <link rel=\"shortcut icon\" href=\"hplus/favicon.ico\"> <link href=\"hplus/css/bootstrap.min14ed.css?v=3.3.6\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"hplus/css/font-awesome.min93e3.css?v=4.4.0\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("    <!-- jqgrid-->\r\n");
      out.write("    <link href=\"hplus/css/plugins/jqgrid/ui.jqgridffe4.css?0820\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("    <link href=\"hplus/css/animate.min.css\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"hplus/css/style.min862f.css?v=4.1.0\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"hplus/css/plugins/sweetalert/sweetalert.css\" rel=\"stylesheet\">\r\n");
      out.write("    \r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/bootstrapStyle/bootstrapStyle.css\" type=\"text/css\">\r\n");
      out.write("\r\n");
      out.write("    <style type=\"text/css\">\r\n");
      out.write("        #alertmod_table_list_2 {\r\n");
      out.write("            top: 900px !important;\r\n");
      out.write("        }\r\n");
      out.write("        .must-label {\r\n");
      out.write("        \tcolor : #ed5565;\r\n");
      out.write("        }\r\n");
      out.write("    </style>\r\n");
      out.write("</head>\r\n");
      out.write("<body class=\"gray-bg\">\r\n");
      out.write("    <div class=\"wrapper wrapper-content  animated fadeInRight\">\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("            <div class=\"col-sm-12\">\r\n");
      out.write("                <div class=\"ibox \">\r\n");
      out.write("                    <div class=\"ibox-title\">\r\n");
      out.write("                        <h5>用户管理</h5>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"ibox-content\">\r\n");
      out.write("                       \t<form class=\"form-inline\">\r\n");
      out.write("                       \t\t<label class=\"control-label\">性别:</label>\r\n");
      out.write("                        \t<select class=\"form-control m-b\" style=\"width:100px;margin-top:15px\" id=\"user_gender\">\r\n");
      out.write("                        \t\t<option value=\"\">请选择</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"G\">男</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"M\">女</option>\r\n");
      out.write("\t\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t\t\t<label class=\"control-label\">状态:</label>\r\n");
      out.write("                        \t<select class=\"form-control m-b\" style=\"width:100px;margin-top:15px\" id=\"user_status\">\r\n");
      out.write("                        \t\t<option value=\"\">请选择</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"Y\">启用</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"N\">停用</option>\r\n");
      out.write("\t\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t\t\t<button type=\"button\" class=\"btn btn-outline btn-primary form_select\">查询</button>\r\n");
      out.write("\t\t\t\t\t\t\t<button type=\"reset\" class=\"btn btn-outline btn-primary\">重置</button>\r\n");
      out.write("                       \t</form>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t");
      if (_jspx_meth_shiro_005fhasPermission_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t");
      if (_jspx_meth_shiro_005fhasPermission_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t");
      if (_jspx_meth_shiro_005fhasPermission_005f2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t");
      if (_jspx_meth_shiro_005fhasPermission_005f3(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("                        <div class=\"jqGrid_wrapper\">\r\n");
      out.write("                            <table id=\"user_table\"></table>\r\n");
      out.write("                            <div id=\"table_page\"></div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("    <!-- 新增表单 -->\r\n");
      out.write("    <div id=\"insert-form\" class=\"modal fade\" aria-hidden=\"true\">\r\n");
      out.write("        <div class=\"modal-dialog\">\r\n");
      out.write("            <div class=\"modal-content\">\r\n");
      out.write("                <div class=\"modal-body\">\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                        <div class=\"col-sm-12\">\r\n");
      out.write("                            <h3 class=\"m-t-none m-b\">新增用户</h3>\r\n");
      out.write("                            <form role=\"form\" id=\"user_insert_form\" class=\"user-validate\">\r\n");
      out.write("                                <div class=\"form-group\">\r\n");
      out.write("                                    <label class=\"must-label\">邮箱(必填):</label>\r\n");
      out.write("                                    <input type=\"text\" placeholder=\"请输入邮箱\" class=\"form-control\" id=\"userEmail\" name=\"userEmail\" />\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"form-group\">\r\n");
      out.write("                                    <label class=\"must-label\">手机号码(必填):</label>\r\n");
      out.write("                                    <input type=\"text\" placeholder=\"请输入手机号码\" class=\"form-control\" id=\"userPhone\" name=\"userPhone\" />\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"form-group\">\r\n");
      out.write("                                    <label class=\"must-label\">登录密码(必填):</label>\r\n");
      out.write("                                    <input type=\"password\" placeholder=\"请输入密码\" class=\"form-control\" id=\"userPwd\" name=\"userPwd\" />\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"form-group\">\r\n");
      out.write("                                    <label class=\"must-label\">确认密码(必填):</label>\r\n");
      out.write("                                    <input type=\"password\" placeholder=\"请确认密码\" class=\"form-control\" id=\"userPwd2\" name=\"userPwd2\" />\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"form-group\">\r\n");
      out.write("                                    <label>昵称:</label>\r\n");
      out.write("                                    <input type=\"text\" placeholder=\"请输入昵称\" class=\"form-control\" id=\"userNickname\" name=\"userNickname\" />\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"form-group\">\r\n");
      out.write("                                    <label>身份证号码:</label>\r\n");
      out.write("                                    <input type=\"text\" placeholder=\"请输入身份证号码\" class=\"form-control\" id=\"userIdentity\" name=\"userIdentity\" />\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"form-group\">\r\n");
      out.write("                                    <label>真实姓名:</label>\r\n");
      out.write("                                    <input type=\"text\" placeholder=\"请输入真实姓名\" class=\"form-control\" id=\"userName\" name=\"userName\" />\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"form-group\">\r\n");
      out.write("                                    <label>性别:</label>\r\n");
      out.write("                                    <label class=\"form-inline\" style=\"margin-left:10px\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t男&nbsp;&nbsp;<input type=\"radio\" name=\"userGender\" value=\"G\" checked />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<label class=\"form-inline\" style=\"margin-left:10px\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t女&nbsp;&nbsp;<input type=\"radio\" name=\"userGender\" value=\"M\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</label>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"form-group\">\r\n");
      out.write("                                    <label>生日:</label>\r\n");
      out.write("                                    <div>\r\n");
      out.write("                                        <input readonly type=\"text\" class=\"form-control layer-date\" id=\"strUserBirthday\" name=\"strUserBirthday\" />\r\n");
      out.write("                                        <label class=\"laydate-icon inline demoicon\" onclick=\"laydate({elem: '#strUserBirthday'});\"></label>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"form-group\">\r\n");
      out.write("                                    <label>地址:</label>\r\n");
      out.write("                                    <input type=\"text\" placeholder=\"请输入地址\" class=\"form-control\" id=\"userAddress\" name=\"userAddress\" />\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"form-group\">\r\n");
      out.write("                                    <label>QQ:</label>\r\n");
      out.write("                                    <input type=\"text\" placeholder=\"请输入QQ\" class=\"form-control\" id=\"qqOpenId\" name=\"qqOpenId\" />\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"form-group\">\r\n");
      out.write("                                    <label>微信:</label>\r\n");
      out.write("                                    <input type=\"text\" placeholder=\"请输入微信\" class=\"form-control\" id=\"wechatOpenId\" name=\"wechatOpenId\" />\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"form-group\">\r\n");
      out.write("                                    <label>微博:</label>\r\n");
      out.write("                                    <input type=\"text\" placeholder=\"请输入微博\" class=\"form-control\" id=\"weiboOpenId\" name=\"weiboOpenId\" />\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"form-group\">\r\n");
      out.write("                                    <label>描述:</label>\r\n");
      out.write("                                    <input type=\"text\" placeholder=\"请输入描述\" class=\"form-control\" id=\"userDes\" name=\"userDes\" />\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"form-group\">\r\n");
      out.write("                                    <label>所属公司:</label>\r\n");
      out.write("                                    <select class=\"form-control m-b\" id=\"companyId\" name=\"companyId\">\r\n");
      out.write("\t\t                        \t\t<option value=\"\">请选择</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</select>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"form-group\">\r\n");
      out.write("                                    <label>基本工资:</label>\r\n");
      out.write("                                    <input type=\"text\" placeholder=\"请输入基本工资\" class=\"form-control\" id=\"userSalary\" name=\"userSalary\" />\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"form-group\">\r\n");
      out.write("                                    <label>状态:</label>\r\n");
      out.write("                                    <select class=\"form-control m-b\" id=\"userStatus\" name=\"userStatus\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"Y\">启用</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"N\">停用</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</select>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div>\r\n");
      out.write("                                    <button class=\"btn btn-sm btn-primary pull-right m-t-n-xs\" style=\"margin-left:5px\" type=\"button\" id=\"insert_submit\">\r\n");
      out.write("                                    <strong>保存</strong>\r\n");
      out.write("                                    </button>\r\n");
      out.write("                                    <button class=\"btn btn-sm btn-default pull-right m-t-n-xs\" type=\"button\" id=\"insert_close\">\r\n");
      out.write("                                    <strong>关闭</strong>\r\n");
      out.write("                                    </button>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </form>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("    <!-- 编辑表单 -->\r\n");
      out.write("    <div id=\"edit-form\" class=\"modal fade\" aria-hidden=\"true\">\r\n");
      out.write("        <div class=\"modal-dialog\">\r\n");
      out.write("            <div class=\"modal-content\">\r\n");
      out.write("                <div class=\"modal-body\">\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                        <div class=\"col-sm-12\">\r\n");
      out.write("                            <h3 class=\"m-t-none m-b\">编辑用户</h3>\r\n");
      out.write("                            <form role=\"form\" id=\"user_edit_form\">\r\n");
      out.write("                            \t<input type=\"hidden\" id=\"edit_userId\" name=\"userId\" />\r\n");
      out.write("                            \t<input type=\"hidden\" id=\"edit_userEmail\" name=\"userEmail\" />\r\n");
      out.write("                            \t<input type=\"hidden\" id=\"edit_userPhone\" name=\"userPhone\" />\r\n");
      out.write("                            \t<input type=\"hidden\" id=\"edit_userPwd\" name=\"userPwd\" />\r\n");
      out.write("                            \t<input type=\"hidden\" id=\"edit_userSalt\" name=\"userSalt\" />\r\n");
      out.write("                            \t<input type=\"hidden\" id=\"edit_userIcon\" name=\"userIcon\" />\r\n");
      out.write("                            \t<input type=\"hidden\" id=\"edit_userCreatedTime\" name=\"strUserCreatedTime\" />\r\n");
      out.write("                            \t<input type=\"hidden\" id=\"edit_userLoginedTime\" name=\"strUserLoginedTime\" />\r\n");
      out.write("                                <div class=\"form-group\">\r\n");
      out.write("                                    <label>昵称:</label>\r\n");
      out.write("                                    <input type=\"text\" placeholder=\"请输入昵称\" class=\"form-control\" id=\"edit_userNickname\" name=\"userNickname\" />\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"form-group\">\r\n");
      out.write("                                    <label>身份证号码:</label>\r\n");
      out.write("                                    <input type=\"text\" placeholder=\"请输入身份证号码\" class=\"form-control\" id=\"edit_userIdentity\" name=\"userIdentity\" />\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"form-group\">\r\n");
      out.write("                                    <label>真实姓名:</label>\r\n");
      out.write("                                    <input type=\"text\" placeholder=\"请输入真实姓名\" class=\"form-control\" id=\"edit_userName\" name=\"userName\" />\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"form-group\">\r\n");
      out.write("                                    <label>性别:</label>\r\n");
      out.write("                                    <label class=\"form-inline\" style=\"margin-left:10px\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t男&nbsp;&nbsp;<input type=\"radio\" id=\"edit_userGender1\" name=\"userGender\" value=\"G\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<label class=\"form-inline\" style=\"margin-left:10px\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t女&nbsp;&nbsp;<input type=\"radio\" id=\"edit_userGender2\" name=\"userGender\" value=\"M\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</label>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"form-group\">\r\n");
      out.write("                                    <label>生日:</label>\r\n");
      out.write("                                    <div>\r\n");
      out.write("                                        <input readonly type=\"text\" class=\"form-control layer-date\" id=\"edit_strUserBirthday\" name=\"strUserBirthday\" />\r\n");
      out.write("                                        <label class=\"laydate-icon inline demoicon\" onclick=\"laydate({elem: '#edit_strUserBirthday'});\"></label>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"form-group\">\r\n");
      out.write("                                    <label>地址:</label>\r\n");
      out.write("                                    <input type=\"text\" placeholder=\"请输入地址\" class=\"form-control\" id=\"edit_userAddress\" name=\"userAddress\" />\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"form-group\">\r\n");
      out.write("                                    <label>QQ:</label>\r\n");
      out.write("                                    <input type=\"text\" placeholder=\"请输入QQ\" class=\"form-control\" id=\"edit_qqOpenId\" name=\"qqOpenId\" />\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"form-group\">\r\n");
      out.write("                                    <label>微信:</label>\r\n");
      out.write("                                    <input type=\"text\" placeholder=\"请输入微信\" class=\"form-control\" id=\"edit_wechatOpenId\" name=\"wechatOpenId\" />\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"form-group\">\r\n");
      out.write("                                    <label>微博:</label>\r\n");
      out.write("                                    <input type=\"text\" placeholder=\"请输入微博\" class=\"form-control\" id=\"edit_weiboOpenId\" name=\"weiboOpenId\" />\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"form-group\">\r\n");
      out.write("                                    <label>描述:</label>\r\n");
      out.write("                                    <input type=\"text\" placeholder=\"请输入描述\" class=\"form-control\" id=\"edit_userDes\" name=\"userDes\" />\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"form-group\">\r\n");
      out.write("                                    <label>所属公司:</label>\r\n");
      out.write("                                    <select class=\"form-control m-b\" id=\"edit_companyId\" name=\"companyId\">\r\n");
      out.write("\t\t                        \t\t<option value=\"\">请选择</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</select>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"form-group\">\r\n");
      out.write("                                    <label>基本工资:</label>\r\n");
      out.write("                                    <input type=\"text\" placeholder=\"请输入基本工资\" class=\"form-control\" id=\"edit_userSalary\" name=\"userSalary\" />\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"form-group\">\r\n");
      out.write("                                    <label>状态:</label>\r\n");
      out.write("                                    <select class=\"form-control m-b\" id=\"edit_userStatus\" name=\"userStatus\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"Y\">启用</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"N\">停用</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</select>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div>\r\n");
      out.write("                                    <button class=\"btn btn-sm btn-primary pull-right m-t-n-xs\" style=\"margin-left:5px\" type=\"button\" id=\"edit_submit\">\r\n");
      out.write("                                    <strong>保存</strong>\r\n");
      out.write("                                    </button>\r\n");
      out.write("                                    <button class=\"btn btn-sm btn-default pull-right m-t-n-xs\" type=\"button\" id=\"edit_close\">\r\n");
      out.write("                                    <strong>关闭</strong>\r\n");
      out.write("                                    </button>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </form>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("    <!-- 角色菜单 -->\r\n");
      out.write("    <div id=\"role_modal\" class=\"modal fade\" aria-hidden=\"true\">\r\n");
      out.write("        <div class=\"modal-dialog\">\r\n");
      out.write("            <div class=\"modal-content\" style=\"width:400px\">\r\n");
      out.write("                <div class=\"modal-body\">\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                        <div class=\"col-sm-12\">\r\n");
      out.write("                            <h3 class=\"m-t-none m-b\">添加角色</h3>\r\n");
      out.write("                            <input type=\"hidden\" id=\"userId\" />\r\n");
      out.write("                            <div class=\"content_wrap\">\r\n");
      out.write("\t                            <div class=\"zTreeDemoBackground left\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<ul id=\"ztree\" class=\"ztree\"></ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t<button class=\"btn btn-sm btn-primary pull-right m-t-n-xs\" style=\"margin-left:5px\" type=\"button\" id=\"role_submit\">\r\n");
      out.write("\t\t\t\t\t\t\t<strong>保存</strong>\r\n");
      out.write("\t\t\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t\t\t<button class=\"btn btn-sm btn-default pull-right m-t-n-xs\" type=\"button\" id=\"role_close\">\r\n");
      out.write("\t\t\t\t\t\t\t<strong>关闭</strong>\r\n");
      out.write("\t\t\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <script src=\"hplus/js/jquery.min.js?v=2.1.4\"></script>\r\n");
      out.write("    <script src=\"hplus/js/bootstrap.min.js?v=3.3.6\"></script>\r\n");
      out.write("    <script src=\"hplus/js/plugins/peity/jquery.peity.min.js\"></script>\r\n");
      out.write("    <script src=\"hplus/js/plugins/jqgrid/i18n/grid.locale-cnffe4.js?0820\"></script>\r\n");
      out.write("    <script src=\"hplus/js/plugins/jqgrid/jquery.jqGrid.minffe4.js?0820\"></script>\r\n");
      out.write("    <script src=\"hplus/js/content.min.js?v=1.0.0\"></script>\r\n");
      out.write("    <script src=\"hplus/js/plugins/sweetalert/sweetalert.min.js\"></script>\r\n");
      out.write("    <script src=\"hplus/js/plugins/layer/laydate/laydate.js\"></script>\r\n");
      out.write("    <script src=\"hplus/js/plugins/validate/jquery.validate.min.js\"></script>\r\n");
      out.write("    <script src=\"hplus/js/plugins/validate/messages_zh.min.js\"></script>\r\n");
      out.write("\t\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"http://tajs.qq.com/stats?sId=9051096\" charset=\"UTF-8\"></script>\r\n");
      out.write("    \r\n");
      out.write("    <script type=\"text/javascript\" src=\"js/common.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"js/user/user.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"js/user/user.validate.js\"></script>\r\n");
      out.write("    \r\n");
      out.write("    <!-- ztree -->\r\n");
      out.write("    <script type=\"text/javascript\" src=\"js/ztree/jquery.ztree.core.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"js/ztree/jquery.ztree.excheck.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"js/ztree/jquery.ztree.exedit.js\"></script>\r\n");
      out.write("    \r\n");
      out.write("    <script type=\"text/javascript\" src=\"js/user/user.tree.js\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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

  private boolean _jspx_meth_shiro_005fhasPermission_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  shiro:hasPermission
    org.apache.shiro.web.tags.HasPermissionTag _jspx_th_shiro_005fhasPermission_005f0 = (org.apache.shiro.web.tags.HasPermissionTag) _005fjspx_005ftagPool_005fshiro_005fhasPermission_0026_005fname.get(org.apache.shiro.web.tags.HasPermissionTag.class);
    _jspx_th_shiro_005fhasPermission_005f0.setPageContext(_jspx_page_context);
    _jspx_th_shiro_005fhasPermission_005f0.setParent(null);
    // /WEB-INF/views/user/userIndex.jsp(63,7) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_shiro_005fhasPermission_005f0.setName("user:insert");
    int _jspx_eval_shiro_005fhasPermission_005f0 = _jspx_th_shiro_005fhasPermission_005f0.doStartTag();
    if (_jspx_eval_shiro_005fhasPermission_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t<a data-toggle=\"modal\" class=\"btn btn-primary\" href=\"#insert-form\">新增</a>\r\n");
        out.write("\t\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_shiro_005fhasPermission_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_shiro_005fhasPermission_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fshiro_005fhasPermission_0026_005fname.reuse(_jspx_th_shiro_005fhasPermission_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fshiro_005fhasPermission_0026_005fname.reuse(_jspx_th_shiro_005fhasPermission_005f0);
    return false;
  }

  private boolean _jspx_meth_shiro_005fhasPermission_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  shiro:hasPermission
    org.apache.shiro.web.tags.HasPermissionTag _jspx_th_shiro_005fhasPermission_005f1 = (org.apache.shiro.web.tags.HasPermissionTag) _005fjspx_005ftagPool_005fshiro_005fhasPermission_0026_005fname.get(org.apache.shiro.web.tags.HasPermissionTag.class);
    _jspx_th_shiro_005fhasPermission_005f1.setPageContext(_jspx_page_context);
    _jspx_th_shiro_005fhasPermission_005f1.setParent(null);
    // /WEB-INF/views/user/userIndex.jsp(66,7) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_shiro_005fhasPermission_005f1.setName("user:update");
    int _jspx_eval_shiro_005fhasPermission_005f1 = _jspx_th_shiro_005fhasPermission_005f1.doStartTag();
    if (_jspx_eval_shiro_005fhasPermission_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t<button data-toggle=\"button\" class=\"btn btn-primary user-update\" type=\"button\">修改</button>\r\n");
        out.write("\t\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_shiro_005fhasPermission_005f1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_shiro_005fhasPermission_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fshiro_005fhasPermission_0026_005fname.reuse(_jspx_th_shiro_005fhasPermission_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fshiro_005fhasPermission_0026_005fname.reuse(_jspx_th_shiro_005fhasPermission_005f1);
    return false;
  }

  private boolean _jspx_meth_shiro_005fhasPermission_005f2(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  shiro:hasPermission
    org.apache.shiro.web.tags.HasPermissionTag _jspx_th_shiro_005fhasPermission_005f2 = (org.apache.shiro.web.tags.HasPermissionTag) _005fjspx_005ftagPool_005fshiro_005fhasPermission_0026_005fname.get(org.apache.shiro.web.tags.HasPermissionTag.class);
    _jspx_th_shiro_005fhasPermission_005f2.setPageContext(_jspx_page_context);
    _jspx_th_shiro_005fhasPermission_005f2.setParent(null);
    // /WEB-INF/views/user/userIndex.jsp(69,7) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_shiro_005fhasPermission_005f2.setName("user:delete");
    int _jspx_eval_shiro_005fhasPermission_005f2 = _jspx_th_shiro_005fhasPermission_005f2.doStartTag();
    if (_jspx_eval_shiro_005fhasPermission_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t<button data-toggle=\"button\" class=\"btn btn-primary user-remove\" type=\"button\">删除</button>\r\n");
        out.write("\t\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_shiro_005fhasPermission_005f2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_shiro_005fhasPermission_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fshiro_005fhasPermission_0026_005fname.reuse(_jspx_th_shiro_005fhasPermission_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fshiro_005fhasPermission_0026_005fname.reuse(_jspx_th_shiro_005fhasPermission_005f2);
    return false;
  }

  private boolean _jspx_meth_shiro_005fhasPermission_005f3(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  shiro:hasPermission
    org.apache.shiro.web.tags.HasPermissionTag _jspx_th_shiro_005fhasPermission_005f3 = (org.apache.shiro.web.tags.HasPermissionTag) _005fjspx_005ftagPool_005fshiro_005fhasPermission_0026_005fname.get(org.apache.shiro.web.tags.HasPermissionTag.class);
    _jspx_th_shiro_005fhasPermission_005f3.setPageContext(_jspx_page_context);
    _jspx_th_shiro_005fhasPermission_005f3.setParent(null);
    // /WEB-INF/views/user/userIndex.jsp(72,7) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_shiro_005fhasPermission_005f3.setName("user:role");
    int _jspx_eval_shiro_005fhasPermission_005f3 = _jspx_th_shiro_005fhasPermission_005f3.doStartTag();
    if (_jspx_eval_shiro_005fhasPermission_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t<button data-toggle=\"button\" class=\"btn btn-primary user-role\" type=\"button\">添加角色</button>\r\n");
        out.write("\t\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_shiro_005fhasPermission_005f3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_shiro_005fhasPermission_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fshiro_005fhasPermission_0026_005fname.reuse(_jspx_th_shiro_005fhasPermission_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fshiro_005fhasPermission_0026_005fname.reuse(_jspx_th_shiro_005fhasPermission_005f3);
    return false;
  }
}
