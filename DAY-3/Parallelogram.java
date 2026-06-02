// 5. Area of Parallelogram

import java.util.Scanner;
class Parallelogram{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("H B : in this format only :");
        int l = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Area of Parallelogram based on the Height  and base  is here : "+ (l * b));
    }
}

// formula = Height * Base 