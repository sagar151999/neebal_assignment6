/*
 * Replace characters : Create a program that replaces all occurrences of a specified character
with another character in a given string.
Replace Characters: Test Case 1: Input String: "Hello World" Character to Replace: "o"
Replacement Character: "X" Expected Output: "HellX WXrld"
Test Case 2: Input String: "abracadabra" Character to Replace: "a" Replacement Character: "z"
Expected Output: "zbrzczdzbrz"
Test Case 3: Input String: "Mississippi" Character to Replace: "i" Replacement Character: "e"
Expected Output: "Messesseppe"
Test Case 4: Input String: "abcdeedcba" Character to Replace: "d" Replacement Character: "X"
Expected Output: "abcXeeXcba"
Test Case 5: Input String: "aaaaa" Character to Replace: "a" Replacement Character: "b"
Expected Output: "bbbbb"
 */
package assignment_6;

import java.util.Scanner;

public class replace_characters_in_an_string {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the character do you want to replace with charachter");
		String str=sc.nextLine();
		System.out.println("enter the charcter do you want to replace a Character");
		char target=sc.nextLine().charAt(0);
		System.out.println("enter the character replace with which character");
		char replacement=sc.nextLine().charAt(0);
		
		char[]chararray=str.toCharArray();
		for(int i=0;i<chararray.length;i++)
		{
			if(chararray[i]==target)
			{
				chararray[i] = replacement;
			}
		}
		String Result=new String(chararray);
		System.out.println("old character: "+str);
		System.out.println("new character: "+str);
		sc.close();
	}

}
