package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import com.resultset.ResultSetReturnImpl;

public final class MyPost_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta charset=\"ISO-8859-1\">\n");
      out.write("<title>Predicting Cyberbullying</title>\n");
      out.write("<style type=\"text/css\">\n");
      out.write("body{\n");
      out.write("margin:0px;\n");
      out.write("padding:0px;\n");
      out.write("}\n");
      out.write("#head{\n");
      out.write("background-color:DarkCyan;\n");
      out.write("width:100%;\n");
      out.write("height:100px;\n");
      out.write("border:1px solid DarkCyan;\n");
      out.write("}\n");
      out.write("#link{\n");
      out.write("background-color:Cyan;\n");
      out.write("width:100%;\n");
      out.write("height:50px;\n");
      out.write("}\n");
      out.write("ul{\n");
      out.write("\n");
      out.write("margin:0px;\n");
      out.write("padding:0px;\n");
      out.write("\n");
      out.write("list-style:none;\n");
      out.write("}\n");
      out.write("ul li {\n");
      out.write("text-align:center;\n");
      out.write("float:left;\n");
      out.write("width:100px;\n");
      out.write("margin-top:15px;\n");
      out.write("\n");
      out.write("}\n");
      out.write("ul li a{\n");
      out.write("color:gold;\n");
      out.write("text-decoration:none;\n");
      out.write("font-weight:bold;\n");
      out.write("}\n");
      out.write("a:hover{\n");
      out.write("color:red;\n");
      out.write("}\n");
      out.write("#image{\n");
      out.write("width:76%;\n");
      out.write("height:320px;\n");
      out.write("border:1px solid Cyan;\n");
      out.write("background-color:Cyan;\n");
      out.write("}\n");
      out.write("#abstract{\n");
      out.write("width:76%;\n");
      out.write("height:auto;\n");
      out.write("background-color:Snow;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("<link href=\"table.css\" rel=\"stylesheet\">\n");
      out.write("</head>\n");
      out.write("<body bgcolor=\"DarkSlateGray\">\n");
      out.write("<div id=\"head\">\n");
      out.write("<center>\n");
      out.write("<h2 style=\"width:80%;color:gold\">Predicting Cyberbullying on Social Media in the Big Data Era Using Machine Learning Algorithms: Review of Literature and Open Challenges</h2>\n");
      out.write("</center>\n");
      out.write("</div>\n");
      out.write("<div id=\"link\">\n");
      out.write("<center>\n");
      out.write("<ul>\n");
      out.write("<li><a href=\"index.html\" style=\"margin-left:400px;\">HOME</a></li>\n");
      out.write("<li><a href=\"User.jsp\"style=\"margin-left:400px;\">USER</a></li>\n");
      out.write("<li><a href=\"OSNServer.jsp\"style=\"margin-left:400px;\">OSNServer</a></li>\n");
      out.write("</ul>\n");
      out.write("</center>\n");
      out.write("</div>\n");
      out.write("<center>\n");
      out.write("<div id=\"image\">\n");
      out.write("<image src=\"images/Capture.PNG\"/>\n");
      out.write("</div>\n");
      out.write("<div id=\"abstract\">\n");
      out.write("    <div id=\"name\" style=\"width:100%;height:40px;border-bottom:1px solid graytext;\">\n");
      out.write("        ");
String email=(String)session.getAttribute("email");
        String username=(String)session.getAttribute("username");
      out.write("\n");
      out.write("        <h2 style=\"margin:0px;\"> WelCome To User Home Page...!! ");
      out.print(username);
      out.write("</h2>\n");
      out.write("    </div>\n");
      out.write("    <div id=\"link2\" style=\"width:35%;height:400px;border-left:1px solid graytext;float:right\">\n");
      out.write("        <ul>\n");
      out.write("            <ul style=\"float:left;margin-left:150px;margin-top:10px;\"><a href=\"UserHome.jsp\">Home</a></ul>\n");
      out.write("            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("            <ul style=\"float:left;margin-left:150px;margin-top:10px;\"><a href=\"MyProfile.jsp\">My Profile</a></ul>\n");
      out.write("            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("            <ul style=\"float:left;margin-left:150px;margin-top:10px;\"><a href=\"SearchFriends.jsp\">Search Friends</a></ul>\n");
      out.write("            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("            <ul style=\"float:left;margin-left:150px;margin-top:10px;\"><a href=\"Fr_Requests.jsp\">Friends Request</a></ul>\n");
      out.write("            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("            <ul style=\"float:left;margin-left:150px;margin-top:10px;\"><a href=\"Add_Posts.jsp\">Add Posts</a></ul>\n");
      out.write("            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("            <ul style=\"float:left;margin-left:150px;margin-top:10px;\"><a href=\"MyPost.jsp\">My Post</a></ul>\n");
      out.write("            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("            <ul style=\"float:left;margin-left:150px;margin-top:10px;\"><a href=\"VF_Post.jsp\">View Friends Post</a></ul>\n");
      out.write("             &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("            <ul style=\"float:left;margin-left:150px;margin-top:10px;\"><a href=\"CyberComments.jsp\">My Cyber Comments</a></ul>\n");
      out.write("            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("            <ul style=\"float:left;margin-left:150px;margin-top:10px;\"><a href=\"User.jsp\">Logout</a></ul>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("        </ul>\n");
      out.write("    </div>\n");
      out.write("     <h2 style=\"color:orange\">My Posts</h2>\n");
      out.write("    <table>\n");
      out.write("       \n");
      out.write("        ");

        try{
            String sql="select * from post where email='"+username+"'";
               ResultSetReturnImpl rr=new ResultSetReturnImpl();
            ResultSet r=rr.getExecuteQuery(sql);
            while(r.next()){
              String email1=r.getString("email");
              
      out.write("\n");
      out.write("              <tr>\n");
      out.write("    <td colspan=\"2\"><image src=\"view.jsp?email=");
      out.print(email1);
      out.write("\"</td>\n");
      out.write("  </tr>\n");
      out.write("              <tr><th>Post title</th><td>");
      out.print(r.getString("title"));
      out.write("</td></tr>\n");
      out.write("              <tr><th>Post Date</th><td>");
      out.print(r.getString("pdate"));
      out.write("</td></tr>\n");
      out.write("              <tr><th>Post Uses</th><td>");
      out.print(r.getString("uses"));
      out.write("</td></tr>\n");
      out.write("            \n");
      out.write("              <tr><th>Post Description</th><td><textarea cols=\"20\" rows=\"10\">");
      out.print(r.getString("desc"));
      out.write("</textarea></td>\n");
      out.write("           \n");
      out.write("            \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        ");

            }
        }catch(Exception e){
            System.out.println(e);
        }
        
        
      out.write("\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("    </table>\n");
      out.write("    \n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("</center>\n");
      out.write("</body>\n");
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
