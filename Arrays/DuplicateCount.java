// 13. Count the total number of duplicate elements.

import java.util.HashSet;
class DuplicateCount{
    public static void main(String [] args){
        int arr [] = {1,2,3,2,3,2,4,5,3,4,10,1};
        int count = 0;
        HashSet <Integer> set = new HashSet<>();
        for(int i : arr){
            if(!set.add(i)){
                count++;
            }
        }
        System.out.println(count);
    }
}