// 30. Determine if a number is a 'Harshad Number'.
// Harshad numbers mean number is complitely divided by sum of it digits 

// num = 153 
// => 153 / (1+5+3)
// => 153 / 9 = 17 then it is Harshad number

import java.util.Scanner;
class Harshad{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int num = sc.nextInt();
        int temp = num;
        int sum = 0;
        while(temp > 0){
            sum += temp % 10;
            temp = temp / 10;
        }
        if(num % sum == 0){
            System.out.println("Harshad Number");
        }else{
            System.out.println(" Not a Harshad Number");
        }
    }
}