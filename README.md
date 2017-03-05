# medical-search-engine

Project members :
Ankit Raj, Jasmeet Singh Grewal and Ramanpreet Kaur Deol

#Objective:
To build a medical search engine which is capable of generating
catagorical search results based on the string entered by the user.
#Key Features:
#
Efficient to generate high quality content: This search engine would be self-efficient to search the symptoms based on the disease that encounters with them. No such results would be fetched that does not have any medical background such as research journal or scholar papers related to the topic (symptom) being searched.
#
Non-redundancy: There would be no duplicate data fetched through this application.
#
Non-Clumsiness: The links or data fetched would be well categorized on the basis of different diseases that have the same symptoms.

Single Objective Search engine: Since the search engine would basically serve as a medical dictionary, thus, there would be no results for any term outside the medical scope
#Prototype: (Invisio)
https://projects.invisionapp.com/share/BFA6L4CW9
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
As on 04-March-207: Implemented MVC architecture.
#
As on 05-March-2017 : Implemented the phase 1 development along with proper constraints as required by project.
#
Copied find.jsp in web folder of source
#
Copied web.xml and mysql-connector-java-5.1.41-bin in ..\web\WEB-INF of project
#
Copied DatabaseConn.java in ..\src\java folder of project
#
The link for downloading the ICD 10 data :
#
https://www.cob.cms.hhs.gov/Section111/help/icd10.dx.codes.htm
#
and 
#
http://icd10codelink.com/

#Pre-requisites:
#
1) Java 7 or higher version
#
2) MySql
#
3) Apache Tomcat Server
#
4) Netbeans(optional if you wish to work on codes)


#Setup Instructions:
1_a) Setting up database: Create a database and name it web_info (also need to update the root password as per your database in the respective connector files).
#
1_b) Import the data to your database in a table named "icd" from ICD-10 data recorded in icd.csv file.
#
2) MySql-J-connector setting up: Download mysql-connector-java-5.1.41-bin and copy it in \web\WEB-INF folder of java
#
3_a) Servlet setup:Copy DatabaseConn.java file in \src\java of java
#
3_b) Copy web.xml in \web\WEB-INF folder of java
#
4)Setting up front-end:Copy find.jsp and test_connection.jsp along with all images specified in repository (with updated root password) in \web folder of java. Finally, you are all set to use this application.
