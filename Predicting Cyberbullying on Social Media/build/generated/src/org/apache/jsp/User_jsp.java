package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class User_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
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
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<title>Predicting Cyberbullying</title>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("body{\r\n");
      out.write("margin:0px;\r\n");
      out.write("padding:0px;\r\n");
      out.write("}\r\n");
      out.write("#head{\r\n");
      out.write("background-color:DarkCyan;\r\n");
      out.write("width:100%;\r\n");
      out.write("height:100px;\r\n");
      out.write("border:1px solid DarkCyan;\r\n");
      out.write("}\r\n");
      out.write("#link{\r\n");
      out.write("background-color:Cyan;\r\n");
      out.write("width:100%;\r\n");
      out.write("height:50px;\r\n");
      out.write("}\r\n");
      out.write("ul{\r\n");
      out.write("\r\n");
      out.write("margin:0px;\r\n");
      out.write("padding:0px;\r\n");
      out.write("\r\n");
      out.write("list-style:none;\r\n");
      out.write("}\r\n");
      out.write("ul li {\r\n");
      out.write("text-align:center;\r\n");
      out.write("float:left;\r\n");
      out.write("width:100px;\r\n");
      out.write("margin-top:15px;\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("ul li a{\r\n");
      out.write("color:gold;\r\n");
      out.write("text-decoration:none;\r\n");
      out.write("font-weight:bold;\r\n");
      out.write("}\r\n");
      out.write("a:hover{\r\n");
      out.write("color:red;\r\n");
      out.write("}\r\n");
      out.write("#image{\r\n");
      out.write("width:76%;\r\n");
      out.write("height:320px;\r\n");
      out.write("border:1px solid Cyan;\r\n");
      out.write("background-color:Cyan;\r\n");
      out.write("}\r\n");
      out.write("#abstract{\r\n");
      out.write("width:76%;\r\n");
      out.write("height:500px;\r\n");
      out.write("background-color:Snow;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body bgcolor=\"DarkSlateGray\">\r\n");
      out.write("<div id=\"head\">\r\n");
      out.write("<center>\r\n");
      out.write("<h2 style=\"width:80%;color:gold\">Predicting Cyberbullying on Social Media in the Big Data Era Using Machine Learning Algorithms: Review of Literature and Open Challenges</h2>\r\n");
      out.write("</center>\r\n");
      out.write("</div>\r\n");
      out.write("<div id=\"link\">\r\n");
      out.write("<center>\r\n");
      out.write("<ul>\r\n");
      out.write("<li><a href=\"index.html\" style=\"margin-left:400px;\">HOME</a></li>\r\n");
      out.write("<li><a href=\"User.jsp\"style=\"margin-left:400px;\">USER</a></li>\r\n");
      out.write("<li><a href=\"OSNServer.jsp\"style=\"margin-left:400px;\">OSNServer</a></li>\r\n");
      out.write("</ul>\r\n");
      out.write("</center>\r\n");
      out.write("</div>\r\n");
      out.write("<center>\r\n");
      out.write("<div id=\"image\">\r\n");
      out.write("<image src=\"images/Capture.PNG\"/>\r\n");
      out.write("</div>\r\n");
      out.write("<div id=\"abstract\">\r\n");
      out.write("\r\n");
      out.write("<image src=\"images/userlogin.jpg\" style=\"float:left\"/>\r\n");
      out.write("\r\n");
      out.write("<div id=\"log\" style=\"width:400px;height:200px;border:1px solid white;float:left\">\r\n");
      out.write("<h2>Welcome To User Login</h2>\r\n");
      out.write("<form action=\"UserLoginAction.jsp\" method=\"post\">\r\n");
      out.write("<table>\r\n");
      out.write("<tr><th style=\"width:200px;height:50px;background-color:red;color:white;\">UserName:</th><td><input type=\"text\" name=\"uname\" required=\"\"></td></tr>\r\n");
      out.write("<tr><th style=\"width:200px;height:50px;background-color:red;color:white;\">Password:</th><td><input type=\"password\" name=\"pwd\" required=\"\"></td></tr>\r\n");
      out.write("<tr><th></th><td><input type=\"submit\" value=\"LOGIN\">\r\n");
      out.write("<input type=\"reset\" value=\"RESET\"></td></tr>\r\n");
      out.write("<tr></tr><tr></tr>\r\n");
      out.write("<tr><th>Don't Have An Account:?</th><th><a href=\"Register.jsp\">Register Here</a></th></tr>\r\n");
      out.write("</table>\r\n");
      out.write("</form>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("</center>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
