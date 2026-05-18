public class MathApp{

     int firstNumber = 40;
    int secondNumber = 10;

    public double mathOperations(char operation){
        switch(operation){
            case '+': return addition(firstNumber, secondNumber);
            case '*': return multiply(firstNumber, secondNumber);
            case '-': return subtract(firstNumber, secondNumber);
            case '/': return division (firstNumber, secondNumber);
            default : 
                     throw new IllegalArgumentException("Enter valid operator");    
}       
             }      
    
    public  int multiply(int firstNumber, int secondNumber){
        return firstNumber * secondNumber;

    }
    
    public  int subtract(int firstNumber, int secondNumber){
        return firstNumber - secondNumber;


    }

    public  int addition(int firstNumber, int secondNumber){
        return firstNumber + secondNumber;


    }

    public  double division(double firstNumber, double secondNumber){
        if(firstNumber == 0) throw new ArithmeticException("invalid!!");
    
        return firstNumber / secondNumber;


    }

    

}
