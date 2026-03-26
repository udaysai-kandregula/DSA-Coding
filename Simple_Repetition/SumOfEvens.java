
// 57. Sum all even numbers between 1 and n.

class SumOfEvens{
    public static void main(String [] args){
        int num = 10;
        int sum = 0;
        for(int i = num ; i >  0 ; i-- ){
            if(i % 2 == 0){
                sum += i;
            }
            
        }
        System.out.println(sum);
    }
}
