import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class BackToSenderTest{

    @Test
    public void testRidersWageLessThanFifty(){

    BackToSender riderWage = new BackToSender();

    int actual = 25;

    int delivery = riderWage.wage(actual);

    int expected = 9000;

    assertEquals(expected,delivery);

    }

    @Test
    public void testRidersWageLessThanFiftyNine(){

    BackToSender secondWage = new BackToSender();

    int actual = 59;

    int delivery = secondWage.wageLessThanFiftyNine(actual);

    int expected = 16800;

    assertEquals(expected,delivery);

    }

    @Test
    public void testRidersWageLessThanSixtyNine(){

    BackToSender thirdWage = new BackToSender();

    int actual = 69;

    int delivery = thirdWage.wageLessThanSixtyNine(actual);

    int expected = 22250;

    assertEquals(expected,delivery);

    }

    @Test
    public void testRidersWageGreaterThanSeventy(){

    BackToSender fourthWage = new BackToSender();

    int actual = 80;

    int delivery = fourthWage.wageGreaterThanSeventy(actual);

    int expected = 45000;

    assertEquals(expected,delivery);

    }





} 


