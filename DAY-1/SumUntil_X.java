//5. Sum Until 'x' Keep taking numbers as input till the user enters x. After that, print the sum of all numbers entered.

import java.util.Scanner;
class SumUntil_X{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of x : ");
        int x = sc.nextInt();
        int total_sum = 0;
        for(int i = 1 ; i <=x ; i++){
            System.out.print("Enter the "+ i + " : " );
            int val = sc.nextInt();
            total_sum += val;
        }  
        System.out.println("Total sum is : " + total_sum); 
    }
}



// TC = O(n);
// SC = O(1);