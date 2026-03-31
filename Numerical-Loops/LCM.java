// 74. Find the LCM of two numbers.
class LCM{
 static int hcf(int num1,int num2){
        while(num2 != 0){
            int temp = num1 % num2;
            num1 = num2;
            num2 = temp;
        }
        return num1;
    }
    public static void main(String [] args){
        int num1 = 20;
        int num2 = 30;
        int d = hcf(num1,num2);
        int lcm = (num1*num2)/d;
        System.out.println(lcm);
    }
}