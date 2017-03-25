# Spring Boot, AngularJS and Spring Security 


### Prerequisites
- [JDK 1.8]
- [Spring Tool Suite]
- [MySql]

### How to run 

  - clone the project. 
  - run: gradlew clientInstall 
  - This will install client dependencies 
   import project in Spring Tool Suite (STS) from File > Import > Gradle (STS) Project. 
  - In STS, right click on the project and click on Gradle (STS) > Refresh Dependencies.
  - Now open **application.properties** file and change database related properties as per your [MySql] database. Change for both spring datasource and [flyway] datasource. Also create a databse with name you have specified in **application.properties**.
  - Open **App.java** and Run as **Java Application**. This will start the application and you can check on http://localhost:8080
  
### What this project coantains

This Spring boot web project has implementaion of simple CRUD operation of User and Task entities. The implementaion is based on Angular JS. So for User entity, there is a seperate folder called user under **src/assets/javascript/bootdemo**. This folder has controllers, services, directives and templates related to User module.

The project also has Spring Security and Auditor Aware cofigured with it. Authentication in Spring Security is done from database. 
### Tech
* [Spring Boot]
* [Spring Data JPA]
* [MySql]
* [Bower]
* [Asset Pipeline]
* [Materialize CSS]
* [Gradle]
* [Flyway]

### Update 21th My 2016
Added Spring Security (database authentication) and 
AuditorAware to track who edited/added entity. Most of the code related to Spring Security has been taken from [jhipster-sample-app].

### Reference

* [Spring Boot Asset Pipeline Gradle Adapter]
* [Client Dependencies Gradle Plugin]




# SpringBoot-Angular
