package inter;

import java.util.Scanner;

public class LongestPattern {

		    public static String findLongestPattern(String inputString) {
	        int length = inputString.length();
	        String longestPattern = "";

	        for (int i = 0; i < length; i++) {
	            for (int j = i + 1; j < length; j++) {
	                String pattern = inputString.substring(i, j);
	                int repetitionCount = countRepetitions(inputString, pattern);

	                // Check if the pattern repeats more than once and is longer than the current longest pattern
	                if (repetitionCount > 1 && pattern.length() > longestPattern.length()) {
	                    longestPattern = pattern;
	                }
	            }
	        }

	        return longestPattern;
	    }

	    private static int countRepetitions(String inputString, String pattern) {
	        int count = 0;
	        int index = 0;

	        while ((index = inputString.indexOf(pattern, index)) != -1) {
	            count++;
	            index += pattern.length();
	        }

	        return count;
	    }

	    public static void main(String[] args) {
	        //String inputStr = "ababababc";
	        Scanner s= new Scanner(System.in);
			System.out.println("Please enter a string:: \n");
			String inputStr = s.next();
	        String result = findLongestPattern(inputStr);

	        if (!result.isEmpty()) {
	            System.out.println("The longest repeating pattern is: " + result);
	        } else {
	            System.out.println("No repeating pattern found.");
	        }
	    }
	}
