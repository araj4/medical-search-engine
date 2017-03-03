<%@ page import="java.sql.*" %> 
<%@ page import="java.io.*" %> 
<%@ page import= "java.sql.Connection"  %> 
<%@ page import= "java.sql.DriverManager"  %> 
<%@ page import= "java.sql.SQLException"  %>  
<html> 
<head> 
<title>Connection with mysql database</title>
</head> 
<body>
<h1>Connection status</h1>
<% 
try {
            String connectionURL = "jdbc:mysql://localhost:3306/web_info";
            Connection connection = null; 
            Class.forName("com.mysql.jdbc.Driver").newInstance(); 
            connection = DriverManager.getConnection(connectionURL, "root", "1234567890");
            if(!connection.isClosed())
                 out.println("Successfully connected to " + "MySQL server using TCP/IP...");
            connection.close();
        }catch(Exception ex){
            out.println("Unable to connect to database"+ex);
        } 
%>
</font>
</body> 
</html>