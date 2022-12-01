package Functinal_interface;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

class employee
{
	String name;
	int salary;
	employee(String name,int salary)
	{
		this.name=name;
		this.salary=salary;
	}
}

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<employee> emp=new ArrayList<employee>();
		emp.add(new employee("scoot",10000));
		emp.add(new employee("daveed",10000));
		emp.add(new employee("ashok",20000));
		emp.add(new employee("john",30000));
		emp.add(new employee("mary",40000));
		emp.add(new employee("pulli",45000));
		emp.add(new employee("king",70000));
		
		Function<employee,Integer> fn=e->{
									int sal=e.salary;
									if ((sal>=10000)&&(sal<=20000))
										return (sal*10/100);
									else if((sal>20000)&&(sal<=30000))
										return (sal*20/100);
									else if((sal>30000)&&(sal<=40000))
										return (sal*30/100);
									else
										return(sal*40/100);
									};
			Predicate<Integer> pr=i->i>5000;
			
	for(employee emplist:emp)
	{
		int bonus=fn.apply(emplist); /// FUNCTION
		if(pr.test(bonus)) // predicated
		{
		System.out.println(emplist.name+"  "+emplist.salary);
		System.out.println("The bouns is"+bonus);
		}
		
			
		
		
	}
				
		
		

	}

}
