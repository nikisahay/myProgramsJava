package strings;

import java.util.HashMap;
import java.util.Scanner;

public class MaxCharacterCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		System.out.println("Please enter a string:: \n");
		String str = s.next();
	    System.out.println("The entered string is " +str);
		HashMap<Character, Integer> mp = new HashMap<>();
		int n = str.length();
		
		char ans = 0;
		int cnt = 0;
		
		for(int i = 0 ; i< n ; i++)
		{
			char c = str.charAt(i);
			mp.put(c, mp.getOrDefault(c, 0) + 1);
			
			if(cnt < mp.get(c)) {
				ans = c;
				cnt = mp.get(c);
			}
		}
       System.out.println("Max occurring character is: " +ans+ " and the count is " +cnt);
	}

}
