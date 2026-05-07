import java.util.Scanner;
public class Ifelsestatement{
 
 public static void main(String[] args){

         Scanner input = new Scanner(System.in);
   System.out.println("Enter the number");
        int student = input.nextInt();

   int grade = student;
   if (grade >= 60){
System.out.println("passed");

}
else{
   System.out.println("Failed");

}
  
}
}
