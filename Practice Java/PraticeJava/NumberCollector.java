import java.util.Scanner;


public class NumberCollector{

   public static void main(String[] args){

      Scanner input = new Scanner(System.in);
       
         System.out.println("Collect first Number:");
          int firstNum = input.nextInt();
          
           int largest = firstNum;

       System.out.println("Collect second number:");
           int secondNum = input.nextInt();

      if(secondNum > largest){
          largest = secondNum;
  
}
        System.out.println("Collect third number:");
          int thirdNum = input.nextInt();

    if (thirdNum >  largest){
           largest = thirdNum;

}
        System.out.println("Collecr fourth number:");
          int fourthNum = input.nextInt();

     if (fourthNum > largest){
          largest = fourthNum;

}
        System.out.println("Collect fifth number:");
          int fifthNum = input.nextInt();
   if (fifthNum > largest){
        largest = fifthNum;        
}

System.out.println("This is the largest number:" + largest);

}


}
