
public class Project {

	public static void main(String[] args) {
		
		//creation of object
		Alien obj1=new Alien();
		
		
		//accessing properties of object using object reference
		System.out.println(obj1.name);
		System.out.println(obj1.salary);
		
		obj1.code();

	}

}

class Alien
{
	
	//also called as instance variables
	
	String name="Navin";
	int age=30;
	String tech="Blockchain";
	
	int salary=5000;
	
	public void code()
	{
		System.out.println("Reusing code");
	}
}

