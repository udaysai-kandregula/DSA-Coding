// 3. Check divisibility by 5 and 11.

import java.util.Scanner;
class Divisibility{
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int num = sc.nextInt();
        if(num % 5 == 0 && num % 11 == 0){
            System.out.print("Yes");
        }
        else{
            System.out.print("NO");
        }
    }
}