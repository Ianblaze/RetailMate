# RetailMate: AI-Powered POS & Inventory Ecosystem

> **A "Hybrid Intelligence" retail platform connecting a Spring Boot backend, a Python AI brain, and a React Native mobile floor manager.**

[![Live Demo](https://img.shields.io/badge/Live_Demo-Railway-success?style=for-the-badge&logo=railway)](#)
[![GitHub Repo](https://img.shields.io/badge/Code-GitHub-black?style=for-the-badge&logo=github)](https://github.com/Ianblaze/RetailMate)

**RetailMate** revolutionizes traditional Point of Sale systems by allowing store owners to chat with their data. Whether it's asking *"Price of Redmi Note 13"* (even with typos) or managing stock via a mobile app, RetailMate unifies operations into one intelligent ecosystem.

---

## Key Features

### 🧠 The "Smart" Core (Hybrid AI)
* **Conversational Interface:** Ask natural questions like *"How much stock of D-Link Router?"* or *"Predict revenue for next week."*
* **Fuzzy Logic Engine:** The Python microservice corrects typos (e.g., "redmi notee") and extracts entities to query the database accurately.
* **Sales Forecasting:** Integrated Linear Regression algorithms predict future sales trends.

### 📱 Mobile Companion (React Native)
* **Barcode Scanner:** Use your phone camera to scan products for instant price checks and stock updates.
* **Live Dashboard:** View real-time revenue, net profit, and low-stock alerts from anywhere.

### 💻 Web POS & Analytics
* **Dynamic Billing:** Professional invoicing with tax calculation and "Amount in Words" conversion.
* **Inventory Control:** Bulk Excel import/export and category management.

---

## Tech Stack

| Domain | Technology Used |
| :--- | :--- |
| **Backend** | Java Spring Boot (Maven), Hibernate, Spring Data JPA |
| **AI Service** | Python Flask, TheFuzz (Fuzzy Matching), Pandas, Scikit-learn logic |
| **Mobile** | React Native (Expo), Expo Router, Expo Camera |
| **Database** | PostgreSQL (Hosted on Railway/Supabase) |
| **Deployment** | Railway PaaS |

---

## How It Works (The Hybrid Architecture)

1.  **User Query:** *"Price of redmi notee"* (Typo included).
2.  **Spring Boot (Java):** Receives the query and forwards it to the Python microservice.
3.  **Python Brain:** Uses **Fuzzy Logic** to match "redmi notee" $\rightarrow$ "Redmi Note 13" (95% match) and extracts the price from the DB.
4.  **Response:** Python returns the specific answer; Java displays it to the user.

---

## ⚡ Quick Start

**Prerequisites:** Java JDK 17, Python 3.9+, Node.js v20+, PostgreSQL (or Docker).

### Option 1: Docker (Recommended)
```bash
# Clone the repository
git clone https://github.com/Ianblaze/RetailMate.git
cd RetailMate

# Spin up the backend, database, and AI service automatically
docker compose up --build
```

### Option 2: Manual Start
```bash
# 1. Clone the Repo
git clone https://github.com/Ianblaze/RetailMate.git
cd RetailMate

# 2. Start the AI Microservice (Port 5000)
cd ai-service
pip install -r requirements.txt
python app.py

# 3. Start the Backend API (Port 8080)
# Open a new terminal in the root directory
./mvnw spring-boot:run
```

---

## Contact & Links
* **Live App:** *(Link available upon Railway deployment)*
* **GitHub:** [https://github.com/Ianblaze/RetailMate](https://github.com/Ianblaze/RetailMate)
* **Developer:** Ian
