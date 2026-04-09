import java.util.Scanner;

public class PrintNum{
  
public static void main(String[] args){
  Scanner input = new Scanner(System.in);

   System.out.print("Enter your N digit:");
    
    int userInput = input.nextInt();

     for ( int count =1; count <= userInput; count++ ){
     System.out.println(count);
    
    }

  }

}
