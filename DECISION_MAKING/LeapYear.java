// 6. Check if a year is a leap year.


import java.util.Scanner;
class LeapYear{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Year Here : ");
        int year = sc.nextInt();
        if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
            System.out.println("Leap year " + year);
        }
        else{
            System.out.println("Not a LeapYear : "+ year);
        }
    }
}