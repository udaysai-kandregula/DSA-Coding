import java.util.Scanner;
class Pattern{
    int i,j;
    void box(int num){
        for(i = 0 ; i < num ; i++){
            for(j = 0 ; j < num ; j++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
    void rightAngleTrinagle(int num){
        for(i = 0 ; i < num ; i++){
            for(j = 0 ; j <= i ; j++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
    void rightAngledNumberPyramid(int num){
        for(i = 1 ; i <= num ; i++){
            for(j = 1 ; j <= i ; j++){
                System.out.print(j +" ");
            }
            System.out.println();
        }
    }
        void rightAngledNumberPyramid2(int num ){
            for(i = 1 ; i <= num ; i++){
                for(j = 0 ; j < i ; j++){
                    System.out.print(i +" ");
                }
                System.out.println();
            }
    }
    public static void main(String [] args){
        
        // inputs 
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size ");
        int num = sc.nextInt();

        Pattern obj = new Pattern();

        System.out.println("\nBOX Pattern");
        obj.box(num);

        System.out.println("\nRight Angle Triangle");
        obj.rightAngleTrinagle(num);

        System.out.println("\nRight-Angled Number Pyramid");
        obj.rightAngledNumberPyramid(num);
        
        System.out.println("\nRight-Angled Number Pyramid - II");
        obj.rightAngledNumberPyramid2(num);
    }
}