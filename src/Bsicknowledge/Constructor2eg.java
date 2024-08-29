package Bsicknowledge;

public class Constructor2eg {
	
	Constructor2eg()//non parametrized constructor
	{
		
		System.out.println("hello world");
	}
	Constructor2eg(int a)// parametrized constructor
	{
		System.out.println("hellooo world");
	}
	public static void main(String[] args) {
		new Constructor2eg();//non parametrized object creation
		new Constructor2eg(32000);//parametrized object creation
		
		
	}

}
