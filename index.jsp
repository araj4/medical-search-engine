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
    
    <script type="text/javascript">
         <!-- var lk="https://scholar.google.ca/scholar?hl=en&q=fever&btnG=&as_sdt=1%2C5&as_sdtp"!-->
         function generatelink()
         {
             
           var gen = document.getElementById("lnken").value; 
           symp=gen.toLowerCase();
           <!--!-->
           var gen1 = gen.replace(" ", "+");
           <!--!-->
           if ((symp==="fever" )|| (symp==="diarrhea") || (symp==="blood pressure")|| (symp==="high blood pressure")
           || (symp==="low blood pressure")|| (symp==="diabetes")|| (symp==="blood in urine")|| (symp==="cough")
           || (symp==="cold")|| (symp==="cough and cold")|| (symp==="sinus")|| (symp==="high sugar level")
           || (symp==="insomnia"))
           {
           var lk="https://scholar.google.ca/scholar?hl=en&q=diseases+with+"+gen1+"&btnG=&as_sdt=1%2C5&as_sdtp";
           }
           else
           {alert("Invalid symptoms");
           gen = ""; }
           return lk;        
         }
    </script>    
     
         
    <body>
        <div class="w3-container">
<form class="form-wrapper cf">
  <input type="text" id="lnken" name="search" style="height:40px;width:650px;position:absolute;
            top : 250px;
            left: 340px;font-size:20px;" placeholder="Symptoms">
	<input type=button id="search" style="position:absolute;top:250px;right:370px; height:46px;width:50px;" >
        <img src="search.jpg" alt="GO" style="position:absolute;top:250px;right:370px; height:46px;width:50px;"
             onclick="window.location.href=generatelink()"> 
 </form>
 </div>
 <p> 
  <img src="3.JPG" alt="" style="position:absolute;top:100px;right:540px; height:150px;width:350px;"/>
  <img src="2.JPG" alt="" style="position:absolute;top:300px;right:530px; height:160px;width:350px;" >
 </p>

    </body>
</html>
