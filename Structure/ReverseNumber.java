import java.util.Scanner;

public class ReverseNumber{

    public static void main(String[] args){

        Scanner inputCollector = new Scanner(System.in);
        System.out.println("Enter your integer: ");
        
        int number = inputCollector.nextInt();
        int reverseDigit = reverseDigits(number);

        System.out.println("Your reversed number is: " + reverseDigit);

                
    }

    public static int reverseDigits(int number){

        int reverse = 0;

        while(number != 0){
           int theDigit = number % 10;
            reverse = reverse * 10 + theDigit;
            number /= 10; 
            


        }
        return reverse;


            }


}
