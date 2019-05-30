package practice6;

import java.util.Scanner;

public class printingDate {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		
		System.out.println("Please enter the day.");
		int day= input.nextInt();
		
		while(day<1 || day>31) {
			System.out.println("Wrong entry, please type again.");
			day=input.nextInt();
		}
		
		System.out.println("Please enter the month.");
		int month=input.nextInt();
		
		while(month<1 || month>12) {
			System.out.println("Wrong entry, please type again.");
			month=input.nextInt();
		}
		
		System.out.println("Please enter the year.");
		int year=  input.nextInt();
		
		
		dmy(day,month,year);
		mdy(day,month,year);
		ymd(day,month,year);
	}
	
	static void dmy(int day, int month,int year) {
		System.out.println("Date-Month-Year is :"+day+"."+month+"."+year);
	}
	static void mdy(int day, int month,int year) {
		System.out.println("Month-Date-Year is :"+month+"."+day+"."+year);
	}
	static void ymd(int day, int month,int year) {
		System.out.println("Year-Month-Day is :"+year+"."+month+"."+day);
	}
	

}
