// 26. Verify if three points are collinear.
import java.util.Scanner;
import java.lang.Math;
class Collinear{
    int x,y;
    Collinear(){
        System.out.println("Normal running : ");
    }
    Collinear(int x,int y){
        this.x = x;
        this.y = y;
    }
    double distance(Collinear obj1 , Collinear obj2){
        return Math.sqrt(Math.pow(obj2.x - obj1.x,2)+Math.pow(obj2.y - obj1.y,2));
        
    }
    public static void main(String [] args){
        // Scanner sc = new Scanner(System.in);
        Collinear c1 = new Collinear(1,1);
        Collinear c2 = new Collinear(2,2);
        Collinear c3 = new Collinear(3,1);
        Collinear obj = new Collinear();
        double d1 = obj.distance(c1,c2);
        double d2 = obj.distance(c2,c3);
        double d3 = obj.distance(c3,c1);
    //    System.out.println(obj.distance(c1,c2));
       
       if (d1 + d2 == d3 || d2 + d3 == d1 || d3 + d1 == d2){
        System.out.println("COllinear Points");
       }else{
        System.out.println("Non Collinear Points");
       }
    }
}
