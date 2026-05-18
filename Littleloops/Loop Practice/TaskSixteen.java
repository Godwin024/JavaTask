import java.util.Scanner;

public class TaskSixteen{

    public static void main(String[] args){

        Scanner input = new Scanner (System.in);

        System.out.println("Enter your password: ");
        String userInput = input.nextLine();


        while(!userInput.equals ("password")){

        System.out.println("Enter your password: ");
        userInput = input.nextLine();

            

        
            }
            System.out.println("This is the correct password: ");
        }


}
