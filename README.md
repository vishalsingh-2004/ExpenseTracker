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

# 💰 Expense Tracker

**Stop tracking, Start managing.** Expense Tracker is a powerful, full-stack personal finance application built to give you effortless control over your income and expenses. Visualize your spending, track trends over time, and take control of your financial future.

Excellent idea! Integrating your actual project screenshots will make the README much more visually appealing and informative.

Here is the updated README with your provided images linked into the "Screenshots" section, corresponding to the correct descriptions.

Important: Please ensure the image URLs you provided are publicly accessible so they display correctly on GitHub. I've used placeholder text (<YOUR_GITHUB_IMAGE_URL_HERE>) for the specific URLs for images not explicitly provided in the prompt, but I've matched the ones you did give.

Markdown

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
| 🛡️ | **Secure User Authentication** | Full user registration with email verification for robust security. |
| 📊 | **Interactive Dashboard** | Real-time summary of net balance, income, expenses, and category-based spending visualization. |
| 🏷️ | **Custom Categories** | Define, edit, and manage custom categories for precise organization of all transactions. |
| 📈 | **Trend Visualization** | Dedicated views for Income and Expense with historical line charts to analyze trends over time. |
| 🔎 | **Advanced Filtering** | Efficiently search and filter transactions by category, date range, and keywords. |
| 📧 | **Export & Reporting** | Export current month's financial data to an Excel sheet and receive reports via email notification. |

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
| **Spring Boot (Java)** | ![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.0-6DB33F?style=for-the-badge&logo=springboot&logoColor=white) | Robust, RESTful API server handling all business logic and security. |
| **Spring Security & JWT** | ![Security](https://img.shields.io/badge/Spring%20Security-Auth-6DB33F?style=for-the-badge&logo=springsecurity&logoColor=white) | Stateless authentication and authorization using JSON Web Tokens. |
| **MySQL / PostgreSQL** | ![Database](https://img.shields.io/badge/JPA-MySQL%2FPostgreSQL-E0B13D?style=for-the-badge&logo=mysql&logoColor=white) | Relational database persistence handled by Spring Data JPA. |

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

* Java Development Kit (JDK) 20 or later
* Maven
* Node.js (18+) & npm/yarn
* A running instance of **MySQL** or **PostgreSQL**

### 1. Backend Setup (`expensetracker/expensetracker`)

1.  **Navigate to the backend directory:**
    ```bash
    cd expensetracker/expensetracker
    ```

2.  **Configure Environment:**
    Update `src/main/resources/application.properties` with your database connection, JWT secret, and Email Service credentials.

    ```properties
    # Example MySQL Configuration
    spring.datasource.url=jdbc:mysql://localhost:3306/moneymanager
    spring.datasource.username=${YOUR_DB_USERNAME}
    spring.datasource.password=${YOUR_DB_PASSWORD}
    ```

3.  **Run the application:**
    ```bash
    ./mvnw spring-boot:run
    ```
    The Spring Boot API will start on `http://localhost:8080/api/v1.0`.

### 2. Frontend Setup (`expensetracker/expensetrackerwebapp`)

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

The frontend application will be available at `http://localhost:5173/`.

---

## 🧑‍💻 Author

* **Vishal Singh** - Feel free to connect if you have any questions or feedback!
    * [**LinkedIn**](https://www.linkedin.com/in/vishal-singh-81988928b/)
    * [**GitHub**](https://github.com/vishalsingh-2004)
