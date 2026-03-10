// 1. Check if a number is positive, negative, or zero.

import java.util.Scanner;
package decision_making;

class Main{
    public static void main(String [] args){
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter your number : ");
      int num = sc.nextInt();
      if(num > 0 ){
        System.out.println("Positive Number");
      }
      else if(num < 0){
        System.out.println("Negitive Number");
      }
      else{
        System.out.println("It is Zero");
      }
    }
}
