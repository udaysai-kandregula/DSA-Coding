// 25. Check if a given character is a numeric digit.

import java.util.Scanner;
class CheckNumber{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        if(ch >= '0' && ch <= '9'){
            System.out.println("The given character is a digit ");
        }else{
            System.out.println("Not a digit");
        }
    }
}