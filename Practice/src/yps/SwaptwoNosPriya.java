package yps;

public class SwaptwoNosPriya {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int first=40;

		int second =50;

		System.out.println("Before swap");

		System.out.println("First value :"+first);

		System.out.println("Second value :"+second);


		first= first - second;
		second =first+second;
		first =second -first;

		System.out.println("After swap");

		System.out.println("First value :"+first);

		System.out.println("Second value :"+second);

    }

}
