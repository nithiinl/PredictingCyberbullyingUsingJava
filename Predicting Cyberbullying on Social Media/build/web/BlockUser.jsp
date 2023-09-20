<%-- 
    Document   : BlockUser
    Created on : 6 Jun, 2023, 1:48:05 PM
    Author     : nlash
--%>

<%@page import="com.update.UpdatePerform"%>
<%@page import="com.resultset.ResultSetReturnImpl"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
String user=request.getParameter("user");
try{
  UpdatePerform rr=new UpdatePerform();
 String sql="update register set status='Blocked' where username='"+user+"'";
    int i=rr.getQuery(sql);
   if(i>0){

       %>
    <script type="text/javascript">
        window.alert("User Blocked Success...!!");
        window.location="VCB_Users.jsp";
        </script>
    <%     
    }else{
%>
    <script type="text/javascript">
        window.alert("User Blocked  Failed...!!");
        window.location="VCB_Users.jsp";
        </script>
    <% 
}
}catch(Exception e){
   System.out.println(e); 
}

%>

