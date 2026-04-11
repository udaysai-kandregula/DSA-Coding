// 7. Count the total number of negative elements in an array.

class CountNegative{
    static boolean checker(int num){
        if(num < 0){
            return true;
        }
        return false;
    }
    public static void main(String [] args){
    int arr [] = {1,2,3,4,-5,6,-7,8,9,-10};
    int p = 0 , n = 0;
    for(int i : arr){
        if(checker(i)){
            n++;
        }
        else{
            p++;
        }
    }
    System.out.println("positive Count : " + p + "\nnegitive Count : " + n);
    }
}