package javaprogram;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String args[])
	{
		int count=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();		//n=3
		
		for(int i=1;i<=n;i++)	//1<=3//2<=3//3<=3//
		{	
			if(n%i==0)	//3%1=0-->0=0->true//3%2=1->false//3%3=0->true
			{
				count++;	//count=0++>1++>2
			}
		}
			if(count==2)	//2==2-->true
			{	
				System.out.println("is  prime");// it is prime
				//break;
			}
			else {
				System.out.println("is not prime");
				//break;
				
			}
		}
	}

		



