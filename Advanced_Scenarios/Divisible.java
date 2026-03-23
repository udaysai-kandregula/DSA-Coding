// 35. Check if a number is a multiple of both 3 and 7.

import java.util.Scanner;
class Divisible{
    public static void main(String [] args){
        System.out.print("Enter your value : " );
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println((num % 3 == 0 && num % 7 == 0) ? "It is a multiple of both 3 & 7" : "It is not multiple of 3 & 7 ");
    }
}