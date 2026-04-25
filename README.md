# RetailMate — AI-Powered POS & Inventory Ecosystem

> An all-in-one retail management platform that replaces the fragmented mess of separate billing, inventory, analytics, cashier, and distributor tools with a single unified system, powered by a hybrid AI brain.

---

## Why I Built This

Most small and mid-size retail stores juggle 4 or 5 different tools just to run their day. One for billing, one for inventory, another for analytics, a separate cashier interface, and spreadsheets for distributor management. RetailMate puts all of that in one place.

---

## What Makes It Different

Traditional POS systems are passive. They do what you tell them. RetailMate is active. Store managers can type a plain question like *"How much stock do I have left of the D-Link Router?"* or *"What's my net profit today?"* and get an instant answer. No menus, no navigation, no training required.

On top of that, the system doesn't just react to what's happening — it predicts what's coming. Sales forecasting, low stock alerts, and cart based product recommendations mean the store is always one step ahead.

---

## Core Features

### 🧠 Conversational AI Dashboard
Store managers can ask plain questions about inventory, sales, or profit and get direct answers. It's powered by a Python microservice that parses the intent and queries the PostgreSQL database on the fly.

### 🔍 Fuzzy Product Search
The search is typo tolerant. Searching "rdmi notee" correctly returns "Redmi Note 13" with a 95% confidence match. This was one of my favourite things to build because it solves a very real problem — cashiers make typos, and a system that fails on a typo is a system people stop trusting.

### 🛒 Billing & Checkout
Real time invoice generation with automated tax calculations and "Amount in Words" conversion. Each transaction gets a dynamic UPI QR code generated on the spot, and customers can receive a PDF receipt over email. I also built a Market Basket Analysis engine into the checkout flow that recommends related products based on what's already in the cart, the same logic big e-commerce platforms use to increase order value.

### 📦 Inventory & Distributor Management
Full inventory control with bulk Excel import and export, category management, and distributor tracking so store owners can manage suppliers and purchase orders from the same place they do everything else. Automated low stock alerts go out over email when items drop below a set threshold.

### 📈 Analytics & Forecasting
A real time dashboard showing revenue, net profit, and sales trends. I integrated Linear Regression based sales forecasting so owners can predict future inventory needs and restock before they run out rather than after.

### 📱 Mobile Companion
A React Native app built with Expo that lets staff scan barcodes using their phone camera for instant price checks and stock updates. The live dashboard is also accessible on mobile so managers can keep an eye on things from anywhere.

---

## Tech Stack

| Domain | Technology |
|---|---|
| Backend | Java 17, Spring Boot, Hibernate, Spring Data JPA |
| AI Microservice | Python 3, Flask, TheFuzz, Pandas, Scikit-learn |
| Mobile | React Native (Expo), Expo Router, Expo Camera |
| Database | PostgreSQL hosted on Railway |
| Deployment | Docker, Railway PaaS |
| Frontend Web POS | HTML5, CSS3, JavaScript, WebSockets |

---

## How the Architecture Works

RetailMate runs on a microservice architecture that keeps the enterprise Java backend completely separate from the Python AI engine. The heavy transactional logic never competes with the ML and language processing, and both sides can scale independently.

```
User types: "Price of redmi notee"
        │
        ▼
Spring Boot (Java)
Handles all transactions, billing, inventory, and auth.
Receives the query and forwards it to Python.
        │
        ▼
Python Flask Microservice
Fuzzy matches "redmi notee" to "Redmi Note 13" at 95% confidence.
Queries PostgreSQL and returns the exact answer.
        │
        ▼
Answer displayed to the user instantly.
```

Most projects at this level are monolithic. Splitting it this way was a deliberate decision to reflect how production systems at scale are actually designed.

---

## A Note on the Repository

This project was collaboratively developed and the codebase was migrated from a shared repository, which is why the commit history looks condensed. Everything here, the AI microservice, the billing engine, the inventory system, the distributor management, and the forecasting model was built as part of this project from scratch.
