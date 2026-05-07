//public class Arrays{
//
//    public static void main(String[] args){
//        
//  int [] number = {1,2,3,4,5,};
//
//
//            for(int count = 0; count < number.length; count ++){
//
//
//                 System.out.println(number[count]);
//
//        }
//
//   
//        for(int count : number){
//            System.out.println(count);
//
//        }
//
//            }
//
//}

import java.util.Random;

public class Arrays {
    public static void main(String[] args) {
        int[] numbers = new int[100];
        Random rand = new Random();

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(100); // 0 to 99
        }

        // print array
        for (int n : numbers) {
            System.out.println(n);
        }
    }
}
