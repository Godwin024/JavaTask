public class StandardDeviation{

    public static void main (String[] args){
        

    }

    public static double addScores(int[] arrays){
        int sumArrays = 0;
        
        for(int number: arrays){
            sumArrays += number;      
        }
        return sumArrays;

      }

    public static double mean(int [] arrays){
        double mean = addScores(arrays) / arrays.length;
        return mean;

    }
        
    public static double meanDeviation(int [] arrays){
        double numbers = 0;
        double total = 0;
        
        for(int count : arrays){
            numbers =(count - mean(arrays)) *(count - mean(arrays));
            total += numbers;

        }
        return total;

    }
    
    public static double variance(int[] arrays){
        double variance = meanDeviation(arrays) / arrays.length;
        return variance;   
    }

    public static double standardDeviation(int [] arrays){
        double standardDeviation = Math.sqrt(variance(arrays));
        return standardDeviation;

    }


}
