import java.util.Scanner;

public class BackToSender{

   public static void main(String[]args){

        Scanner inputCollector = new Scanner(System.in);
           System.out.println("Enter your collection rate: ");

            int userInput = inputCollector.nextInt();

      
    if(userInput < 50){
        System.out.println("Your daily wage is : "+ wage(userInput));   
    } else if(userInput <= 59){

        System.out.println("Your daily wage is :"+ wageLessThanFiftyNine(userInput) );
    } else if(userInput <= 69){

        System.out.println("Your daily wage is : " + wageLessThanSixtyNine(userInput));  
    }else if (userInput >= 70){

        System.out.println(" Your daily wages is : " + wageGreaterThanSeventy(userInput));  
    }
      
}
       

    public static int wage(int number){
    int riderWages = 0;
    if(number < 50){
      riderWages = number * 160 + 5000;
    }
     return riderWages;
    


}

    public static int wageLessThanFiftyNine(int secNumber){
    int secondWage = 0;
    if(secNumber <= 59){
    secondWage = secNumber * 200 + 5000;
    }
    return secondWage;
        
    }

    public static int wageLessThanSixtyNine(int thirdNumber){
    int thirdWage = 0;
    if (thirdNumber <= 69 ){
    thirdWage = thirdNumber * 250 + 5000;

    }
    return thirdWage;
    }


    public static int wageGreaterThanSeventy(int fourthNumber){
    int fourthWage = 0;
    if(fourthNumber >= 70){
    fourthWage = fourthNumber * 500 + 5000;
 
     }
      return fourthWage;
        }

}
