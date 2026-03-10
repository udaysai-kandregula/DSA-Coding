// 5. Find the largest of three numbers.

import java.util.Scanner;
class LargestOfThree{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int a = sc.nextInt();
        System.out.print("Enter your number : ");
        int b = sc.nextInt();
        System.out.print("Enter your number : ");
        int c = sc.nextInt();
        if(a > b && a > c ){
            System.out.println("A is big " + a);
        }
        else if (b > a && b > c){
            System.out.println("B is big " + b);

        }
        else{
            System.out.println("C is big " + c);
        }    
    }
}