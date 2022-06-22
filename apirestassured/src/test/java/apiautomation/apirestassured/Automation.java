package apiautomation.apirestassured;

public class Automation 
{

	public Automation() 
	{
		this(23,78,98);
		System.out.println("Default parent Constructor");
	}
	
	public Automation(int a) 
	{
		this();
		System.out.println("one parameterized parent Constructor");
	}
	
	public Automation(int a,int b) 
	{
		this(67);
		System.out.println("two parameterized parent Constructor");
	}
	
	public Automation(int a,int b,int c) 
	{
		
		System.out.println("three parameterized parent Constructor");
	}
	

}
