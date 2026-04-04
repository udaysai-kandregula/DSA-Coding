// 82. Find all Perfect numbers in a range.

class RangeOfPerfect{

    static boolean checkPerfect(int num){
        int sum = 1;
        for(int i = 2 ; i <= num / 2 ; i++){
            if(num % i == 0){
                sum += i;
            }
        }
        if(sum == num ){
            return true;
        }
        return false;
    }

    public static void main(String [] args){
        int num = 1008;
        for(int i = 1 ; i <= num ; i++){
            if(checkPerfect(i)){
                System.out.print(i + " ");
            }
        }
    }
}