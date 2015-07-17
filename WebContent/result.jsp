<%@ page import="java.util.*" %>
<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=BIG5">
<title>Insert title here</title>
</head>
<body>

<%  
    List <String> styles = (List) request.getAttribute("styles");
    for (String item : styles){
        out.print("<br>Try: it : " + item ) ;
    }
%>

<br>
<%  
    List <String> styles2 = (List) request.getAttribute("styles2");
    for (String item : styles2){
        out.print("<br>Your Weight : " + item ) ;
    }
%>

<br>
<%
     String [] sizes = request.getParameterValues("sizes") ;
     for (String item : sizes){
         out.print("<br>sizes: " + item) ;
     }

%>

</body>
</html>