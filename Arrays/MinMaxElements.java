// 4. Find the maximum and minimum element in an array.

class MinMaxElements{
    public static void main(String [] args){
        
        int arr [] = {10,20,30,21,2,21,44,54};
        int max = arr[0];
        int min = arr[0];
        for(int i = 1 ; i < arr.length ; i++){
            if(max < arr [i]){
                max = arr[i];
            }
            if(min > arr[i]){
                min = arr[i];
            }
        }
        System.out.println("Max element is : "+max +"\nMin element is :" + min);
    }
}