package day9;

public class FinallyBlock {

	public static void main(String[] args) {
		System.out.println("Program is started");
		int a=100;
		try
		{
		System.out.println(a/0);
		}
		catch(Exception e)
		{
			System.out.println("Enter into the catch block");
			
		}
		finally
		{
			System.out.println("Eneter to the finally block");
		}
		System.out.println("The program is exited");
	}

}
