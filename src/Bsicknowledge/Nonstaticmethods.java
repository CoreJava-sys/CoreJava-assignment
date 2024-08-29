package Bsicknowledge;

public class Nonstaticmethods {
	
	void add()
	{
		int a1=200;
		int a2=200;
		int sum=a1+a2;
		System.out.println(sum);
		
	}	
	void sub()
	{
		int a1=200;
		int a2=200;
		int sum=a1-a2;
		System.out.println(sum); 
	}
	void mul()
	{
		int a1=200;
		int a2=200;
		int sum=a1*a2;
		System.out.println(sum); 
	}
	void div()
	{
		int a1=200;
		int a2=200;
		int sum=a1/a2;
		System.out.println(sum); 
	}
	void mod()
	{
		int a1=200;
		int a2=200;
		int sum=a1%a2;
		System.out.println(sum); 
	}
		public static void main (String[] args)
		{
			Nonstaticmethods n1 = new Nonstaticmethods();//syntax to create an object
			n1.add();
			n1.sub();
			n1.div();
			n1.mod();
			n1.mul();
		}
		
		
		
	}
	

