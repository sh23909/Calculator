package c5;

public class CalculatorDrive {
	public static void main (String [] args){
		int nums[] = new int[10];
		for(int i=1;i<10;i++){
			nums[i]=i+1;
		}
	
		int numbers[]={1,2,3,4,5,6,7,8,9,10};
		System.out.println(Calculator.sum(nums));
		System.out.println(Calculator.sum(1,4));
		System.out.println(Calculator.sum(1.2,4.3));
		System.out.println(Calculator.avg(1.2,4.3));
		System.out.println(Calculator.avg(1,4));
		System.out.println(Calculator.pro(1.2,4.3));
		System.out.println(Calculator.pro(1,4));
		System.out.println(Calculator.fac(5));
		System.out.println(Calculator.fac(4));
	}

}
