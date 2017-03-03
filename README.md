# medical-search-engine

Project members :
Ankit Raj, Jasmeet Singh Grewal and Ramanpreet Kaur Deol

#Objective:
To build a medical search engine which is capable of generating
catagorical search results based on the string entered by the user.

#Comment:- 
The project uses jsp as front end along with collaboration of Apache-Tomcat server.
Currently it is using MySql for backend operations 
but soon will be able to use UI tools to fetch results directly from websites.
 
#Progress Detail:
 As on 20-Feb-2017:
We have succesfully built the first draft of the engine were web page is generated and user is able to enter the text for searching.
When Clicked on search button a dynamic link for google scholar  page is generated and
the web page is browsed accordingly.
There are also some on-screen constraints which makes sure that the data entered by the user is related to medical scope.
#
As on 02-March-2017: Based on the project constraints, we have used MySql so as to test the developments made.
We had added mySql-j-connector in the libraries of java so as to establish the connection with our database.
Database, named web_info, is created using the data from ICD 10 2016 downloaded in a .csv format and then importing it in database at our end. 
#
As on 03-March-2017: Implemented the logic of string manipulation.
#
The link for downloading the ICD 10 data :
#
https://www.cob.cms.hhs.gov/Section111/help/icd10.dx.codes.htm
#
and 
#
http://icd10codelink.com/
