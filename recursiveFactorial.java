package practice4;

import java.util.Scanner;

public class recursiveFactorial {

	public static void main(String[] args) {
		int i=1;
		System.out.println("Please enter a positive number.");
		Scanner a= new Scanner(System.in); 
		int num= a.nextInt();
		while (num<1) {
			System.out.println("Wrong entry, please enter a positive number.");
			num=a.nextInt();
		}
		
		
		int result = fact(num,i);
		System.out.println(result);
		

	}
	
	static int fact(int num,int i) {
		
		if(i==num) return num;
		
		
		return i*fact(num,i+1);
	}

}
