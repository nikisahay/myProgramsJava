package yps;

public class CountVowelsPriya {
	public static void main(String[] args) {

		int vowel=0;

		int consonent =0;

		
		String str = "counting the vowels and Consonent in a string";


		for(int i = 0; i < str.length(); i++) {


		if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {



		vowel++;

		}

		else if(str.charAt(i) >= 'a' && str.charAt(i)<='z')

		{

		consonent++;

		}


		}

		System.out.println("vowels in the strings are : " + vowel);

		System.out.println("consonent in the String are : " + consonent);

		}

}
