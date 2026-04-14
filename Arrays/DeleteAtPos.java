10. Delete an element from a specific position.

class DeleteAtPos{
    public static void main(String [] args){
        int pos = 2;
        int arr [] = {1,2,3,4,5,6,7};
        int i = pos;
        while(i < arr.length-1){
            arr[pos] = arr[pos+1];
            i++;
        }
        for(int j : arr){
            System.out.println(j);
        }
    }
}