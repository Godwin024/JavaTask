import java.util.Scanner;

public static void main(String[] args){
   
  Scanner input = new Scanner(System.in);

    System.out.print("Enter your weight in pounds:");
    double weightinP = input.nextDouble();
       
      System.out.println();
      System.out.print("Enter your Height in inches:");
      double heightinI = input.nextDouble();

          System.out.println();
          double pounds = weightinP * 0.45359237;
            double inches = heightinI * 0.0254;

double totalBMI = pounds/ Math.pow(inches, 2);

System.out.println("Your BMI is:" + totalBMI);






}
