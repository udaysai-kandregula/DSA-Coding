// 11. Input a month number and print the days in that month.

import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
class DaysOfMonth{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter you input : ");
        int num = sc.nextInt();
        int days = 0;
        ArrayList <Integer> list = new ArrayList<>((Arrays.asList(1,3,5,7,8,10,12)));
        // list = (1,3,5,7,8,10,12) ;
        if(num == 2){
            days = 28;
        }else{
            days = 30;
            for(int i : list){
               if(i == num){
                  days = 31;
              }
             }  
        }
        System.out.println(days +" days" );
    }
}
