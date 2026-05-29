//  3. Input Principal (P), Time (T), Rate (R) from the user and calculate Simple Interest.

import java.util.Scanner;
class SimpleInterest{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter principal amount , Time , and rate of interest with space seperation : ");
        float p = sc.nextFloat();
        int t = sc.nextInt();
        float r = sc.nextFloat();

        System.out.println("SI = " + (p * t * r) / 100);
    }
}

// TC = O(1);
// SC = O(1);