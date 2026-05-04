import java.util.Scanner;

public class LongDigitNumber{

    public static void main(String[] args){

        Scanner inputCollector = new Scanner(System.in);
        
        System.out.println("Enter your number: ");
        long number = inputCollector.nextLong();

        long total = sumDigits(number);

        System.out.println("Total sum digit is: " + total);    


    }

     public static long sumDigits(long number){
               long sumOfNumber = 0;
                
            while(number != 0){

                sumOfNumber += number %10;
                number /= 10;

               
                }

                return sumOfNumber;
        
            }


}
