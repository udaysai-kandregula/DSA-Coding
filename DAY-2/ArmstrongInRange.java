// 9. Find all Armstrong Numbers between two given numbers.
import java.util.Scanner;
class ArmstrongInRange{
   static int isArmstrong(int num){
        int count = 0;
        int temp = num;
        int tsum = 0;
        // how many digits it has
        while(num > 0){
            count += 1;
            num /= 10;
        }
        num = temp;
        //checking the given number is armstrong or not 
        while(temp > 0){
            int d = temp % 10;
            tsum += Math.pow(d,count);
            temp /= 10;
        }
    return tsum;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your range here using space  : ");
        int start = sc.nextInt();
        int end = sc.nextInt();
        for(int i = start ; i <= end ; i++){
            int re = isArmstrong(i);
            if(re == i ){
                System.out.print(" " + i); 
            }
        }
        sc.close();
    }
}

// TC = O(N log N)
// SC = O(1)
