public class ReverseString{

    public static void main (String [] args){

        String word = "Programming";
        String reverseWord = "";
        char str;

        for(int count = word.length() -1; count >= 0; count--){
                str = word.charAt(count);
                reverseWord = str + reverseWord;
                 
            
        }
        System.out.println("here is your reversed string:" + reverseWord);

    }


}
