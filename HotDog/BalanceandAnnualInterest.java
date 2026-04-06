import java.util.Scanner;

public class BalanceandAnnualInterest{
  
  public static void main(String[] args){
  Scanner input = new Scanner(System.in);
 
  
  System.out.println("Enter your balance:");
   double balance = input.nextDouble();

   
     System.out.println("Enter your annual interest: ");
       double annualInterest = input.nextDouble();
       
         annualInterest = annualInterest/ 100;

       
double monthlyInterest = balance *  (annualInterest /1200);

System.out.print("Your Monthly interest is $ :" + monthlyInterest);
 


   }


}
