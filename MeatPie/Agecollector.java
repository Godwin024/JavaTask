import java.util.Scanner;

public class Agecollector{
 
 public static void main(String[] args){

   Scanner input = new Scanner(System.in);
   System.out.print("What's your Age?");
   
   int MyAge = input.nextInt();
   
//   System.out.println("Yo! \n your Age is" + MyAge); 
     System.out.printf("Yo! %n Your Age is %d %n", MyAge); 
  }

}
