import java.util.Scanner;

public class NumberCollector{
    
    public static void main(String[] args){

    Scanner inputCollector = new Scanner(System.in);

         
        int sumAverage = 0;
        double average = 1;

         int count = 0;
    while(true){
        System.out.print("Enter a negative number to stop: ");
        int userinput = inputCollector.nextInt();
             count++;
              sumAverage += userinput;
        average = sumAverage / count;  
            if(userinput < 0){
             
         System.out.println("This is the average of positive number: " + average);               
    
            break;
    }

//             average = sumAverage / count;  
 
             
    }


   
    

}
          }
 
 

    



