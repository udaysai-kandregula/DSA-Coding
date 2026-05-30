// 7. Print the Fibonacci Series up to n numbers.

import java.util.Scanner;
class FibonacciSeries{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0, b = 1, c = 0;
        System.out.print(a+ " " + b + " ");
        for(int i = 0 ; (i < n-2 && n > c); i++){
            c = a + b;
            System.out.print((c) + " ");
            a = b;
            b = c;
        }
        sc.close();
    }
}


