package assignment_6;
import java.util.Scanner;
public class longest_palindrome_sustring {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        String input = scanner.nextLine();
	        scanner.close();

	        String longestPalindrome = findLongestPalindrome(input);

	        if (longestPalindrome.isEmpty()) {
	            System.out.println("No palindromic substring found.");
	        } else {
	            System.out.println("Longest Palindromic Substring: " + longestPalindrome);
	        }
	    }

	    public static String findLongestPalindrome(String s) {
	        if (s == null || s.length() == 0) {
	            return "";
	        }

	        int start = 0;
	        int end = 0;

	        for (int i = 0; i < s.length(); i++) {
	            int len1 = expandAroundCenter(s, i, i);
	            int len2 = expandAroundCenter(s, i, i + 1);
	            int len = Math.max(len1, len2);

	            if (len > end - start) {
	                start = i - (len - 1) / 2;
	                end = i + len / 2;
	            }
	        }

	        return s.substring(start, end + 1);
	    }

	    private static int expandAroundCenter(String s, int left, int right) {
	        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
	            left--;
	            right++;
	        }
	        return right - left - 1;
	    }
	}


