// 17. Calculate profit or loss based on cost and selling price in percentage .

import java.util.Scanner;
class ProfitOrLoss{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter you cost price of the product : ");
        float cp = sc.nextFloat();
        System.out.print("Enter selling price of the product : ");
        float sp = sc.nextFloat();
        if(cp > sp){
            System.out.println("it a loss " + ((cp-sp) / cp) * 100f  );
        }else if (sp > cp){
            System.out.println("its a profit " + ((sp-cp) / cp) * 100f);
        }else{
            System.out.println("not get any thing ");
        }
    }
}