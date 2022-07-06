package apiautomation.apirestassured;

import java.util.Scanner;

public class palindromenumber 
{
public static void main(String[] args) 
{
	Scanner s=new Scanner(System.in);
	System.out.println("Please enter the number");
	int number=s.nextInt();   //111
	int oldnumber=number;     //111
	int sum=0;    //0
	while(number>0)    //111    //11   //1
	{
		int r=number%10;    //1    //1   //1
		sum=sum*10+r;        //1 //11  //111
		number=number/10;   //11  //1  //0
		
	}
	if (sum==oldnumber) 
	{
		System.out.println("It Is a Polindrome Number");
		
	}
	else
	{
		System.out.println("It is not a Polindrome Number");
	}
}
}
