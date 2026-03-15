// 18. Calculate student percentage and grade.

import java.util.Scanner;
import java.lang.*;
class StdGrade{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how main subject you have : ");
        int n = sc.nextInt();
        System.out.print("Enter paper total marks : ");
        int total = sc.nextInt();
        int marks = 0 , total_marks = n*total,k = 1;
        // for storing data ;
        int array [] = new int[n]; 
        for(int i = 0; i < n ; i++){
            System.out.print("Enter the mark you got in subject " + k++  + " : ");
            array[i]= sc.nextInt();
        }
       for(int j = 0 ; j < n ;j++ ){
        marks += array[j];
       } 
       int per = (marks * 100) / total_marks;
       System.out.print("You got " +per);
       if(per > 80){
        System.out.println(" A grade");
       }else if (per>60 && per < 81){
        System.out.println(" B grade");
       }
       else if (per > 40 && per < 61) {
        System.out.println(" C grade");
       }
       else{
        System.out.println("Sorry");
       }
    }
}
