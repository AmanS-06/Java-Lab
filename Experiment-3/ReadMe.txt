EXPERIMENT 3: BOOK INVENTORY SYSTEM USING JAVA COLLECTIONS AND EXCEPTION HANDLING

AIM
To develop a Book Inventory System using Java that demonstrates object oriented programming concepts, user defined exceptions, constructor validation, and the use of ArrayList to manage multiple objects.

OBJECTIVES

- Understand object oriented programming structure in Java
- Create classes with appropriate constructors
- Implement user defined exception handling
- Validate object data using constructor based checks
- Manage multiple objects using ArrayList
- Perform aggregate operations such as average calculation
- Use forEach() method to filter and display specific records

DESCRIPTION
This program implements a Book Inventory System using multiple classes:

Book
- Contains book attributes such as title, author, genre, and price.
- Includes constructors for object initialization.
- One constructor throws InvalidPriceException if the price is less than 0.
- Contains appropriate getter methods and display functionality.

InvalidPriceException
- A user defined exception class.
- Thrown when a Book object is created with a negative price value.

ArrayListOfBooks
- Contains the main method.
- Creates multiple Book objects and stores them in an ArrayList.
- Uses try-catch block to handle InvalidPriceException while attempting to create a Book with negative price.
- Displays all book details stored in the ArrayList.
- Calculates and prints the average price of books.
- Prints books belonging to a particular genre such as "Fiction" using the forEach() method.

FEATURES

- Book class with appropriate attributes
- Constructor validation with exception throwing
- User defined exception (InvalidPriceException)
- Exception handling using try-catch
- Use of ArrayList to store objects
- Iteration using forEach() method
- Average price calculation
- Genre based filtering of books

FOLDER STRUCTURE
experiment-3/
    src/
        ArrayListOfBooks.java
        Book.java
	InvalidGenreException.java
	InvalidPriceException.java
    README.txt

HOW TO COMPILE
javac src/*.java

HOW TO RUN
java ArrayListOfBooks

EXPECTED OUTPUT

- Multiple Book objects are created and stored in an ArrayList
- If a Book is created with negative price, InvalidPriceException is thrown and handled
- All valid book records are displayed
- Average price of books is calculated and printed
- Books of a specific genre (e.g., Fiction) are displayed using forEach()

AUTHOR
Aman Saxena
AIML - A2
24070126030