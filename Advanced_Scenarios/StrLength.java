// 37. Verify if an input string length is even or odd.


import java.util.Scanner;
class StrLength{
    public static void main(String [] args){
        System.out.print("Enter your value : " );
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println((str.length() % 2 == 0) ? "String length is Even " : "String length is odd ");
    }
}