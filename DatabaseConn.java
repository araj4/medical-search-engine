/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;  
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/**
 *
 * @author Ankit,Grewal,Raman
 */
public class DatabaseConn extends HttpServlet {
  
@Override
public void init(ServletConfig config) throws ServletException {
super.init(config);
}
  
  
@Override
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    
    PrintWriter out = response.getWriter();
    response.setContentType("text/html"); 
    out.println("<html>");
    out.println("<head>");
    out.println("<style>");
    out.println("body  {");
    out.println("background-image: url(\"bg1.jpg\");");
    out.println("background-repeat:no-repeat;");
    out.println("background-size:cover;");
    out.println("}");
    out.println("</style>");    
    out.println("</head>");
    out.println("<head><title>Disease Details</title></head>");
    out.println("<body background=\"bg1.jpg\">");
    out.println("<center><h1>What Are You Exactly Looking For?</h1>");
    out.println("<Table border=2><h2><tr><td><center><b> ICD-10 Codes</b></center></td><td><center><b> Disease Description and Related Journals</b></center></td></tr></h2>");
    
      String connectionURL = "jdbc:mysql://localhost:3306/web_info";
      Connection connection=null;
      Statement s=null;
      ResultSet rs=null;
      String search1=request.getParameter("search"); 
      String symp;
      symp = search1.toLowerCase();      
      String[] strArray = symp.split(" ");
      response.setContentType("text/html"); 
      try {
     // Load the database driver
      Class.forName("com.mysql.jdbc.Driver");
      // Get a Connection to the database
      connection = DriverManager.getConnection(connectionURL, "root", "1234567890"); 
      //Add the data into the database
      try
      {
          for (int i=0; i<strArray.length; i++)
            {
          
              
              s = connection.createStatement();
         String QueryString = "select code, short_description from icd where  lower(short_description) RLIKE \"[[:<:]]"+strArray[i]+"[[:>:]]\"";
         //String QueryString = "select code, short_description from icd where lower(short_description) like ('%"+strArray[i]+"%')";
         
         rs = s.executeQuery(QueryString);
         System.out.println(strArray[i]);
      /*if(rs.next ()){//Use If Here not While  
          System.out.println(rs.getString(1));
          System.out.println(rs.getString(2)); 
          }*/ 
        while (rs.next()) {
         out.println("<tr>");   
        String code = rs.getString("code"); 
        String short_description = rs.getString("short_description");
        String desc=short_description.replace(" ", "+");
         out.print("<td><a href=\"http://icd10api.com/?code="+code+"&r=json&desc=short\">"+code+"</a></td>");
         out.print("<td><a href=\"https://scholar.google.ca/scholar?hl=en&q="+desc+"&btnG=&as_sdt=1%2C5&as_sdtp\">"+short_description + "</a></td>");
         out.println("</tr>"); 
      }
                   
      //rs.close();
                    //s.close();
      }}
          catch (SQLException e) {
      out.println("An error occured while retrieving " + "all employees: "  + e.toString());
      //System.out.println(strArray[i]);
    }   finally {
      try {
        if (s != null) {
          s.close();
        }
        if (connection != null) {
          connection.close();
        }
      } catch (SQLException ex) {
      }
    }
    out.println("</Table>");
    out.println("</center>");
    out.println("</body>");
    out.println("</html>");
    out.close();
      }
      //RequestDispatcher dispatcher=getServletContext().getRequestDispatcher( "/find.jsp" );
      //dispatcher.forward( request, response );
      
      catch(SQLException | ClassNotFoundException e){
      System.out.println("Exception is ;"+e);
      }
    }

    /**
     *
     */
    @Override
 public void destroy() { 
}
}