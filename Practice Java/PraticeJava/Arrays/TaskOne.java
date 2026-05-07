public class TaskOne{

    public static void main(String[] args){

    int [] numbers = {3, 5, 2, 1, 7, 8};

        System.out.println("Your even numbers are: " + evenNumber(numbers));
        
        System.out.println("Your odd numbers are: " + evenNumber(numbers));




         }

    public static int evenNumber(int [] numbers){
        
            int noOfEvenNumber = 0;
            
            for(int index = 0; index < numbers.length; index++){
                if(numbers[index] %2 == 0){
                    noOfEvenNumber++;
               }

            }
           return noOfEvenNumber;
        }

    public static int oddNumber(int [] numbers){

            int noOfOddnumbers = 0;

            for(int index = 0; index < numbers.length; index++){
                
                if(numbers[index] %2 != 0){
                    noOfOddnumbers++;

                }

        }
            return noOfOddnumbers;


        }



    }
