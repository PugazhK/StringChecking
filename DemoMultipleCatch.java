package exceptions;

public class DemoMultipleCatch {
	
	public static void main (String [] args) {
		
		int a =10;
		int b =0;
		
		try
		{
			String name = "Hello";
			System.out.println(name.charAt(7));
			
		}
		catch(StringIndexOutOfBoundsException se)
		{
			System.out.println(se);
			se.printStackTrace();
		}
		
		try {
			
			System.out.println(a/b);
		}
		catch(ArithmeticException ae)
		{
			System.out.println(ae);
			ae.printStackTrace();
		}
		catch(NumberFormatException ne) {
			System.out.println(ne);
			ne.printStackTrace();
		}
		
		catch(Exception e)
		{
			System.out.println(e);
			e.printStackTrace();
		}
		finally {
			System.out.println("Finally block executed");
		}
		
		
	}

}
