import java.util.Scanner;
class LeapYearCheck{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if(year % 4 == 0 || (year % 400 == 0 && year % 100 != 0 )){
            System.out.println("Year is Leap year");
        }
        else{
            System.out.println("Not a Leap year Or Normal year");
        }
    }
}



// TC = O(1)
// SC = O(1)
