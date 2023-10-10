# Registration and Authorization model

This project implements the following features:

## Registration and Authorization using Spring Security

To ensure the security of the application, Spring Security is used to implement user registration and authorization mechanisms.

## Usage of JWT Tokens at Session Level

JWT tokens are used for user authentication and authorization at the server level. This allows verifying the authenticity of users and granting access to protected resources.

## Usage of CSRF Tokens in HTML Forms

To protect against Cross-Site Request Forgery (CSRF) attacks, CSRF tokens are used in HTML forms. This verifies the authenticity of requests sent from the client and prevents potential attacks.

## Encryption of Data in Databases

To ensure the security of data in the database, encryption is used. All sensitive data is stored in an encrypted format, preventing unauthorized access to it.

## Technologies Used

- Spring Security 6.1.4
- Spring Boot Java 17
- Maven
- PostgreSQL
- Lombok

Installation and running instructions are described in the following sections.

## Installation

1. Clone the repository to your local machine: `git clone https://github.com/your/repository.git`
2. Navigate to the project directory: `cd project-directory`
3. Install the necessary dependencies using Maven: `mvn install`

## Running

1. Run the project with the following command: `mvn spring-boot:run`
2. The application will be available at: `http://localhost:8080`

## Contributing

If you would like to contribute to the project, please review the information on making changes and submitting merge requests in the [CONTRIBUTING](CONTRIBUTING.md) file.

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.