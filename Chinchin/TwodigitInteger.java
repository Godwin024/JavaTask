import java.util.Scanner;

public class TwodigitInteger{
 
  public static void main(String[] args){
   
   Scanner input = new Scanner(System.in);
    

      System.out.print("Enter two digit:");
       int enterDigit = input.nextInt();

    int tenNum =  enterDigit /10;
 int unitMode = enterDigit % 10;

System.out.println(" The tent number is: " + tenNum);
System.out.println("The unit number is:" + unitMode);

if(tenNum > unitMode && tenNum == unitMode){

  System.out.print("The tens digit is greater than unit");
 

} 

else{

System.out.println("The unit is greater than the tens digit");


}



  }


}
