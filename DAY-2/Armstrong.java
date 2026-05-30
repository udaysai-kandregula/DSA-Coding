// 9.1. check the given three digit number is  Armstrong Numbers or  not.
import java.util.Scanner;
class Armstrong{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your value here : ");
        int val = sc.nextInt();
        int temp = val;
        int tsum = 0;
        while(temp > 0){
            int d = temp % 10;
            tsum += Math.pow(d,3);
            temp = temp /10;
        }
        System.out.println((tsum == val ? "Armstrong number " : "Not Armstrong number"));
        sc.close();
    }
}

// TC = O(n)
// SC = O(1)


