\# College Management System



\## Overview

This Java program demonstrates \*\*Inheritance\*\* in Object-Oriented Programming (OOP) by modeling a simple college management system. The program includes a parent class `Person` and child classes `Student` and `Professor`, showing how real-world relationships can be represented in code.



---



\## Classes and Features



| Class      | Description |

|------------|-------------|

| `Person`   | Parent class with fields `name` and `email` and a method `displayDetails()` to show basic information. |

| `Student`  | Child class of `Person` with additional fields `rollNo` and `course`. Overrides `displayDetails()` to include student-specific details. |

| `Professor`| Child class of `Person` with additional fields `employeeId` and `subject`. Overrides `displayDetails()` to include professor-specific details. |



\### Key Concepts Demonstrated

\- \*\*Inheritance\*\*: `Student` and `Professor` extend `Person`.

\- \*\*Method Overriding\*\*: Child classes override `displayDetails()` to show additional information.

\- \*\*Constructor Chaining\*\*: Using `super()` to call the parent class constructor.

\- \*\*Polymorphism\*\* (basic): Different objects use the same method name with different behaviors.



---



\## How to Run



1\. Open the folder in your IDE or terminal.

2\. Compile the Java program:



```bash

javac CollegeManagementSystem.java











Person Details>>>>>>>>>>>>>>>>  

Name of the person is :Ali  

Email of the person is :ali123@gmail.com  



Student Details>>>>>>>>>>>>>>>>  

Name of the person is :Syhed Abu  

Email of the person is :syded234@gmail.com  

Roll Number Of the Student:221A  

Course of the Student :CSE  



Professor Details>>>>>>>>>>>>>>>>  

Name of the person is :Sk.Malik  

Email of the person is :malik132@gmail.com  

Professor Employee Id:221S  

Subject Of the Professor:AI-Ml





