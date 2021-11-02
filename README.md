## Project Title
Online Car Garage application.
## Getting Started
This is an online application for selling car and booking slot for test drive.

The online user can see all the available cars in garage and then can select to know about the status of the license.

The online user can book a slot for test drive on a selected car.
The application is REST Api for Cars present in the garage.
The front-end application call this api to get all the cars available in garage.
## Prerequisites
To run the this application on desktop or laptop, the below software’s need to install 
Ex-:
    Eclipse (which supports Java EE version)
     Maven installation
     JDK 8 or higher version
 
## Installing
Below are the steps download the application to your local desktop.
1.	Enter the below URL in the browser and then clone or download the application. 
              Clone URL - https://github.com/devgit2020/carservice.git
2.	Then can go the clone directory and below steps need to do to start the application
 	i) Import the project as maven project
               ii)  mvn clean install
               ii) Run the service as main function

3. This service using the H2 in memory DB for persistence the data. 
The H2 console can be open using the below url (Note:- if you change the application port in the application.properties , then same port need to use for H2 console).
URL - http://localhost:8082/h2/

4. The application is using Swagger UI for documentation and API testing, which can done using below url http://localhost:8082/swagger-ui.html

## About the application.
This is web api application which need to call the react application garage_ui.
## Versioning
The first release version is 0.0.1.

