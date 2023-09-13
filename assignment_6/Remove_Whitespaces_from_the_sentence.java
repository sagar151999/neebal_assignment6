/*
 * Remove whitespace : Write a program that takes a sentence as input and removes all the
whitespace characters from it.
. Remove Whitespace: Test Case 1: Input: "Hello World" Expected Output: "HelloWorld"
Test Case 2: Input: " This is a test " Expected Output: "Thisisatest"
Test Case 3: Input: "NoWhitespaceHere" Expected Output: "NoWhitespaceHere"
Test Case 4: Input: " 123 456 789 " Expected Output: "123456789"
Test Case 5: Input: " " Expected Output: "" (empty string after removing all whitespace)
 */
package assignment_6;

import java.util.Scanner;

public class Remove_Whitespaces_from_the_sentence {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String str=sc.nextLine();
	String a=" ";
	for(int i=0;i<str.length();i++)
	{
		if(str.charAt(i)!=32)
		{
			a+=str.charAt(i);
		}
	}
		System.out.println(a);
		

	}

}
