import java.util.Scanner;

public class PizzaWahala{

    public static void main(String[]args){
        
        Scanner inputCollector = new Scanner(System.in);
        String menuBar = """
                                          MENU BAR
                                             
                          Pizza Type     Number of Slices   Price per box

                            Sapa size            4            2,500
                                
                            Small Money          6            2,900

                            Big boys             8            4,000

                            Odogwu               12           5,200

                        """;

        System.out.println(menuBar);

                        
        System.out.println("Enter the number of guest: ");

        int userinput = inputCollector.nextInt();
        
        System.out.println("Enter your choice of  pizza type : ");
        int pizzaType = inputCollector.nextInt();

        System.out.println("Enter the  selected price of your pizza type: ");
        int pricePerbox = inputCollector.nextInt();


    }



}
