<h1 style="text-align: center;">
  User Cadastro API REST
</h1>

This is a sample project for a User Cadastro REST API developed using Spring Boot and Java.


## Prerequisites

Make sure you have the following tools installed on your machine:

- JDK (Java Development Kit)
- Maven
- IDE (Eclipse, IntelliJ, etc.) or text editor of your choice
- Postman, httpie or another tool for testing REST APIs

## How to Run

- Clone this repository to your local environment:
```
$ git clone https://github.com/ggomes12/Backend-project.git
```
- Build the project:
```
$ ./mvnw clean package
```
- Run the application:
```
$ java -jar target/SpringbootApplication-0.0.1-SNAPSHOT.jar
```

The application will start and be accessible at http://localhost:8080.

## API Endpoints

Here are the endpoints available in this API:

- GET /user: Returns all user.
- GET /user/{id}: Returns a specific user by ID.
- POST /user: Adds a new user.
- PUT /user/{id}: Updates an existing user.
- DELETE /user/{id}: Removes an existing user by ID.

To make the HTTP requests below, the httpie tool was used: [httpie](https://httpie.io):

- Create product
```
$ http POST :8080/user name="Guilherme Gomes" login="gui.gomes" password="1234" email="guilherme.silva@ufpi.edu.br"

[
  {
    "id": "1",
    "name": "Guilherme Gomes",
    "login": "gui.gomes",
    "password": "1234",
    "email": "guilherme.silva@ufpi.edu.br"
  }
]
```

- List all products
```
$ http GET :8080/user

[
  {
    "id": "1",
    "name": "Guilherme Gomes",
    "login": "gui.gomes",
    "password": "1234",
    "email": "guilherme.silva@ufpi.edu.br"
  }
]
```

- List one products
```
$ http GET :8080/user/1

[
  {
    "id": "1",
    "name": "Guilherme Gomes",
    "login": "gui.gomes",
    "password": "1234",
    "email": "guilherme.silva@ufpi.edu.br"
  }
]
```

- Remove products
```
http DELETE :8080/user/1

[ ]
```
