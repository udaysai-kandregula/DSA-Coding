// 2. Perimeter of Square

import java.util.Scanner;
class Square{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side of the square  : ");
        int side  = sc.nextInt();
        System.out.println("perimeter of the square is Here : " + ( 4 * side ));
    }
}

// formula = 4 * side 