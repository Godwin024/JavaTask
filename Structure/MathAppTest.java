import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class MathAppTest{
    MathApp myCalMathApp = new MathApp();
    

    @Test
    public void testThatTheAdditionOperatorIsAccurate(){
        char operation = '+';
        int firstNumber = 40;
        int secondNumber = 10;
        int expected = 50;
        int actual = myCalMathApp.addition(firstNumber,secondNumber);
        assertEquals(expected,actual);  

    }


    @Test
    public void testThatTheMultipleOfTwoNumberIsAccurate(){
        char operation = '*';
        int firstNumber = 40;
        int secondNumber = 10;
        int expected = 400;
        int actual = myCalMathApp.multiply(firstNumber,secondNumber);
        assertEquals(expected,actual);  

    }


    @Test
    public void testThatTheSubtractionOfTwoNumberIsAccurate(){
        char operation = '-';
        int firstNumber = 40;
        int secondNumber = 10;
        int expected = 30;
        int actual = myCalMathApp.subtract(firstNumber,secondNumber);
        assertEquals(expected,actual);  

    }


    @Test
    public void testThatTheDivisionOfTwoNumberIsAccurate(){
        char operation = '/';
        double firstNumber = 40;
        double secondNumber = 10;
        double expected = 4.0;
        double actual = myCalMathApp.division(firstNumber,secondNumber);
        assertEquals(expected,actual);  

    }

    @Test
    public void testThatTheOperationIsAccurate(){
        char operation = '?';
        assertThrows(IllegalArgumentException.class, () -> myCalMathApp.mathOperations(operation));  

    }

    @Test
    public void testThatTheMultipleofTwoNumbersisAccurate(){
        int firstNumber = 4;
        int secondNumber = 2;
        int expected = 8;
        int actual = myCalMathApp.multiply(firstNumber,secondNumber);
        assertEquals(expected,actual);  

    }

    @Test
    public void testThatTheSubstractionOfTwoNumbersisAccurate(){
        int firstNumber = 4;
        int secondNumber = 2;
        int expected = 2;
        int actual = myCalMathApp.subtract(firstNumber,secondNumber);
        assertEquals(expected,actual);

    }

    @Test
    public void testThatTheAdditionOfTwoNumbersisAccurate(){
        int firstNumber = 4;
        int secondNumber = 2;
        int expected = 6;
        int actual = myCalMathApp.addition(firstNumber,secondNumber);
        assertEquals(expected,actual);

    }

    @Test
    public void testThatTheDivisionOfTwoNumbersisAccurate(){
        double firstNumber = 4;
        double secondNumber = 2;
        double expected = 2;
        double actual = myCalMathApp.division(firstNumber,secondNumber);
        assertEquals(expected,actual);

    }
    @Test
    public void testThatTheFirstNumberisNotZeroIsAccurate(){
        double firstNumber = 0;
        double secondNumber = 10;
        assertThrows(ArithmeticException.class, () -> myCalMathApp.division(firstNumber, secondNumber));  

    }




}
