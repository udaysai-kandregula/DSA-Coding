// 19. Calculate gross salary based on basic pay and allowances.

import java.util.Scanner;
class Salary{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your basic pay : ");
        float bp = sc.nextFloat();
        double da = (0.5 * bp);   // bp = basic pay da  = Dearness Allowance 
        double hra = 0.2*bp;   //hra = Housing reant Allowance
        double ta = 0.1 * bp;    // ta = Travelling Allowance
        double allowances = da + hra + ta;
        // System.out.print(allowances);
        System.out.print("Your gross salary :  " + (bp+allowances));
    }
}