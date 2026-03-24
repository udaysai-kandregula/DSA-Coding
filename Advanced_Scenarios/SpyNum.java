// 42. Check if a number is a 'Spy Number'.

// Spy number means sum of the digits is equal to the product of the digits;
// example : 
//     22 => 2+2 == 2*2; yes
//     123 => 1*2*3 == 1+2+3 => 6 ; yes;
//     124 => 1*2*4 != 1+2+4 => 8 != 7 ; no

class SpyNum{
    public static void main(String [] args){
        int num = 22;
        int sum = 0;
        int product = 1;
        while(num > 0){
            sum += num % 10 ;
            product *= num % 10;
            num = num / 10;
        }
        System.out.println((sum == product ? "Yes"  : "NO"));
    }
}