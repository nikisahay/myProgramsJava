package inter;

import java.util.Scanner;

public class FactorialofNumber {
	    public static void main(String[] args) {
	    	Scanner s= new Scanner(System.in);
			System.out.println("Please enter a number:: \n");
			int number = s.nextInt();
	        //int number = 5; // The number for which factorial is to be calculated
	        int factorial = calculateFactorial(number);
	        System.out.println("Factorial of " + number + " is: " + factorial);
	        s.close();
	    }

	    public static int calculateFactorial(int number) {
	        if (number == 0 || number == 1) {
	            return 1; // Factorial of 0 and 1 is always 1
	        } else {
	            int factorial = 1;
	            for (int i = 2; i <= number; i++) {
	                factorial *= i;
	            }
	            return factorial;
	        }
	    }
	}


