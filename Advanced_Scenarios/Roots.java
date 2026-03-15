// 16. Find all roots of a quadratic equation.

import java.util.Scanner;
// import java.lang.Math.sqrt;
class Roots{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your x square value : ");
        int a = sc.nextInt();
        System.out.print("Enter your x value here : ");
        int b = sc.nextInt();
        System.out.print("Enter your constant value here : ");
        int c = sc.nextInt();
        int d = b*b-(4*a*c);
        // System.out.println(d);
        if(d > 0){
            System.out.println("Roots are real ");
            System.out.println("Root1 : " + (-b  + Math.sqrt(d))/(2*a) );
            System.out.println("Root2 : " + (-b - Math.sqrt(d))/(2*a));
        }else if( d == 0){
            System.out.print("Roots are equal : ");
            System.out.println(-b / (2 * a ));
        }else{
            System.out.println("No real roots : ");
            double real = -b / (2 * a);
            double img  = Math.sqrt(Math.abs(d) / (2 * a));
            System.out.println("Root1 " +real+ "+"+img);
            System.out.println("Root1 " +real+ "-"+img);
        }
    }
}