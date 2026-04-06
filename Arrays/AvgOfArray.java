// 3. Find the average of array elements.

class AvgOfArray{
    public static void main(String [] args){
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        float sum = 0;
        for(int i : arr){
            sum += i;
        }
        System.out.print("Average of elements in an array is  " + sum/arr.length);

    }  
}