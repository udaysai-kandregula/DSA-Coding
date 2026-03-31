// 71. Find all factors of a number.
class Factors{
    public static void main(String [] args){
        int num = 30;
        for(int i = 2 ; i <= num /2 ; i++ ){
            if(num % i == 0){
                System.out.println(i);
            }
        }
        System.out.println("1 and itself of a nunber is default factors : " + 1  +" & " + num);
    }
}