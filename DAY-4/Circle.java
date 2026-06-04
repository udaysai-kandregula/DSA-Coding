// 8. Perimeter of Circle (Circumference)


import java.util.Scanner;
class Circle{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radious of the circle : ");
        int r  = sc.nextInt();
        System.out.println("Circumference of circle is Here : " + 2 *(Math.PI * r ));
    }
}

// formula = 2 * pi * r 