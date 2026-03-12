// 10. Input a week number and print the weekday.

import java.util.Scanner;
class WeekDay{
     public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your input here : ");
        int num = sc.nextInt();
        switch(num){
            case 1 : {
                System.out.println("Monday");
                break;
            }
            case 2 : {
                System.out.println("Tuesday");
                break;
            }
            case 3 : {
                System.out.println("Wednesday");
                break;
            }
            case 4 : {
                System.out.println("Thursday");
                break;
            }
            case 5 : {
                System.out.println("Friday");
                break;
            }
            case 6 : {
                System.out.println("Saturday");
                break;
            }
            case 7 : {
                System.out.println("Sunday");
                break;
            }
            default : {
                System.out.println("Your in puts is not in the range (1-7)");
            }
        }
     }
}

