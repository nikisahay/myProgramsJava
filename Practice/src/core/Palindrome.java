package core;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter any word :");
		String str = sc.next();
		
		String rev = "";
		
		for (int i=0; i<str.length(); i++)
		{
			rev = str.charAt(i) + rev;
		}
		System.out.println("output is : "+rev);
		if ( str.contains(rev)) {
			System.out.println("Palindrom");
			
		}else
		{
			System.out.println("Not Palindrom");
		}
	}
}
