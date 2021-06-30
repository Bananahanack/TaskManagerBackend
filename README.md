# TaskManager
RESTful web-service for task management.

        (TODO)
        add more detailed description


## Getting Started:

1. Download or clone repository:

    
    git clone https://github.com/Bananahanack/TaskManagerBackend.git


2. Open cmd in project directory and start server:

    ```java
    mvn clean package && mvn spring-boot:run
    ```

3. Use 8080 port for server requests:

   http://localhost:8080


## Provided API

* Get the list of employees/projects/tasks
    ```java
    /api/employees[GET]
    /api/projects[GET]
    /api/tasks[GET]
    ```

* Get an employee/project/task
    ```java
    /api/employees/{id}[GET]
    /api/projects/{id}[GET]
    /api/tasks/{id}[GET]
    ```

* Add employee/project/task
    ```java
    /api/employees[POST]
    /api/projects[POST]
    /api/tasks[POST]
    ```

* Change employee/project/task
    ```java
    /api/employees/{id}[PUT]
    /api/projects/{id}[PUT]
    /api/tasks/{id}[PUT]
    ```

* Delete employee/project/task
    ```java
    /api/employees/{id}[DELETE]
    /api/projects/{id}[DELETE]
    /api/tasks/{id}[DELETE]
    ```


## Environment: <br/>
- **JDK 11**
- **build automation**: [Maven](http://maven.apache.org) <br/>
- **web/REST**: [Spring Boot](https://projects.spring.io/spring-boot/) 2.4.5 <br/>
- **persistence providers**: [H2 DATABASE ENGINE](https://www.h2database.com/) <br/>
- **Bean Validation API**: [Beanvalidation](http://beanvalidation.org/)
