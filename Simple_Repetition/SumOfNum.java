// 56. Calculate the sum of natural numbers up to n.

class SumOfNum{
    public static void main(String [] args){
        int num = 10;
        int sum = 0;
        for(int i = num ; i >  0 ; i-- ){
            sum += i;
        }
        System.out.println(sum);
    }
}
