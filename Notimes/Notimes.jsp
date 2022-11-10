<%@ page import="java.io.*,java.util.*" %>
<html>
<head>
<title> No.Of times page referred </title>
</head>
<body align="center" text="blue">
<%
Integer hitsCount =(Integer)application.getAttribute("hitCounter"); 
if( hitsCount ==null || hitsCount == 0 ){
out.println("<h2>Welcome to this page!</h2>"); hitsCount = 1;
}else{
out.println("<font color='pink'><h2>Welcome back!!!</h2>"); 
hitsCount += 1;
}
application.setAttribute("hitCounter", hitsCount);
%>
<center>
<p><b>Total Number of times visited: <%= hitsCount%></b></p> </center>
</body>
</html>