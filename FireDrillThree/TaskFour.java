import java.util.Scanner;

public class TaskFour{

    public static void main(String[] args){

        Scanner inputCollector = new Scanner(System.in);
        System.out.println("Enter your numbers");

        int scores = inputCollector.nextInt();

        int[] arrays = new int[10];           

        for(int count = 0; count < arrays.length; count++ ){
             System.out.println("Enter your score: ");
                scores = inputCollector.nextInt();
                              
                 arrays[count] = scores;
        }

            for(int counter = 0; counter < arrays.length; counter++){
               // System.out.println(counter + ",  " + arrays[counter]  );

                      if(counter %2 == 0){
                System.out.println("Here is your even numbers: " + counter);

            }


          



        }


        int result = myArrays(score);
        System.out.println(result);

    }

        public static int
 

}
