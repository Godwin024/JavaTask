import java.util.Scanner;

public class VolumeofTriangle{
  
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
     
     System.out.print("Enter the base Triangl:");
     double baseTriangle = input.nextDouble();
     
         System.out.print("Enter the height of Triangle:");
            double heightTriangle = input.nextDouble();
                 
             System.out.print("Enter the length of Triangle:");
               double lengthTriangle = input.nextDouble();

double volumeTriangle = (baseTriangle / 1/2) * heightTriangle * lengthTriangle;

  System.out.println("The Volume of the triangle is:" + volumeTriangle);


    }

}
