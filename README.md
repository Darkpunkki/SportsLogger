# Sports Logger Application

This is a simple Java-based application that allows users to log sports activities, view logged activities, and calculate the total time spent on sports for the week. The application is packaged into a Docker container for ease of deployment.

## Features

- **Log Activities**: Users can log various sports activities, specifying the sport name, duration, and day of the week.
- **View Logged Activities**: Users can view all the logged activities, including the sport type, duration, and day.
- **Calculate Total Time**: The application calculates the total time spent on sports activities for the week.

## Requirements

- **Docker**: The application runs in a Docker container. Docker should be installed on your system.
- **JDK 17**: If running locally, ensure that Java Development Kit (JDK) 17 or higher is installed.

## How to Use

### 1. Clone the Repository

First, clone the repository from GitHub:

```bash
git clone https://github.com/darkpunk/SportsLogger.git
cd sportslogger
```

### 2. Build the Docker Image

```bash
docker build -t darkpunk/sportslogger .
```

### 3. Run the Application with Docker
Run the application in a Docker container:

```bash
docker run -d -p 8080:8080 darkpunk/sportslogger
```
The application will be accessible at http://localhost:8080 on your browser, depending on the interface (console or web-based).

### 4. Pull the Pre-built Image from Docker Hub
If you don’t want to build the image locally, you can pull it from Docker Hub:


Copy code
```bash
docker pull darkpunk/sportslogger:latest
docker run -d -p 8080:8080 darkpunk/sportslogger
```

### 5. Running the Application in a Linux VM
To run the application in a Linux virtual machine (VM):

Set up a Linux VM using your preferred virtualization tool.
Install Docker on the Linux VM (sudo apt install docker.io).
Pull the Docker image from Docker Hub and run it as described above.

## Project Structure
```bash
.
├── Dockerfile           # Dockerfile to build the Docker image
├── pom.xml              # Maven build configuration file
├── src                  # Java source code
│   └── main
│       └── java
│           └── SportsLogger.java   # Main class for the Sports Logger application
└── README.md            # Project documentation (this file)
```

Continuous Integration
This project includes integration with Jenkins for CI/CD:

Build: Jenkins pulls the code from GitHub and builds the application using Maven.
Test: Unit tests are run with JUnit, and test coverage is reported using JaCoCo.
Docker: The application is containerized, and Docker images are pushed to Docker Hub.
Technologies Used
Java 17: The core language for the application.
Maven: For dependency management and building the project.
JUnit: For unit testing.
JaCoCo: For code coverage reporting.
Docker: For containerizing and deploying the application.
Jenkins: For continuous integration and deployment.


## How to Contribute:

Fork the repository.
Create a new branch for your feature or bug fix:

```bash
git checkout -b feature-name
```

Commit your changes with a descriptive commit message:

```bash
git commit -m "Add new feature"
```

Push your changes to your branch:

```bash
git push origin feature-name
Create a pull request on GitHub.
```
