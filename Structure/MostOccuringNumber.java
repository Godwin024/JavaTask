public class MostOccuringNumber {
    public static void main(String[] args){

        int[] numbers = {1,2,2,2,3};


        System.out.println("The most occuring number is" + mostOccured(numbers));
    }


    public static int mostOccured(int [] numbers){
            
            int uniqueCount = 0;

            for(int count = 0; count < numbers.length; count++) {
                     boolean tempNumber = true;

            for(int counter = 0; counter < count; counter++) {

                if(numbers[count] == numbers[counter]) {
                    tempNumber = false;
                    break;
                }
            }

            if(tempNumber) {
                uniqueCount++;
            }
        }    

    }
}

