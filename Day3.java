package basics;

import java.util.Scanner;

public class Day3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the number :");
//		int n = sc.nextInt();
//		
//		if(n>0) {
//			System.out.println("The number is positive");
//		}
//		else if (n<0)
//			System.out.println("The number is negative");
//		else
//			System.out.println("The number is zero");
//		
//		
//		//Leap year example
//		System.out.println("Enter the year :");
//		int year = sc.nextInt();
//		if (year%4==0 && year%100!=0 || year%100==0) {
//			System.out.println("Its a leap year");
//		}
//			else 
//				System.out.println("Not a leap year");
//		
//		
//		//calculator using switch
//		System.out.println("Enter the operation :");
//		int operation = sc.nextInt();
//		System.out.println("Enter the number1 :");
//		int a = sc.nextInt();
//		System.out.println("Enter the second number :");
//		int b = sc.nextInt();
//		
//		switch(operation) {
//		case 1:
//			int sum = a +b;
//			System.out.println("the sum is :" +sum);
//			break;
//		case 2:
//			int substraction = a-b;
//			System.out.println("the difference is :" +substraction);
//			break;
//		case 3:
//			int multiplication = a*b;
//			System.out.println("the product is :" +multiplication);
//			break;	
//		case 4:
//			int division = a/b;
//			System.out.println("the quotient is :" +division);
//			break;	
//		default:System.out.println("no such operation");
//		break;
//		}
		
		//write a table for a given number
//		System.out.println("Enter the number :");
//		int x= sc.nextInt();
//		System.out.println("The table of :" +x + " is " );
//		for (int i=1 ; i<=10;i++) {
//			int table = i*x;
//			System.out.println(+table);
//		}
		
		//Run a loop until valid pwd is entered
		final String correctPassword = "secret";
		boolean passwordEntered = false;
		while(!passwordEntered) {
		System.out.println("Enter the pwd :" );
		String pwd = sc.nextLine();
		if(pwd.equals(correctPassword)) {
			passwordEntered =true;
			System.out.println("password is correct.Access granted!");
		}
			else {
				System.out.println("Incorrect password.Try Again!!");
			}
		}
		sc.close();
	}
}
 

