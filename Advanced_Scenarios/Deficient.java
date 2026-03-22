// 33. Check if a number is 'Abundant'.

// An Abundant numbere is a positive Integer for which the 'sum of its proper divisors but (not number itself)'
//     sum is not greaterthen itself
// ex : num =  21
//     divisor => 1,3,7,{but not 21}
//     sum = 11
//     sum < num

import java.util.Scanner;
class Deficient{
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
       System.out.println((sum < num ? "It is a Deficient Number" : "Not an Deficient Number"));
    }
}
