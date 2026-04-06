import java.util.Scanner;

public class SquaremeterToPingConverter{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
    

        System.out.print("Enter square meter number:");
            double mySquaremeter = input.nextDouble();

                   double myPing = mySquaremeter * 0.3025;

                      System.out.println("Your Ping number is:" + mySquaremeter + myPing);



     }

}
