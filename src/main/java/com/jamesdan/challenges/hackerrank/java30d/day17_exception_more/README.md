# Day 17: Exceptions - More Exceptions
Reference: https://www.hackerrank.com/challenges/30-more-exceptions/problem

### Objective
Yesterday's challenge taught you to manage exceptional situations by using try and catch blocks. In today's challenge, you will practice throwing and propagating an exception. Check out the Tutorial tab for learning materials and an instructional video.

### Task
Write a Calculator class with a single method: int power(int,int). The power method takes two integers,  and , as parameters and returns the integer result of . If either  or  is negative, then the method must throw an exception with the message: n and p should be non-negative.

Note: Do not use an access modifier (e.g.: public) in the declaration for your Calculator class.

### Input Format

Input from stdin is handled for you by the locked stub code in your editor. The first line contains an integer, , the number of test cases. Each of the  subsequent lines describes a test case in  space-separated integers that denote  and , respectively.

### Constraints

No Test Case will result in overflow for correctly written code.

### Output Format

Output to stdout is handled for you by the locked stub code in your editor. There are  lines of output, where each line contains the result of  as calculated by your Calculator class' power method.

### Sample Input

    4
    3 5
    2 4
    -1 -2
    -1 3 

### Sample Output

    243
    16
    n and p should be non-negative
    n and p should be non-negative

### Explanation

**_T = 4_**

**_T0 : 3_**: **_5_** and  are positive, so power returns the result of , which is .
</br>**_T0 : 2_**: **_4_** and  are positive, so power returns the result of =, which is .
</br>**_T2_**: Both inputs (**_-1_** and **_-2_**) are negative, so power throws an exception and  is printed.
</br>**_T3_**: One of the inputs () is negative, so power throws an exception and  is printed.