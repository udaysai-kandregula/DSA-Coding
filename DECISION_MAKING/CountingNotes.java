// 12. Count the total number of notes in a given amount.

import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
class CountingNotes{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter you amount here  : ");
        int amount = sc.nextInt();
        int temp = amount;
        int count = 0;
        int total_count = 0;
        ArrayList <Integer> list = new ArrayList<>((Arrays.asList(2000,500,200,100,50,20,10)));
        if(temp < 10){
            System.out.println("Only coins");
        }
        else{
            for(int i : list){
                if(temp >= i){
                    count = temp / i;
                    System.out.println(count +" " +i+" Notes" );
                    total_count = total_count + count;
                    temp = temp % i;
                }
            }
             System.out.println("Total number of notes is " + total_count);
             System.out.println("Total change is " + temp);
        }
    }
}