public class SmallMathApp{

    static int firstNumber = 40;
    static int secondNumber = 10;

    public static double mathOperations(char operation){
        switch(operation){
            case '+': return addition(firstNumber, secondNumber);
            case '*': return multiply(firstNumber, secondNumber);
            case '-': return subtract(firstNumber, secondNumber);
            case '/': return division (firstNumber, secondNumber);
            default : 
                     throw new IllegalArgumentException("Enter valid operator");    
}       
             }      
    
    public static int multiply(int firstNumber, int secondNumber){
        return firstNumber * secondNumber;

    }
    
    public static int subtract(int firstNumber, int secondNumber){
        return firstNumber - secondNumber;


    }

    public static int addition(int firstNumber, int secondNumber){
        return firstNumber + secondNumber;


    }

    public static double division(double firstNumber, double secondNumber){
        if(firstNumber == 0) throw new ArithmeticException("invalid!!");
    
        return firstNumber / secondNumber;


    }

    

}
