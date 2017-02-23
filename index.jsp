<%-- 
    Document   : index
    Created on : Feb 23, 2017, 11:53:23 AM
    Author     : Ankit,Grewal,Raman
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <style>
p
{color: Blue;
font-family:verdana;
font-size:400%;
}
p.padding {
    padding-left: 500px;
	padding-top: 100px;
	}
        </style>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <title>I-MedWiki</title>
    </head>
     <!--<script>
     public static void main(String[] args) throws Exception {

    String key="d5afef5e255701e19e3e25102006f3a4f8952c54";
    String qry="fever";
    URL url = new URL(
            "https://www.googleapis.com/customsearch/v1?key="+key+ "&cx=013036536707430787589:_pqjad5hr1a&q="+ qry + "&alt=json");
    HttpURLConnection conn = (HttpURLConnection) url.openConnection();
    conn.setRequestMethod("GET");
    conn.setRequestProperty("Accept", "application/json");
    BufferedReader br = new BufferedReader(new InputStreamReader(
            (conn.getInputStream())));

    String output;
    System.out.println("Output from Server .... \n");
    while ((output = br.readLine()) != null) {

        if(output.contains("\"link\": \"")){                
            String link=output.substring(output.indexOf("\"link\": \"")+("\"link\": \"").length(), output.indexOf("\","));
            //System.out.println(link);       //Will print the google search links
        }     
    }
    conn.disconnect();                              
}
     </script>!-->
    <body>
        <div class="w3-container">
<form class="form-wrapper cf">
  <input type="text" name="search" style="height:40px;width:650px;position:absolute;
            top : 250px;
            left: 340px;font-size:20px;" placeholder="Symptom" >
	<input type=button id="search" style="position:absolute;top:250px;right:370px; height:46px;width:50px;" >
        <img src="search.jpg" alt="GO" style="position:absolute;top:250px;right:370px; height:46px;width:50px;"
             onclick="window.location.href='https://scholar.google.ca/scholar?hl=en&q=symptoms&btnG=&as_sdt=1%2C5&as_sdtp'">/>
        <!--'https://scholar.google.ca/scholar?hl=en&q=symptoms&btnG=&as_sdt=1%2C5&as_sdtp'">/>!-->
 </form>
 </div>
 <p> 
  <img src="3.JPG" alt="" style="position:absolute;top:100px;right:540px; height:150px;width:350px;"/>
  <img src="2.JPG" alt="" style="position:absolute;top:300px;right:530px; height:160px;width:350px;" >
 </p>

    </body>
</html>
