// small works : Check if a number is 'Perfect'.

// An Perfect numbere is a positive Integer for which the 'sum of its proper divisors but (not number itself)'
    // total sum is equal to the number itself
// ex : num =  28 
//     divisor => 1,2,4,7,14,{but not 28}
//     sum = 1,2,4,7,14
//     sum  = num

import java.util.Scanner;
class Prefect{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your value : ");
        int num = sc.nextInt();
        int sum = 0;
       for(int i = 1; i <= num/2 ; i++){
        if(num % i == 0){
            sum += i;
        }
       }
       System.out.println((sum == num ? "It is a Perfect Number" : "Not an Perfect Number"));
    }
}

// note as of now 2026 only 51 Perfect numbers are found
    // 51th number is 49,724,095
