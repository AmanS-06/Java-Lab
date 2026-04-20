EXPERIMENT 7: STUDENT RECORD MANAGER USING JAVA WITH FILE-BASED CRUD OPERATIONS



AIM

To develop a file-based student record management system in Java that performs Create, Read, Update, and Delete operations on a CSV file, with modular class design and IOException handling.



OBJECTIVES



Create a Student model class to represent a single student record

Implement a CSVHandler class to manage all low-level file read/write operations

Build a PercentageCalculator utility class to compute student percentage from marks

Develop a StudentDAO class to encapsulate all CRUD operations

Use StudentRecordManager as the entry point to orchestrate and display all operations

Catch and display IOException at every file handling operation

Demonstrate an exception condition by attempting to read a non-existent file



DESCRIPTION

This program manages student records stored in a CSV file using five modular classes:



Student



Model class representing a single student record

Fields: studentId, name, branch, marks1, marks2, marks3, marks4, marks5, percentage

Provides fromCSV(String) to parse a CSV row into a Student object

Provides toCSV() to serialize a Student object back into a CSV row string

Includes getters and setters for all fields



CSVHandler



Handles all low-level file I/O for the CSV data store

readLines() reads all rows from Students.csv and returns them as a list

writeLines(List) overwrites the CSV with the given list of rows

display(String label) prints all rows with a labeled section heading

demonstrateIOException() intentionally opens a non-existent file to trigger and display an IOException



PercentageCalculator



Single-purpose utility class for percentage computation

calculate(double, double, double, double, double) returns the average of five marks

Overloaded calculate(Student) accepts a Student object for convenience



StudentDAO



Data Access Object containing all CRUD operations

addStudent(...) appends a new student row with marks4 and marks5 initialized to 0

getAllStudents() reads and returns all student records as a list of Student objects

updateMarks(studentId, ...) replaces all five marks for the specified student

updateAllPercentages() recalculates and writes the percentage for every student using PercentageCalculator

deleteStudent(studentId) removes the row matching the given student ID



StudentRecordManager



Entry point class containing only main()

Calls DAO and CSVHandler methods in sequence to demonstrate all CRUD operations



FEATURES



Modular design with each class having a single, clear responsibility

File-based persistence using a plain CSV file

Full CRUD: Create, Read, Update (marks and percentage), Delete

Percentage auto-calculated via a dedicated utility class

IOException caught and printed at every file operation

Simulated exception condition shown in output



FOLDER STRUCTURE



experiment-7/

Students.csv

Student.java

CSVHandler.java

PercentageCalculator.java

StudentDAO.java

StudentRecordManager.java

README.md



HOW TO COMPILE

javac Student.java CSVHandler.java PercentageCalculator.java StudentDAO.java StudentRecordManager.java



HOW TO RUN

java StudentRecordManager





AUTHOR

Aman Saxena

AIML - A2

24070126030

