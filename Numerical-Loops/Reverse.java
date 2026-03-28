// 66. Reverse a number.
class Reverse{
    public static void main(String [] args){
        int num = 102;
        int n = 0;
        int rev = 0;
        while(num > 0){
            rev = num % 10;
            n = n*10 + rev;
            num = num/10;
        }
        System.out.println(n);
    }
}
