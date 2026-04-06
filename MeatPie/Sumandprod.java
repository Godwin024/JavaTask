import java.util.Scanner;

public class Sumandprod{
   
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);



      System.out.print("Enter first number?");
      int firstNum = input.nextInt();
      
      System.out.print("Enter second number?");
      int secondNum= input.nextInt();

      int sumNum= firstNum + secondNum;
      int productNum  = firstNum * secondNum;
      
      System.out.print( "The sum is:" + sumNum);
      System.out.print("The product is:" + productNum);

       
   

  
  }

}
