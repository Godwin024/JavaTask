import java.util.Scanner;

public class Miletokmconverter{
 
     public static void main (String[] args){
 
           Scanner input = new Scanner(System.in);


                 System.out.print("Enter your miles:");
                    double  myMiles =input.nextDouble();
     
                      double myKilometers = myMiles * 1.6;

           System.out.println("You have reached:" + myMiles + myKilometers + "Km");
  



}

}
