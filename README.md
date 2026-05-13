# Yatra UI Automation Framework

> End-to-end UI automation framework for [Yatra.com](https://www.yatra.com) built with **Selenium WebDriver**, **Java**, and **TestNG**.  
> Implements dynamic calendar handling to identify and select the **lowest fare** across current and next months.

---

## 📌 Overview

This framework automates flight search on Yatra.com with a focus on handling a **dynamic calendar component** — extracting and comparing flight prices across dates to identify the cheapest available fare.

---

## 🚀 Features

- Launches Yatra.com and handles popups dynamically
- Interacts with dynamic calendar UI to extract flight prices
- Identifies the minimum fare within a month
- Compares prices across current and next month
- Clean and reusable test structure using `BaseTest` setup

---

## 🛠️ Tech Stack

| Layer | Technology |
|---|---|
| Language | Java |
| Automation | Selenium WebDriver |
| Test Framework | TestNG |
| Build Tool | Maven |
| Browser | Chrome |
| IDE | IntelliJ IDEA |

---

## 📂 Project Structure

```
├── src
│   └── test
│       └── java
│           └── com.yatra.automation.tests
│               ├── BaseTest.java
│               └── YatraTest.java
├── pom.xml
└── README.md
```

---

## ▶️ How to Run

**1. Clone the repository**
```bash
git clone https://github.com/nikhilt1206/Yatra-UI-Automation-Framework.git
```

**2. Navigate to the project folder**
```bash
cd Yatra-UI-Automation-Framework
```

**3. Run tests using Maven**
```bash
mvn test
```

---

## 🧠 Key Learnings

- Handling dynamic web elements (calendar UI)
- Working with XPath and complex DOM structures
- Implementing reusable setup using `BaseTest`
- Extracting and processing real-time UI data
- Git and GitHub project management

---

## 📈 Future Improvements

- [ ] Implement Page Object Model (POM)
- [ ] Replace `Thread.sleep` with explicit waits
- [ ] Add assertions for test validation
- [ ] Introduce logging and reporting (Extent Reports / Allure)
- [ ] Integrate with CI/CD pipeline (Jenkins / GitHub Actions)

---

## 👨‍💻 Author

**Nikhil Tiwari**  
[GitHub](https://github.com/nikhilt1206) • [LinkedIn](https://www.linkedin.com/in/nikhilt1206)

---

> ⭐ *This project is built for learning and interview preparation, focusing on real-world UI automation challenges.*
