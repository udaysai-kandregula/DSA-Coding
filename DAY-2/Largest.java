// 5. Take 2 numbers as input and print the largest.

import java.util.Scanner;
class Largest{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println((a > b ? "a is big " + a  : "b is big " + b));
    }
}



// TC = O(1);
// SC = O(1);