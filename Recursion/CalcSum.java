package Recursion;

public class CalcSum {

	public static int calcSum(int n){
		if(n==1) {
			return 1;
		}
		int sn=n+calcSum(n-1);
		return sn;
	}
	public static void main(String[] args) {
		int n=5;
		System.out.println("sum of first "+n +" numbers = "+calcSum(n));

	}

}
