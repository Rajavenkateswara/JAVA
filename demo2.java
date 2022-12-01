package Consumer;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class employee
{
	String Empname;
	int salary;
	String Gender;
	employee(String emp,int sal,String gen)
	{
		Empname=emp;
		salary=sal;
		Gender=gen;
		
	}
}
public class demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//employee emp1=new employee("raja",30000,"female");
		//System.out.println(emp1); 
		ArrayList<employee> emplist=new ArrayList<employee>();
		emplist.add(new employee("kiran",50000,"male"));
		emplist.add(new employee("scott",60000,"male"));
		emplist.add(new employee("daveed",4000,"female"));
		emplist.add(new employee("ramu",40000,"female"));
		emplist.add(new employee("ramesh",50000,"female"));
		emplist.add(new employee("rakesh",56000,"male"));
		//Calculate  BONUS of the employee
		//Function
		Function<employee,Integer> emp=e->(e.salary*10)/100;
		// Predication
		Predicate<Integer> p=b->b>=5000; //check the condition bonus as input parameter
		
		// consumer
		Consumer<employee> c=e1->{
			      System.out.println(e1.Empname);
			      System.out.println(e1.salary);
			      System.out.println(e1.Gender);
		           }; // task-3
		           
		           for(employee e:emplist)
		           {
		        	   int bonus=emp.apply(e); // caluclate bonus invoked by function
		        	   if(p.test(bonus))
		        	   {
		        		   c.accept(e);// invoke the customer
		        		   System.out.println("Employee bonus:" +bonus);
		        		   
		        	   }
		        			   
		        		  
		        			 
		        	    
		}
		
		

	}

}
