package inter;

import java.util.Scanner;

public class CharacterSwapper {
	
	public static String swapCharactersInPairs(String input) {
        // Check if the string length is odd
        if (input.length() % 2 != 0) {
            // Append an extra space to make the length even
            input += " ";
        }

        // Convert the string to a character array
        char[] chars = input.toCharArray();

        // Swap characters in pairs without using a temporary variable
        for (int i = 0; i < chars.length; i += 2) {
            chars[i] = (char) (chars[i] ^ chars[i + 1]);
            chars[i + 1] = (char) (chars[i] ^ chars[i + 1]);
            chars[i] = (char) (chars[i] ^ chars[i + 1]);
        }

        // Convert the character array back to a string
        String swappedString = new String(chars);

        return swappedString;
    }

    public static void main(String[] args) {
    	Scanner  s= new Scanner(System.in);
	   System.out.println("Please enter a string:: \n");
	    String input=s.nextLine();
        //String input = "abcdefgh";
        String swappedString = swapCharactersInPairs(input);
        System.out.println("Original String: " + input);
        System.out.println("Swapped String: " + swappedString);
    }

}
