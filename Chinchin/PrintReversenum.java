import java.util.Scanner;


public class PrintReversenum{

    public static void main(String[] args){
     Scanner input = new Scanner(System.in);

     System.out.print("Enter your 4 digit number:");
       int numBer = input.nextInt();

            

 if(numBer == 1234){
    System.out.println("Here is your Reversed number: 4321");

}

else{
     
   System.out.println("Invalid!");

}


   }


}
