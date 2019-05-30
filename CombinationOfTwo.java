package practice5;

import java.util.Scanner;

public class CombinationOfTwo {

	public static void main(String[] args) {
		Scanner a= new Scanner(System.in);
		
		
		System.out.println("Please enter first positive number.");
		int num1=a.nextInt();
		System.out.println("Please enter second positive number.");
		int num2=a.nextInt();
		
		
		
		int result = comb(num1,num2);
		
		System.out.println(result);

	}
	
	static int comb(int num1,int num2){
		int result;
		
		result = fact(num1)/(fact(num2)* fact(absoluteMinus(num1,num2)));
		return result;
	}
	
	static int fact(int num) {
		int result=1;
		
		for(int i=1;i<=num;i++) {
			result*=i;
		}
		
		return result;
	}
	static int absoluteMinus(int num1,int num2) {
		int biggerOne;
		
		if(num1<num2) {
			biggerOne=num2;
			num2=num1;
			num1=biggerOne;
		}
		
		int result=num1-num2;
		return result;
	}

}
