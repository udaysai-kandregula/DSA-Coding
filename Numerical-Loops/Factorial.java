// 72. Calculate the factorial of a number.

class Factorial{
    void main(String [] a){
        int num = 3;
        double fact = 1;
        for(int i = 1; i <= num ; i++){
            fact *= i;
        }
        System.out.println(fact);
    }
}