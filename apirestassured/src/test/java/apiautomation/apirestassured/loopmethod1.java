package apiautomation.apirestassured;

import java.util.Scanner;

public class loopmethod1 
{
public static void main(String[] args) 
{
	Scanner s=new Scanner(System.in);
	System.out.println("Please enter Marks=");
	int a=s.nextInt();
	if ((a>=0)&&(a<35))
	{
		System.out.println("Student is FAIL"+a);
	
	}
	else if ((a>=35)&&(a<60))
	{
		System.out.println("Student Is PASS"+a);
	}
	else if ((a>=60)&&(a<75))
	{
		System.out.println("Student Pass with First Class"+a);
	}
	else if ((a>=75)&&(a<100))
	{
		System.out.println("Student pass with Distinction"+a);
	}
	else 
	{
		System.out.println("Please Enter the valid Marks"+a);
	}
	
}
}
