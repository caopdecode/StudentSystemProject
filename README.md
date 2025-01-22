# Student Management System
## Description
This project is a Student Management System that provides functionality
for managing students using CRUD operations (CREATE, READ, UPDATE, DELETE).

Project from <a href="https://github.com/amigoscode" target="_blank">Amigoscode</a> Spring Boot Tutorial

## Technologies Used
- Java
- Spring Boot

## How to Setup and Run The Project Locally

To execute the project follow these steps:

1. Download the project
   - Clone the repository from GitHub or download the ZIP file.
     
2. Load the project into your IDE
   - Use IntelliJ IDEA or your preferred IDE to open the project.
     
3. Build the project
   - Navigate to the terminal and run the following commands after build the project, to execute the .jar file.
     
    ```
     cd build
     cd libs
     java -jar demo-0.0.1-SNAPSHOT.jar 
    ```
    
4. Access the application
   - Once the application it's running, you can interact with it through HTTP request.

## Example Endpoints

Here are examples of the availabe endpoints that can be tested using tools like Postman:

### Create New Student

- Endpoint: POST api/v1/student
- Request body:
  ```
  {
    "name": "caopdecode",
    "age": 22,
    "numContact": 301546789
    "email": "caopdecode.contact@gmail.com"
  }
  ```

### Get All Students

- Endpoint: GET api/v1/student

### Update Student

- Endpoint: PUT api/v1/student/{studentId}
- Request Params:
  - name
  - email

### Delete Student

- Endpoint: DELETE api/v1/student/{studentId}

### Notes: 

Replace {studentId} with the ID of the student that you want to update or delete.

## Testing Endpoints

- Use Postman to send requests to the application.
  
Example:
![POSTMANREQUEST](https://github.com/user-attachments/assets/a65e58c9-2132-408d-be8f-3d0d35c9b483)

## Additional Notes

- Feel free to raise any issues.
- This project is intended to show my progress on Spring Boot learning.



