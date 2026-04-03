// 80. Find all Armstrong numbers in a range.

class RangeOfArmstrong{
    static boolean checkArmstrong(int num){
        if(num < 0)
            return false;
        int count =  0;
        int temp = num;
        int sum =0;
        while(num > 0){
            num /=10;
            count++;
        }
        num = temp;
        while(num > 0){
            int d = num % 10;
            sum += Math.pow(d,count);
            num /= 10;
        }
        if(sum == temp){
            return true;
        }
        return false;
    }
    public static void main(String [] args){
        int n = 500;
        int c = 0;
        for(int i = 1; i < n ; i++){
            if( checkArmstrong(i)){
                System.out.print(i+ " ");
            }
        }
    }
}