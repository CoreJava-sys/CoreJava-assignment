package Bsicknowledge;

public class Methodoverlaoding {
	
	void add()
	{
		int a=10;
		System.out.print(10);
	}
	
	void add(int a)
	{
		System.out.print(60);
	}

	static void add(int a, double b)
	{
		System.out.print(a+8);
	}
	
	public static void main(String[] args)
	{
		add(9,0.9);
		Methodoverlaoding m1 = new  Methodoverlaoding();
		m1.add(0);
		m1.add(6, 0.56);
}
}
