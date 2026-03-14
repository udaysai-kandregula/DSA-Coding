// 14. Check if a triangle is valid based on sides.

import java.util.Scanner;
class SidesValid{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your value here : ");
        int a = sc.nextInt();
        System.out.print("Enter your value here : ");
        int b = sc.nextInt();
        System.out.print("Enter your value here : ");
        int c = sc.nextInt();
        boolean i = c+b > a;
        boolean j = a+c > b;
        boolean k = a+b > c;
        if(i== j && j == k){
            System.out.println("Triangle is valid bases on sides");
        }else{
            System.out.println("Trinangle is not valid based on sides ");
        }
    }
}

