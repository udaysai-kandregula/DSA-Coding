// 8. Check if an alphabet is a vowel or consonant.
import java.util.Scanner;
class VowelOrConsonant{
     public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int count = 0;
        System.out.print("Enter your number : ");
        String s = "aeiou";
        char ch = sc.next().charAt(0);
        ch = Character.toLowerCase(ch);
        for( char c : s.toCharArray()){
            if(ch == c){
                count++;
            }
        }
        System.out.println((count > 0 ?"Vowel":"Consonant"));
     }
}
