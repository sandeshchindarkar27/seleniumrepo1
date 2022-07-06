package apiautomation.apirestassured;

import java.util.Scanner;
import java.util.concurrent.CountDownLatch;

import org.w3c.dom.css.Counter;

public class primenumber2 
{
public static void main(String[] args) 
{
	Scanner s=new Scanner(System.in);
	System.out.println("Please enter number");
	int num=s.nextInt();
	int half=num/2;
	int count=0;
	for (int i=2;i<=half;i=i+1)
	{
		if (num%i==0) 
		{
			System.out.println("not a prime number");
			count=1;
			break;
		
		
		}
		
		
	}
	if (count==0) 
	{
		System.out.println("prime number");

	}
	
}
}
