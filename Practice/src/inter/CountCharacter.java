package inter;

public class CountCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "How are you";
		//str = str.replaceAll("\\s", "").toLowerCase();
		int count=0;
		//Print the count of each character
		//String str1= "CAPITAL";
				int len = str.length();
				for (int i = 0 ; i < len ;i ++)
				{
				 if(str.charAt(i)!=' ')
					 count++; 
				}
				System.out.println("Characters count: " +count);
		   }

	}

