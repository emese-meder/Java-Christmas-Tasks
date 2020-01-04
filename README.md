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
3. fizzBuzzGenerator(1,15) should return the correct elements

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

* this also checks if the actual list is the same length as the expected list  
* and also that the entries in the list are strings
* and if the above is correct, 15 returns "FizzBuzz"
* numbers divisible by 3 and 5 return "Fizz" and "Buzz" repectively
* and that the other numbers are left the same

The Assert.assertArrayEquals(expected array ,actual array) method was used

The expected list is ["1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz"]. This was entered as a new String array to the method above. 

The actual array was then the one created by the FizzBuzz metod (calling at the FizzBuzzGenerator class) with startNumber 1 and endNumber 15. As this method created a list, this was converted to an array using .to Array()
   

## Testing the Code: 

The next step is then to run the tests and fix the code based on them. Then run the test again and repeat if necessary. 

The The FourIsDivisibleByTwoTest() failed at first, meaning that the divisibleBy method was incorrect. 

The test has passed after changing the return statement in the divisbleBy method:

   return numerator % Denominator == 2; 
   
to be:

   return numerator % Denominator == 0; 

The ThreeIsNotDivisibleByTwoTest() passed both times. 

The The fizzBuzzFirstFifteenTest() displayed the following msg on the first run:
java.lang.AssertionError: array lengths differed, expected.length=15 actual.length=14

This was fixed by changing the second parameter in the for loop in the Java class FizzBuzz method to be

i<=endNumber

instead of 

i<endNumber. 

Running a test again revailed that while the first 2 elements matched, the first one where it differed was element [2] (the 3rd one). While it should have returned "Fizz", the actual value returned was "FizzBuzz". 

This was fixed by the logical operator in the for loop in the Java class FizzBuzz method from || to &. This is an AND operator that only returns true if both sides are true. 

& was used instead of && because & evaluates both sides at the same time while && checks the second statement only if teh first is true.  While in this situation this would deliver the same result, it makes more sense to treat the two conditions (divisible by 3 and 5) equally. 

After rerunning the test this time element [4] returned "Buz" instead if the expected "Buzz". This is a simple spelling mistake that was quickly fixed. 

All three tests have passed after this. 








