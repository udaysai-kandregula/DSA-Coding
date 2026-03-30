// 67. Check if a number is a palindrome.

// import java.util.Scanner;
class Palandrome{
    public static void main(String [] args){
        int num = 101;
        int temp = num;
        int rev = 0;
        while(temp > 0){
            int d = temp % 10;
            rev = rev*10 + d;
            temp /= 10;
        }
        System.out.println((rev == num ? "Palindrome number ": "Not a palindrome Number"));
    } 
}