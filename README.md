# Prime Number Checker
## Description

This program checks whether a given integer is a prime number or not.
A prime number is a number greater than 1 that has no divisors other than 1 and itself.

The program uses a simple algorithm with a slight optimization — instead of checking divisibility up to the number itself, it only checks up to the square root of the number, which makes it more efficient.

## How It Works

The program reads an integer input from the user.

If the number is less than or equal to 1, it is not prime.

Otherwise, the program checks divisibility of the number from 2 up to √num.

If any divisor is found, the number is not prime.

If no divisors are found, the number is prime.

Finally, it prints the result
```
# Compile
javac Practice.java

# Run
java Practice
```
