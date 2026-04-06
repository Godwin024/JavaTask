import java.util.Scanner;

public class SubandGratuityReader{
  
 public static void main(String[] args){
  Scanner input = new Scanner(System.in);

    System.out.print("Enter your Subtotal:");
     double subtotal = input.nextDouble();

       System.out.print("Enter your Gratuity:");
         double gratuity = input.nextDouble();

double gratuityRate = gratuity * subtotal/ 100;
 double totalRate = gratuityRate + subtotal;


   System.out.println("Your gratuity rate is:" + gratuityRate);
   System.out.println("Your total rate is :" + totalRate);
 


}



}
