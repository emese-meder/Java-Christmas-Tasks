import org.junit.Assert;
import org.junit.Test;

public class Tests {

    //Test to see if the divisibleBy method returns true for 4/2
    @Test
    public void FourIsDivisibleByTwoTest()  {
        Assert.assertTrue( FizzBuzzGenerator.divisibleBy(4,2) );
        System.out.println("Test 1: The divisibleBy() method returns true for 4 is divisible by 2 as expected.");
    }

    //Test to see if the divisibleBy method returns false for 3/2
    @Test
    public void ThreeIsNotDivisibleByTwoTest()  {
        Assert.assertFalse( FizzBuzzGenerator.divisibleBy(3,2) );
        System.out.println("Test 2: The divisibleBy() method returns false for 3 is divisible by 2 as expected.");
    }

    //test to see if the first 15 elements are as expected
    //this checks if the actual list length matches the expected length as well
    //and also if the actual list contains strings as required
    @Test
    public void fizzBuzzFirstFifteenTest()  {
        FizzBuzzGenerator n = new FizzBuzzGenerator();
        String[] expectedArray = new String[] {"1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz"};
        Assert.assertArrayEquals(expectedArray, n.FizzBuzz(1,15).toArray());
        System.out.println("Test 3: The elements returned by the FizzBuzzGenerator() match the expected ones.");
    }
}
