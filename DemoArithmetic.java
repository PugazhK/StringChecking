package exceptions;

public class DemoArithmetic {

	public static void main(String[] args) {
		int a = 10;
		int b =0;
		
		try
		{
			System.out.println(a/b);
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Any number should not be divided ");
			System.out.println(ae);
			ae.printStackTrace();
		}
	}

}
