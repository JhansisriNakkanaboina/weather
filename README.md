# Weather Application

## Overview

The Weather Application is a RESTful API built with Spring Boot, using H2 as an in-memory database and JPA for data management. This application provides endpoints to manage and retrieve weather data for various cities. The API allows users to create, read, update, and delete weather records, making it a useful tool for applications that require weather information.

## Features

- **RESTful API**: Implements standard HTTP methods (GET, POST, PUT, DELETE) for interacting with weather data.
- **In-Memory Database**: Uses H2 database for fast data storage and retrieval.
- **JPA Integration**: Simplifies database operations with Spring Data JPA.
- **H2 Console**: Provides a web-based interface to view and manage the in-memory database.

## API Endpoints

- `GET /api/weather`: Retrieve a list of all weather records.
- `GET /api/weather/{id}`: Retrieve a specific weather record by ID.
- `POST /api/weather`: Create a new weather record.
- `PUT /api/weather/{id}`: Update an existing weather record by ID.
- `DELETE /api/weather/{id}`: Delete a weather record by ID.

## Getting Started

### Prerequisites

- Java 17 or later
- Maven
- An IDE (e.g., IntelliJ IDEA, Eclipse) for Java development

### Instructions to Download and Run the Application

1. **Clone the Repository**

   Open your terminal and run the following command to clone the repository:

   ```bash
   git clone https://github.com/JhansisriNakkanaboina/weather.git
