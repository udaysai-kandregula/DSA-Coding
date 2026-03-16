// 20. Calculate electricity bill based on units consumed.

import java.util.Scanner;
class ElectricityBill{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the unit price here : ");
        float unit_price = sc.nextFloat(); 
        System.out.print("Enter the total units consumed by the user : ");
        float units = sc.nextFloat();
        System.out.println("Your bill is "+ (units * unit_price));
    }
}