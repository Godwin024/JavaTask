public class LoopNumbers{

    public static void main (String... args){

        
        int count = 0;
        while (count <=100){
            
            if (count %2 == 0){
                 System.out.println(count + "Hello");
                               
            } else if(count %2 == 1){

             System.out.println(count + "Buzz");
       
            }
                
                      
            count++;
        }


    }


}
