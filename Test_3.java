package Demos;
interface cab3
{
	public String bookcab2(String source,String destination);
}
/*class ola3 implements cab3
{
	public String bookcab2(String source,String destination){
	System.out.println("ola is booked from"+source+" to "+ destination);
	return("price : 3000 rupees");
	}
}*/
public class Test_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cab3 cab3=(source,destination)->{
		System.out.println("ola is booked from"+source+" to "+ destination);
		return("price : 3000 rupees");
		};
		
		System.out.println(cab3.bookcab2("ongole", "markapur"));

	}

}
