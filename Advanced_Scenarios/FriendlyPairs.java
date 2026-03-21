// 29. Check if two numbers are 'Friendly Pairs'.

import java.util.Scanner;
class FriendlyPair{
    int num,sum;
    FriendlyPair(int num){
        this.num = num;
        sum = num;
    }
    float abundancy(){
         for(int i = 1 ; i <= num/2 ;  i++ ){
            if(num % i == 0){
                sum += i;
            }
        }
        return sum/num;
    }

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number here : ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number here : ");
        int num2 = sc.nextInt();
       FriendlyPair obj1 = new FriendlyPair(num1);
       FriendlyPair obj2 = new FriendlyPair(num2);
       if(obj1. abundancy() == obj2.abundancy()){
        System.out.println("Both are friendly pair");
       }else{
        System.out.println("Not frinedly pair ");
       }
    }
}