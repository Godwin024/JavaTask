import java.util.Scanner;

public class IfandElse{

    public static void main(String[] args){
      // System.out.println("Enter a number");
         
        Scanner inputCollector = new Scanner(System.in);
        
        int number = inputCollector.nextInt();
        while(number < 1 || number > 10){

        System.out.println("number is not between 1 and 10 " + number );
       // number++;
        number = inputCollector.nextInt();
        
      
            }
           
        System.out.println(number + "number is between 1 and 10");
        

    }

} 
