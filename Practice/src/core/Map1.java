package core;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//import javax.inject.Inject;

public class Map1 {



	    //@Inject
	    private static Map<String, String> dictionary;

	    public Map1() {
	        dictionary = new HashMap<>();
	        dictionary.put("SEO", "Search engine optimization");
	        dictionary.put("SaaS", "Software as a service");
	        dictionary.put("UX", "User experience");
	    }

	    public static void runApp() {
	        Scanner scanner = new Scanner(System.in);

	        while (true) {
	            System.out.println("Enter lookup word or Q to quit");
	            String input = scanner.nextLine();
	            if (input.toUpperCase().equals("Q")) {
	                System.out.println("Thanks for using Dev Dictionary");
	                scanner.close();
	                return;
	            }
	           
          if(dictionary.containsKey(input))
        	  System.out.println(input + ": " +dictionary.get(input));
          else
        	 System.out.println("Word doesn't exist, try again or Q to quit");
	        }
	    }
	    
	    public static void main(String args[]) {
	    	Map1.runApp();
	    }
	}

