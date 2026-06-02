// 1. Area of Circle


import java.util.Scanner;
class AreaOfCircle{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        System.out.println("Area of circle based on the radius is here : "+Math.PI * r * r);
    }
}