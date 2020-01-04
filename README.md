# Java Christmas Tasks

**The Task:** to test if the FizzBuzz Code works according to the program requirements and to fix the code so that it does.

## Requirements of the FizzBuzz Program 

1. Returns a list of strings
2. Accepts a list of integers
3. Returns "Fizz" for multiples of 3 (but not 5)
4. Returns "Buzz" for multiples of 5 (but not 3)
5. Return "FizzBuzz" for multiples of both 3 and 5 (ie. multiples of 15)
6. Returns the number (as a string) otherwise


## Tests needed: 

1. using the divisibleBy method in the code, divisibleBy(4,2) should return true
2. divisibleBy(3,2) should return false
3. fizzBuzzGenerator(1,15) should return ["1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "buzz", "11", "Fizz", "13", "14", "FizzBuzz"] meaning that when 15 is input as the last element in the generator, that should indeed be the last element it considers (and not 14)

## Tests

A Tests class whas created under the src folder (this is the folder that included the main and FizzBuzzGenerator classes as well) ensuring that the methods that needed to be tested could be called within the test class.
(Note that for this the divisibleBy method had to be changed to static).
The test class was created to be public. 

Within the Tests class, all individual tests were defined to be in the tests category using the @Test notataion (org.junit.Test was imported)

### The FourIsDivisibleByTwoTest() 

The first test checks if the divisibleBy method used by the FizzBuzzGenerator class returns true for divisibleBy(4,2) ie. that 4 is taken to be divisible by 2 as it should be.

This was done by using the Assert.assertTrue() method that checks if a boolean returns true. 
The boolean to be checked was then FizzBuzzGenerator.divisibleBy(4,2) (ie. the divisbleBy method from the FizzBuzzGenerator class with numerator 4 and denominator 2). 

### The ThreeIsNotDivisibleByTwoTest() 

The second test checks if the divisibleBy method used by the FizzBuzzGenerator class returns false for divisibleBy(3,2) ie. that 3 is taken to be NOT divisible by 2 as it should be.

This was done by using the Assert.assertFalse() method that checks if a boolean returns false. 
The boolean to be checked was then FizzBuzzGenerator.divisibleBy(3,2) (ie. the divisbleBy method from the FizzBuzzGenerator class with numerator 3 and denominator 2). 

### The fizzBuzzFirstFifteenTest() 

The last test checks if the actual elements returned are as expected between 1 and 15.   
   *this also checks if the actual list is the same length as the expected list  
   *and also that the entries in the list are strings
   *and if the above is correct, 15 returns "FizzBuzz"
   *numbers divisible by 3 and 5 return "Fizz" and "Buzz" repectively
   *and that the other numbers are left the same
   


## Next Step: 

Fix the code. 


## Rerun Tests

Once the code was fixed, rerun all the tests and repeat the whole process if necessary. 




