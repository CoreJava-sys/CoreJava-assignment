package Bsicknowledge;

public class Sangeethaconstructor {
	
	Sangeethaconstructor()//method 1
	{
		System.out.println("constructor");
	}
	
	void add()//method 2
	{
		System.out.println("Non static ");
		
	}
	
	static void sub()//method 3
	{
		System.out.println("static Method ");
	}
	public static void main(String[] args)//method 4
	{
		Sangeethaconstructor m1 =new Sangeethaconstructor();
		m1.add();
		sub();
		
	}
}
		
		
		
		

	
	


