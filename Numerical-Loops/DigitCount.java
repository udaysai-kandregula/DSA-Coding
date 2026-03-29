// Find the frequency of each digit in an integer
import java.util.*;
class DigitCount{
    public static void main(String [] args){
        int num = 9866;
        HashMap <Integer,Integer> hashmap = new HashMap<>();
        while(num > 0){
            int d = num % 10;
            hashmap.put(d,hashmap.getOrDefault(d,0)+1);
            num /= 10;
        }
        System.out.println(hashmap);
    }
}