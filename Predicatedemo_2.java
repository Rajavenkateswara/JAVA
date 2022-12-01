package Predicate;

import java.util.ArrayList;
import java.util.function.Predicate;

class employee
{
	String name;
	int salary;
	int experience;
	
	employee(String ename,int sal,int exp)
 	{
 		name=ename;
 		salary=sal;
 		experience=exp;
 	}
 }
public class Predicatedemo_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//EXAMPLE-1
		employee emp =new employee("raja",500,5);
		Predicate<employee> pr=e->(e.salary>3000 && e.experience>3);
		System.out.println(pr.test(emp));
		
		// EXAMPLE-2
		ArrayList<employee> a1=new ArrayList<employee>();
		a1.add(new employee("raja",500,2));
		a1.add(new employee("srikanth",50000,5));
		a1.add(new employee("gumma",60000,6));
		a1.add(new employee("goverdhan",50000,4));
		a1.add(new employee("scott",200,2));
		a1.add(new employee("daveed",500,3));
		
		for(employee e:a1)
		{
			//if(pr.test(e))
			if(e.salary>3000 && e.experience>2)
			{
				System.out.println(e.name+"  "+e.salary);
			}
		}
	
	}
}
