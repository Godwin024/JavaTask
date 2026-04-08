import java.util.Scanner;

public class SimpleandComInterest{

   public static void main(String[] args){
    Scanner input = new Scanner(System.in);

     System.out.println("Enter Principle:");
      double princiPal = input.nextDouble();


       System.out.println("Enter Rate:");
         double rate = input.nextDouble();
       

           System.out.println("Enter time:");
             double time = input.nextDouble();


 double simpleInterst=  (princiPal * rate * time) / 100;

   double  compoundForm = princiPal * Math.pow((1 + rate/100),  time);
     double compountInterest = compoundForm -simpleInterst;

       System.out.println("Your Simple interest is : " + simpleInterst);
       System.out.println("Your Compound interest is : " + compountInterest);

   }


}
