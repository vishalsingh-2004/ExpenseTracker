# ExpenseTracker 
# 💰 Expense Tracker

**Stop tracking, Start managing.** Expense Tracker is a powerful, full-stack personal finance application built to give you effortless control over your income and expenses. Visualize your spending, track trends over time, and take control of your financial future.

## ✨ Features Spotlight

| Icon | Feature | Description |
| :---: | :--- | :--- |
| 🛡️ | **Secure User Authentication** | Full registration flow with email activation for maximum security. |
| 📊 | **Interactive Dashboard** | Real-time overview of net balance, total income/expense, and a category-based pie chart. |
| 🏷️ | **Custom Categories** | Define and manage your own custom categories for precise organization of all transactions. |
| 📈 | **Trend Visualization** | Dedicated Income and Expense overviews with historical line charts to monitor financial performance. |
| 🔎 | **Advanced Filtering** | Filter and sort transactions by category, date range, and keyword to quickly find specific data. |
| 📧 | **Export & Reporting** | Easily export financial data to an Excel sheet and receive it via email notification. |

## 💻 Tech Stack

This project is built using a modern full-stack approach for scalability and performance.

### Frontend
| Technology | Description |
| :--- | :--- |
| **React.js** | Library for building the dynamic and responsive user interface. |
| **Vite** | Next-generation frontend tooling for a fast development experience. |
| **Tailwind CSS** | Utility-first framework for rapid and consistent styling. |

### Backend
| Technology | Description |
| :--- | :--- |
| **Spring Boot (Java 20+)** | Robust, RESTful API server handling business logic and security. |
| **Spring Security & JWT** | Industry-standard security and stateless authentication. |
| **Spring Data JPA** | Data persistence layer, supporting MySQL/PostgreSQL. |

---

## 🚀 Getting Started

Follow these steps to set up the project locally.

### Prerequisites

You will need the following installed:

* Java Development Kit (JDK) 20 or later
* Maven
* Node.js (18+) & npm/yarn
* A running instance of **MySQL** or **PostgreSQL**

### 1. Backend Setup (Spring Boot)

1.  **Navigate to the backend directory:**
    ```bash
    cd expensetracker/expensetracker
    ```

2.  **Configure Environment:**
    Open `src/main/resources/application.properties` and update the database connection details, JWT secret, and email service credentials.

    ```properties
    # Example MySQL Configuration
    spring.datasource.url=jdbc:mysql://localhost:3306/moneymanager
    spring.datasource.username=${YOUR_DB_USERNAME}
    spring.datasource.password=${YOUR_DB_PASSWORD}
    
    # ... other security and email configurations
    ```

3.  **Run the application:**
    ```bash
    ./mvnw spring-boot:run
    ```
    The Spring Boot API will start on `http://localhost:8080`.

### 2. Frontend Setup (React/Vite)

1.  **Navigate to the frontend directory:**
    ```bash
    cd ../expensetrackerwebapp
    ```

2.  **Install dependencies:**
    ```bash
    npm install
    # or
    yarn install
    ```

3.  **Run the application:**
    ```bash
    npm run dev
    # or
    yarn dev
    ```

The frontend should now be running at `http://localhost:5173/` and connected to the backend API.
