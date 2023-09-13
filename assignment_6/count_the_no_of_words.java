package assignment_6;

import java.util.Scanner;

public class count_the_no_of_words {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the words do you want to count");
		String str=sc.nextLine();
		int wordcount=0;
		boolean word = false;
		for(int i=0;i<str.length();i++)
		{
			char currentcharacter=str.charAt(i);
			if(Character.isWhitespace(currentcharacter))
			{
				word=false;
			}
			else if(!word)
			{
				wordcount++;
				word=true;
			}
				
		}
		System.out.println("number of words"+wordcount);

	}

}
