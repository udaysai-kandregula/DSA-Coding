// 40. Check if a number is a 'Duck Number'.
// Duck number mean a number  which has at least ZEOR in the number but not in starting of it;
// example = 2001 yes;
//         = 0202 no;
//         = 300 yes;
//         =99323 no;

class DuckNum{
    public static void main(String [] args){
        int num = 2001;
        boolean yes = false;
        while (num > 0){
            if(num % 10 == 0){
               yes = true;
               break;
            }
             num = num / 10;
        }
        System.out.println((yes == true ? "Yes" : "NO"));

    }
}