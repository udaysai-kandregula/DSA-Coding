// 55. Print all odd numbers between 1 and 100.

class OddNum{
    public static void main(String [] args){
        for(int i = 1 ; i <= 100 ; i++){
            if(i % 2 != 0){
                System.out.println(i);
            }
        }
    }
}