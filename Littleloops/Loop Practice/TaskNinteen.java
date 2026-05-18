import java.util.Scanner;
public class TaskNinteen{

    public static void main(String[] args){
     
    Scanner input = new Scanner(System.in);
    
    System.out.println("Enter your digit: ");
    int userInput = input.nextInt();
    
    int largest = userInput;
    
    for(int count = 2; count <=5; count++){
    
          System.out.printf("Enter your digit %d: ", count);
          userInput = input.nextInt();
          
          if(largest < userInput){
          largest = userInput;
          }
          
    
    
        }
        System.out.println("The largest number is: " + largest);
    
    
    
    
    }



}
