// 21. Determine if a 3-digit number is an Armstrong number.
import java.util.Scanner;
class Armstrong{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a three digit number here : ");
        int num = sc.nextInt();
        int temp = num % 10;
        num = num / 100;
        // System.out.println(temp);
        // System.out.println(num % 10);
        if(num % 10 == temp){
            System.out.println("Armstrong number ");
        }else{
            System.out.println("Not Armstrong number ");
        }
    }
}
