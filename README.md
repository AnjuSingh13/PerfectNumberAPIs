# PerfectNumberAPIs

This is a Java program to check if a number is perfect or not. It will also returns all perfect numbers in a given range of numbers.

This contains two REST APIs to serve the following operations:

1. Check if a given number is perfect
2. Find all perfect numbers between a range (start-end)

**Tools used **

Java 11.0.14
intellij
Postman


**Execution**

Run the application in intellij or suitable IDE or command line


There are two end-points available as follows:

{input}/10000/is-it-perfect - Check if a given number in "input" is a perfect number, example localhost:8080/10000/is-it-perfect
/is-it-perfect?start={start}&end={end} - Gets all perfect numbers with in the range, example localhost:8080/is-it-perfect?start=10&end=1000
Postman can be used to test

**Improvements **

There is scope of following improvments in program
1. Include error handling
2. Include authentication 
