// 8. Check whether a given String is a Palindrome or not.

import java.util.Scanner;
class PalindromeOrNot{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String value here : ");
        String s = sc.nextLine();
        int right = s.length()-1;
        int left = 0;
        boolean flag = false;
        while(left < right){
            if(s.charAt(left) != s.charAt(right)){
                flag = false;
                break;
            }
        left++;
        right--;
        flag = true;
        }
        if(flag)
            System.out.println("Yes it is a palindrome");
        else
            System.out.println("Not a Palindrome");

        sc.close();
    }
}

// TC = O(n)
// SC = O(1)


