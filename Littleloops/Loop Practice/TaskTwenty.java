import java.util.Scanner;

public class TaskTwenty{

    public static void main(String[] args){
    
    Scanner input = new Scanner(System.in);
    
    System.out.println("Enter your digit: ");
    int userInput = input.nextInt();
    
    int smallestNumber = userInput;
    
    for(int count = 2; count <= 5; count++){
    
      System.out.println("Enter your digit: ");
      userInput = input.nextInt();
      
      if(userInput < smallestNumber){
      smallestNumber = userInput;
      }
    
    
    
    
    }
    
    System.out.println("The smallest number is: " + smallestNumber);
    
    
    
    }


}
