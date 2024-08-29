package Bsicknowledge;

public class world {
	      world()//non parameterised constructor
	      {
	    	  System.out.println("1");
	      }
	      world(double a)//parameterised constructor
	      {
	    	  System.out.println("2");
	      }
	      world(int  a)//parameterised constructor
	      {
	    	  System.out.println("3");
	      }
	      world(String a)//parameterised constructor
	      {
	    	  System.out.println("4");
	      }
	      world(int a,double b)//parameterised constructor
	      {
	    	  System.out.println("5");
	      }
	      world(int a,int b,int c,int d,int e,int f,int g)
	      {
	    	  System.out.println("6");
	      }
	      world(int a,boolean b,String c,double d,char e,float f,long g)
	      {
	    	  System.out.println("7");
	      }
		public static void main(String[] args) {
			world w1= new world();//non parameterised object creation
			world w2= new world(3.14);//parameterised object creation
			world w3= new world(100);
			world w4= new world("A");
			world w5= new world(100,90.76);
			world w6= new world(128,-200,2356,-8765,89788,235566,877);
			world w7= new world(128,true,"A",87.67,'A',12.89f,253253226);

		}

}
