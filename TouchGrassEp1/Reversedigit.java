import java.util.Scanner;

public class Reversedigit {

    public static void main(String[] args) {
 
     Scanner inputCollector = new Scanner(System.in);
   
    System.out.print("Enter an integer : ");
   int digitnum = inputCollector.nextInt();
    

 while (digitnum > 0) {
  int lastDigit = digitnum % 10;
  
 System.out.print(lastDigit);
 
   digitnum /=  10; 

        }
    }
}
