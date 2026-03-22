// 32. Check if a number is 'Abundant'.

// An Abundant numbere is a positive Integer for which the 'sum of its proper divisors but (not number itself)'
// ex : num =  12 
//     divisor => 1,2,3,4,6,{but not 12}
//     sum = 1+2+3+4+6 = 16
//     sum > num

import java.util.Scanner;
class Abundant{
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
       System.out.println((sum > num ? "It is a Abundant Number" : "Not an Abundant Number"));
    }
}
