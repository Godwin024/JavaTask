import java.util.Scanner;

public class Sumnumber{
   
   public static void main(String[] args){
    
         Scanner input = new Scanner (System.in);

         System.out.println("Enter first number:");
         int firstNum = input.nextInt();


         System.out.println("Enter second number");
         int secondNum = input.nextInt();


         int sum = firstNum + secondNum;
         System.out.printf("The Result is %n%d%n", sum);

 
    
   }


}
