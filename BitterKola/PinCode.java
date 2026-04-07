import java.util.Scanner;

public class PinCode{

 public static void main(String[] args){
    Scanner input = new Scanner(System.in);

     System.out.println("Enter your  4 digit PIN:");
       int pinCodenum = input.nextInt();



if (pinCodenum >= 1000 && pinCodenum <= 9999){
System.out.println("Valid Pin");
 
}

else{

System.out.println("invalid Pin");

}












 


  }

}
