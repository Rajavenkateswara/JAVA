package Demos;

interface cab
{
	public void bookcab();
}
 /*class OLA implements cab
{
	public void bookcab()
	{
		System.out.println("ola cab is booked");
	}
}*/ 

public class Test_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cab cab=()-> System.out.println("ola cab is booked");
		cab.bookcab();

	}

}
