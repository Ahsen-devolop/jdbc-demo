# Student Registration API (Spring Boot + MySQL)

This is a basic Spring Boot REST API that allows users to register students by sending their information in JSON format. The student data is stored in a MySQL database.

## Purpose

The goal of this project is to demonstrate a simple CRUD (Create, Read, Update, Delete) functionality using Spring Boot and JDBC with MySQL. It is useful as a starting point for understanding how to connect a Java backend application with a relational database.

## Features

- Add new students with `firstname`, `lastname`, and `studentid`
- Store student data in a MySQL database
- Test the API with tools like Postman

## How to Use

1. Run the Spring Boot application.
2. Send a `POST` request to the following endpoint: http://localhost:8080/api/students/add


 Example JSON body:
```json
{
  "firstname": "John",
  "lastname": "Kowallski",
  "studentid": "75867"
}

On success, the response will be: Student added successfully!


