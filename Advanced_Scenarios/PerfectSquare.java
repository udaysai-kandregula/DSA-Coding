// 22. Verify if a number is a perfect square.

import java.util.Scanner;
class PerfectSquare{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter vlaue : ");
        int num = sc.nextInt();
        int temp = 2 , count = 0,i = 2 ,k = 0;
        boolean check = false;
        // Approch 1 : 

        while (temp * temp <= num){
            if(temp * temp == num){
                check = true;
            }else{
                check = false;
            }
            temp++;
            count++;
        } 
        System.out.println("while loop output : " + check);
        System.out.println("while loop count : " + count);

        // Approch 2 : 

        for( i = 2 ; i < num ; i++){
            if(i * i == num){
               check = true;
               System.out.println("For loop output : " + check);
               System.out.println("for loop count : " + k);
               return ;
            }else{
                check = false;
            }
            k++;
        } 
        System.out.println("For loop output : " + check);
        System.out.println("for loop count : " + k);
        
    }
}