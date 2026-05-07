import java.util.Scanner;

public class Method{

    public static void main(String[] args){
        System.out.println("Enter a number");
        
        Scanner inputCollector = new Scanner(System.in);
        int number = inputCollector.nextInt();

        if (number % 2 == 0)
                System.out.println("even number");

        if(number % 2 == 1)
                System.out.println("odd number");
         


            

   

    }

} 
