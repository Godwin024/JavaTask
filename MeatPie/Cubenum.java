import java.util.Scanner;

public class Cubenum{
   
   public static void main(String[] args){
    
         Scanner input = new Scanner(System.in);

         System.out.println("Enter Number:");
         int cubeNum= input.nextInt();


         int cubeNumber= cubeNum * cubeNum *cubeNum;



         System.out.print("The cube number is:\n" + cubeNumber );

 
    
   }


}
