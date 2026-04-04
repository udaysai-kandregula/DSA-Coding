// 81. Check if a number is a Perfect number.

// prefect number means sum of factor are equal to the original number;
class PerfectNumber{
    public static void main(String [] args){
        int num = 28;
        int sum = 1;
        for(int i = 2 ; i <= num / 2 ; i++){
            if(num % i == 0){
                sum += i;
            }
        }
        if(sum == num){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
    }
}
