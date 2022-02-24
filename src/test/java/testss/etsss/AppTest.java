package testss.etsss;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    
    @Test
    public void testDoFizzBuzz_NumberDivisibleBy3_ShouldReturnFizz() {
    	// Arrange
    	int nombre = 9;
    	FizzBuzz fb = new FizzBuzz();
    	String expectedOutput = "Fizz";
    	
    	// Act
    	String result  = fb.doFizzBuzz(nombre);
    	
    	// Assert
    	Assert.assertEquals(expectedOutput, result);
    }
    
    @Test
    public void testDoFizzBuzz_NumberDivisibleBy5_ShouldReturnBuzz() {
    	// Arrange
    	int nombre = 25;
    	FizzBuzz fb = new FizzBuzz();
    	String expectedOutput = "Buzz";
    	
    	// Act
    	String result  = fb.doFizzBuzz(nombre);
    	
    	// Assert
    	Assert.assertEquals(expectedOutput, result);
    }
    
    @Test
    public void testDoFizzBuzz_NumberDivisbleBy3And5_ShouldReturnFizzBuzz() {
    	// Arrange
    	int nombre = 15;
    	FizzBuzz fb = new FizzBuzz();
    	String expectedOutput = "FizzBuzz";
    	
    	// Act
    	String result  = fb.doFizzBuzz(nombre);
    	
    	// Assert
    	Assert.assertEquals(expectedOutput, result);
    }
    
    @Test
    public void testDoFizzBuzz_NumberNonDivisbleBy3Nor5_ShouldReturnNumber() {
    	// Arrange
    	int nombre = 7;
    	FizzBuzz fb = new FizzBuzz();
    	String expectedOutput = "7";
    	
    	// Act
    	String result  = fb.doFizzBuzz(nombre);
    	
    	// Assert
    	Assert.assertEquals(expectedOutput, result);
    }
}
