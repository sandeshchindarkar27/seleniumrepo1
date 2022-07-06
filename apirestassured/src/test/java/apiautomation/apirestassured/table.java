package apiautomation.apirestassured;

import java.util.Scanner;

public class table 
{
public static void main(String[] args) 
{
	Scanner a=new Scanner(System.in);
	System.out.println("enter number for table");
	int number=a.nextInt();
	
	for
	(int i=1;i<=10;i=i+1)
	
	{
		int table=number * i;
		System.out.println("table is"+table);	
	}
	
	
	
	
}
}
