// 6. Perimeter of Parallelogram

import java.util.Scanner;
class Parallelogram{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the adjecents of the parallelogram {a  , b} here :");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Perimeter of the Parallelogram is here  : "+ (2 * (a +b) ));
    }
}

// formula =  2 * (a + b)