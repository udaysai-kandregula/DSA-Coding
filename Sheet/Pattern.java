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
    void inventedRigthPyramid(int num){
        for(i = 0 ; i < num ; i++){
            for(j = 0 ; j < num-i ; j++){
                System.out.print("*"+ " ");
            }
            System.out.println();
        }
    }
    void inventedNumRigthPyramid(int num){
        for(i = 0 ; i < num ; i++){
            for(j = 1 ; j <= num-i ; j++){
                System.out.print(j+ " ");
            }
            System.out.println();
        }
    }
    void starPyramid(int num){
        int k = 1,count = 1;
        for(i = 1 ; i <= num ; i++){
            for(j = 1 ; j <= num-i ; j++){
                System.out.print(" ");
            }
            for(k = 1 ; k <= count ; k++){
                System.out.print("*" +"");
            }
            count +=2;
            System.out.println();
        }  
        System.out.println("\nModel II\n");
        for(i = 0 ; i < num ; i++){
            for(j = 0; j < num-i ; j++){
                System.out.print(" ");
            }
            for(k = 0 ; k < 2*i+1 ; k++){
                System.out.print("*" +"");
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

        System.out.println("\nPattern-1:BOX Pattern");
        obj.box(num);

        System.out.println("\nPattern-2:Right Angle Triangle");
        obj.rightAngleTrinagle(num);

        System.out.println("\nPattern-3:Right-Angled Number Pyramid");
        obj.rightAngledNumberPyramid(num);
        
        System.out.println("\nPattern-4:Right-Angled Number Pyramid - II");
        obj.rightAngledNumberPyramid2(num);

        System.out.println("\nPattern-5: Inverted Right Pyramid");
        obj.inventedRigthPyramid(num);

        System.out.println("\nPattern - 6: Inverted Numbered Right Pyramid");
        obj.inventedNumRigthPyramid(num);

        System.out.println("\nPattern - 7: Star Pyramid");
        obj.starPyramid(num);

        // System.out.println("_" + *5);

    }
}