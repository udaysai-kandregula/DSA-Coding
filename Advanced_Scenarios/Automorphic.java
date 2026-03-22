// 30. Determine if a number is a 'Automorphic Number'.

// Automorphic => The square of the number last digits is equal to the same number is called Automorphic number
// example : 5 => 
//                 5*5 = 25 ends with 5
//           25 =>
//                 25*25 = 625 ends with 25

import java.util.Scanner;
class Automorphic{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int num = sc.nextInt();
        int temp = num;
        int square = num * num;
        int count = 0;
        while(temp > 0){
            count++;
            temp = temp / 10;
        }
        if( (square % Math.pow(10,count)) == num){
            System.out.println("Automorphic Number");
        }else{
            System.out.println(" Not a Automorphic Number");
        }
    }
}