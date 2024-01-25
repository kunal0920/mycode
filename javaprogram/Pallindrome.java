package javaprogram;

import java.util.Scanner;

public class Pallindrome {
	
	public static void main(String args[])
	{
		int s=0,c,r;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter any number");
		int n=sc.nextInt();
		c=n;			//n=121;-->c
		
		while(n>0)		//121>0-->true//12>0-->true//1>0-->true ##0>0##-->false
		{
			r=n%10;		//121%10-->1//12%10-->2//1%10-->1
			s=(s*10)+r;	//0*10+1-->1//1*10+2-->12//12*10+1-->121
			n=n/10;		//	121/10-->12//12/10-->1//1/10-->0
		}
			if(c==s)	//121=121-->true
			{
				System.out.println("It Is Pallindrome");
			}
			else
			{
				System.out.println("It Is Not Pallindrome");
			}
	}

}
