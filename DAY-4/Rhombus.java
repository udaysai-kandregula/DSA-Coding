// 3. Perimeter of Rhombus

import java.util.Scanner;
class Rhombus{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side of the square  : ");
        int side  = sc.nextInt();
        System.out.println("perimeter of the Rhombus is Here : " + ( 4 * side ));
    }
}

// formula = 4 * side 