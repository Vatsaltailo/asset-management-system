# 📦 Asset Management System

The **Asset Management System** is a web-based solution designed to streamline and automate the tracking and management of departmental assets in educational institutions. Built using **Java Spring Boot** and **MySQL**, this system simplifies invoice tracking, asset allocation, and expenditure monitoring — replacing cumbersome manual processes with a centralized and user-friendly platform.

---

## 🧩 Problem Statement

Managing department assets manually is tedious, error-prone, and inefficient. Faculty members have to remember individual asset details, manage physical bills, and manually calculate total expenditures. This leads to disorganization and risks data loss or miscommunication.

---

## ✅ Solution

This system provides:
- A centralized repository to store and track all assets.
- Invoice and recurring asset tracking.
- Department-wise expenditure summaries.
- A scalable structure to accommodate multiple departments and asset types.
- Simple usability such that any faculty member can take over the system without training overhead.

---

## 🎯 Features & Objectives

- 📋 Fixed Asset Management  
- 🔁 Recurring Asset Management  
- 🧾 Invoice Management  
- 💰 Department-wise Expenditure Calculation  
- 🏢 Asset-to-Infrastructure Mapping  
- 🧩 Multi-Department Scalability (Future Scope)

---

## 🛠️ Tech Stack

### Software Requirements
- Java 8.0+
- Spring Boot (MVC + Data JPA)
- MySQL (via XAMPP / WAMP)
- Spring Tool Suite / Eclipse / IntelliJ

### Hardware Requirements
- Intel Core i3 processor or higher
- Minimum 2GB RAM

---

## 🚀 Project Scope

- Initially supports a **single department**.
- Easily extensible to support **multiple departments** with varied asset types and needs.
- Can accommodate department-specific workflows or customization needs in future versions.

---

## 🔧 Installation Instructions

1. Clone the repository:
   ```bash
   git clone https://github.com/yourusername/asset-management-system.git
2. Import the project into Spring Tool Suite / IntelliJ/ Microsoft VSCode.

3. Configure MySQL:
   Create a database asset_db
   Update application.properties with your DB credentials

4. Run the application using LabManagementApplication.java file

5. Access the application at: http://localhost:8080


## 📚 Future Enhancements
Multi-user authentication & authorization

Role-based access control (Admin, Faculty, Department Head)

Notifications for asset expiry/maintenance

Export reports (PDF/Excel)

## 👤 Authors
Vatsal Tailor
Maharshi Chaudhary
