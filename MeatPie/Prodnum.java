import java.util.Scanner;

public class Prodnum{
   
   public static void main(String[] args){
    
         Scanner input = new Scanner (System.in);

         System.out.println("Enter first number:");
         int firstNum = input.nextInt();


         System.out.println("Enter second number");
         int secondNum = input.nextInt();


         int prodNum= firstNum * secondNum;

         System.out.print("The Result is:\n" + prodNum);

 
    
   }


}
