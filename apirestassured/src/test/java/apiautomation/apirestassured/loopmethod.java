package apiautomation.apirestassured;

import java.util.Scanner;

public class loopmethod 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		
		System.out.println("Please enter the value");
		int a=s.nextInt();
		if (a%2==1) 
		{
			System.out.println("Number is ODD="+a);
		}
		else
		{
			System.out.println("Number is EVEN="+a);
		}
		
	}
}
