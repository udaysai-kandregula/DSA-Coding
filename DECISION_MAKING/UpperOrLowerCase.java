// 9. Check if an alphabet is uppercase or lowercase.


import java.util.Scanner;
class UpperOrLowerCase{
     public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your  Alphabet character here : ");
        char ch = sc.next().charAt(0);
        if(ch >= 'A' && ch <= 'Z'){
            System.out.println("your character is uppercase");
        }
        else{
            System.out.println("your character is Lowercase");

        }
        System.out.println(Character.isUpperCase(ch));
     }
}