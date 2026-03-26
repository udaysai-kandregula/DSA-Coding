// 61. Find the first and last digit of a number.

class FirstAndLast{
    public static void main(String [] args){
        int num = 10102;
        int temp = num;
        int count = 0;
        while( temp > 0){
            temp /= 10;
            count++;
        }
       System.out.println("first digit is  : " + (int)(num / Math.pow(10,count-1)) );
       System.out.println("Last digit is : " + num % 10);
    }
}