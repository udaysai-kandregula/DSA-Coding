// 2. Determine if an integer is even or odd.

import java.util.Scanner;
class EvenOdd{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int num = sc.nextInt();
        if(num % 2 == 0){
            System.out.println("Even Number");
        }
        else{
            System.out.println("Odd Number");
        }
        
    }
}