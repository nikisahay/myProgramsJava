package yps;

import java.util.Scanner;

public class SwaptwoNosRohit {
	public static void main(String[] args) {
		
		Scanner  s= new Scanner(System.in);
		System.out.println("Please enter two numbers:: \n");
		int a = s.nextInt();
		int b = s.nextInt();
		
		System.out.println("Entered numbers: \n "+ a +" "+b);
		a = a + b;
		b = a - b;
		a = a - b;
		
		System.out.println("Result : \n"+a +" "+ b);
				
  }
}
