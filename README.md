Healthcare Analytic System
Overview
The Healthcare Data Management System integrates data analytics, machine learning, and web technologies to manage and analyze healthcare data effectively. This system includes various components for data visualization, predictive analysis, resource management, and personal care insights.

Components
1. Python Backend
Scripts:
healthcare_analysis.py: Handles data visualization, predictive analysis using Random Forest, resource management, and personal care insights.
py4j_gateway.py: Sets up a Py4J gateway server to facilitate communication between Java and Python components.
2. Java Backend
Files:
HealthcareApplication.java: The main entry point for the Spring Boot application.
AnalyticsController.java: Provides RESTful API endpoints for interfacing with the Python backend.
3. JavaFX Frontend
File:
MainApp.java: A JavaFX application offering a graphical user interface (GUI) for user input and prediction display.
4. HTML Frontend
File:
index.html: Contains the layout and styling for the Healthcare Data Management UI.
HTML Code
The index.html file provides a basic structure for the user interface of the Healthcare Data Management System. This HTML file is designed to enhance user interaction with the system by offering a clean and organized layout. It includes:

Sidebar Navigation: Allows users to easily navigate between different sections such as Dashboard, Data Visualization, Predictive Model, Resource Management, and Personal Care.
Main Content Area: Dedicated sections for displaying charts, forms, and predictions, making it straightforward for users to interact with the system’s features.
Advantages
Improved User Experience: The clear navigation and organized layout help users find and use various features of the system efficiently.
Visual Appeal: The design elements, such as card-based sections and responsive charts, create an engaging and visually appealing interface.
Modularity: Each section is designed to be modular, making it easier to update or extend functionalities without affecting the entire layout.
How to Run
Backend Setup:

Ensure Python and Java are installed on your system.
Run py4j_gateway.py to start the Py4J gateway.
Start the Spring Boot application using HealthcareApplication.java.
Frontend Setup:

Open index.html in a web browser to view the user interface.

<img width="1488" height="836" alt="image" src="https://github.com/user-attachments/assets/412dc815-bc3f-4554-aea0-1baac4279ed7" />

<img width="1483" height="832" alt="image" src="https://github.com/user-attachments/assets/3f8f8d0a-9c10-495f-bb18-dffe70e41dc9" />






