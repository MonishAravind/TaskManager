# Task Manager RESTful API

## Project Description
This project is a simple task manager application built using Java and Spring Boot. The API allows users to perform CRUD operations (Create, Read, Update, and Delete) on tasks. Each task consists of a title, description, and a flag for completion status. The API is tested using Postman or Curl.

## Features
- Retrieve all tasks.
- Retrieve a single task by its ID.
- Create a new task.
- Update an existing task by its ID.
- Delete a task by its ID.
- Proper error handling for invalid requests.
- Input validation for task creation and updates.

## Implementation Levels
1. **Level 1:** In-memory data structure (Array[]).
2. **Level 2:** Work with MongoDB (Non-relational Database).
3. **Level 3:** Work with MySQL (Relational Database).
4. **Level 4:** Combine Redis caching with MongoDB (Caching).

## Endpoints
- **GET /tasks:** Retrieve all tasks.
- **GET /tasks/:id:** Retrieve a single task by its ID.
- **POST /tasks:** Create a new task.
- **PUT /tasks/:id:** Update an existing task by its ID.
- **DELETE /tasks/:id:** Delete a task by its ID.

## Error Handling
- Invalid request handling.
- Input validation ensuring title and description are not empty.
- Ensuring completion status is a boolean value.

## Technologies Used
- Java
- Spring Boot
- MongoDB (Level 2)
- MySQL (Level 3)
- Redis (Level 4)
- Postman (for testing)

## Setup Instructions
### Prerequisites
- Java 11 or higher
- Maven
- MongoDB (for Level 2)
- MySQL (for Level 3)
- Redis (for Level 4)

### Step-by-Step Setup

1. **Clone the repository:**
    ```bash
    git clone https://github.com/your-username/task-manager-api.git
    cd task-manager-api
    ```

2. **Build the project:**
    ```bash
    mvn clean install
    ```

3. **Run the application:**
    ```bash
    mvn spring-boot:run
    ```

4. **Configure the application:**
    - For **Level 2** (MongoDB): Update the `application.properties` with your MongoDB configuration.
    - For **Level 3** (MySQL): Update the `application.properties` with your MySQL configuration.
    - For **Level 4** (Redis): Ensure Redis is running and update the `application.properties` accordingly.

## Testing the API
### Using Postman
1. **Retrieve all tasks:**
    - Method: GET
    - URL: `http://localhost:8080/tasks`

2. **Retrieve a single task by its ID:**
    - Method: GET
    - URL: `http://localhost:8080/tasks/{id}`

3. **Create a new task:**
    - Method: POST
    - URL: `http://localhost:8080/tasks`
    - Body (JSON):
      ```json
      {
          "title": "New Task",
          "description": "Task description",
          "completed": false
      }
      ```

4. **Update an existing task by its ID:**
    - Method: PUT
    - URL: `http://localhost:8080/tasks/{id}`
    - Body (JSON):
      ```json
      {
          "title": "Updated Task",
          "description": "Updated description",
          "completed": true
      }
      ```

5. **Delete a task by its ID:**
    - Method: DELETE
    - URL: `http://localhost:8080/tasks/{id}`

### Using Curl
1. **Retrieve all tasks:**
    ```bash
    curl -X GET http://localhost:8080/tasks
    ```

2. **Retrieve a single task by its ID:**
    ```bash
    curl -X GET http://localhost:8080/tasks/{id}
    ```

3. **Create a new task:**
    ```bash
    curl -X POST http://localhost:8080/tasks -H "Content-Type: application/json" -d '{
        "title": "New Task",
        "description": "Task description",
        "completed": false
    }'
    ```

4. **Update an existing task by its ID:**
    ```bash
    curl -X PUT http://localhost:8080/tasks/{id} -H "Content-Type: application/json" -d '{
        "title": "Updated Task",
        "description": "Updated description",
        "completed": true
    }'
    ```

5. **Delete a task by its ID:**
    ```bash
    curl -X DELETE http://localhost:8080/tasks/{id}
    ```

## Conclusion
This project provides a simple and effective RESTful API for managing tasks, with the ability to switch between different data storage options and caching mechanisms as needed. By following the setup instructions and using the provided endpoints, you can easily manage tasks and ensure the application runs smoothly.
