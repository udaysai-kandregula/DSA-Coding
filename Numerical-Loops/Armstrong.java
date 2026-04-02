// 79. Check if a number is an Armstrong number.

class Armstrong{
    static int armstrong(int num){
        int sum = 0;
        while(num > 0){
            int d = num % 10;
            sum +=d*d*d;
            num = num / 10;
        }
        return sum;
    }
    public static void main(String [] args){
        int num = 153;
        int check =armstrong(num);
        if(check == num){
            System.out.println("Armstrong Number");
        }else{
            System.out.println("Not Armstrong Number");
        }
    }
}