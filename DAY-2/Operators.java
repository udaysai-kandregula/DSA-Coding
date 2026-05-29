// 4. Take two numbers and an *operator (+, -, x , /, %) as input and calculate the result using if conditions.

import java.util.Scanner;
class Operators{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your operator in the given list [ + , - , x , / , % ] : ");
        char operator = sc.next().charAt(0);
        System.out.print("Enter your two values this space seperation : ");
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        if(operator == '+')
            System.out.println("result is : " +(a + b));
        else if (operator == '-')
            System.out.println("result is : " +(a-b));
        else if(operator == 'x')
            System.out.println("result is : " + (a*b));
        else if(operator == '/')
            System.out.println("result is : " + (a/b));
        else
            System.out.println("result is : " + (a % b));
    }
}



// TC = O(1);
// SC = O(1);