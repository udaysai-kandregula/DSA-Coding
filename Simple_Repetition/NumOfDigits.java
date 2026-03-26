// 60. Count the number of digits in an integer.

class NumOfDigits{
    public static void main(String [] args){
        int num = 10;
        int count = 0;
        while( num > 0){
            num /= 10;
            count++;
        }
       System.out.println(count);
    }
}
