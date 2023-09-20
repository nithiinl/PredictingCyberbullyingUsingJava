package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import com.resultset.ResultSetReturnImpl;

public final class ViewUser_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("height:500px;\n");
      out.write("background-color:Snow;\n");
      out.write("}\n");
      out.write("\n");
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
      out.write("        <h2 style=\"margin:0px;\">Server Home Page..!!</h2>\n");
      out.write("    </div>\n");
      out.write("    <div id=\"link2\" style=\"width:30%;height:400px;border-left:1px solid graytext;float:right\">\n");
      out.write("        <ul>\n");
      out.write("            <ul style=\"float:left;margin-left:60px;margin-top:10px;\"><a href=\"ServerHome.jsp\">Home</a></ul>\n");
      out.write("            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("            <ul style=\"float:left;margin-left:60px;margin-top:10px;\"><a href=\"ViewUser.jsp\">View User & Authorize</a></ul>\n");
      out.write("            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("            <ul style=\"float:left;margin-left:60px;margin-top:10px;\"><a href=\"AddFilter.jsp\">Add Filters</a></ul>\n");
      out.write("            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("            <ul style=\"float:left;margin-left:60px;margin-top:10px;\"><a href=\"VAU_Comments.jsp\">View All User Comments</a></ul>\n");
      out.write("            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("            <ul style=\"float:left;margin-left:60px;margin-top:10px;\"><a href=\"VA_Posts.jsp\">View All Posts</a></ul>\n");
      out.write("            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("            <ul style=\"float:left;margin-left:60px;margin-top:10px;\"><a href=\"VFReq_Res.jsp\">Friends Request & Response</a></ul>\n");
      out.write("            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("            <ul style=\"float:left;margin-left:60px;margin-top:10px;\"><a href=\"VCB_Details.jsp\">View Cyberbullying Details</a></ul>\n");
      out.write("            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("            <ul style=\"float:left;margin-left:60px;margin-top:10px;\"><a href=\"VCB_Users.jsp\">View Cyberbullying Users</a></ul>\n");
      out.write("            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("            <ul style=\"float:left;margin-left:60px;margin-top:10px;\"><a href=\"VCB_CResult.jsp\">Cyberbullying Chart Result</a></ul>\n");
      out.write("            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("            <ul style=\"float:left;margin-left:60px;margin-top:10px;\"><a href=\"OSNServer.jsp\">Logout</a></ul>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("        </ul>\n");
      out.write("    </div>\n");
      out.write("    <h2 style=\"color:orange\">View All Users</h2>\n");
      out.write("    <table>\n");
      out.write("        <tr><th>Email</th><th>Mobile</th><th>UserName</th><th>Status</th></tr>\n");
      out.write("        ");

        try{
            String sql="select * from register";
               ResultSetReturnImpl rr=new ResultSetReturnImpl();
            ResultSet r=rr.getExecuteQuery(sql);
            while(r.next()){
                String satus=r.getString("status");
              
      out.write("\n");
      out.write("        <tr>\n");
      out.write("            <td>");
      out.print(r.getString("email"));
      out.write("</td>\n");
      out.write("            <td>");
      out.print(r.getString("mobile"));
      out.write("</td>\n");
      out.write("            <td>");
      out.print(r.getString("username"));
      out.write("</td>\n");
      out.write("            ");
if(satus.equals("waiting")){
           
      out.write("\n");
      out.write("             <td><a href=\"Authorize.jsp?email=");
      out.print(r.getString("email"));
      out.write("\">Authorize</a></td>\n");
      out.write("           \n");
      out.write("            ");

            }else{

      out.write("\n");
      out.write("             <td>");
      out.print(r.getString("status"));
      out.write("</td>\n");
      out.write("           \n");
      out.write("            ");

}
      out.write("\n");
      out.write("            \n");
      out.write("        </tr>\n");
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
