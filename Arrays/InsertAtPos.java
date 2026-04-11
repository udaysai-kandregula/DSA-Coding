// 9. Insert an element at a specific position in an array.

import java.util.Scanner;
class InsertAtPos{
    public static void  main(String [] args){
        int arr [] = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER YOUR ARRAY ELEMENTS : ");
        int n  = 6;
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("ENTER POS : ");
        int pos = sc.nextInt();
        System.out.print("ENTER ELE TO INSERT : ");
        int ele = sc.nextInt();
        int j = n;
        while(j != pos){
            int temp = arr[j-1];
            arr[j-1] = arr[j];
            arr[j] = temp;
            j--;
        }
        arr[pos] = ele;
    for(int i = 0 ; i < arr.length ; i++){
        System.out.print(arr[i] + " ");
    }

    }
}