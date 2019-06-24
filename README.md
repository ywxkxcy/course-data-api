# course-data-api
Course data api is a Spring applciation on my way to learn Spring Boot. Build with RESTful API implemented using Spring MVC and  data layer implemented by Spring Data JPA.

## Description
* <b>Spring MVC</b>. Used Spring MVC annotations to map incoming REST API requests to controller methods. access path variables and request body content to get data as well as send JSON responses from the REST API.
* <b>Spring Data JPA</b>. Used the Spring Data JPA framework to connect to both an embedded Derby database as well as an external Derby database running in server mode. use CrudRepository to create simple CRUD operations, and also create custom find methods to extend and add new methods to the repository.
* <b>Spring Actuator</b>. enabled Spring Actuator in the Spring Boot application to access realtime metrics about the app.