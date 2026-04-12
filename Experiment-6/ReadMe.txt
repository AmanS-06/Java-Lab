EXPERIMENT 6: EMPLOYEE MANAGEMENT SYSTEM USING JAVA WITH INHERITANCE AND ABSTRACT METHODS

AIM
To implement an employee management system in Java using inheritance, abstract classes, and method overriding to calculate Cost-to-Company (CTC) for different categories of employees.

OBJECTIVES

Create abstract base class Employee with common attributes and abstract calcCTC() method
Implement derived classes FullTimeEmployee and ContractEmployee
Override calcCTC() method in child classes based on role-specific logic
Extend FullTimeEmployee to create Manager subclass with additional allowances
Demonstrate polymorphic behavior using an array of Employee references
Display employee details along with calculated CTC

DESCRIPTION
This program implements an employee hierarchy using four classes:

Employee
- Abstract root class containing common attributes: name, PANNo., joiningDate, designation, empId
- Declares abstract method calcCTC() to be implemented by all child classes

FullTimeEmployee
- Inherits from Employee
- Adds fields: baseSalary, perfBonus, hiringCommission, role
- Overrides calcCTC() with role-based logic:
  - role=SWE: returns baseSalary + perfBonus
  - role=HR: returns baseSalary + hiringCommission
  - Default: returns baseSalary only

ContractEmployee
- Inherits from Employee
- Adds fields: noOfHrs, hourlyRate
- Overrides calcCTC() to return noOfHrs * hourlyRate

Manager
- Inherits from FullTimeEmployee
- Adds fields: travelAllowance, eduAllowance
- Overrides calcCTC() to return super.calcCTC() + travelAllowance + eduAllowance

Main
- Creates objects of each concrete employee type
- Invokes calcCTC() polymorphically and displays results

FEATURES

Abstract class design with abstract method enforcement
Three-level inheritance hierarchy
Method overriding for specialized CTC computation
Role-based logic within FullTimeEmployee
Polymorphic method invocation
Clean and readable code with simple comments

FOLDER STRUCTURE

experiment-6/
    src/
        Employee.java
        FullTimeEmployee.java
        ContractEmployee.java
        Manager.java
        Main.java
    README.txt

HOW TO COMPILE
javac src/*.java

HOW TO RUN
java Main

EXPECTED OUTPUT

Software Engineer (Alice) CTC: 95000.0
HR Specialist (Bob) CTC: 72000.0
Contract Developer (Charlie) CTC: 12000.0
Engineering Manager (Diana) CTC: 165000.0

AUTHOR
Aman Saxena
AIML - A2
24070126030