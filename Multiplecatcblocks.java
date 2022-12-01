package day9;

public class Multiplecatcblocks {

	public static void main(String[] args) {
		try{
			int arr[]=new int[5];
		arr[10]=100;
		System.out.println(arr);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		finally{
			System.out.println("The finally block is always excuted");
		}
		
		
		
		
		
}
}
//ArithmeticException