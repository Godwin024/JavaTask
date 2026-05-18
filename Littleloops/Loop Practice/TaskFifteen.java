import java.util.Scanner;
public class TaskFifteen{

    public static void main(String[] args){

    Scanner input = new Scanner(System.in);


    int count = 0;
    int sum = 0;

    while(count < 5){
        
    System.out.println("Enter your integer: ");
    int number = input.nextInt();
        
        sum += number;
        
            count++;

            }
        System.out.println(sum);
    


    }


}
