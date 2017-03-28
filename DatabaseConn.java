/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//************************Imported library to check duplication (not used)*******************
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
//************************Finally implemented duplicate check using loops*******************
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
    /*out.println("<head>");
    out.println("<style>");
    out.println("body  {");
    out.println("background-image: url(\"bg1.jpg\");");
    out.println("background-repeat:no-repeat;");
    out.println("background-size:cover;");
    out.println("}");*/ 
    out.println("</style>");    
    out.println("</head>");
    out.println("<head><title>Disease Details</title></head>");
    out.println("<body>");
    out.println("<center><h1>What Are You Exactly Looking For?</h1>");
     //************************Feature 2> Non-Clumsiness *********************\
    out.println("<Table border=2><h2><tr><td><center><b> ICD-10 Codes</b></center></td><td><center><b>Hierarchical Codes</b></center></td><td><center><b> Disease Description and Related Journals</b></center></td></tr></h2>");
    
      String connectionURL = "jdbc:mysql://localhost:3306/web_info";
      Connection connection=null;
      Statement s=null;
      ResultSet rs=null;
      String var1=null;
      int var2=0;
      String search1=request.getParameter("search"); 
      String symp;
      symp = search1.toLowerCase();      
      String[] strArray = symp.split(" ");
      /* ***************For duplicate check tried with hash function*****************
     String text = request.getParameter("search");
     List<String> list = Arrays.asList(text.split(" "));
     Set<String> uniqueWords = new HashSet<String>(list);
     symp = List.toLowerCase();      
      String[] strArray = symp.split(" ");
      **************Then finally concluded with for-loops**************************/
      for (int k=0; k<strArray.length; k++)
            {
//****************************Feature 1> Non-Redundancy Check*********************\\
                for(int l=0; l<strArray.length;l++){
                    System.out.println("1--"+strArray[k]);
                    if(k!=l){
                        System.out.println("2--"+strArray[l]);
                        if(strArray[l].equals(strArray[k])){
                           strArray[l]="_"; 
                        }
                    }
                }
            }
      
 //******************************Non-Redundancy Check*******************************\\
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
         String QueryString = "select code,h_code, short_description from icd where  lower(short_description) RLIKE \"[[:<:]]"+strArray[i]+"[[:>:]]\"";
         //String QueryString = "select code, short_description from icd where lower(short_description) like ('%"+strArray[i]+"%')";
         
         rs = s.executeQuery(QueryString); 
      /*if(rs.next ()){//Use If Here not While  
          System.out.println(rs.getString(1));
          System.out.println(rs.getString(2)); 
          }*/ 
        while (rs.next()) {
         out.println("<tr>"); 
        String code = rs.getString("code"); 
        String h_code = rs.getString("h_code"); 
        String short_description = rs.getString("short_description");
        
       //************************ Feature 3> Single objective search (medical scope)*********************\
        String desc=short_description.replace(" ", "+");
        out.print("<td><a><font color=\"brown\"><b>"+code+"</b></font></a></td>");
         out.print("<td><a href=\"http://apps.who.int/classifications/icd10/browse/2016/en#/"+h_code+"\"><font color=\"brown\"><b>"+h_code+"</b></font></a></td>");
         out.print("<td><a href=\"https://scholar.google.ca/scholar?hl=en&q="+desc+"&btnG=&as_sdt=1%2C5&as_sdtp\"><font color=\"red\"><b>"+short_description + "</b></font></a></td>");
         out.println("</tr>"); 
         //************************ Single objective Search *********************\
         //************************ Non-Clumsiness (Tabular form) *********************\
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
