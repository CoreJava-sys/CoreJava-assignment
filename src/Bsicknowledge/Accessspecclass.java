package Bsicknowledge;

public class Accessspecclass {
	
	  public  void add()
	    {
	    	System.out.println("1");
	    }
	   private void sub()
	    {
	    	System.out.println("2");
	    }
	   protected void mul()
	    {
	    	System.out.println("3");
	    }
	    void div()
	    {
	    	System.out.println("4");
	    }
	    
		public static void main(String[] args)
		{
			Accessspecclass A1= new Accessspecclass();
					A1.add();
					A1.div();
					A1.mul();
					A1.sub();

		}

	}


