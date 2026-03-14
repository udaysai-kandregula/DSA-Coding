// 15. Classify a triangle as equilateral, isosceles, or scalene.

// key note
// equilateral means all sides are equal;
// isosceles means any two sides are equal;
// scalene means no sides are equal;

import java.util.Scanner;
class TypeOfTriangle{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your value here : ");
        int a = sc.nextInt();
        System.out.print("Enter your value here : ");
        int b = sc.nextInt();
        System.out.print("Enter your value here : ");
        int c = sc.nextInt();
        // checing 
        boolean i = c+b > a;
        boolean j = a+c > b;
        boolean k = a+b > c;
        if(i!= j || j != k){
            System.out.println("Trinangle is not valid based on sides ");
        }else{
        // main conditions 
            if(a == b && c == b ){
                System.out.println("The given Triangle is Equilateral ");
            }
            else if (a == b || b == c || c == a){
                System.out.println("The given Triangle is Isosceles ");
             }
            else{
                System.out.println("The given Triangle is Scalene ");
            }
        } 
    }
}