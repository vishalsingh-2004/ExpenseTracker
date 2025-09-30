
# 💰 Expense Tracker

**Stop tracking, Start managing.** Expense Tracker is a powerful, full-stack personal finance application built to give you effortless control over your income and expenses. Visualize your spending, track trends over time, and take control of your financial future.

## Screenshots

| Landing Page | Signup Page |
| :---: | :---: |
| ![Landing Page](https://github.com/user-attachments/assets/036184e1-2c28-4e72-b55c-485f69d55188) | ![Signup Page](https://github.com/user-attachments/assets/07b392d4-5255-4d11-9e56-5764945012d3) |

| Dashboard Overview | Category Management |
| :---: | :---: |
| ![Dashboard Overview](https://github.com/user-attachments/assets/c321f61e-cc50-4422-ad14-688eaafd92bf) | ![Category Management](https://github.com/user-attachments/assets/33d51d8d-4c66-42e4-af83-82f139e68d52) |

| Income Tracking | Expense Overview |
| :---: | :---: |
| ![Income Tracking](https://github.com/user-attachments/assets/229aaeb0-9c96-4783-ae28-f18faee7d59c) | ![Expense Overview](https://github.com/user-attachments/assets/21bf66df-7190-4b2e-84c0-b0740bde3efe) |

| Filter Transactions | Login Page |
| :---: | :---: |
| ![Filter Transactions](https://github.com/user-attachments/assets/b4843afc-d9d3-4a15-ac81-a83de51ef160) | ![Login Page](https://github.com/user-attachments/assets/222401ff-3054-4e4a-92d3-48a78a13e42b) |

## ✨ Features Spotlight

| Icon | Feature | Description |
| :---: | :--- | :--- |
| 🛡️ | **Secure User Authentication** | Full registration flow with email activation for maximum security. |
| 📊 | **Interactive Dashboard** | Real-time overview of net balance, total income/expense, and a category-based pie chart. |
| 🏷️ | **Custom Categories** | Define and manage your own custom categories for precise organization of all transactions. |
| 📈 | **Trend Visualization** | Dedicated Income and Expense overviews with historical line charts to monitor financial performance. |
| 🔎 | **Advanced Filtering** | Filter and sort transactions by category, date range, and keyword to quickly find specific data. |
| 📧 | **Export & Reporting** | Easily export financial data to an Excel sheet and receive it via email notification. |

## 🛠️ Tech Stack

This project leverages a modern, decoupled architecture for scalability and maintainability.

### Frontend
| Technology | Badge | Description |
| :--- | :--- | :--- |
| **React.js** | ![React](https://img.shields.io/badge/React-18-61DAFB?style=for-the-badge&logo=react&logoColor=black) | Library for building the dynamic and responsive user interface. |
| **Vite** | ![Vite](https://img.shields.io/badge/Vite-Build%20Tool-646CFF?style=for-the-badge&logo=vite&logoColor=white) | Fast, modern frontend tooling for development and bundling. |
| **Tailwind CSS** | ![TailwindCSS](https://img.shields.io/badge/TailwindCSS-3-38B2AC?style=for-the-badge&logo=tailwindcss&logoColor=white) | Utility-first framework for rapid and consistent styling. |

### Backend & Database
| Technology | Badge | Description |
| :--- | :--- | :--- |
| **Spring Boot (Java)** | ![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.0-6DB33F?style=for-the-badge&logo=springboot&logoColor=white) | Robust, **RESTful API** server handling business logic and security. |
| **Spring Security & JWT** | ![Security](https://img.shields.io/badge/Spring%20Security-Auth-6DB33F?style=for-the-badge&logo=springsecurity&logoColor=white) | Stateless authentication and authorization using **JSON Web Tokens**. |
| **MySQL / PostgreSQL** | ![Database](https://img.shields.io/badge/JPA-MySQL%2FPostgreSQL-E0B13D?style=for-the-badge&logo=mysql&logoColor=white) | Relational database persistence handled by Spring Data JPA. |

---
![React](https://img.shields.io/badge/React-18-61DAFB?style=for-the-badge&logo=react&logoColor=black)
![TailwindCSS](https://img.shields.io/badge/TailwindCSS-3-38B2AC?style=for-the-badge&logo=tailwindcss&logoColor=white)
![Lucide Icons](https://img.shields.io/badge/Lucide-Icons-000000?style=for-the-badge&logo=lucide&logoColor=white)
![Clerk](https://img.shields.io/badge/Clerk-Auth-3B82F6?style=for-the-badge&logo=clerk&logoColor=white)
![Java](https://img.shields.io/badge/Java-17-007396?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.0-6DB33F?style=for-the-badge&logo=springboot&logoColor=white)
![Spring Security](https://img.shields.io/badge/Spring%20Security-JWT-6DB33F?style=for-the-badge&logo=springsecurity&logoColor=white)
![MySQL](https://img.shields.io/badge/MySQL-8.0-4479A1?style=for-the-badge&logo=mysql&logoColor=white)
![Maven](https://img.shields.io/badge/Maven-Build-FF6C37?style=for-the-badge&logo=apachemaven&logoColor=white)
![Vite](https://img.shields.io/badge/Vite-4.0-646CFF?style=for-the-badge&logo=vite&logoColor=white)
![Bootstrap](https://img.shields.io/badge/Bootstrap-5-7952B3?style=for-the-badge&logo=bootstrap&logoColor=white)
![Axios](https://img.shields.io/badge/Axios-API%20Calls-5A29E4?style=for-the-badge&logo=axios&logoColor=white)

![Postman](https://img.shields.io/badge/Postman-API%20Testing-FF6C37?style=for-the-badge&logo=postman&logoColor=white)


---

## 💡 What I Learned

This project was a deep dive into building production-ready full-stack applications, allowing me to master key skills:

* Full-stack integration between **React & Spring Boot**.
* Implementing **secure user authentication** with email activation and JWT.
* Designing and implementing a complex **RESTful API**.
* Building highly **responsive and performant UIs** using Tailwind CSS.
* Mastering **data fetching and state management** in React.

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

---

## 🧑‍💻 Author

* **Vishal Singh** - Feel free to connect if you have any questions or feedback!
    * [**LinkedIn**](https://www.linkedin.com/in/vishal-singh-81988928b/)
    * [**GitHub**](https://github.com/vishalsingh-2004)
