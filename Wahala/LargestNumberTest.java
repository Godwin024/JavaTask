import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LargestNumberTest{



    @Test 
    public void testTheSumOfTwoNumbers(){
        int firstNumber = 45;
        int secondNumber = 43;
        int expected = 88;
        int actual = LargestNumber.addition(firstNumber, secondNumber);
        assertEquals (expected, actual);

    }


    @Test
    public void testTheRemainderOftwoNumber(){
        int firstNumber = 45;
        int secondNumber = 43;
        int expected = 2;
        int actual = LargestNumber.substraction(firstNumber,secondNumber );
        assertEquals (expected,actual);


    }

    @Test
    public void testTheProductOfTwoNumber(){
        int firstNumber = 45;
        int secondNumber = 43;
        int expected = 1935;
        int actual = LargestNumber.productsNumber(firstNumber, secondNumber);
        assertEquals (expected, actual );


}
    

}
