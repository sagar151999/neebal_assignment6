/*
 * Check balanced parenthesis : Develop a program that checks whether at given string
containing parenthesis is balanced or not.
Check Balanced Parentheses: Test Case 1: Input: "((()))" Expected Output: True
Test Case 2: Input: "()()()()" Expected Output: True
Test Case 3: Input: "((())" Expected Output: False
Test Case 4: Input: "(()())" Expected Output: True
Test Case 5: Input: "())(" Expected Output: False
 */

package assignment_6;
import java.util.Scanner;
public class check_balance_paranethesis {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the parenthesis do you want to check");
		String str=sc.nextLine();
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			char currentchar=str.charAt(i);
			if(currentchar=='(')
			{
				count++;
			}
			else if(currentchar==')')
			{
				count--;
			}
			if(count<0)
			{
				System.out.println("false");
			}
		}
		if(count==0) 
		{
			System.out.println("true");
		}
		else
			System.out.println("false");

	}

}
