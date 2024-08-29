package Bsicknowledge;

public class Staticandnonstatic {

	public static void add()
	{
		int a=100;
		int b=200;
		int sum=a+b;
		System.out.println(sum);
		}
	public static void sub()
	{
		int a=100;
		int b=200;
		int sum=a-b;
		System.out.println(sum);
		}
	void div()
	{

		int a=100;
		int b=200;
		int sum=a/b;
		System.out.println(sum);
	}
	public static void main(String[] args)
	{
        add();
        sub();
		Nonstaticmethods n1 = new Nonstaticmethods();//syntax to create an object
		n1.div();
		
	}
}
