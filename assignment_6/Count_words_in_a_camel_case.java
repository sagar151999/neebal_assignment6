package assignment_6;

import java.util.Scanner;

public class Count_words_in_a_camel_case {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a camelcase string");
		String str=sc.next();
		int wordcount=0;
		for(int i=0;i<str.length();i++)
		{
			char currentchar=str.charAt(i);
			if(Character.isUpperCase(currentchar))
			{
				wordcount++;
			}
		}
		wordcount++;
		System.out.println("the number of words"+wordcount);
	}

}
