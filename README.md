<p align="center">
  <img alt="Taxi service" height="200" src="logo-ts.svg">
</p>

## 🚖 Project description

---
**This project is designed to register the fleet of cars and record the drivers of these cars.
It represents the work of a taxi service 
and providing the possibility of user registration and authentication,
as well as all CRUD operations for cars and drivers.
The web application consists of both backend and frontend parts,
implemented using n-tired architecture in accordance with SOLID principles.**

## 🎯️ Features

---
**Realised the ability to perform the following operations:**
- registration a new driver
- authentication like a driver
- create/update/remove a driver
- create/update/remove a manufacturer
- create/update/remove a car
- add driver to car
- display list of all drivers
- display list of all manufacturers
- display list of all cars
- display list of all cars by current driver

## 🌳 Project structure

---
**Implemented a 3-level architectural model:**
- DAO - Data access layer
- Service - Application logic layer
- Controllers - Presentation layer

## 🤖 Used technologies

---
**The following technologies were used during creation:**
- Apache Maven
- Apache Tomcat
- MySQL
- JDBC
- Java Servlet API
- JSP/JSTL
- HTML/CSS
- Log4j2

## ⚙️ How to run the project

---
**To start the project you need to do the following:**
1. Download the [Project](https://github.com/serhii-shyian/my-taxi-service) from GitHub and save it
2. Download [JDK](https://www.oracle.com/java/technologies/downloads/) and install it on computer
3. Download [IntelliJ IDEA](https://www.jetbrains.com/idea/download) and install it on computer
4. Download [MySQL](https://dev.mysql.com/downloads/installer/) and install it on computer
5. Download [Workbench](https://dev.mysql.com/downloads/workbench/) and install it on computer
6. Open MySql Workbench, copy and run **init_db.sql** (/src/main/resources/init_db.sql) SQL script
7. Open IntelliJ IDEA and load the previously saved project
8. Open the project ConnectionUtil class and fill in the appropriate fields to configure connection of project to database
```java
private static final String USERNAME = "DATABASE_USERNAME";
private static final String PASSWORD = "DATABASE_PASSWORD";
private static final String URL = "DATABASE_URL";
```
9. Download [Tomcat](https://tomcat.apache.org/download-90.cgi) web server and save it
10. Add Tomcat server to the project
- click "Edit Configurations" at the top, near to the "run" button 
- choose "Add new Configuration"("+") in the upper left corner
- select "Tomcat Server - local"
- click "Fix" and select "taxi-service:war exploded"
- then delete link that appeared after the "/"
- to save the results press "OK"
11. To run the project press the Run button
