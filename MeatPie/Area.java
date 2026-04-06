import java.util.Scanner;

public class Area{
   
   public static void main(String[] args){
    
         Scanner input = new Scanner(System.in);

         System.out.println("Enter lenght:");
         double myLenght= input.nextDouble();

         System.out.println("Enter width:");
         double myWidth = input.nextDouble();

         double myArea = myLenght * myWidth;



         System.out.println("The Area is: " + myArea);

 
    
   }


}
