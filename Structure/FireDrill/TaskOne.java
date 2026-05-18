import java.util.Scanner;
import java.util.Arrays;
public class TaskOne{

        
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args){

       int [] myNumber = {23,45,67,45,32,11,22, 45};

       int [] numbers = taskSix(myNumber);
        System.out.println(Arrays.toString(numbers));

    }
        
    public static int [] taskOne(){

        int [] numbers = new int [10];
        for(int index = 0; index < 10; index++){
            System.out.println("Enter your number: ");
            int number = input.nextInt();
            
            numbers[index] = number;
        }
        return numbers;
    }   
    
    public static int[] taskTwo(int [] numbers){

    int [] newNumbers =  numbers.clone();
    for(int index = 0; index < numbers.length /2; index++){

        int tempNumber = newNumbers[index];
        
        newNumbers[index] = newNumbers[numbers.length -1 - index];
        newNumbers[numbers.length -1-index] = tempNumber;

            }
    
      return newNumbers;

        }   

    public static int [] taskSix(int[] numbers){
        int [] newNumbers = numbers.clone();

        for(int outerIndex = 0; outerIndex < newNumbers.length; outerIndex++){
            int smallest = newNumbers[outerIndex];
        
            for(int innerIndex = outerIndex +1; innerIndex < newNumbers.length; innerIndex++){

                if(newNumbers[innerIndex] < smallest){

                    
                    smallest = newNumbers[innerIndex];
                    newNumbers[innerIndex] = newNumbers[outerIndex];
                    newNumbers[outerIndex]  = smallest;

                }
            }

        }
        return newNumbers;
        
    
    }

}
