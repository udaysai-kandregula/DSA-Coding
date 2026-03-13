// 13. Check if a triangle is valid based on angles.

import java.util.Scanner;
class ValidTriangle{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your first angle here  : ");
        int a = sc.nextInt();
        System.out.print("Enter your second angle here  : ");
        int b = sc.nextInt();
        System.out.print("Enter your third angle here  : ");
        int c = sc.nextInt();
        System.out.println((a+b+c == 180 ? "Valid" : "Not valid"));
    }
}