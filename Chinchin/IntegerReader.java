import java.util.Scanner;

public class IntegerReader{

  public static void main(String[] args){
    Scanner input = new Scanner(System.in);


      System.out.println("Enter your first Integer:");
       double firstInt = input.nextDouble();


        System.out.println("Enter your second Integer:");
         double secondInt = input.nextDouble();

if (secondInt == 0){
System.out.print("Error!!");
}

else{
double handleFirstandSecondInt =firstInt / secondInt;

    System.out.println("your answer is:\n" + handleFirstandSecondInt);
}













}





}
