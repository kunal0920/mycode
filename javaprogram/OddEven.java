package javaprogram;

import java.util.Scanner;

public class OddEven {

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		if(n%2==0)
		{
			System.out.println("Even Number");
		}
		else
		{
			System.out.println("Odd Number");
		}
	}
}
