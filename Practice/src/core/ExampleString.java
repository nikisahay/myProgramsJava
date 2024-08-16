package core;

public class ExampleString {

	public static void main(String[] args) {
		
		//String is an object //String literal
		String s = "Rahul Shetty Academy";
		String s1 = "Rahul Shetty Academy";
		String s3 = "hello";
		
		//create with new keyword
		String s2 = new String("Welcome");
		String s4 = new String("Welcome");
		
		String[] splittedstring= s.split(" ");
		System.out.println(splittedstring[0]);
		System.out.println(splittedstring[1]);
		System.out.println(splittedstring[2]);
		//splittedstring[1].trim();
		
		for(int i=0 ; i<s.length();i++) {
			System.out.println(s.charAt(i));
		}
        
		//print the string in reverse order
		for(int i =s.length()-1;i>=0;i--) {
			System.out.print(s.charAt(i)); 
		}
	}

}
