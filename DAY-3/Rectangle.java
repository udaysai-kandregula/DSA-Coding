// 3. Area of Rectangle


import java.util.Scanner;
class Rectangle{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("L B : in this format only :");
        int l = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Area of Rectangle based on the Length  and breadth  is here : "+ ( l * b));
    }
}

// formula = Length * Breadth 