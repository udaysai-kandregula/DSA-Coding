// 36. Determine eligibility for a bank loan based on age and credit score.

import java.util.Scanner;
class LoanAccepter{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age  : " );
        int age = sc.nextInt();
        System.out.print("Enter your credit Score  : " );
        int credit_score = sc.nextInt();
        System.out.print("Enter your loan Amount  : " );
        int amount = sc.nextInt();
        if(age <= 18 && credit_score < 300 ){
            System.out.println("Sorry Your load is rejected : ");
        }else if(age > 18 && credit_score < 300 && amount <= 20000){
            System.out.println("Ok but you need some strong proofs like parent signature or land documnets ect..");
        }else if(age > 18 && (credit_score >= 300 && credit_score <= 950)) {
            System.out.println("Your load is accepeted very soon see you later : ");
        }else{
            System.out.println("Recheck your detials please :");
            System.out.println("AGE  : " + age);
            System.out.println("credit_score : " + credit_score);
        }
    }
}