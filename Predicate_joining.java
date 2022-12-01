package Predicate;

import java.util.function.Predicate;

public class Predicate_joining {

	public static void main(String[] args) {
	// Combine the predicates by using AND OR negate;
		int a[]={20,30,45,44,80,60,88,120,140,3,5,9};
		
		Predicate<Integer> p1=i->i%2==0;
		Predicate<Integer>p2=i->i>50;
		System.out.println("The given number is greater than 50 and even");
		
		for(int n:a)
		{
			/*if (p1.and(p2).test(n))//if(p1.test(n) && p2.test(n))
			{
				System.out.println(n);
			}*/
			
			/*if (p1.or(p2).test(n))//if(p1.test(n) && p2.test(n))
			{
				System.out.println(n);
			}*/
			
			if (p1.negate().test(n))//if(p1.test(n) && p2.test(n))
			{
				System.out.println(n);
			}
		}
		

	

}
}
