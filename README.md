# 🚕 Cab Service 🚕 

## 📃Brief
A small, fairly rudimentary (to be added to over time) taxi service 
with a small list of features that help interact with the database 
within the service.
 
## 💻Features
- ### 🔐Authentication
###### (It is possible to register a new user, log in to an existing account, and operate the service from that account.).
- ### 🖥️Scrolling through the information
###### (The user can view existing information on drivers, the vehicles to which they are assigned, and the manufacturers of the vehicles that are assigned to the service.). 
- ### ⚙️Information handling
###### (The user is able to add new drivers, vehicles, manufacturers, as well as clean up the previously listed attributes accordingly.)

## 📋Project structure
### The project is based on three-tier architecture which makes it more comfortable to use in practice.
- ### 👤Client 
###### (Level of software operation, intuitive for the user.).
- ### 💼Service
###### (Layer that organises the business logic of the programme, operating on commands from the top layer.).
- ### 💾DAO
###### (Full interaction with the database and logical layer.).

## 🧬Technologies
- ### Java, Maven
- ### JSP, JSTL
- ### HTTP Servlets
- ### HTML, CSS, XML
- ### Tomcat
- ### MySQL, JDBC

## ▶️Project launch
- ### Copy project link
- ### Create new Intellij IDEA project from Version Control System
- ### Edit `ConnectionUtil` class to establish connection to your own DataBase 
###### (Optionally: you can run the init_db.sql file from resources directory to create the appropriate database.)
- ### Add your own Tomcat server to the project configuration
- ### Run project

## 🗓️Features to be implemented in the future
- ### Deployment of the site globally.
- ### Introducing authorisation.
- ### Adding client interaction functionality.
- ### Adding some features for interaction with a non-authenticated user as well.