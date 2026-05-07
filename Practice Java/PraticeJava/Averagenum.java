import java.util.Scanner;

public class TaskTwo{

   public static void main(String[] args){

     Scanner inputCollector = new Scanner (System.in);

     
        int sum = 0;
        int counter = 0;
        double average = 0;

         for(int count =1; count <=10; count++){
             System.out.println("Enter the score:" + count);

               int score= inputCollector.nextInt();
             sum += score;
             counter = counter+1;
             average = sum / counter;
               

     }

             System.out.println(" Your average score is:" + average);

 

   }




}
