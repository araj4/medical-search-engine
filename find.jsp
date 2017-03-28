<%-- 
    Document   : index
    Created on : Mar 03, 2017, 11:23:47 PM
    Author     : Ankit,Grewal,Raman


--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<head>
        <style>
		body  {
    background-image: url("bg1.jpg");
    background-repeat:no-repeat;
    background-size:cover;
}
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
<body >
        <div class="w3-container">
<form class="form-wrapper cf" name="form" method="post" action="DatabaseConn" >
  <input type="text" id="search" name="search" style="height:40px;width:650px;position:absolute;
            top : 250px;
            left: 340px;font-size:20px;" placeholder="Symptoms"  value="<%=(request.getAttribute("search")==null)?"":(String)request.getAttribute("search")%>">
<button type=submit id="postlnk"  style="position:absolute;top:250px;right:370px; height:41px;width:50px;" >
<img src="search.jpg" />
            </button>
             
         
 </form>
 </div>
 <p> 
  <img src="3.png" alt="" style="position:absolute;top:100px;right:540px; height:150px;width:350px;"/>
  <img src="2.png" alt="" style="position:absolute;top:300px;right:530px; height:160px;width:350px;" >
 </p>
</body>


