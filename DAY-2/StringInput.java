// 2. Take a name as input and print a greeting message for that name.

import java.util.Scanner;
class StringInput{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String s = sc.nextLine();
        System.out.println("Hello mr/miss " + s);
    }
}

// TC = O(1);
// SC = O(1);
