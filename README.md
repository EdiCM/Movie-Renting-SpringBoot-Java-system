# BlockBuster-System
This project is a Blockbuster-like application developed in Java using the Spring Boot framework. The application allows for managing clients and performing operations related to a video rental store.

### *Features*

- Client Management: The application allows adding, editing, deleting, and listing clients.
- RESTful API: Endpoints for managing clients are exposed through a REST controller.
- Data Persistence: Uses JPA (Java Persistence API) to interact with the database and store client information.

### *Project Structure* 

- BlockBusterApplication.java: Main class that starts the Spring Boot application.
- controllers: Contains the ClientController.java, which handles client-related requests.
- models: Contains the ClientModel.java, which defines the structure of the client entity.
- repositories: Contains repositories to interact with the database.
- services: Contains services that implement the business logic of the application.

### *Requirements*

- Java 17 or higher
- Spring Boot 3.1.5
- Maven 3.6.3 or higher
