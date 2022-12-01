package Demos;

interface cab1
{
	public void bookcab1(String source,String destination);
}
/*class ola1 implements cab1
{
	public void bookcab1(String source,String destination)
	{
		System.out.println("Ola cab is booked from"+source+"  "+ "to"+destination);

	}
}*/




public class Test_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cab1 cab1=(source,destination)->System.out.println("Ola cab is booked from"+source+"  "+ "to"+destination);
		cab1.bookcab1("SR NAGAR", "KPHB"); 
	}

}
