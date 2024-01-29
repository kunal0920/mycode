package javaprogram;

import java.util.Scanner;

public class SumNaturalNumber {

	public static void main(String Args[])
	{
		int sum=0;
		System.out.println("Enter no of term ");
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			sum=sum+i;
		}
		System.out.println("addition=" + sum);
	}
}
