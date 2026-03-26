// 62. Calculate the sum of the first and last digit.


class SumOfFirstLast{
    public static void main(String [] args){
        int num = 10102;
        int temp = num;
        int count = 0;
        while( temp > 0){
            temp /= 10;
            count++;
        }
       System.out.println((int)(num / Math.pow(10,count-1))  + num % 10 );
    //    System.out.println("Last digit is : " + num % 10);
    }
}