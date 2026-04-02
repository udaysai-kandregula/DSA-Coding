// 78. Find prime factors of a number.

class Factors{
   static int checkprime(int num){
    int count =0;
        for(int i = 2 ; i <= num/2 ; i++){
            if(num % i == 0){
                count++;
            }
        }
        if(count == 0){
            return num;
        }
        return 0;
    }
    public static void main(String [] args){
       int num = 7429;
       for(int i = 2 ;  i <= num/2 ; i++){
        int c = checkprime(i);
        if(c > 0 && num % c == 0){
            System.out.println(c);
        }

       }
    }
}