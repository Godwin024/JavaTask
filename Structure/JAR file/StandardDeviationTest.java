import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;



public class StandardDeviationTest{

    @Test
    public void testThatTheStandardDeviationExist(){
        int [] arrays = {2,3,4,5,6};
        StandardDeviation.addScores(arrays);
   
   
    }

    @Test
    public void testThatTheStandardDeviationSumOfArrayIsAccurate(){
        int [] arrays = {2,3,4,5,6};
        double expected = 20;
        double actual = StandardDeviation.addScores(arrays);
        assertEquals(actual, expected);
   
    }

    @Test
    public void testThatGetMeanOfTheStandardDeviationIsAccurate(){
        int [] arrays = {2,3,4,5,6};
        double expected = 4;
        double actual = StandardDeviation.mean(arrays);
        assertEquals(actual, expected);
   
    }

   @Test
    public void testThatGetMeanDeviationOfTheStandardDeviationIsAccurate(){
        int [] arrays = {2,3,4,5,6};
        double expected = 10;
        double actual = StandardDeviation.meanDeviation(arrays);
        assertEquals(actual, expected);
   
    }

   @Test
    public void testThatGetVarianceOfTheStandardDeviationIsAccurate(){
        int [] arrays = {2,3,4,5,6};
        double expected = 2;
        double actual = StandardDeviation.variance(arrays);
        assertEquals(actual, expected);
   
    }

   @Test
    public void testThatGetStandardDeviationIsAccurate(){
        int [] arrays = {2,3,4,5,6};
        double expected = 1.414213562373095;
        double actual = StandardDeviation.standardDeviation(arrays);
        assertEquals(actual, expected);
   
    }



}
