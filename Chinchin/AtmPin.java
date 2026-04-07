import java.util.Scanner;

public class AtmPin{

  public static void main(String[] args){

     Scanner input =  new Scanner(System.in);
      

      System.out.print("Enter your Pin:");
        int  pinNumber  = input.nextInt();
         

        if (pinNumber == 1234){
System.out.print("Yor balance is $1000");

}

else{

System.out.print("Incorrect PIN");



      }
 


   }


}
