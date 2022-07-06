package apiautomation.apirestassured;

import java.util.Scanner;

public class armstrongnumber 
{
public static void main(String[] args) 
{
	Scanner number=new Scanner(System.in);
	System.out.println("Please enter the Number");
	int a=number.nextInt();
	int oldnumber=a;
	int sum=0;
	while (a>0) //153    //15    //1
		{
		int r=a%10;   //3    //5   //1
		sum=sum+r*r*r;  //27  //152  //153
		a=a/10;  //15   //1   //0
		}
	if (sum==oldnumber) 
	{
		System.out.println("its a Armstrong Number"+oldnumber);
		
		
	}
	else
	{
		System.out.println("It Is Not A Armstrong Number");
	}
}
}
