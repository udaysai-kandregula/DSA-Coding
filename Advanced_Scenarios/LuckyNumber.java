// 34. Identify if a 4-digit number is a 'Lucky Number' (sum of first 2 = sum of last 2).

import java.util.Scanner;
class LuckyNumber{
    public static void main(String [] args){
        System.out.print("Enter your 4 digite value : " );
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int temp = num;
        int count = 0;
        int last_two_sum = 0;
        int first_two_sum = 0;
        while(temp > 0){
            if(count < 2){
                last_two_sum += temp % 10;
            }else{
                first_two_sum += temp % 10;
            }
            count++;
            temp = temp / 10;
        }
        System.out.print(( first_two_sum == last_two_sum ? "Lucky Number " : "Not a Lucky Number"));
    }
}