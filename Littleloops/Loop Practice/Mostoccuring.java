public class Mostoccuring{

    public static  void main(String[] args){
    
        int [] array = {2,5,5,2,2,3,6,2,9};
        
        int temp = 0;
        
            for(int count = 0; count < array.length; count++){
            int dog = 0;
            
                for(int index = 0; index < array.length; index++){
                
                
                if(array[count] == array[index]){
                    dog++;
                    if(temp < dog){
                    temp =dog;
                    
                    }
                
                }
                }
              
            
            
            }
    
      
                System.out.println(temp);
    
    }


}
