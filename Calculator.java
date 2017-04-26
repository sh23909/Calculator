package c5;

public class Calculator {
	public static int sum(int[] nums){
		int sum=0;
		for(int i=0;i<10;i++){
		sum+=nums[i];
		}
		return nums[0];
	}
	public static int sum(int a, int b){
		return a+b;
	}
	public static double sum(double a, double b){
		return a+b;
	}
	public static double avg(double c, double d){
		return (c+d)/2;
	}
	public static double pro(double e, double f){
		return e*f;
	}
	public static int fac(int g){
		
		
		int result=1;
		while (g>=1){
			result=result*g;
			g--;
		}
		
		return result;
	}
	public static int avg(int c, int d){
		return (c+d)/2;
	}
	public static int pro(int e, int f){
		return e*f;
	}
	public static double fac(double g){
		
		
		int result=1;
		while (g>=1){
			result=(int) (result*g);
			g--;
		}
		
		return result;
	}




}
