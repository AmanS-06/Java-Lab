EXPERIMENT 5: BANKING APPLICATION USING JAVA WITH INHERITANCE AND METHOD OVERRIDING

AIM
To implement a banking application in Java using inheritance, method overriding, and ArrayList to manage customer and account details.

OBJECTIVES

Create base class Account with common attributes and methods
Implement derived classes SavingsAccount and LoanAccount
Override deposit() and withdraw() methods in child classes
Create Customer class to store customer details
Use ArrayList to manage multiple customers and accounts
Display consolidated account information for each customer

DESCRIPTION
This program implements a banking system using four classes:

Customer

Stores customer details like name and ID
Maintains a list of accounts associated with the customer
Provides method to display customer and account details

Account

Base class for all account types
Contains common attributes like account number and balance
Defines deposit() and withdraw() methods

SavingsAccount

Inherits from Account
Overrides deposit() and withdraw() methods with savings-specific logic

LoanAccount

Inherits from Account
Overrides deposit() and withdraw() methods based on loan behavior

Main (BankingApp)

Creates ArrayList of customers and accounts
Associates accounts with customers
Displays consolidated details of each customer and their accounts

FEATURES

Inheritance-based design
Method overriding for specialized behavior
Use of ArrayList for dynamic data storage
Multiple account handling per customer
Consolidated account information display

FOLDER STRUCTURE

experiment-5/
    src/
        BankingApp.java
        Customer.java
        Account.java
        SavingsAccount.java
        LoanAccount.java
    README.txt

HOW TO COMPILE
javac src/*.java

HOW TO RUN
java BankingApp

EXPECTED OUTPUT

Customers and their accounts are created successfully
Deposit and withdrawal operations are performed
Overridden methods behave according to account type
Consolidated customer account details are displayed

AUTHOR
Aman Saxena
AIML - A2
24070126030