// 5. Find the second largest element in an array.
class SecondLargest{
    public static void main(String [] args){
        int arr [] = {10,20,30,21,2,21,44,54};
        // int i = 0 , j = arr.length-1;
        int small = arr[0];
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length-1 ; j++ )
            if(arr[j+1] > arr[j]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }
        for(int i = 0 ; i < arr.length ; i++){
        System.out.println(arr[i]);
        }
        System.out.println("Second largest number is " + arr[1]);
        
    }
}