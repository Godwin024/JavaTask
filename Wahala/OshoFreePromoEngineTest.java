import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class OshoFreePromoEngineTest {

    @Test
        public void TestThatOshoFreePromoEngineExists(){
                OshoFreePromoEngine.calPercentDiscount(4000 , "StarTER");
        }

    @Test
        public void TestThatAllCaseIsAccepted(){
                double expected = 5400.0;
                double actual = OshoFreePromoEngine.calPercentDiscount(6000 , "StarTER10");
                assertEquals(expected , actual);
        }

    @Test
        public void TestThatTheInvalidAmount(){
                double expected = 0.0;
                double actual = OshoFreePromoEngine.calPercentDiscount(-4000 , "StarTER10");
                assertEquals(expected , actual);
        }

    @Test
        public void TestThatCartTotalIsEqualTo5000WithoutPromoCodeRequired(){
                double expected = 5000.0;
                double actual = OshoFreePromoEngine.calPercentDiscount(5000 , "FakecCODE18");
                assertEquals(expected , actual);
        }

    @Test
        public void TestThatCartTotalIsEqualTo5000WithTheAccuratePromoCodeRequired(){
                double expected = 4500.0;
                double actual = OshoFreePromoEngine.calPercentDiscount(5000 , "StARTER10");
                assertEquals(expected , actual);
        }

    @Test
        public void TestThatCartTotalIsEqualTo15000WithoutTheAccuratePromoCode(){
                double expected = 15000.0;
                double actual = OshoFreePromoEngine.calPercentDiscount(15000 , "Rtdgd19");
                assertEquals(expected , actual);
        }

    @Test
        public void TestThatCartTotalIsEqualTo15000WithTheAccuratePromoCode(){
                double expected = 12000.0;
                double actual = OshoFreePromoEngine.calPercentDiscount(15000 , "BIGBOY20");
                assertEquals(expected , actual);
        }

    @Test
        public void TestThatCartTotalIsEqualTo30000WithoutPAccuratePromoCodeRequired(){
                double expected = 30000.0;
                double actual = OshoFreePromoEngine.calPercentDiscount(30000 , "BIGBOY20");
                assertEquals(expected , actual);
        }

    @Test
        public void TestThatCartTotalIsEqualTo30000WithTheAccuratePromoCodeRequired(){
                double expected = 19500.0;
                double actual = OshoFreePromoEngine.calPercentDiscount(30000 , "OSHOFREE35");
                assertEquals(expected , actual);
        }
    
}




