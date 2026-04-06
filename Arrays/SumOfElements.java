// 2. Find the sum of all array elements.

class SumOfElements{
    public static void main(String [] args){
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        int sum = 0;
        for(int i : arr){
            sum += i;
        }
        System.out.print("Sum of elements in an array " + sum);
    }  
}
