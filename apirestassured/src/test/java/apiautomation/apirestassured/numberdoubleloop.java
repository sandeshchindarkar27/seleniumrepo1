package apiautomation.apirestassured;

public class numberdoubleloop 
{/*
	1
	23
	456
	7890*/
public static void main(String[] args) 
{
	int num=0;
	for(int i=1;i<=4;i++)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print(num++);
		}
		System.out.println();
	}
	
	
	for(int i=1;i<=4;i++)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print(" "+j);
		}
		System.out.println();
	}
		
}
}
