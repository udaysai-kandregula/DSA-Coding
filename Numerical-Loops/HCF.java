// 73. Find the HCF (GCD) of two numbers.

class HCF{
	public static void main(String [] args){
		int num1= 24;
		int num2 = 40;	
		while(num2 != 0){
			int temp = num1 % num2;
			num1 = num2;
			num2 = temp;
		}
		System.out.println(num1);
	}
}
