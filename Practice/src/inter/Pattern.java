package inter;

public class Pattern {

	public static void main(String[] args) {
		pattern(4);
  }
	
	static void pattern(int n)
	{
		for(int row =0 ; row<=n ; row++) {
			for(int col =0 ; col <=row ; col++) {
				System.out.print("* ");
				}
			//print a new line 
			System.out.println();
		}
	}
}