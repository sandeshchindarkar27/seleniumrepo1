package apiautomation.apirestassured;

public class selenium extends	Automation
{
	public selenium() 
	{
		super(34, 45);
		System.out.println("Default child Constructor");
	}
	
	public selenium(int a) 
	{
		this(56, 87);
		System.out.println("one parameterized child Constructor");
	}
	
	public selenium(int a,int b) 
	{
		this(23,45,78);
		System.out.println("two parameterized child Constructor");
	}
	
	public selenium(int a,int b,int c) 
	{
		this();
		System.out.println("three parameterized child Constructor");
	}
	public static void main(String[] args) 
	{
		selenium s=new selenium(45);
		
	}
	
}
