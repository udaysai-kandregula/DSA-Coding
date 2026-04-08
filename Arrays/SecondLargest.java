// 5. Find the second largest element in an array.
class SecondLargest{
    public static void main(String [] args){
        int arr [] = {10,20,30,21,2,21,44,54};
        // int i = 0 , j = arr.length-1;
        int small = arr[0];
        for(int i = 0; i < arr.length-1 ; i++){
            for(int j = 1; j < arr.length ; j++ )
            if(arr[i] > arr[j]){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        for(int i = 0 ; i < arr.length ; i++){
        System.out.println(arr[i]);
        }
    }
}