 package day9;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ThrowsKeyWord {

	public static void main(String[] args) throws InterruptedException, IOException{
	
			FileReader fr=null;
			fr=new FileReader("C:\\Users\\ RAJA VENKATESWARLU\\Desktop\\Manual testing\\nptel testing material\\funtional testing");
			
			BufferedReader bfr=new BufferedReader(fr);
			System.out.println(bfr.readLine());
			
			Thread.sleep(5000);

	}

}
