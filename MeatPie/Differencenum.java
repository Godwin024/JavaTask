import java.util.Scanner;

public class Differencenum{
   
   public static void main(String[] args){
    
         Scanner inputCollector = new Scanner (System.in);

         System.out.println("Enter first number:");
         int firstNum = inputCollector.nextInt();


         System.out.println("Enter second number");
         int secondNum = inputCollector.nextInt();


         int diff= firstNum - secondNum;
         System.out.printf("The Result is %n%d%n", diff);

 
    
   }


}
