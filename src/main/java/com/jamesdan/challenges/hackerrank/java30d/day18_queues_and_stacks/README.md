# Day 18: Queues and Stacks
Reference: https://www.hackerrank.com/challenges/30-queues-stacks/problem

### Objective
Welcome to Day 18! Today we're learning about Stacks and Queues. Check out the Tutorial tab for learning materials and an instructional video!

A palindrome is a word, phrase, number, or other sequence of characters which reads the same backwards and forwards. Can you determine if a given string, , is a palindrome?

To solve this challenge, we must first take each character in , enqueue it in a queue, and also push that same character onto a stack. Once that's done, we must dequeue the first character from the queue and pop the top character off the stack, then compare the two characters to see if they are the same; as long as the characters match, we continue dequeueing, popping, and comparing each character until our containers are empty (a non-match means  isn't a palindrome).

Write the following declarations and implementations:

    Two instance variables: one for your , and one for your .
    A void pushCharacter(char ch) method that pushes a character onto a stack.
    A void enqueueCharacter(char ch) method that enqueues a character in the  instance variable.
    A char popCharacter() method that pops and returns the character at the top of the  instance variable.
    A char dequeueCharacter() method that dequeues and returns the first character in the  instance variable.

### Input Format

You do not need to read anything from stdin. The locked stub code in your editor reads a single line containing string . It then calls the methods specified above to pass each character to your instance variables.

### Constraints

is composed of lowercase English letters.

### Output Format

You are not responsible for printing any output to stdout.
If your code is correctly written and  is a palindrome, the locked stub code will print ; otherwise, it will print

### Sample Input

    racecar

### Sample Output

    The word, racecar, is a palindrome. 