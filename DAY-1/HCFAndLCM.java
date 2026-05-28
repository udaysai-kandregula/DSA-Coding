//  HCF and LCM Take 2 numbers as input. Find and print both their HCF and LCM.
class HCFAndLCM{
    public static void main(String [] args){
        int a = 1000,b =90;
        int hcf = 0, lcm = 0;
        // HCF = higest common faction so it always lessthen or equal to the smallest number 
        int small = (a>b ? b : a );
        for(int i = small ; i > 0 ; i--){
            if(a % i == 0 && b % i == 0){ 
                hcf = i;
                break;
            }
        } 
        lcm =  a * b / hcf;

        System.out.println("LCM = " + lcm +"\nHCF = " + hcf);

    }
}