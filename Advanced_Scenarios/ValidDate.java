// 28. Validate if a date (DD/MM/YYYY) is real.

import java.util.Scanner;
class ValidDate{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your date With using pre-formated {DD/MM/YYYY} : ");
        String s = sc.nextLine();
        int dd = Integer.parseInt(s.substring(0,2));
        int mm = Integer.parseInt(s.substring(3,5));
        int yy = Integer.parseInt(s.substring(6,10));
       if((dd > 0  && dd < 32) && (mm > 0 && mm < 13) && (yy > 999 && yy <3000 )){
        System.out.println("Valid");
       }else{
        System.out.println("Not Valid");
       }
    }
}
