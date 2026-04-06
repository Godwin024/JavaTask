import java.util.Scanner;

public class MeterToFeetConverter{
 
     public static void main (String[] args){
 
         Scanner input = new Scanner(System.in);


                System.out.print("Enter your meter:");
                       double  myMeter =input.nextDouble();
     
                             double myFeet = myMeter * 3.2786;

                                System.out.println("You have reached:" + myMeter + myFeet + "Feets");
  



   }

}
