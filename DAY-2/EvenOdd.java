// 1. Write a program to print whether a number is even or odd — take input from the user.

import java.util.Scanner;
class EvenOdd{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println((num % 2 == 0 ? "Even number" : "Odd Number"));
    }
}

// TC = O(1);
// SC = O(1);