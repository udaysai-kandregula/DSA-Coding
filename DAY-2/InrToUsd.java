// 6. Input an amount in Indian Rupees and convert it to USD. (Use: 1 USD = 83.5 INR — update with current rate)

import java.util.Scanner;
class InrToUsd{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        float inr = sc.nextFloat();
        if(inr < 0 )
            System.out.println("I am sorry ");
        System.out.println("Your amount is in USD :  " + inr / 83.5);
        sc.close();
    }
}



// TC = O(1);
// SC = O(1);