package core;

public class FizzBuzz_PriyaYP {
	
	public static void main(String[] args) {

		int m=1;

		int n=50;

		for(int i=m; i<=n;i++)

		{
		if(i%3==0)

		{

		System.out.println( "Fizz");

		}

		else if(i%5==0)

		{

		System.out.println("Buzz");

		}

		else if(i%3==0 && i%5==0)

		{

		System.out.println("FizzBuzz");

		}
		}
		}
}
