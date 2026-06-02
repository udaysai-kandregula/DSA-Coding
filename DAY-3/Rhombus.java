// 6. Area of Rhombus

import java.util.Scanner;
class Rhombus{
    public static void main(String [] a){
        Scanner sc = new Scanner(System.in);
        int d1 = sc.nextInt();
        int d2 = sc.nextInt();
        System.out.print("Area of Rhombus : " +(0.5 * d1 * d2));
    }
}

// formula : 1/2 * d1 * d2;