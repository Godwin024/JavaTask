import java.util.Scanner;

public class Squarenum{
   
   public static void main(String[] args){
    
         Scanner input = new Scanner(System.in);

         System.out.println("Enter Number:");
         int squareNum= input.nextInt();


         int squarenum = squareNum * squareNum;



         System.out.print("The Square number is:\n" + squarenum );

 
    
   }


}
