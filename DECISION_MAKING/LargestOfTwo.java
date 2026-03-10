// 4. Find the largest of two numbers.

import java.util.Scanner;
class LargestOfTwo{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int a = sc.nextInt();
        System.out.print("Enter your number : ");
        int b = sc.nextInt();
        if(a > b ){
            System.out.println("A is big " + a);
        }
        else{
            System.out.println("B is big " + b);
        }   
    }
}