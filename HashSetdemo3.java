package collectiondemo;

import java.util.HashSet;

public class HashSetdemo3 {

	public static void main(String[] args) {
		HashSet<Integer> Set1=new HashSet<Integer>();
		Set1.add(1);
		Set1.add(2);
		Set1.add(3);
		Set1.add(4);
		Set1.add(5);
		Set1.add(6);
		Set1.add(7);
		System.out.println("The values in the set1:" +Set1);
		
		HashSet<Integer> Set2=new HashSet<Integer>();
		Set2.add(4);
		Set2.add(5);
		Set2.add(6);
		Set2.add(7);
		System.out.println("The values in the set2" +Set2);
		
		//union
		//Set1.addAll(Set2);
		//System.out.println("Union operation:" +Set1);
		
		//Intersection
		//Set1.retainAll(Set2);
		//System.out.println("intersection operation:" +Set1);
		
		//difference
		//Set1.removeAll(Set2);
		//System.out.println("differnce operation:" +Set1);
		//subset
		System.out.println(Set1.containsAll(Set2));
		

	}

}
