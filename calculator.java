package javapractise1;

public class calculator {
	int x;
	int y;
	int z;
	calculator(int x,int y,int z)
	{
		this.x=x;
		this.y=y;
		this.z=z;
	}
	void sum()
	{
		System.out.println(x+y+z);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calculator cal1=new calculator (20,30,40);
		cal1.sum();
		
	}

}
