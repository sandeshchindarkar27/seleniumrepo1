package apiautomation.apirestassured;

import java.util.Scanner;

public class loopmethod2 
{
public static void main(String[] args) 
{
	Scanner s=new Scanner(System.in);
	System.out.println("Please enter the value=");
	int a=s.nextInt();
	
	if (a>0) 
	{
		if (a%2==0)
		{
			System.out.println("EVEN Number");
		}
		else
		{
			System.out.println("ODD Number");
		}
	}
	else
	{
		System.out.println("Enter Only Positive Value");
	}
}
}
