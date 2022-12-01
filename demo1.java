package Functinal_interface;

import java.util.function.Function;

public class demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Function<Integer,Integer> f=n->n*n;
		System.out.println(f.apply(5));
		System.out.println(f.apply(2));
		System.out.println(f.apply(6));
		System.out.println(f.apply(7));
		System.out.println(f.apply(8));
		//Example-2
		//String length
		//String---length--Integer
		Function< String,Integer> fn = s->s.length();
		System.out.println(fn.apply("kits"));
		System.out.println(fn.apply("Rajavenkateswarlu"));
		System.out.println(fn.apply("Raja venkateswarlu"));
		System.out.println(fn.apply("karravula"));
		System.out.println(fn.apply("srilaxmi"));
		System.out.println(fn.apply("brama"));
	}

}
