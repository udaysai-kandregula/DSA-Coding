// 70. Find the power of a number using a loop.

class Power{
    public static void main(String [] args){
        int n = 4;
        int val = 3;
        int power=1;
        for(int i = 1 ; i <= n ; i++){
            power  = power * val;
        }
        System.out.println(power);
    }
}