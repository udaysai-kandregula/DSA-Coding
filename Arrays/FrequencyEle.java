// 11. Find the frequency of each element in an array.

import java.util.HashMap;
class FrequencyEle{
    public static void main(String [] args){
        int arr[] = {1,2,3,2,4,5,23,1,63,3,5,6};
        HashMap <Integer,Integer> mp = new HashMap<>();
        for(int i : arr){
            mp.put(i,mp.getOrDefault(i,0)+1);
        }
        System.out.println(mp);  
    }
}