import java.util.Scanner;

public class LengthOfTriangleReader{

   public static void main(String[] args){
      Scanner input = new Scanner(System.in);
 
       System.out.println("Enter the length of the Triangle: ");
         double lengthOftriangle = input.nextDouble();


         double theArearReader =  (Math.sqrt(3)/4) * Math.pow(lengthOftriangle, 2);
        
    System.out.println( "The area is :" + lengthOftriangle + theArearReader);


    }

}
