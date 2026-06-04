// 7. Area of Equilateral Triangle


import java.util.Scanner;
class EquilateralTriangle{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of one side here :");
        int side = sc.nextInt();
        System.out.println("Area of Equilateral Triangle based on the Side lenght is here : "+ (Math.sqrt(3) / 4 * (side * side) ));
    }
}

// formula =  (√3 / 4) × side²

