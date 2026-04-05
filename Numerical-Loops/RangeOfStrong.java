// 84. Find all Strong numbers in a range.
class RangeOfStrong {
    static boolean checkStrong(int num){
        int temp = num;
        int sum = 0;
        while(temp > 0){
            int d = temp % 10;
            int fact = 1;
            for(int i = 1 ; i <= d ; i++){
              fact *= i;
            }
            sum += fact;
            temp = temp / 10;
        }
        if(sum == num){
            return true;
        }
        return false;
    }
    public static void main(String [] args){
        int num = 1000;
        for(int i = 1 ; i <= num ; i++){
            if(checkStrong(i)){
                System.out.print(i + " ");
            }
        }
        
        // System.out.print(fact);
  }
}