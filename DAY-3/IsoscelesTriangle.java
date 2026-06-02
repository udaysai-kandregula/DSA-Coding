// 4. Area of Isosceles Triangle


import java.util.Scanner;
class IsoscelesTriangle{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("H B : in this format only :");
        int l = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Area of Isosceles Triangle based on the Height  and base  is here : "+ (0.5 * l * b));
    }
}

// formula = 1/2 * base * height;

