// 1. Read and print elements of an array.

class PrintElements{
    static void show(int i , int arr[]){
        if(i >= arr.length){
            return;
        }
        System.out.print(arr[i] +" ");
        show(i+1,arr);
    }
    public static void main(String [] args){
        // int arr[] = new int [10];
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        int i = 0;
        System.out.println("For Loop");
        for(i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nFor Each Loop");
        for(int j : arr){
            System.out.print(j + " ");
        }
        System.out.println("\nWhile Loop");
        i = 0;
        while(i < arr.length){
            System.out.print(arr[i] + " ");
            i++;
        }
        System.out.println("\nDo while Loop");
        i = 0;
        do{
            System.out.print(arr[i]+ " ") ;
            i++;
        }while(i < arr.length);
        System.out.println("\nRecusion ");
        show(0,arr);
    }
}
