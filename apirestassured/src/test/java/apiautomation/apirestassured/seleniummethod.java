package apiautomation.apirestassured;

public class seleniummethod extends automationmethod
{
	public void sel1()
	{
		this.sel3(23,67);
		System.out.println("default child method");
	}
	public void sel2(int a)
	{
		
		this.sel1();
		System.out.println("one parameterized child method");
	}
	public void sel3(int a,int b)
	
	{
		
		System.out.println("two parameterized child method");
	}
	public void sel4(int a,int b,int c)
	{
		super.method3(4,5);
		this.sel2(34);
		System.out.println("three parameterized child method");
	}
	public static void main(String[] args) 
	{
		seleniummethod obj=new seleniummethod();
		obj.sel4(34,67,89);
	}
}
