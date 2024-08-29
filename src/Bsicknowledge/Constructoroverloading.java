package Bsicknowledge;

public class Constructoroverloading {
	
	Constructoroverloading()//parametrized constructor
	{
		System.out.println(78);
	}
	
	Constructoroverloading(String a)//parametrized constructor
	{
		System.out.println("Binvit");
	}
	
	Constructoroverloading(int a, double c)//parametrized constructor
	{
		System.out.println("3456789676");
	}
	
	public static void main(String[] args)
	{
		Constructoroverloading m1 = new Constructoroverloading();
		Constructoroverloading m2 = new Constructoroverloading("1");
		Constructoroverloading m3 = new Constructoroverloading(100,12345);
		
		
	}
	
}
