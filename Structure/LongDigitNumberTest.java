import org.junit.jupiter.api.Test;

import static  org.junit.jupiter.api.Assertions.*;

public class LongDigitNumberTest{

    @Test
    public void testTheSumOfTheInputNumber(){
        long number = 12345;
        long expected = 15;
        long actual = LongDigitNumber.sumDigits(number);
        assertEquals(expected, actual);




    }






}
