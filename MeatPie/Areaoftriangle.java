import java.util.Scanner;

public class Areaoftriangle{
   
   public static void main(String[] args){
    
         Scanner input = new Scanner(System.in);

         System.out.println("Enter base:");
         double myBase= input.nextDouble();

         System.out.println("Enter height:");
         double myHeight= input.nextDouble();

         double myAreaotriangle = (myBase * myHeight) / 2 ;



         System.out.println("The Area of triangle is: " + myAreaotriangle);

 
    
   }


}
