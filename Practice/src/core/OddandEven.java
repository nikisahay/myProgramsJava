package core;

import java.util.Scanner;

public class OddandEven {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Any Nmuber : ");
		int num = sc.nextInt();
		int count = 0;
		//----Find the prime number------
		for(int i=1; i <= num; i++)
		{
			if(num % i == 0){	
				count++;
			}
		}
		if(count == 2) {			
		System.out.println("Entered number is Prime \n");
		}else {			
		System.out.println("Entered number is Not Prime \n");
		}
		
		//-----Find the Odd and even number-----
		
		if(num % 2 == 0)
		{
			System.out.println("Entered number is Even");
		}else
		{
			System.out.println("Entered number is Odd");
		}
	}

}
