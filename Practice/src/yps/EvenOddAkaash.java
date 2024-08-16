package yps;
import java.util.Scanner;

public class EvenOddAkaash {
		public static void main(String args[]) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter a Number");
			int n = scanner.nextInt();
			
			System.out.println("Prime numbers:");
			for(int i=2; i<n; i++) {
				if(isPrime(i)) {
					System.out.print(i + " ");
				}
			}
			
			System.out.println("\nEven numbers:");
			for(int i=1; i<=n; i++) {
				if(Even(i)) {
					System.out.print(i + "");
				}
			}
			
			System.out.println("\nOdd numbers");
			for(int i=1; i<=n; i++) {
				if(isOdd(i)) {
					System.out.print(i + " ");
				}
			}
		}

		private static boolean isOdd(int n) {
			// TODO Auto-generated method stub
			return n%2 != 0;
		}

		private static boolean Even(int n) {
			// TODO Auto-generated method stub
			return n%2 == 0;
		}

		private static boolean isPrime(int n) {
			// TODO Auto-generated method stub
			if(n <=1 ) {
				return false;
			}
			
			for(int i =2; i<=Math.sqrt(n); i++) {
				if(n%i==0) {
					return false;
				}
			}
			return true;
			
		}

	}