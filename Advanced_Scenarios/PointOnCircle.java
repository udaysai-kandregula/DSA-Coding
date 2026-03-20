// 27. Check if a point lies inside, on, or outside a circle.

import java.util.Scanner;
class PointOnCircle{
    public static void main(String [] args){
        System.out.println("Circle radies is 5cm\nand cente point of the circle is (0,0)");
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Y = sc.nextInt();
        double dist = Math.pow((X-0),2) + Math.pow((Y-0),2);
        if(dist == 25){
            System.out.println("the point is on the circle");
        }else if (dist < 25){
            System.out.println("The point is inside the circle");
        }else{
            System.out.println("The Point is outside the circle");
        }
    }
}
