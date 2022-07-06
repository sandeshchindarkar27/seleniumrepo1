package apiautomation.apirestassured;

import java.util.Scanner;

public class swapping 
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
	
	
	a=a+b; //9  //1+2=3   //4+5=9
	b=a-b; //4  //1-2=-1   //8-5=4
	a=a-b;  //5 //1-2=-1   //9-4=5
	
	System.out.println("after swapping"+a);
	System.out.println("after swapping"+b);
	
}
}
