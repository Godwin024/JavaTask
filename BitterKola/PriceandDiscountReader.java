import java.util.Scanner;

public class PriceandDiscountReader{
   public static void main(String[] args){
     Scanner input = new Scanner(System.in);


   System.out.println("Enter the price:");
     double enterPrice = input.nextDouble();


        System.out.println("Ente the discount price in %:");
          double discountPrice = input.nextDouble();

 

double handleValue = enterPrice * (discountPrice/100);
     double finalAmount = enterPrice - handleValue;
      System.out.println("Your final amount is:" + finalAmount);








}


}
