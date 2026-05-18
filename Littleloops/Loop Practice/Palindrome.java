import java.util.Scanner;

public class Palindrome{

    public static void main(String [] args){
    
    Scanner input = new Scanner(System.in);
    
    System.out.println("Enter your string: ");
    
    String enter = input.nextLine();
    
    int count = 0;
    
    int word = enter.length() -1;
    
    boolean isPalindrome = true;
    
    while(count < word){
    
    if(enter.charAt(count) != enter.charAt(word)){
    
        isPalindrome = false;
         break;
    }
    count++;
    word--;
   
    
    }
    if(isPalindrome){
    System.out.println("is a palindrome" + isPalindrome);
    
    }else{
        System.out.println("is not a palindrome" + isPalindrome);
    
    
    }
    
    
    

    
    
    
    
    
    }



}
