import java.util.Scanner;

public class Mystatus{
   
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);



      System.out.println("Enter your name :");
      String name = input.nextLine();
      
      System.out.println("Enter your age:");
      int age = input.nextInt();
      
      System.out.printf("I am %s and i am %d years old %n", name, age);

       
   

  
  }

}
