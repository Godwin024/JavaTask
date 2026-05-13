import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class ArrayFunctionTest{


    @Test
    public void testThatIHaveListOfNumberAndGetTheRange(){

    int [] numbers = {2,5,7,9,20};
    int expectedRangeNumber = 18;
    int actualRange = ArrayFunction.getRangeOf(numbers);
    assertEquals(actualRange, expectedRangeNumber);



        }





}
