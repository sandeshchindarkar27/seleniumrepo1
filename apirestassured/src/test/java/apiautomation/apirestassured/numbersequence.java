package apiautomation.apirestassured;

import java.util.Scanner;

public class numbersequence 
{
public static void main(String[] args) 
{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter number for fibnocci series");
	int a=s.nextInt();
	System.out.println(+a);
	int b=a+1;
	System.out.println(+b);
	int sum;
	for(int i=1;i<=12;i=i+1)
	{
		sum=a+b;
		System.out.println(+sum);
		a=b;
		b=sum;
	}
}
}
