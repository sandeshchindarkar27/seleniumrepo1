package apiautomation.apirestassured;

import java.util.Scanner;

public class swappingwithc 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter Number");
		int a=s.nextInt();
		System.out.println("enter Number");
		int b=s.nextInt();
		
		System.out.println("before swapping"+a);
		System.out.println("before swapping"+b);
		
		int c=a;
		a=b;
		b=c;
		
		System.out.println("after swapping"+a);
		System.out.println("after swapping"+b);
		
	}
}
