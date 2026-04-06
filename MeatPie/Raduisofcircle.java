import java.util.Scanner;

public class Raduisofcircle{
   
   public static void main(String[] args){
    
         Scanner input = new Scanner(System.in);

         System.out.println("Enter the raduis of the circle:");
         double myRadius= input.nextDouble();

         

         double myAreaofraduis = Math.PI * myRadius * myRadius ;



         System.out.println("The Area of circle is: " + myAreaofraduis);

 
    
   }


}
