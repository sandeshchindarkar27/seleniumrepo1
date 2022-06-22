package apiautomation.apirestassured;

public class automationmethod 
{
	public void method1()
	{
		this.method4(23,34,45);
		System.out.println("default parent method");
	}
	
	public void method2(int a)
	{
		this.method1();
		System.out.println("one parameterized parent method");
	}
	
	public void method3(int a,int b)
	{
		this.method2(23);
		System.out.println("two parameterized parent method");
	}
	
	public void method4(int a,int b,int c)
	{
		System.out.println("three parameterized parent method");
	}
}
