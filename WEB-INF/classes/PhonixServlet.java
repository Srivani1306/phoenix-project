import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.ServletException;
import javax.servlet.GenericServlet;
import java.io.IOException;
import java.io.PrintWriter;
public class PhonixServlet extends GenericServlet{

   public void service(ServletRequest request,ServletResponse response)throws ServletException,IOException{

	   //set ContentType
	   response.setContentType("text/html");

	   //getting printwriter object on response object
	   PrintWriter pw = response.getWriter();

	   //capturing get data
	   String username = request.getParameter("Username")!= null !="".equals(request.getParameter("Username"))? request.getParameter("Username"):"no value from form";
	   String password = request.getParameter("Password")!= null !="".equals(request.getParameter("Password"))? request.getParameter("Password"):"no value from form";

	   //displaying the data
	   pw.println("<body bgcolor:'yellow;'>");
	   pw.println("<h3 style = 'text-align:center;color:red;'>Login with PSI Incontrol AD Account</h3>");
	   pw.println("<table align='center'>");
	   pw.println("<tr><th>Request ParameterName</th><th>Request parameterValue</th>");
	   pw.println("<tr><td>Username</td><td>"+username+"</td></tr>");
	   pw.println("<tr><td>Password</td><td>"+password+"</td></tr>");
	   pw.println("</table>");
	   pw.println("<div>");
	   pw.println("<a href ='Phonix.html'>|Go Back|</a>");
	   pw.println("</div>");
	   pw.println("<body>");
  }
}
