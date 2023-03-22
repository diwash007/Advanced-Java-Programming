import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import java.util.*;

public class DemoServ extends HttpServlet{
    public void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
    {
        res.setContentType("text/html");
        PrintWriter pw=res.getWriter();

        // Getting individual parameters
        // String username = req.getParameter("username");
        // String password = req.getParameter("password");
        // pw.println("Username: " + username);
        // pw.println("Password: " + password);

        // Getting all parameters and reading them
        Enumeration paramNames = req.getParameterNames();
        while (paramNames.hasMoreElements()) {
            String paramName = (String) paramNames.nextElement();
            String[] paramValues = req.getParameterValues(paramName);
            pw.println(paramName + ": " + paramValues[0]);
        }

    }
}
