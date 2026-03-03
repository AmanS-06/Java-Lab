EXPERIMENT 4: VECTOR OPERATIONS USING JAVA WITH USER DEFINED EXCEPTION HANDLING

AIM
To implement 2D and 3D vector operations in Java using object oriented programming and user defined exceptions.

OBJECTIVES

- Create a Vector class with constructor validation
- Restrict vector creation to only 2D or 3D
- Implement add(), subtract(), and dotProduct() methods
- Return objects for addition and subtraction
- Return scalar value for dot product
- Handle incompatible dimensions using custom exception

DESCRIPTION
This program implements vector operations using three classes:

Vectors
- Stores vector components and dimension.
- Constructor allows only 2D or 3D vectors.
- Throws VectorException for invalid dimensions.
- add() and subtract() return a new Vector object.
- dotProduct() returns a double value.
- Includes method to display vector.

VectorException
- User defined exception class.
- Thrown for invalid dimensions or incompatible operations.

Main
- Accepts user input.
- Uses try-catch to handle exceptions.
- Performs addition, subtraction, and dot product.
- Displays results.

FEATURES

- Constructor based validation
- User defined exception handling
- Vector addition and subtraction
- Dot product calculation
- Dimension compatibility check
- Result display method

FOLDER STRUCTURE
experiment-4/
    src/
        Main.java
        Vectors.java
        VectorException.java
    README.txt

HOW TO COMPILE
javac src/*.java

HOW TO RUN
java Main

EXPECTED OUTPUT

- Valid 2D or 3D vectors are created
- Invalid dimensions throw VectorException
- Addition, subtraction, and dot product results are displayed

AUTHOR
Aman Saxena
AIML - A2
24070126030