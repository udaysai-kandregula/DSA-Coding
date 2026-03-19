// 24. Identify the quadrant of a coordinate point (x, y).

import java.util.Scanner;
class CoordinatePoints{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        if(x > 0 && y > 0){
            System.out.println("1 st Quadrant ");
        }else if ( x < 0 && y > 0){
            System.out.println("2 nd Quadrant");
        }else if(x < 0 && y < 0 ){
            System.out.println("3 rd Quadrant");
        }else if(x > 0 && y < 0){
            System.out.println("4 th Quadrant");
        }else{
            System.out.printin("points are (0,0)");
        }
    }
}