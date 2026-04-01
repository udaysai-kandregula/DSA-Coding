// 77. Find the sum of all Prime numbers between 1 and n.

import java.util.Scanner;
public class SumOfPrimes{
    public static int checkprime(int num){
        for(int i = 2 ; i <= num / 2 ; i++){
            if(num % i == 0){
                return 0;
            }
        }
        return num;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number ");
        int n = sc.nextInt();
        int sum=0;
        for(int i = 2 ; i <= n; i ++){
            int c = checkprime(i);
            if(c>0){
                System.out.print(c + " ");
                sum += c;
            }
        }
        System.out.println("\n\nsum of  prime number is : " + sum);
    }
}