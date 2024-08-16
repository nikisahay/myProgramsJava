package strings;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		System.out.println("Please enter a string:: \n");
		String str = s.next();
	    System.out.println("The entered string is " +str);
	    int n = str.length();
	    String rev="";
	    for(int i = 0 ; i < n ; i++)
	    {
	    	rev = str.charAt(i)+rev;
	    }
	    
	    System.out.println("The reversed string is " +rev);
	}

}
