// 7. Check if a character is an alphabet, digit, or special character.

import java.util.Scanner;
class CharacterType{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your character Here : ");
        char ch = sc.next().charAt(0);
        if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= "Z")){
            System.out.println("Alphabet");
        }
        else if (ch >= '0' && ch <= '9'){
            System.out.println("Digit");
        }
        else{                        
            System.out.println("Special ");
        }
        //  System.out.println('a'.int());
    }
}