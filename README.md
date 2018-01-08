# Object-OrientedDocumentSimilarity
Project related to Object Oriented Programming 2017

## References
WAR AND PEACE :https://github.com/fluentpython/example-code
<br />
Return of Sherlock Holmes : https://sherlock-holm.es/ascii/

## UML Diagram
// TO DO !!!

##Current Bugs in the Application;
Jaccard Simerlarity Percentage won't return to Screen, will return in console!
(Use the Runner test class to compare documents)


## Overview
You are required to develop a Java web application that enables two or more text documents to
be compared for similarity.

### Minimum Requirements are:

1. A document or URL should be specified or selected from a web browser and then
dispatched to a servlet instance running under Apache Tomcat.
2. Each submitted document should be parsed into its set of constituent shingles and
then compared against the existing document(s) in an object-oriented database (db4O)
and then stored in the database.
3. The similarity of the submitted document to the set of documents stored in the
database should be returned and presented to the session user.

The purpose of this assignment is to demonstrate my knowledge of the principles of object-oriented design, through the use of abstraction, encapsulation, composition,
inheritance and polymorphism throughout the application 

## How to Run Application
1. Install Tomcat Version 9.0 from the site https://tomcat.apache.org/download-90.cgi
2. Clone the reposittory to your Desktop.
3. Set the %CLASSPATH% Variable to ..C:\Program Files\Apache Software Foundation\Tomcat 9.0\lib\servlet-api.jar . <br /> <br />*NB if System Variable "CLASSPATH" doesn't exist, you can create one!* <br />
4. Copy the .war file into the "webapps" folder of Apache Tomcat, and start the Tomcat Server, It will generate a new folder with the application in the same directory.

