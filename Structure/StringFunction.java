public class StringFunction{
    
    public static void main(String[] args){

        String [] name = {"Character"};

        System.out.println("Length of name: " + characterLength(name) );



        }

    public static String characterLength(String []name){

        int lengthName = 0;

        for(int index = 0; index < name.length; index++){
            if(name [index] < name.length){
                lengthName++;                

            }
       
      }
            System.out.println(lengthName);

        }



}
