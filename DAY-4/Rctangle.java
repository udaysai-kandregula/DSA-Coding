// 1. Perimeter of Rectangle

import java.util.Scanner;
class Rectangle{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter L and B using space : ");
        int l = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("perimeter of the rectangle is Here : " + (2* (l + b) ));
    }
}

// formula =  2(L + B)

