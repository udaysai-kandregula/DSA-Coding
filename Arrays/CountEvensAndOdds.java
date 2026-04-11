// 6. Count the total number of even and odd elements.

class CountEvensAndOdds{
    static boolean checker(int num){
        if(num % 2 == 0){
            return true;
        }
        return false;
    }
    public static void main(String [] args){
    int arr [] = {1,2,3,4,5,6,7,8,9,10};
    int ecount = 0 , ocount = 0;
    for(int i : arr){
        if(checker(i)){
            ecount++;
        }
        else{
            ocount++;
        }
    }
    System.out.println("Even Count : " + ecount + "\nOdd Count :" + ocount);
    }
}