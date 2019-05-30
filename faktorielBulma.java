package practice3;
import java.util.Scanner;

public class faktorielBulma {

	public static void main(String[] args) {
		int fact =1;
		Scanner a= new Scanner(System.in);
		
		System.out.println("Please enter a positive number.");
		int num= a.nextInt();
		while (num<1) {
			System.out.println("Wrong entry. Please enter a positive number.");
			num=a.nextInt();
			
		}
		
		for (int i=num;i>0;i--) {
			
			fact*=i;
		}
		
		System.out.println(fact);
		
		
		
		
		
	}

}
