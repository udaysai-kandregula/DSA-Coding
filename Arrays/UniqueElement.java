// 12. Print all unique elements in an array.

import java.util.HashSet;
class UniqueElement{
    public static void main(String [] args){
        int arr [] = {1,2,3,2,4,3,2,4,5,3,4,5,3,5};
        HashSet <Integer> set = new HashSet<>();
        for(int i : arr){
            set.add(i);
        }
        System.out.print(set);
    }
}