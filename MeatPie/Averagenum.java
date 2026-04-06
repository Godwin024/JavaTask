import java.util.Scanner;

public class Averagenum{
   
   public static void main(String[] args){
    
         Scanner input = new Scanner(System.in);

         System.out.println("Enter first Number:");
         int firstNum= input.nextInt();


         System.out.println("Enter second Number:");
         int secNum= input.nextInt();

         System.out.println("Enter third Number:");
         int thirdNum= input.nextInt();
      
         int numbers = (firstNum + secNum + thirdNum) / 3;



         System.out.print("The average is: " + numbers);

 
    
   }

}
