// 14. Delete all duplicate elements from an array.
import java.util.HashSet;
class DeleteDuplicateEle{
    public static void main(String [] args){
        HashSet<Integer> set = new HashSet<>();
        int arr [] = {1,2,3,2,3,2,4,5,3,4,10,1};
        System.out.println("Deleted elements are :");
        for(int i : arr){
            if(!set.add(i)){
                System.out.print(i + " ");
            }
        }
        System.out.println("\nNot Deleted elements are : ");
        for(int i : set){
            System.out.print(i +" ");
        }
    }
}
