// 75. Check if a number is Prime.

import java.util.Scanner;
class PrimeNumber{
    static boolean checkPrime(int num){
        for(int i = 2 ; i <= num / 2 ; i++){
            if(num % i == 0){
                return false; // if it is true it divisiable by other number other than the 1 and itself so it not prime number
            }   
        }
        return true;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number here : ");
        int n =sc.nextInt();
        System.out.println((checkPrime(n) ? "Yes" : "NO"));
    }
}    