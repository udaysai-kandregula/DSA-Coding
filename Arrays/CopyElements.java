// 8. Copy all elements from one array to another.

class CopyElements{
    public static void main(String [] args){
        int arr [] = {1,2,3,4,5,6};
        int copy[] = new int [arr.length];
        for(int i = 0 ; i < arr.length;i++){
            copy[i] = arr[i];
            System.out.print(copy[i] +" ");
        } 
    }
}