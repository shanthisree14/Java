import java.io.*; 
import java.util.*; 
import jakarta.servlet.*; 
import jakarta.servlet.http.*; 
import java.sql.*;
public class MarksMemo extends HttpServlet
{
Connection con;
Statement stmt;
ResultSet rs;
String driver;
String url;
String user; String pass;
public void init(ServletConfig sc) throws ServletException
{
try
{
super.init(sc);
driver = "com.mysql.jdbc.Driver";
url = "jdbc:mysql://localhost/marks"; user = "root"; pass = "12345";
}
catch(Exception e) { e.printStackTrace(); }
}
public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
{
res.setContentType("text/html");
PrintWriter out = res.getWriter();
try{
Class.forName("com.mysql.jdbc.Driver"); con = DriverManager.getConnection(url,user,pass);
stmt = con.createStatement();
String htnum = req.getParameter("htno");
rs= stmt.executeQuery("select * from marks_lst where Htno= "+htnum); if(!rs.isBeforeFirst())
{
out.println("<center><h3>No Data found: </h3></center>");
}
else
{
out.println("<html><head><title>Marks Sheet </title></head><body><center>"); out.println("<h3>MARKS MEMO</h3><hr><table border =1 bordercolor = black cellspacing = 2>");
out.println("<tr><th width = '90'>Subject </th>"); out.println("<th>Marks out of 100 </th></tr>"); 
while(rs.next())
{
String Htno = rs.getString(1);
String Name = rs.getString(2);
int Hindi = rs.getInt(3);
int English = rs.getInt(4); int Maths = rs.getInt(5); int Science = rs.getInt(6); int Social = rs.getInt(7);
out.println("HTNO:<i><b>"+ Htno +"</b></i><br>"+"Student Name:<i><b>"+Name+"</b></i>");
out.println("<tr><td> Hindi</td><td align = 'center'>"+Hindi+"</td></tr>"); out.println("<tr><td> English</td><td align = 'center'>"+English+"</td></tr>"); out.println("<tr><td> Maths</td><td align = 'center'>"+Maths+"</td></tr>"); out.println("<tr><td> Science</td><td align = 'center'>"+Science+"</td></tr>"); out.println("<tr><td> Social</td><td align = 'center'>"+Social+"</td></tr>");
}
out.println("</center></table></body></html>"); rs.close(); stmt.close(); con.close();
}
}
catch(SQLException se) { out.print(se); } catch(Exception e) { out.print(e); } finally { try
{
if(stmt!= null) { stmt.close(); }
}catch(SQLException se2) { } try{
if(con!= null) { con.close(); }
}catch(SQLException se) { out.print(se);}
} }
}
