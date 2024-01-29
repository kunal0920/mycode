package javaprogram;

import java.util.Scanner;

public class factorial {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		int i,fact=1,num=n;
		//int num =5;
		for(i=1;i<=num;i++) {
			
			fact=fact*i;
			
		}
		System.out.println("factorial of "+num+"is:"+fact);
	}

}
