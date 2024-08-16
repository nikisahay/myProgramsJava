package basics;

import java.util.Scanner;

public class Day2 {

	//IncrementDecrementOperators 
	    public static void main(String[] args) {
	        int number = 5;

	        // Increment and decrement operators
	        number++; // Increment by 1
	        int incrementedNumber = number;

	        number--; // Decrement by 1
	        int decrementedNumber = number;

	        System.out.println("Incremented Number: " + incrementedNumber);
	        System.out.println("Decremented Number: " + decrementedNumber);
	        
	        //arithmatic operators
	        int a = 5;
	        int b = 8;
	        int c = 28;
	        int d = 102;
	        
	        int sum,difference,product,quotient,remainders;
	        
	        sum = a+b;
	        difference = b-a;
	        product = a * c;
	        quotient = d/b;
	        remainders = d%c;
	        
	        System.out.println("The sum is " +sum);
	        System.out.println("The diff is " +difference);
	        System.out.println("The prod is " +product);
	        System.out.println("The quo is " +quotient);
	        System.out.println("The remaind is " +remainders);
	        
	        //string concat
//	        String fname = "Niki";
//	        String lname = "Sahay";
//	        String fullname = fname+ " "+lname;
//	        System.out.println("Full name :" +fullname);
//	        
	        //casting types
	        int num = 5;
	        long lnum = num;
	        
	        System.out.println("the long number is " +lnum);
	        
	        double n = 20.654;
	        int num1 = (int)n;
	        
	        System.out.println("the int number is " +num1);
	        
	        //cast from string to int and double
	        String str = "25";
	        int num2 = Integer.parseInt(str);
	        double num3 = Double.parseDouble(str);
	        
	        System.out.println("the integer is " +num2);
	        System.out.println("the double number is " +num3);
	        
	        double x = 13.2;
	        double y = 19.0;
	        
	        double areaOfrect = x*y;
	        System.out.println("area of rectangle is " +areaOfrect);
	        
	        //convert celsius to fahren
	        double celsius = 24.0;
	        double fahren = (celsius * 9/5) + 32;
	        System.out.println("coverted value from celsius " +fahren);
	        
	        //if a number is even or odd or prime
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter the number :");
	        int number1 = scanner.nextInt();
	        if(number1==0||number1==1) {
	        	System.out.println("the number is not prime ");
	        }
	        else 
	        {
	        	
	        	for(int i=2;i<=number1/2;++i) {
	        		if (number1%i==0)
	        			System.out.println("the number is not prime");
	        		else
	        			System.out.println("the number is prime");
	        		break;
	        	}
	        }
	          if (number1 % 2 == 0) {
	        	  System.out.println("the number is even ");
	          }
	          else
	        	  System.out.println("the number is odd");
	          scanner.close();
	    }
}
