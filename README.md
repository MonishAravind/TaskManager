# TaskManager

Project Description
This project is a simple task manager application built using Java and Spring Boot. The API allows users to perform CRUD operations (Create, Read, Update, and Delete) on tasks. Each task consists of a title, description, and a flag for completion status. The API is tested using Postman or Curl.

Features
Retrieve all tasks.
Retrieve a single task by its ID.
Create a new task.
Update an existing task by its ID.
Delete a task by its ID.
Proper error handling for invalid requests.
Input validation for task creation and updates.
Implementation Levels
Level 1: In-memory data structure (Array[]).
Level 2: Work with MongoDB (Non-relational Database).
Level 3: Work with MySQL (Relational Database).
Level 4: Combine Redis caching with MongoDB (Caching).
Endpoints
GET /tasks: Retrieve all tasks.
GET /tasks/:id: Retrieve a single task by its ID.
POST /tasks: Create a new task.
PUT /tasks/:id: Update an existing task by its ID.
DELETE /tasks/:id: Delete a task by its ID.
Error Handling
Invalid request handling.
Input validation ensuring title and description are not empty.
Ensuring completion status is a boolean value.
Technologies Used
Java
Spring Boot
MongoDB (Level 2)
MySQL (Level 3)
Redis (Level 4)
Postman (for testing)
