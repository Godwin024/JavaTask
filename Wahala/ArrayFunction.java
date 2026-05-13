

public class ArrayFunction{ 


public static int getRangeOf (int [] numbers) {

    int largest = numbers[0];

       for(int index= 0; index < numbers.length; index++){
        if (numbers[index] > largest) {
        largest = numbers[index];

        }
    }

    int smallest = numbers [0];

        for (int count = 0; count < numbers.length; count++) {
           if (numbers[count] < smallest) {
              smallest = numbers[count]; 
 
              } 
        
        }
    return largest - smallest;

 
    }

}

    
                
       


           





