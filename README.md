Student Academic Records 
API Automation Testing
 This presentation covers the design, implementation, and automated testing 
of a RESTful API for managing student academic records. Developed as part 
of the CSE378 course at Lovely Professional University, the project 
demonstrates the use of modern tools and best practices in API 
development and testing.
 by Mihir Raj
Project Overview & 
Objectives
 Project Title
 Student Academic Records 
API with RESTful Services 
and Automated Testing using 
RestAssured.
 Declaration
 Objective
 Develop a RESTful API to 
efficiently manage student 
records, supporting CRUD 
operations for student details, 
subjects, marks, and GPA 
calculations.
 All work is original and completed by Ritesh Ranjan, B.Tech CSE, 
LPU.
Tools & Technologies Used
 Java 11
 Core 
programming 
language for 
backend logic.
 Maven & 
Eclipse IDE
 Project 
management and 
development 
environment.
 Spring Boot 
2.7.0
 Framework for 
building RESTful 
APIs using MVC 
pattern.
 RestAssured 
& JUnit 5
 Automated API 
testing and 
validation.
Development Workflow
 1
 Client Request
 HTTP requests sent to the controller.
 2 Controller Processing
 Controller handles logic using services and repositories.
 3 In-Memory Data
 Data managed using HashMap for efficient access.
 4 Automated Testing
 RestAssured and JUnit 5 validate API endpoints.
System Architecture & Main Components
 MVC Pattern
 Uses Model-View-Controller architecture for clear separation 
of concerns. Spring Boot handles backend logic, while 
RestAssured is used for API testing.
 Core Components
 Student Entity: ID, name, department, GPA
 Subject Entity: course code, credits, grade
 GPA Calculator: computes GPA from marks and credits
Key Functionalities
 Project Setup
 Create Maven project in 
Eclipse
 Configure pom.xml for 
dependencies
 Organize package structure
 Testing & Validation
 Automated tests with RestAssured
 API Implementation
 Student, Subject, Repository, 
Service, Controller layers
 Application entry point
 Status code and ID pattern validation
API Testing & Validation
 1 2
 3 4
 GET Requests
 Retrieve student details by studentId, 
returns JSON or 404 if not found.
 ID Pattern Validation
 Ensures student IDs follow the STU-#### 
format.
 Status Codes
 Checks for correct HTTP status (e.g., 200 
OK).
 Test Results
 JUnit view displays pass/fail outcomes for 
each test case.
Challenges, Solutions & 
Future Scope
 1
 2
 3
 Challenges
 Handling invalid data (e.g., marks out of range)
 GPA precision issues
 Mapping student-subject relationships
 Solutions
 Validation annotations (@NotNull, @Size)
 Custom exceptions for error handling
 Future Enhancements
 Frontend integration (Angular/React)
 Authentication & role-based access
 Data import/export, cloud deployment
