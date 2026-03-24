
// 41. Check if a number is a 'Neon Number'.
// neon number mean a number is squared that resulted number digits sum is equal to the original number ;
// example = 9     
//         => 9 * 9 = 81 
//         => 8+1 == 9 yes 
        
//         = 12 
//         => 12 * 12 = 144
//         => 1+4+4 = 9
//         => 9 != 12


class NeonNum{
    public static void main(String [] args){
        int num =  12;
        int sum = 0;
        int sqar = num * num;
        while(sqar > 0){
            sum += sqar % 10;
            sqar = sqar / 10;
        }
        System.out.println((sum == num ? "Yes" : "NO"));
    }
}
