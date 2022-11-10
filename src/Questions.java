import java.io.*; 
import jakarta.servlet.*; 
import jakarta.servlet.http.*;
public class Questions extends HttpServlet
{
protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
{
res.setContentType("text/html"); 
int correct = 0; 
int incorrect = 0;
if(req.getParameter("r1").equals("inputoutput")) { correct++; } else { incorrect++;} 
if(req.getParameter("r2").equals("c")) { correct++; } else { incorrect++;} 
if(req.getParameter("r3").equals("javaserverpage")) { correct++; } else { incorrect++;}
PrintWriter out= res.getWriter();
try{
out.println("<html><head>");
out.println("<title>Servlet QA </title></head>"); 
out.println("<body bgcolor = pink text = yellow><center>"); 
out.println("<table border = 2 bordercolor = black cellpadding = 2>"); 
out.println("<caption align = center ><h2>Test Answers</h2></caption>"); 
out.println("<tr><th>Correct Answer(s)</th>"); 
out.println("<th>Incorrect Answer(s)</th></tr>"); 
out.println("<tr><td align= center><b>"+correct+"</b></td>");
out.println("<td align = center><b>"+incorrect+"</b></td></tr>"); 
out.println("</center></body></html>");
}
catch(Exception e) {
e.printStackTrace();
} finally{ out.close(); }
} }