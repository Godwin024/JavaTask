import java.util.Scanner;

public class TaskOne{

    public static void main(String[] args){

        Scanner inputCollector = new Scanner(System.in);
        System.out.println("Enter your numbers");

        int scores = inputCollector.nextInt();

        int[] arrays = new int[11];
            

        for(int count = 1; count < arrays.length; count++ ){
             System.out.println("Enter your score: ");
                scores = inputCollector.nextInt();
                              
                 arrays[count] = scores;
              System.out.println(count);


        }
        

    }


}
