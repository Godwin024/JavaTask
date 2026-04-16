import java.util.Scanner;

public class TaskFour{

   public static void main(String[] args){

     Scanner inputCollector = new Scanner (System.in);

     
        int sum = 0;
        int counter = 0;
        double average = 0;

         for(int count =1; count <=10; count++){
             System.out.print("Enter the score: ");
             int score= inputCollector.nextInt();
             if(count % 2 == 0){
                sum += score;
                counter++;

              }

         }

    
              average = sum / counter;
              
             System.out.println("Your sum: " + sum + " Your average score is: "+ average);

 

   }




}
