package Predicate;

import java.util.function.Predicate;

//PREDICATE ---TAKES ONLY ONE ARGUMENTS AND RETURN TYPE BOOLEAN
//PREDICATE USE ONLY CHECK THE CONDITION IN PROGRAM

public class PredicateDemo_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Example-1
		Predicate<Integer> p=i->(i>40);
		
		System.out.println(p.test(20));
		System.out.println(p.test(100));
		
		// Ex-2: CHECK THE GIVEN STRING IS GREATER THEN 4 OR NOT
		Predicate<String> pr =S->(S.length()>4);
		
		System.out.println(pr.test("rajavenkayeswarlu"));
		System.out.println(pr.test("raja"));
		
		//Ex-3: Check the array elements whose size is >4 from ARRAY
		String names[]={"RAJA","SCOTT","DAVEED","GUMMA","SRI","PADDU","BRAMARAMBA"};
		
		for(String name:names)
		{
			if(pr.test(name))
			{
				System.out.println(name);
			}
			/*if(name.length()>4)
			{
				System.out.println(name);	
			}*/
		}
		
		

	}

}
