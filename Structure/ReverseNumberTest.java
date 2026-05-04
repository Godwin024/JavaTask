import org.junit.jupiter.api.Test;

import static  org.junit.jupiter.api.Assertions.*;


public class ReverseNumberTest{

    @Test
    public void testThatTheNumberIsReversed(){
        int number = 12345;
        int expected = 54321;
        int actual = ReverseNumber.reverseDigits(number);
        assertEquals(expected, actual);




        }






} 
