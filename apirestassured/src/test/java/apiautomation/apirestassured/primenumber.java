package apiautomation.apirestassured;

import java.util.Scanner;
import java.util.concurrent.CountDownLatch;

public class primenumber 
{
public static void main(String[] args) 
{
	System.out.println("enter a number");
	Scanner sc = new Scanner(System.in);
	int num=sc.nextInt();
	int count=0;
	for(int i=2;i<=num-1;i++)
	{
		if(num%i==0)
		{
			count=1;
		}
	}
	if(count>0)
	{
		System.out.println("not prime");
	}
	else
	{
		System.out.println("prime no ");
	}	
}
}
