package collectiondemo;

import java.util.HashSet;

public class HashSetColletionDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> evennumber=new HashSet<Integer>();
		evennumber.add(2);
		evennumber.add(4);
		evennumber.add(6);
		evennumber.add(8);
		evennumber.add(10);
		evennumber.add(12);
		evennumber.add(14);
		System.out.println(evennumber);
		
		HashSet<Integer> number=new HashSet<Integer>();
		
		//addAll()
		number.addAll(evennumber);
		number.add(16);
		System.out.println(number);
		
		//removeAll
		number.removeAll(evennumber);
		System.out.println(number);
		//size()
		System.out.println(evennumber.size());
		
		
		
		
	}

}
