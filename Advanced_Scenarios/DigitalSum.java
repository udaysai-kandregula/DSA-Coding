// 23. Compare the sum of the first two digits to the last digit of a 3-digit number.

import java.util.Scanner;
class DigitalSum{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your three digit number here : ");
        int num = sc.nextInt();
        int O = (num / 1) % 10;
        int H = (num / 10) % 10;
        int T = (num / 100) % 10;
        System.out.println(O);
        System.out.println(H);
        System.out.println(T);
        if((T + H ) == O){
            System.out.println("sum of First two digits is 'Equal' to the last digit");
        }   else if((T + H)>O){
            System.out.println("sum of First two digits is 'GraterThen to the last digit");
        }
        else{
            System.out.println("sum of First two digits is 'LessThen' to the last digit");
        }
    }
}
