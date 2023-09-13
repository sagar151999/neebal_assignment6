package assignment_6;

import java.util.Scanner;

public class String_rotation {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		boolean isrotation;
		System.out.println("eneter the first string");
		String str1=sc.next();
		System.out.println("enter the second string");
		String str2=sc.next();
		if(isrotation(str1,str2))
		{
			System.out.println("true: "+str2+str1);
		}	
		else
		{
		System.out.println("false: "+str2+str1);	
		}
	}

	public static boolean isrotation(String str1, String str2) 
	{
		if(str1.length()!=str2.length()||str1.isEmpty())
		{
		return false;
		}
		
		String concanetedstring=str1+str1;
		return concanetedstring.contains(str2);
	}

}
