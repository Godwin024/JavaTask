import java.util.Scanner;

public class VolumeofCylinderCal{

 public static void main(String[] args){

    Scanner input = new Scanner(System.in);


     System.out.println("Enter raduis:");
      double  theRaduis = input.nextDouble();

     
        System.out.println("Enter height");
          double theHeight = input.nextDouble();

 double volume = Math.PI * Math.pow(theRaduis, 2) * theHeight;
 double  surfaceArea = (2 * Math.PI * Math.pow(theRaduis, 1) * theHeight)  + (2 * Math.PI * Math.pow(theRaduis, 2)) ;

System.out.println("The Cylinder Volume is:" + volume);
System.out.println("The Surface area is:" + surfaceArea);


     }


}
