package basicprograms;

import java.util.Arrays;

public class Arrayprogram5 

{

	public static void main(String[] args) 
	{
		String input= "kv no 2";
		char [] c1=input.toCharArray();
		System.out.println(Arrays.toString(c1));

		 boolean b1=  Character.isAlphabetic(c1[i]);
		 boolean b2= Character.isDigit(c1[i]);
		 boolean b3= Character.isWhitespace(c1[i]);
	}

}
