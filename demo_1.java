package Supplier;

import java.sql.Date;
import java.util.function.Supplier;

public class demo_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Supplier<Date> s=()->new Date(0);
		System.out.println(s.get());

	}

}
