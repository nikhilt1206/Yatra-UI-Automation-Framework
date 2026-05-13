# Yatra-UI-Automation-Framework
End-to-end UI automation framework for Yatra.com using Selenium WebDriver, Java, and TestNG. Implements dynamic calendar handling to identify and select the lowest fare across current and next months. 

📌 Overview

This project is an end-to-end UI automation framework built for Yatra.com using Selenium WebDriver, Java, and TestNG.

The automation focuses on handling a dynamic calendar component to identify and compare the lowest flight prices across current and next months.

⸻

🚀 Features

* Launches Yatra website and handles popups dynamically
* Interacts with dynamic calendar UI
* Extracts flight prices from multiple dates
* Identifies the minimum price in a month
* Compares prices between current and next month
* Clean test structure using BaseTest setup

⸻

🛠️ Tech Stack

* Language: Java
* Automation Tool: Selenium WebDriver
* Test Framework: TestNG
* Build Tool: Maven
* Browser: Chrome
* IDE: IntelliJ IDEA

⸻

📂 Project Structure
src
 └── test
      └── java
           └── com.yatra.automation.tests
                ├── BaseTest.java
                └── YatraTest.java

pom.xml
README.md

▶️ How to Run

Clone the repository:
git clone https://github.com/nikhilt1206/Yatra-UI-Automation-Framework.git

Navigate to project folder:
cd Yatra-UI-Automation-Framework

Run tests using Maven:
mvn test

🧠 Key Learning

* Handling dynamic web elements (calendar UI)
* Working with XPath and DOM structure
* Implementing reusable setup using BaseTest
* Extracting and processing UI data
* Git and GitHub project management

⸻

📈 Future Improvements

* Implement Page Object Model (POM)
* Replace Thread.sleep with explicit waits
* Add assertions for validation
* Introduce logging and reporting
* Integrate with CI/CD pipeline

⸻

👨‍💻 Author

Nikhil Tiwari

⸻

⭐ Notes

This project is created for learning and interview preparation purposes, focusing on real-world automation challanges.
