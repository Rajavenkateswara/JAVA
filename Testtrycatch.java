package day9;

public class Testtrycatch {

	public static void main(String[] args) {
		System.out.println("Program is started");
		System.out.println("Program is ended");
		
		/*int a =100;
		int res=0;
		
		try{
		//System.out.println(a/2);// Throw the Arithmetic exception
			res=a/0;
		}
		catch(ArithmeticException e){
			System.out.println("Enter the catch block");
		}
		
		System.out.println(res);*/
		
		String s=null;
		try
		{
		System.out.println(s.length());// throws NullPointerException
		}
		catch(Exception e)
		{
			System.out.println("ENTR THE CATCH BLOCK");
		}
		String b="abc";
		//int x=Integer.parseInt(b);
		//System.out.println(x); // thows NumberFormatException
		int arry[]=new int[5];
		//arry[10]=100;
		//System.out.println(arry[10]); //ArrayIndexOutOfBoundsException
		
		
		
		
		System.out.println("Program is completed ");
		System.out.println("Program is excuted"); 

	}

}
