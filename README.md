# Expense Tracker App

## Status: Ongoing Project 🚧
This project is currently under development. The current focus is on implementing the **Auth Service** with **JWT (JSON Web Token)** for authentication and **Refresh Token** functionality to ensure secure and efficient user login sessions.

> **Note:** The repository is updated daily with the current development status.

---

## Overview
The Expense Tracker App helps users manage their personal finances by allowing them to log expenses, track categorized spending, and generate reports. 

### Features:
- **User Authentication:** Users can securely log in and sign up.
- **Manual Expense Management:** Add or remove expenses manually.
- **Expense Overview:** View categorized expenses.
- **Reports and Statistics:** Generate weekly, monthly, and yearly spending reports.

### Future Scope:
- **Financial Behavior Tracking:** Tips and insights to improve financial habits.
- **Automated Expense Tracking:** Automatic logging of expenses via SMS parsing.
- **Notifications:** Alerts via WhatsApp and SMS for overspending, financial risks, and more.

---

## Functional Requirements
- User Authentication for login and sign-up.
- Manual expense addition and removal.
- Overview of categorized expenses.
- Generate detailed spending reports (weekly, monthly, yearly).

## Non-Functional Requirements
- Fault-tolerant and scalable with latency under **100ms**.
- Config-driven to minimize code changes in the future.

---

## System Architecture
The system follows a **microservices architecture**:

### Components:
1. **Client:** User interface for interacting with the application.
2. **API Gateway:** Manages all client requests and handles tokenization for security.
3. **Auth Service:** Manages user authentication and authorization with JWT and Refresh Tokens.
4. **Notification Service:** Sends notifications through multiple channels.
5. **Templatisation Service:** Handles templates for customized notifications.
6. **User Service:** Manages user-related data and operations.
7. **Billing Service:** Tracks user billing and payments.
8. **Ledger Service:** Maintains all transaction data for users.
9. **Reporting Service:** Generates detailed reports on spending behavior.

### Tools and Technologies:
- **Redis:** In-memory data structure store for caching.
- **RabbitMQ:** Message broker for asynchronous microservice communication.
- **Docker:** Containerization for consistent and easy deployment.
- **Kafka:** Distributed streaming platform for real-time data pipelines.
- **Kubernetes:** Orchestrates and manages containerized applications.
- **Kong:** API Gateway for managing and monitoring API traffic.

---

## Installation and Setup

### Prerequisites:
Ensure the following tools are installed:
- Docker
- Docker Compose

### Steps:
1. Clone the repository:
   ```bash
   git clone https://github.com/UmangSonthaliya/Expense-Tracker-App
   cd expense-tracker-app
2. Set up Docker:
    ```bash 
    docker-compose up --build

3. Run the application:
   The app runs on http://localhost:8080 or as defined in your configuration.
4. Configure environment variables:
   Add required configurations for services such as Redis, RabbitMQ, and more.
